CREATE SEQUENCE PUBLIC_PLACE_ID_SEQ;

CREATE TABLE IF NOT EXISTS PUBLIC_PLACE
(
    ID INTEGER UNIQUE DEFAULT nextval('PUBLIC_PLACE_ID_SEQ'),
    DESCRIPTION text,
    POSTAL_CODE  VARCHAR(11),
    NEIGHBORDHOOD_ID int,
    CONSTRAINT fk_neighbordhood FOREIGN KEY (NEIGHBORDHOOD_ID)
        REFERENCES neighbordhood (id)
);

ALTER SEQUENCE PUBLIC_PLACE_ID_SEQ
    OWNED BY PUBLIC_PLACE.ID;