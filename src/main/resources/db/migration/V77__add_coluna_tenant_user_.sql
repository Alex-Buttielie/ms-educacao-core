ALTER TABLE tb_user ADD tenant varchar NULL;
update tb_user set tenant = 'tenant_1';