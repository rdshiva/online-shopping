CREATE TABLE category (
	
	id INT,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id) 

);

INSERT INTO category (name, description,image_url,is_active) VALUES ('Laptop', 'This is description for Laptop category!', 'CAT_1.png', true);
INSERT INTO category (id, name, description,image_url,is_active) VALUES (2,'Television', 'This is description for Television category!', 'CAT_2.png', true);
INSERT INTO category (id,name, description,image_url,is_active) VALUES (3,'Mobile', 'This is description for Mobile category!', 'CAT_3.png', true);

CREATE TABLE user_detail (
	id INT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(id),
);


INSERT INTO user_detail 
(id, first_name, last_name, role, enabled, password, email, contact_number) 
VALUES (1,'Suni', 'Kohli', 'ADMIN', true, 'admin', 'vk@gmail.com', '8888888888');

INSERT INTO user_detail 
(id,first_name, last_name, role, enabled, password, email, contact_number) 
VALUES (2,'vindra', 'Jadeja', 'SUPPLIER', true, '12345', 'rj@gmail.com', '9999999999');

INSERT INTO user_detail 
(id,first_name, last_name, role, enabled, password, email, contact_number) 
VALUES (3,'Ravi', 'Ashwin', 'SUPPLIER', true, '12345', 'ra@gmail.com', '7777777777');


CREATE TABLE product (
	id INT,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);	


INSERT INTO product (id,code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES (1,'PRDABC123DEFX', 'iPhone 5s', 'apple', 'This is one of the best phone', 18000, 5, true, 3, 2 );

INSERT INTO product (id,code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES (2,'PRDDEF123DEFX', 'Samsung s7', 'samsung', 'A smart phone by samsung!', 32000, 2, true, 3, 3 );

INSERT INTO product (id,code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES (3,'PRDPQR123WGTX', 'Google Pixel', 'google', 'This is one of the best', 57000, 5, true, 3, 2 );

INSERT INTO product (id,code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES (4,'PRDMNO123PQRX', ' Macbook Pro', 'apple', 'This is one of the best ', 54000, 3, true, 1, 2 );

INSERT INTO product (id, code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES (5,'PRDABCXYZDEFX', 'Dell Latitude E6510', 'dell', 'This is one of the best', 48000, 5, true, 1, 3 );
