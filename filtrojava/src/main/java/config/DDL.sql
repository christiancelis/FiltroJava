
drop database if exists sgpzf;
create database if not exists sgpzf;

use sgpzf;

create table stack(
	id int primary key AUTO_INCREMENT,
    name varchar(50)
);

create table country(
	id int primary key AUTO_INCREMENT,
    name varchar(50)
);

create table region(
	id int primary key AUTO_INCREMENT,
    name varchar(50),
    idcountry int,
    foreign key (idcountry) references country(id) on delete cascade on update cascade
);


create table gender(
	id int primary key AUTO_INCREMENT,
    name varchar(50)
);

create table city(
	id int primary key AUTO_INCREMENT,
    name varchar(50),
    idregion int,
    foreign key (idregion) references region(id) on delete cascade on update cascade
);

create table skill(
	id int primary key AUTO_INCREMENT,
    name varchar(50)
);

create table person(
	id int primary key AUTO_INCREMENT,
    name varchar(50),
    lastname varchar(50),
    idcity int,
    address varchar(50),
    age int,
    email varchar(100),
    idgender int,
     foreign key (idgender) references gender(id)on delete cascade on update cascade,
      foreign key (idcity) references city(id) on delete cascade on update cascade
);

create table persons_skill(
	id int primary key AUTO_INCREMENT,
    registration_date date,
    idperson int,
    idskill int,
    foreign key (idperson) references person(id) on delete cascade on update cascade,
    foreign key (idskill) references skill(id) on delete cascade on update cascade
);

create table stack_skill(
	id_stack_skill int primary key AUTO_INCREMENT,
    idskill int,
    idstack int,
	foreign key (idskill) references skill(id) on delete cascade on update cascade,
    foreign key (idstack) references stack(id) on delete cascade on update cascade
);


