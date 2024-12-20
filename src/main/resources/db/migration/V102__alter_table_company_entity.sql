ALTER TABLE company ADD opening_date date;
ALTER TABLE company ADD social_capital int;
ALTER TABLE company ADD cnpj text;
ALTER TABLE company ADD date_status_registry date;
ALTER TABLE company ADD status_registry int;
ALTER TABLE company ADD state_registry int;
ALTER TABLE company ADD city_registry_codigo_mec int;
ALTER TABLE company ADD company_size int;
ALTER TABLE company ADD acting_branch_id int;
ALTER TABLE company ADD nature_legal int;
ALTER TABLE company ADD type_unit_company int;
ALTER TABLE company ADD sicom_code int;
ALTER TABLE company ADD postal_code varchar;
ALTER TABLE company ADD state int;
ALTER TABLE company ADD city_codigo_mec int;
ALTER TABLE company ADD number int;
ALTER TABLE company ADD neighbordhood_id int;
ALTER TABLE company ADD public_place_id int;
ALTER TABLE company ADD complement text;

ALTER TABLE company ADD CONSTRAINT city_registry_fk
    FOREIGN KEY (city_registry_codigo_mec) REFERENCES city(codigo_mec);

ALTER TABLE company ADD CONSTRAINT acting_branch_fk
    FOREIGN KEY (acting_branch_id) REFERENCES branch_acting(id);

ALTER TABLE company ADD CONSTRAINT city_fk
    FOREIGN KEY (city_codigo_mec) REFERENCES city(codigo_mec);

ALTER TABLE company ADD CONSTRAINT neighbordhood_fk
    FOREIGN KEY (neighbordhood_id) REFERENCES neighbordhood(id);

ALTER TABLE company ADD CONSTRAINT public_place_fk
    FOREIGN KEY (public_place_id) REFERENCES public_place(id);
