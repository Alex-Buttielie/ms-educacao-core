ALTER TABLE tb_user ADD tenant varchar NULL;
update tb_user set tenant = 'caldas-dev';