

create database employeeportal;
use employeeportal;

CREATE TABLE IF NOT EXISTS employeeinfo(

 id int (4) auto_increment, 
  name VARCHAR(100) NOT NULL,
 location varchar(20),
 age INT ,
 gender varchar(5),
 PRIMARY KEY(id) );
 
insert into employeeinfo (name, age, location, gender) values ("yon", 24, "New York", "m");
insert into employeeinfo (name, age, location, gender) values ("yara", 25, "Lankashir", "f") 
