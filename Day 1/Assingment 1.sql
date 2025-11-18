-- Assignment Day 1
create database assignment1;
use assignment1;

-- Q1 
create table student (studentid int, name varchar(20), phoneNo varchar(10));
insert into student values(101, 'Ravi', '98765');
insert into student values(101, 'Ravi', '87654');
insert into student values(102, 'Anita', '99900');
insert into student values(103, 'John', '88888');
insert into student values(103, 'John', '77777');
insert into student values(103, 'John', '66666');

select * from student;

-- Q2

create table orders (Orderid int, customer varchar(20), items varchar(10));
insert into orders values(01, 'Raj', 'Pen');
insert into orders values(01, 'Raj', 'Pencil');
insert into orders values(02, 'Sam', 'Notebook');
insert into orders values(03, 'John', 'Eraser');
insert into orders values(03, 'John', 'Marker');
insert into orders values(03, 'John', 'Pen');

select * from orders;


-- Q3

create table skills (empid int, empname varchar(20), skills varchar(10));
insert into skills values(01, 'Ramesh', 'Java');
insert into skills values(01, 'Ramesh', 'Python');
insert into skills values(02, 'Anita', 'Excel');
insert into skills values(03, 'John', 'C++');
insert into skills values(03, 'John', 'Java');
insert into skills values(03, 'John', 'HTML');

select * from skills;  

-- Q4

create table address (custid int, name varchar(20), city varchar(10), state varchar(20), country varchar(10));
insert into address values(01, 'Meera', 'Hyderbad', 'Telengana', 'India');
insert into address values(02, 'Ajay', 'Pune', 'Maharashtra', 'India');

select * from address;

-- Q5

create table stu (StudentId int primary key, StudentName varchar (10));
create table course (CourseId varchar(2) primary key, coursename varchar (10), faculty varchar(20));
create table marks (studentid int, courseid varchar(2), marks varchar (10), primary key (studentid, courseid));

insert into stu values (1, 'Ramesh');
insert into stu values (2, 'Anita');
insert into course values ('C1', 'Java', 'Amit');
insert into course values ('C2', 'Python', 'Seema');
insert into marks values (1, 'C1', '90');
insert into marks values (1, 'C2', '85');
insert into marks values (2, 'C1', '78');

select * from stu;
select * from course;
select * from marks;

-- Q6

create table ord (OrderId int primary key, customerName varchar (10));
create table prod (productId varchar(2) primary key, productname varchar (10));
create table quan (orderid int, productid varchar(2), marks varchar (10), primary key (orderid, productid));

insert into ord values (1, 'Raj');
insert into ord values (2, 'Meena');
insert into prod values ('P1', 'Pen');
insert into prod values ('P2', 'Pencil');
insert into quan values (1, 'P1', '2');
insert into quan values (1, 'P2', '1');
insert into quan values (2, 'P1', '3');

select * from ord;
select * from prod;
select * from quan;

-- Q7

create table emp (empId int primary key, empName varchar (10));
create table proj (projectId varchar(2) primary key, projectname varchar (10));
create table hours (empid int, projectid varchar(2), hoursworked int, primary key (empid, projectid));

insert into emp values (1, 'Ravi');
insert into emp values (2, 'Anita');
insert into proj values ('P1', 'WebApp');
insert into proj values ('P2', 'MobileApp');
insert into hours values (1, 'P1', 20);
insert into hours values (1, 'P2', 30);
insert into hours values (2, 'P1', 3);

select * from emp;
select * from proj;
select * from hours;

-- Q8 

create table driver (driverId varchar(2) primary key, driverName varchar (10));
create table route (routeId varchar(2) primary key, routename varchar (20));
create table dist (driverid varchar(2), routeid varchar(2), marks varchar (10), primary key (driverid, routeid));

insert into driver values ('D1', 'Amit');
insert into driver values ('D2', 'Sunil');
insert into route values ('R1', 'Airport Route');
insert into route values ('R2', 'City Route');
insert into dist values ('D1', 'R1', '40 km');
insert into dist values ('D1', 'R2', '20 km');
insert into dist values ('D2', 'R1', '40 km');

select * from driver;
select * from route;
select * from dist;

-- Q9

create  table fnf (orderid int, customername varchar(10), city varchar(10), productid varchar(2), productname varchar (10), price int, quantity int);

insert into fnf values (1, 'Ravi', 'Mumbai', 'P1', 'Pen', 10, 2), (1, 'Ravi', 'Mumbai', 'P1', 'Pen', 10, 3), (2, 'Meena', 'Delhi', 'P2', 'Book', 100, 1),
(2, 'Meena', 'Delhi', 'P3', 'Bag', 500, 1), (2, 'Meena', 'Delhi', 'P3', 'Bag', 500, 2);

select * from fnf;

create table ord2 (OrderId int primary key, customerName varchar (10), city varchar(10));
create table prod2 (productId varchar(2) primary key, productname varchar (10), price int);
create table quan2 (orderid int, productid varchar(2), quantites int, primary key (orderid, productid));

insert into ord2 values (1, 'Ravi', 'Mumbai');
insert into ord2 values (2, 'Meena', 'Delhi');
insert into prod2 values ('P1', 'Pen',10);
insert into prod2 values ('P2', 'Book', 100);
insert into prod2 values ('P3', 'Bag', 500);
insert into quan2 values (1, 'P1', 2);
insert into quan2 values (2, 'P2', 1);
insert into quan2 values (2, 'P3', 1);

select * from ord2;
select * from prod2;
select * from quan2;
