package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.BranchActing;
import br.com.coreeduc.aplication.entities.DivisionGroupBranchActing;
import br.com.coreeduc.aplication.entities.GroupBranchActing;
import br.com.coreeduc.aplication.entities.SessionBranchActing;
import br.com.coreeduc.aplication.records.BranchActingRecord;
import br.com.coreeduc.aplication.records.DivisionBranchActingRecord;
import br.com.coreeduc.aplication.records.GroupBranchActingRecord;
import br.com.coreeduc.aplication.records.SessionBranchActingRecord;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class BranchActingFactory {

    private BranchActing branchActing;
    private BranchActingRecord branchActingRecord;

    public BranchActingFactory(Properties properties) {
        var builder = new Builder();

        setBranchActing(
                builder.description(properties.getProperty("description"))
                        .code(properties.getProperty("id"))
                        .observation(properties.getProperty("observation"))
                        .build()
                        .getBranchActing()
        );

    }

    private BranchActingFactory(Builder builder) {
        setBranchActing(builder.branchActing);
        setBranchActingRecord(builder.branchActingRecord);
    }

    public BranchActingFactory(BranchActing branchActing) {
        setBranchActingRecord(convertBranchActingInRecord(branchActing));
    }

    private void setBranchActingRecord(BranchActingRecord branchActingRecord) {
        this.branchActingRecord = branchActingRecord;
    }

    private void setBranchActing(BranchActing branchActing) {
        this.branchActing = branchActing;
    }

    public BranchActing getBranchActing() {
        return branchActing;
    }

    public BranchActingRecord getBranchActingRecord() {
        return branchActingRecord;
    }

    private BranchActingRecord convertBranchActingInRecord(BranchActing branch) {
        return new Builder().branchActingRecord(branch).branchActingRecord;
    }

    public static final class Builder {

        private BranchActing branchActing;
        private BranchActingRecord branchActingRecord;

        public Builder() {
            branchActing = new BranchActing();
        }

        private static SessionBranchActingRecord apply(SessionBranchActing session) {
            return new SessionBranchActingRecord(session.getCode(), session.getDescription());
        }

        private static DivisionBranchActingRecord apply(DivisionGroupBranchActing division, SessionBranchActingRecord sessionsRecord) {
            return new DivisionBranchActingRecord(division.getCode(), division.getDescription(), sessionsRecord);
        }

        private static GroupBranchActingRecord apply(GroupBranchActing groupBranchActing, DivisionBranchActingRecord divisionBranchActingRecord) {
            return new GroupBranchActingRecord(groupBranchActing.getCode(), groupBranchActing.getDescription(), divisionBranchActingRecord);
        }

        public Builder id(Long id) {
            branchActing.setId(id);
            return this;
        }

        public Builder description(String description) {
            branchActing.setDescription(description);
            return this;
        }

        public Builder code(String code) {
            branchActing.setCode(code);
            return this;
        }

        public Builder observation(String observation) {
            branchActing.setObservation(observation);
            return this;
        }

        public Builder branchActingRecord(BranchActing branch) {
            var sessionsRecord = Optional.ofNullable(branch)
                    .map(BranchActing::getGroupBranchActing)
                    .map(GroupBranchActing::getDivisionGroupBranchActing)
                    .map(DivisionGroupBranchActing::getSessionBranchActing)
                    .map(Builder::apply)
                    .orElse(null);

            var divisionsRecord = Optional.ofNullable(branch)
                    .map(BranchActing::getGroupBranchActing)
                    .map(GroupBranchActing::getDivisionGroupBranchActing)
                    .map(division -> apply(division, sessionsRecord))
                    .orElse(null);

            var groupRecord =  Optional.ofNullable(branch)
                    .map(BranchActing::getGroupBranchActing)
                    .map(group -> apply(group, divisionsRecord))
                    .orElse(null);

            var observations = !branch.getObservation().isEmpty() ? List.of(branch.getObservation().split(";")) : List.of("");

            this.branchActingRecord = new BranchActingRecord(
                    branch.getCode(),
                    branch.getDescription(),
                    observations,
                    groupRecord
            );

            return this;
        }

        public BranchActingFactory build() {
            return new BranchActingFactory(this);
        }

    }

}
