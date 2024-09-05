package br.com.coreeduc.aplication.factorys;

import br.com.coreeduc.aplication.entities.BranchActing;
import br.com.coreeduc.aplication.records.BranchActingRecord;
import br.com.coreeduc.aplication.records.DivisionBranchActingRecord;
import br.com.coreeduc.aplication.records.GroupBranchActingRecord;
import br.com.coreeduc.aplication.records.SessionBranchActingRecord;

import java.util.List;
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
            var secao = branch.getGroupBranchActing().getDivisionGroupBranchActing().getSessionBranchActing();
            var division = branch.getGroupBranchActing().getDivisionGroupBranchActing();
            var group = branch.getGroupBranchActing();

            var observations = List.of(branch.getObservation().split(";"));

            var sessionRecord = new SessionBranchActingRecord(secao.getCode(), secao.getDescription());
            var divisionRecord = new DivisionBranchActingRecord(division.getCode(), division.getDescription(), sessionRecord);
            var groupRecord = new GroupBranchActingRecord(group.getCode(), group.getDescription(), divisionRecord);

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
