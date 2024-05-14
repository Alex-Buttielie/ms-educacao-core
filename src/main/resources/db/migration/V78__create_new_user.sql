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

values ('SECRE', 'Secretario', '93140441061',
        '$2a$10$3XhhrCOssmvwSty2jH2CveJFyaybagNXzND2WC0SPFGcROvZt5ze.', '145875647', 'secretario@gmail.com', '2001-03-16',
        '62999077331', now(), 1, 1, 'educacao-prod');