CREATE TABLE Login(
	login_id bigserial not null
		constraint login_pkey
			primary key,
	username varchar(256),
	password varchar(256),
	roles_id integer,
	customer_id integer,
	seller_company_id integer,
	shipper_id integer
);