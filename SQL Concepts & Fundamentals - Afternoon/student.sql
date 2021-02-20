create database Student;
show databases;
use Student;
show tables;


create table S_basic_info(name varchar(20),surname varchar(20),rollno int,address varchar(100),is_appliedfor_sc int, mobileno varchar(10),dob varchar(20));
create table S_admission_payment(rollno int ,amount_paid int,amount_balance int,admission_type varchar(20),academic_year varchar(20),last_paid_date varchar(20),due_date varchar(20));
create table S_subject(rollno int,subject varchar(20),total_marks int,obtained_marks int, final_result varchar(20));
create table S_scholorship_info(rollno int,scholorship_name varchar(30),description varchar(70),amount int,category int,to_bankname varchar(30), sanctioned_date varchar(20));


insert into S_basic_info values("Bharath","kumar",100,"#8/35,sarada vilas, Bendre nagar,15th Cross, BSK 2nd Stage, Bangalore, 56007",1,"8317450757","27-07-1999");
insert into S_basic_info values("Naveen","kumar",101,"Villa 42, Opal Akshaya, Akshayanagar, Yelenahalli Main Road, Bengaluru",0,"8317456987","27-09-1998");
insert into S_basic_info values("Akash","Raj",102,"Avopa boys hostel 3rd main 9th cross ,chamrajpet,Bengalore-560018",1,"8365698757","15-07-1999");
insert into S_basic_info values("Abhilash","JK",103,"#75, MH, BMSCE hostel, near Allahabad bank, Basavangudi, Banglore - 560019",1,"8311235757","17-07-1998");
insert into S_basic_info values("Abhishek","H",104,"#7,4th cross,kilari road ,chickpete, bangalore-560053",0,"9563250757","26-06-1999");
insert into S_basic_info values("Abhishek","Kattimani",105,"#392,24th B cross, 14th Main, Banashankari 2nd Stage, bangalore-70",1,"869870757","27-01-1998");
insert into S_basic_info values("Amarnath","Mallikarjunr",106,"A-114 Sobha Magnolia Apartment Bannerghatta Main road opp. Jal Bhanwan Bangalore -560029",1,"8317123657","28-03-1999");
insert into S_basic_info values("Nikhil","C",107,"Flat No:103, G.K Heritage,40th cross,Jayanagar 8th block,Bangalore 560082",1,"8317478965","29-07-1999");
insert into S_basic_info values("Ayush","Santholia",208,"42/5 3rd Cross, TR Nagar Basavangudi Bangalore 560028",0,"8317454563","27-04-1998");
insert into S_basic_info values("Pragathi","Battula",209,"42/5 3rd Cross, TR Nagar Basavangudi Bangalore 560028",0,"831778527","22-06-1998");
insert into S_basic_info values("Jayanth","AV",210,"Pramuk temple meadown apt,monotype,banashankari,bangalore",1,"8317451256","21-01-1999");
insert into S_basic_info values("Harsha","Vardhan",300,"42/5 3rd Cross, TR Nagar Basavangudi Bangalore 560028",1,"8317454563","12-06-1999");
insert into S_basic_info values("Hrithik","Shankar",301,"Flat No:103, G.K Heritage,40th cross,Jayanagar 8th block,Bangalore 560082",0,"8317454560","23-07-1999");

select * from S_basic_info;
truncate table S_basic_info;



insert into S_admission_payment values(100,10000,45000,"Government","2020-21","02-07-2021","03-09-2021");
insert into S_admission_payment values(101,20000,35000,"Government","2020-21","05-07-2021","03-10-2021");
insert into S_admission_payment values(102,10000,46000,"Government","2020-21","13-07-2021","03-08-2021");
insert into S_admission_payment values(103,20000,65000,"Payment","2020-21","09-07-2021","06-11-2021");
insert into S_admission_payment values(104,35000,85000,"Payment","2020-21","02-07-2021","09-09-2021");
insert into S_admission_payment values(105,13000,25000,"Government","2020-21","06-07-2021","13-09-2021");
insert into S_admission_payment values(106,25600,35000,"Payment","2020-21","12-07-2021","23-08-2021");
insert into S_admission_payment values(107,12300,60000,"Government","2020-21","03-07-2021","23-10-2021");
insert into S_admission_payment values(208,10000,46000,"Government","2020-21","02-07-2021","13-09-2021");
insert into S_admission_payment values(209,32600,32000,"Payment","2020-21","02-07-2021","19-09-2021");
insert into S_admission_payment values(300,23900,28000,"Government","2020-21","06-07-2021","12-09-2021");
insert into S_admission_payment values(301,10000,66000,"Payment","2020-21","09-07-2021","03-11-2021");
insert into S_admission_payment values(210,22000,60000,"Government","2020-21","09-08-2021","06-11-2021");


select * from S_admission_payment;
delete from S_admission_payment where rollno=210;
truncate table S_admission_payment;


insert into S_subject values(100,"Maths",100,90,"pass");
insert into S_subject values(101,"Science",150,80,"pass");
insert into S_subject values(102,"Statistics",100,26,"fail");
insert into S_subject values(103,"Maths",100,90,"pass");
insert into S_subject values(104,"Science",150,26,"fail");
insert into S_subject values(105,"Maths",100,90,"pass");
insert into S_subject values(106,"Statistics",100,65,"pass");
insert into S_subject values(107,"Science",150,40,"pass");
insert into S_subject values(209,"Maths",100,20,"fail");
insert into S_subject values(208,"Maths",100,90,"pass");
insert into S_subject values(210,"Science",150,30,"fail");
insert into S_subject values(300,"Statistics",100,90,"pass");
insert into S_subject values(301,"Maths",100,80,"pass");

update S_subject set final_result=NULL;
alter table S_subject add percentage varchar(10);
select * from S_subject;
truncate table S_subject;
delete from S_subject where rollno=210;



insert into S_scholorship_info values(100,"Epass","Karnataka obc scholorship",10000,2,"SBI","20-09-2021");
insert into S_scholorship_info values(103,"Epass","Karnataka obc scholorship",1000,2,"Karnatak Bank","22-09-2021");
insert into S_scholorship_info values(106,"Epass","Karnataka obc scholorship",4500,2,"KGB","12-10-2021");
insert into S_scholorship_info values(107,"SSP","Jindal Scholotships prortal for all",22000,1,"Canara Bank","10-09-2021");
insert into S_scholorship_info values(300,"Epass","Karnataka obc scholorship",19000,2,"SBI","10-10-2021");
insert into S_scholorship_info values(210,"NSP","National Scholoship for all",3000,3,"SBI","23-09-2021");



select * from S_scholorship_info;
truncate table S_scholorship_info;
delete from S_scholorship_info where rollno=210;


update S_basic_info set mobileno="7338398920" where rollno=100;
update S_basic_info set dob="02-08-1998" where rollno=300;
update S_admission_payment set  due_date="10-11-2021" where rollno=106;
update S_subject set obtained_marks=99 where rollno=101;
update S_scholorship_info set category=4 where rollno=210;
alter table S_subject add percentage int;

select * from S_basic_info;
select * from S_admission_payment;
select * from S_subject;
select * from S_scholorship_info;


select basic.*,sc.amount from S_basic_info as basic join S_scholorship_info as sc on basic.rollno = sc.rollno where sc.amount > 5000;

select * from S_basic_info basic where basic.is_appliedfor_sc = 1 AND basic.rollno NOT IN ( SELECT rollno from S_scholorship_info );

alter table S_subject modify percentage varchar(50);

DELIMITER //
CREATE PROCEDURE fill_percentage_basic1()
BEGIN
    UPDATE S_subject set percentage = ( obtained_marks / total_marks ) * 100; 
END//
DELIMITER //
CALL fill_percentage_basic1();

DELIMITER //
CREATE PROCEDURE fill_finalresult()
BEGIN
    UPDATE S_subject set final_result = case 
    when percentage >= 35 THEN "PASS" ELSE "FAIL" END;
END//
DELIMITER //
CALL fill_finalresult();




DELIMITER //
CREATE PROCEDURE fill_category1234() 
BEGIN

UPDATE S_scholorship_info as sc JOIN S_subject as sub on sub.rollno = sc.rollno set  sc.category =
			
              CASE 
              WHEN sub.percentage >= 90 THEN 4

              WHEN sub.percentage < 90 AND sub.percentage >=75 THEN 3
              
              WHEN  sub.percentage < 75 AND sub.percentage >60 THEN 2
              
             ELSE 1
			 END;
END//
DELIMITER //
CALL fill_category1234();
select * from S_scholorship_info;


create view S_basic_info_balance0099 as select basic.* ,admission.amount_balance from S_basic_info as basic, S_admission_payment as admission where basic.rollno=admission.rollno;
select * from S_basic_info_balance0099;

select basic.* from S_basic_info as basic where basic.rollno not in(select rollno from S_scholorship_info);


DELIMITER $$
CREATE PROCEDURE Balance_amount_parameter1(IN rollno INT) 
BEGIN
    SELECT amount_balance 
    from S_admission_payment as admission 
    WHERE admission.rollno = rollno;
END $$

CALL Balance_amount_parameter(101); $$



/*Top 5 students percentage wisse*/
Select top_students.*
from (Select basic.*,sub.percentage from S_basic_info as basic join S_subject as sub on basic.rollno = sub.rollno order by sub.percentage desc) 
    as top_students limit 5;



/*15.a. Inner join- to find the students who received the scholorship*/
select basic.*,sc.amount from S_basic_info as basic inner join S_scholorship_info as sc where basic.rollno=sc.rollno;

/* 15.bCross join - To create a table which compares a particular student with every other student */
SELECT * FROM S_subject s
CROSS JOIN S_subject f 
WHERE NOT s.rollno = f.rollno  
ORDER BY s.rollno ASC;

/*15.c Outer join - Get student details who didn't recieve scholarship*/

SELECT * 
FROM S_basic_info b
LEFT OUTER JOIN S_scholorship_info sc ON sc.rollno = b.rollno
WHERE sc.rollno is NULL;



/* category of scholorships and count*/
select sc.category,COUNT(sc.category) as total_scholorships_received  from S_scholorship_info sc group by sc.category;

/* max count of category*/
select sc.category,COUNT(sc.category) as Maximum_count  from S_scholorship_info sc group by sc.category limit 1; 

/* 19.Retrieve the percentage of the students along with students detailed information who
has scored the highest percentage along with availing the maximum scholarship amount*/

update S_subject set obtained_marks=99 where rollno=107;

SELECT basic.*,sub.percentage
FROM S_basic_info as basic
JOIN S_subject as sub on basic.rollno=sub.rollno
WHERE basic.rollno IN
(
    SELECT sc1.rollno
    FROM S_scholorship_info as sc1
    WHERE sc1.amount = 
    (
        SELECT MAX(sc2.amount)
        FROM S_scholorship_info as sc2
    )
) and  sub.percentage in (SELECT MAX(sub1.percentage) from S_subject as sub1);


