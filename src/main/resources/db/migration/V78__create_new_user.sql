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
                     user_typer, tenant)

values ('Alex', 'Alex Buttielie', '70846792198',
        '$2a$10$3XhhrCOssmvwSty2jH2CveJFyaybagNXzND2WC0SPFGcROvZt5ze.', '6796001', 'buttielle@gmail.com', '2001-03-16',
        '64999077331', now(), 1, 1, 'tenant_2');