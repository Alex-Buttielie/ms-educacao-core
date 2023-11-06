CREATE SEQUENCE MES_ID_SEQ;

CREATE TABLE IF  NOT EXISTS MES (id INTEGER UNIQUE DEFAULT nextval('MES_ID_SEQ'),
                                 mes INTEGER,
                                 nome varchar (50)

);

ALTER SEQUENCE MES_ID_SEQ
    OWNED BY MES.ID;
