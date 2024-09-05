CREATE SEQUENCE GROUP_BRANCH_ACTING_ID_SEQ;

CREATE TABLE IF NOT EXISTS GROUP_BRANCH_ACTING
(
    ID INTEGER UNIQUE DEFAULT nextval('GROUP_BRANCH_ACTING_ID_SEQ'),
    DESCRIPTION text,
    CODE  text,
    division_group_branch_acting_id  INTEGER,
    CONSTRAINT fk_division_group_branch_acting FOREIGN KEY (division_group_branch_acting_id)
        REFERENCES division_group_branch_acting (id)
);

ALTER SEQUENCE GROUP_BRANCH_ACTING_ID_SEQ
    OWNED BY GROUP_BRANCH_ACTING.ID;