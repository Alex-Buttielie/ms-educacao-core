CREATE SEQUENCE TB_USER_ID_SEQ;

CREATE TABLE IF  NOT EXISTS TB_USER
(
    ID_USER     	INTEGER  PRIMARY KEY DEFAULT nextval('TB_USER_ID_SEQ'),
    DS_LOGIN    	VARCHAR(300) UNIQUE NOT NULL,
    NAME_USER   	VARCHAR(300) NOT NULL,
    CPF         	VARCHAR (11) UNIQUE  NOT NULL,
    PASSWORD_USER   VARCHAR(300)  NOT NULL,
    RG          	VARCHAR(9)  UNIQUE  NOT NULL,
    BIRTH_DATE  	DATE ,
    EMAIL       	VARCHAR (300),
    TELEPHONE   	VARCHAR (15),
    TELEPHONE2  	VARCHAR (15),
    CADASTRE_DATE   DATE,
    SEX 			INT,
    USER_TYPER 		INT
);

insert into TB_USER (ds_login,
                     name_user,
                     cpf,
                     password_user,
                     rg,
                     email,
                     birth_date,
                     telephone,
                     cadastre_date,
                     sex,
                     user_typer)

values ('Alex.Buttielie','Alex Buttielie','70846792192','$2a$10$3XhhrCOssmvwSty2jH2CveJFyaybagNXzND2WC0SPFGcROvZt5ze.','6796000','buttielle3@gmail.com', '2001-03-16','62994291748',now(),1, 1);