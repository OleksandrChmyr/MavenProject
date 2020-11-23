CREATE TABLE accounts (
id serial CONSTRAINT pk_id PRIMARY KEY,
email varchar NOT NULL CONSTRAINT unique_email UNIQUE,
password varchar(16) NOT NULL,
subs_id int
);

CREATE TABLE subs (
id serial CONSTRAINT pk_subsid PRIMARY KEY,
name varchar(20) NOT NULL CONSTRAINT unique_name UNIQUE,
description TEXT
);