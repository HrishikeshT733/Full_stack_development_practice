--round(),trunc(),mod(),floor()
select Round(45.926,2),trunc(45.926,2),ceil(2.83),ceil(2.45),floor(2.83),floor(2.12),mod(1600,300),round(196.23,-2) from dual;


select employee_id as "Even Numbers",last_name 
from employees
where mod(employee_id,2)=0
order by employee_id;


--power() function
select power(4,3)
from dual;

--Dates function
--sysdate--means system date of database ,current_date --means current date,current_timestamp,sessiontimezone
select current_date,current_timestamp,sessiontimezone,sysdate
from dual;

--count number of times character occurs in string
select length('seed')-length(replace('seed','e',''))
from dual;

--arithmetic operations in sql between date ,below will return number of days
select last_name,Round((sysdate-hire_date)/7) as weeks
from employees
where department_id=90;

--months_between('arg1','arg2'),add_months(arg1,arg2),next_day(arg1,arg2),last_day(arg1,arg2),last_day()-extracts the last date of given month
select months_between('01-May-24',sysdate)
from dual;

select add_months(sysdate,2),last_day('01-FEB-25'),next_day(sysdate,'friday')
from dual;

 --data type conversion TO_CHAR(),TO_NUMBER(),TO_DATE(),fm-fm is used to supress the leading 0's and padded blank spaces
   select to_char(hire_date,'dd-month-yyyy year mm '),
   to_char(hire_date,'fmdd-month-yyyy'),to_char(hire_date,'RR')
   from employees;
   
--
select to_char(sysdate,'HH12:MI:SS AM'),
to_char(sysdate,'dd "of" Month'),
to_char(sysdate,'ddspth "of" Month')
from dual;
 
 select *
 from employees
 where to_char(hire_date,'MON')='FEB' and to_char(hire_date,'yy')='17';
 
 
 
--- we can only use '0' or '9'
select to_char(51234567.879,'9999,999,999.99'),
to_char(451234567.899,'fm$0000,000,000.00'),
to_char(451234567.899,'$0000,000,000.00'),
to_char(451234567.899,'L0000,000,000.00')
from dual;
 
 
---NVL and NVL2 function
select salary,commission_pct,
nvl(commission_pct,1)
from employees;

select salary,commission_pct,
nvl2(commission_pct,'comm','no comm')
from employees;


--NULLIF function

select first_name ,length(first_name) "Exp1",last_name,length(last_name) "Exp2",
nullif(length(first_name),length(last_name)) result
from employees;


--COALESCE() function
select state_province,postal_code,city,
coalesce(state_province,postal_code,city)
from locations;

--CASE function
select last_name,job_id,salary,
CASE job_id when 'IT_PROG' THEN 1.10*salary
            when 'ST_CLERK' THEN 1.15*salary
            when 'SA_REP' THEN 1.20*salary
    ELSE salary END   "REVISED SALARY"
from employees;

--Searched CASE expression
select last_name,salary,
(CASE when salary<5000 then 'Low'
      when salary<10000 then 'Medium'
      when salary<20000 then 'Good'
      ELSE 'Excellent'
END)  qualified_salary
from employees;

---DECODE Function
select last_name,job_id,salary,
DECODE (job_id , 'IT_PROG' , 1.10*salary
            ,'ST_CLERK' , 1.15*salary
            , 'SA_REP' , 1.20*salary
    , salary )   "REVISED SALARY"
from employees;


--ROUND and TRUNC of dates
select round(to_date('14-AUG-24','dd-MON-yy'),'month'),
round(to_date('14-AUG-24','dd-MON-yy'),'year'),
round(sysdate,'month'),
round(sysdate,'year'),
trunc(sysdate,'month'),
trunc(sysdate,'year')
from dual;



--Group Functions
---group functions AVG and SUM.MAX,MIN,Count(*)
select AVG(salary),MAX(salary),MIN(salary),SUM(salary),count(*)
from employees
where job_id like '%REP%';


--listagg
select listagg(first_name,'*') within group(order by salary)
from employees;

--stddev and variance          variance is equal to the square of stddev
select stddev(salary),variance(salary)
from employees;


--group by
select department_id,avg(salary)
from employees
group by department_id 
order by 1;

--having clause-- it is substitute of where clause when group by function is used 
select department_id,count(employee_id)
from employees
group by department_id
having count(employee_id)>5;


--nested group by functions
select max(avg(salary))
from employees
group by department_id;



--Joins 
---Inner joins()
--Equi joins
--natural joins -it is one of the type of  equi-joins
select *
from employees natural join jobs;

--'join with using clause' keywords-it is one of the type of  equi-joins
select * from
employees join departments
using(department_id);

--'join with using clause' with alias and qualifier 
select first_name,department_id,department_name,em.manager_id,d.manager_id
from employees e join departments d
using(department_id);

--join with ON Clause--used when column names is not matching in multiple tables

--in below example join is used within same tables
select emp.first_name "Employee name",
mgr.first_name "Manager name"
from employees emp join employees mgr
on emp.manager_id=mgr.employee_id;

--Cartesian Product
--creating cross joins
select last_name,department_name
from employees CROSS JOIN departments;


--three way joins usin ON clause--we can join as many tables as possible using this method
select employee_id,city, department_name,country_name
from employees e
join departments d
on d.department_id=e.department_id
join locations l
on d.location_id=l.location_id
join countries c
on l.country_id=c.country_id;


--using AND and WHERE statements -- AND is better than WHERE in perfomance and is more efficient i.e  runtime 
select *
from employees e join departments d
on (e.department_id=d.department_id) AND e.manager_id=149;

select *
from employees e join departments d
on e.department_id=d.department_id
where e.manager_id=149;

----Non-Equi joins
select e.employee_id,e.salary,j.grade
from employees e join job_grades j
on salary between j.lowest_salary and j.highest_salary;

--outer joins
--left outer join 
select employee_id,d.department_id,department_name
from employees e left outer join departments d
on e.department_id=d.department_id;

--right outer join
select employee_id,d.department_id,department_name
from employees e right outer join departments d
on e.department_id=d.department_id;

--full outer join
select employee_id,d.department_id,department_name
from employees e full outer join departments d
on e.department_id=d.department_id;


--Subqueries

--single row subqueries
--question --who is hired after Davies
select *
from employees
where hire_date>(select hire_date
from employees
where last_name='Davies');

--multi row sub-queries
select department_id
from departments
group by department_id
having avg(department_id);

--Operators-IN ,ANY,ALL
--1)
select last_name,job_id,salary
from employees
where job_id IN(select job_id from employees where last_name ='Taylor');

--2)
select last_name,job_id,salary
from employees
where job_id=ANY(select job_id from employees where last_name ='Taylor');

--1) and 2) are same i.e  '=ANY' is same as 'IN'
--and '<>All' is same as 'Not IN' 
--3)
select last_name,job_id,salary
from employees
where job_id<>all(select job_id from employees where last_name ='Taylor');

--4)
select last_name,job_id,salary
from employees
where job_id not in (select job_id from employees where last_name ='Taylor');

--3) and 4) are same i.e '<>All' is same as 'Not IN' 

--Null values in subquery
select first_name
from employees
where employee_id not in(select manager_id from employees );

--above query will return null as inner query is returning one or more than one Null values
-- to solve this problem we use below modified query

select first_name
from employees
where employee_id not in(select manager_id from employees where manager_id is not null);


--user access control
alter session set "_oracle_script"=true;
create user seed
identified by 1234;

create user hrishi
identified by hrishi;

grant create session
to hrishi;
 
grant create table
to hrishi;

grant create procedure
to hrishi;


grant create view
to hrishi;
 
 
 grant create sequence
 to hrishi;
 
 Revoke create view 
 from hrishi;

insert into employees
values(1001,'seam','rushi','xyz',6549332,sysdate,'SI_MAN',6596,null,100,100);

--DML commands
insert into departments
values (70,'Public Relations',100,1700);

create table rh
  (deptno   number(4),
  deptname char(4),
  loc varchar2(8) default 'INDIA');
  
  
insert into rh
values (64,'Hij','USA');

update rh
set deptname='Hj'
where loc='Nepal'
commit;

delete from rh
where loc='USA';

rollback;

commit;

delete from rh;

truncate table rh;

  