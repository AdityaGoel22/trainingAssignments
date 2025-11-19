show databases;
create database assingment2;

use assingment2;

-- q1

create table student_info_og ( studid int primary key, studname varchar(20), deptid int, deptname varchar(10), hodid int, hodname varchar(10));

/* to convert it into 2NF and 3NF we need to remove partial and transitive dependencies. 
	here the candidate key is studid and transitive dependency is studid -> deptid -> hodid */

create table student_info ( studid int primary key, studname varchar(20), deptid int not null);
create table dept_info ( deptid int primary key, deptname varchar(10), hodid int not null);
create table hod_info ( hodid int primary key, hodname varchar(10));

-- Q2

create table emp_proj_og ( empid int primary key, empname varchar(20), projid int, projname varchar(10), clientid int, clientname varchar(10));

/* to convert it into 2NF and 3NF we need to remove partial and transitive dependencies. 
	here the candidate key is {empid, projid} and transitive dependency is projid -> clientid -> clientname */

create table emp_info ( empid int primary key, empname varchar(20));
create table proj_info ( projid int primary key, projname varchar(10), clientid int not null);
create table client_info ( clientid int primary key, clientname varchar(10));
create table proj_assignment (empid int references emp_info(empid), projid int references proj_info(projid), primary key (empid, projid));

-- Q3

create table library_og ( bookid int primary key, booktitle varchar(20), authorid int, authorname varchar(10), publisherid int, publishername varchar(10));

/* to convert it into 2NF and 3NF we need to remove partial and transitive dependencies. 
	here the transitive dependency is bookid -> authorid -> authorname and bookid -> publisherid -> publishername */

create table author_info ( authorid int primary key, authorname varchar(10));
create table publisher_info ( publisherid int primary key, publishername varchar(10));
create table book_info ( bookid int primary key, booktitle varchar(20), authorid int references author_info(authorid), publisherid int references publusher_info(publisherid));

-- Q4

create table sales_og ( sale_id int primary key, product_id int, product_name varchar(10), category int, category_discount varchar(10));

/* to convert it into 2NF and 3NF we need to remove partial and transitive dependencies. 
	here the transitive dependency is sale_id -> product_id -> product_name, sale_id -> product_id -> category, product_id -> category -> category_discount  */

create table category_info ( category int primary key, category_discount varchar(10));
create table product_info ( product_id int primary key, product_name varchar(20), category int references category_info(category));
create table sale_info ( sale_id int primary key, product_id int references product_info(product_id));

-- Q5

create table enroll_og ( rollno int primary key, stud_name varchar(20), course_id int, course_name varchar(10), credit int);

/* to convert it into 2NF and 3NF we need to remove partial and transitive dependencies. 
	here there is no transitive dependency  */

create table stud_enroll_info ( rollno int primary key, stud_name varchar(20));
create table course_enroll_info ( course_id int primary key, course_name varchar(20), credit int);
create table enrollment_info ( rollno int, course_id int, primary key (rollno, course_id));

-- Q6

create table course_faculty_og ( course_code int primary key, course_name varchar(20), faculty_id int, faculty_name varchar(10), roomno int);

/* to convert it into 2NF, 3NF and BCNF we need to remove partial and transitive dependencies and if x->y then x should be super key. 
	here there are transitive dependency: course_code -> faculty_id -> roomno  */

create table faculty_cf_info ( faculty_id int primary key, faculty_name varchar(20), roomno int);
create table course_cf_info ( course_id int primary key, course_name varchar(20), faculty_id int references faculty_cf_info(faculty_id));
create table room_info ( roomno int, faculty_id int references faculty_cf_info(faculty_id));

-- Q7

create table orders_og ( order_id int primary key, cust_id int, cust_name varchar(10), city varchar(10), pincode int);

/* to convert it into 2NF, 3NF and BCNF we need to remove partial and transitive dependencies and if x->y then x should be super key. 
	here there are transitive dependency: order_id -> cust_id -> city  */

create table city_info ( city varchar(10) primary key, pincode int);
create table cust_info ( cust_id int primary key, cust_name varchar(20), city varchar(10) references city_info(city));
create table orders_info ( order_id int primary key, cust_id int references cust_info(cust_id));

-- Q8

create table hostel_og ( room_no int, stud_id int primary key, stud_name varchar(10), warden_id int,warden_name varchar(10));

/* to convert it into 2NF, 3NF and BCNF we need to remove partial and transitive dependencies and if x->y then x should be super key. 
	here there are transitive dependency: stud_id -> room_no -> warden_id  */

create table wadern_info ( wadern_id int primary key, wadern_name varchar(20));
create table room_hostel_info ( roomno int primary key, wadern_id int references wadern_info(wadern_id));
create table student_hostel_info ( stud_id int primary key, stud_name varchar(20));
create table allocation_info ( stud_id int primary key references student_hostel_info(stud_id), roomno int references room_hostel_info(roomno));

-- Q9

create table hospital_og ( doc_id int primary key, doc_name varchar(10), patient_id int, patient_name varchar(10), disease varchar(10), roomno int, room_type varchar(10));

/* to convert it into 2NF, 3NF and BCNF we need to remove partial and transitive dependencies and if x->y then x should be super key. 
	here there are transitive dependency: patient_id -> roomno -> room_type  */

create table doc_info ( doc_id int primary key, doc_name varchar(20));
create table room_hosp_info ( roomno int primary key, room_type varchar(20));
create table patient_info ( patient_id int primary key, patient_name varchar(20), roomno int references room_hosp_info(roomno), disease varchar(20));
create table doc_allocation_info ( patient_id int primary key references patient_info(patient_id), doc_id int references doc_info(doc_id));

-- Q10

create table tournament_og ( player_id int primary key, player_name varchar(10), sport_id int, sport_name varchar(10), equipment varchar(10), venue_id int, venue_type varchar(10));

/* 	fds are: 
	player_id -> player_name, sport_id 
    sport_id -> sport_name, equipment, venue_id
    venue_id ->  venue_type
    
	to convert it into 2NF, 3NF and BCNF we need to remove partial and transitive dependencies and if x->y then x should be super key. 
	here there are transitive dependency: player_id -> sport_id -> venue_id  */

create table venue_info ( venue_id int primary key, venue_type varchar(20));
create table sport_info ( sport_id int primary key, sport_name varchar(20), venue_id int references venue_info(venue_id), equipment varchar(20));
create table player_info ( player_id int primary key, player_name varchar(20), sport_id int references sport_info(sport_id));