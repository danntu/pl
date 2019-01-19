CREATE TABLE Shipping(
	shipping_id bigserial not null
		constraint shipping_pkey
			primary key,
      shipper_id integer,
      order_id integer,
      order_number integer,
      shipping_address varchar(255),
      accept_date date,
      shipping_date date,
      add_info message_text
 );