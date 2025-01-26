---1)
select last_name,salary 
from employees
where salary>12000;

--2)
select * 
from employees
where employee_id=175;

--3)i)
select last_name,salary 
from employees
where salary between 5000 and 12000;

--3)ii)
select last_name,salary 
from employees
where salary not between 5000 and 12000;

--4)
select last_name,job_id,hire_date 
from employees
where last_name='Taylor'
    or last_name='Vargas'
order by hire_date;

--5)
select last_name,department_id
from employees
where department_id in(20,70)
order by last_name;

--6)
select last_name "Surname",salary,department_id
from employees
where (salary between 5000 and 12000)and(department_id in(10,20));

--7)
select last_name,hire_date
from employees
where hire_date between '01-JAN-15' and '31-DEC-15';

--8)
select last_name,job_id 
from employees
where manager_id is NULL;
--lab manual chapter 4 exercie 5

--1)
select sysdate
from dual;

--2)
select employee_id,last_name,salary,round(salary*0.16+salary) as "salary"
from employees;

--3)
select employee_id,last_name,salary,round(salary*0.16+salary) as salary_new ,round(salary*0.16+salary)-salary as difference
from employees;

--4)
select initcap(last_name),length(last_name)
from employees;

--5)
select initcap(last_name)as "J and M",length(last_name)
from employees
where last_name like 'J%' or last_name like 'M%';

--6)

select initcap(last_name)as "J and M",length(last_name)
from employees
where last_name like '&col%' or last_name like '&col1%';
 
 
 --7)
 
 select initcap(last_name)as "J and M",length(last_name)
from employees
where upper(last_name) like upper('&col%') or upper(last_name) like upper('&col1%'); 

-8)
select employee_id,months_between(sysdate,hire_date) "total_service" 
from employees
order by  (sysdate-hire_date);


--9)
SELECT  last_name , lpad(salary,12,'$') as salary
FROM employees;


--extra exercise
--1)
select first_name||' '||last_name Employee_names
from employees
where ((sysdate-hire_date)/365)>2;


--2)
select distinct(length(first_name))
from employees;


--3)
select  first_name 
from employees 
where length(first_name)=5;



--lab exercise 7
--1)
select max(salary) max ,min(salary) min,sum(salary) sum,round(avg(salary)) avg 
from employees;

--2)
select count(distinct(employee_id))
from employees;


--3)
select job_id,max(salary) max ,min(salary) min,sum(salary) sum,round(avg(salary)) avg
from employees
group by job_id;

--4)
select job_id,count(employee_id)
from employees
group by job_id;

--5)
select count(employee_id),job_id
from employees
where job_id='&job'
group by job_id;

--6)
select count(distinct(manager_id))
from employees;

--7)
select max(salary),min(salary), max(salary)-min(salary) diff
from employees;

--8)
select department_id,count(employee_id)
from employees
group by department_id;

--9)
select department_id,count(employee_id)
from employees
group by department_id
having count(employee_id)>5;


--10)
select min(salary),manager_id
from employees
group by manager_id;

--11)
select min(salary),manager_id
from employees
group by manager_id
having manager_id is not null;


--12)
select min(salary),manager_id
from employees
group by manager_id 
having min(salary)>6000
order by 1 desc;

--extra practice
--1)
select count(employee_id),hire_date
from employees
group by hire_date
having to_char(hire_date,'yyyy') between 2015 and 2017;

--2)
select max(avg(salary))
from employees
group by department_id;

--3)
select count(employee_id),department_id
from employees
group by department_id
having count(employee_id)<3;
--3)b)
select max(count(employee_id))
from employees
group by department_id;

--4)
select min(count(employee_id))
from employees
group by department_id;


--5)
select count(employee_id),count(commission_pct)
from employees
group by department_id
having department_id=30;

--6)
select department_id,hire_date,first_name
from employees
order by 1,2 desc;

--lab exercise 12
--1)
create table MyDept
(dept_no  number(6) constraint mydept_dept_no_pk primary key
  ,deptname varchar2(20));
  
--2)
desc MyDept

--3)
create table MyEmp(
empid number(7) constraint MyEmp_empid_pk primary key,
lastname varchar2(25)
,firstname varchar2(25)
,deptid number(7),
  constraint MyEmp_dept_fk foreign key(deptid)
references MyDept(dept_no));

--4)
desc MyEmp

--5)
alter table MyEmp
add (commission number(2,2));

--6)
desc MyEmp;

--7)
alter table MyEmp
modify  (lastname varchar(35));
desc MyEmp;

--8)
alter table MyEmp
drop firstname;

desc myemp

--9)
create table logemp
(empid number(6) constraint logemp_empid_pk primary key,
last_name varchar2(25),
first_name varchar2(25),
sal number not null);

desc logemp;

alter table logemp
drop constraint logemp_empid_pk;


--10)
alter table logemp read only;


--11)
alter table logemp
add (jobid number(6));

desc  logemp;

--12)
alter table logemp read write;


--13)
alter table logemp
drop (jobid);


--13)
drop table logemp;
drop table myemp;
drop table mydept;


--DML
--1)
create table MyEmp
(employee_id number(6),
last_name varchar2(15),
first_name varchar2(15),
salary number(7),
department_id number(4));

--2)
desc Myemp;

--3)
insert into MyEmp(employee_id,last_name,first_name,salary,department_id)
values(70,'Muller','David',10000,102);
--4)
insert into MyEmp(employee_id,last_name,first_name,salary,department_id)
values(80,'arnold',NULL,12000,Null);

--5)
insert into MyEmp(employee_id,last_name,first_name,salary,department_id)
values(&employee_id,'&last_name','&first_name',&salary,&department_id);


--6)
update MyEmp
set last_name='Shinde'
where employee_id=50;

--7)
update MyEmp
set salary=1000
where salary<11000;

--lab exercise 11
--1)
insert into MyEmp(employee_id,last_name,first_name,salary,department_id)
values(&employee_id,'&last_name','&first_name',&salary,&department_id);
commit;
--2)
savepoint s1;

--3)
truncate table MyEmp;
 
 rollback to savepoint s1;
 desc MyEmp;
