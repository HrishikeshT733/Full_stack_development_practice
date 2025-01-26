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
 
 
 select first_name||' joined on '||to_char(hire_date,'fmddspth "of" Month yyyy') as "data"
 from employees
 where hire_date<'01-03-15';
 
 
 select last_name,hire_date,
 (case when (sysdate-hire_date)/365>=5 and (sysdate-hire_date)/365<10  then '5 Years of service'
       when (sysdate-hire_date)/365>=10 and (sysdate-hire_date)/365<15  then '10 Years of service'
       when (sysdate-hire_date)/365>=15  then '15 Years of service'
else 'Maybe next year !'
END) "Employee Service",(sysdate-hire_date)/365,trunc((sysdate-hire_date)/365)
from employees;
 
 
 select salary,
 DECODE (trunc(salary/2000,0),
                    0,'NOTAX',
                    1,'0.02',
                    2,'0.05',
                    3,'0.07',
                    4,'0.10','0.15') "Taxes"
                    from employees;
        
        
select job_id,
case  job_id when 'AD_PRES' then 'A' 
            when 'ST_MAN' then 'B' 
            when 'IT_PROG' then 'C' 
            when 'SA_REP' then 'D' 
            when 'ST_CLERK' then 'E'
            else '0' END "CASE",
case  when job_id='AD_PRES' then 'A' 
            when job_id='ST_MAN' then 'B' 
            when job_id='IT_PROG' then 'C' 
            when job_id='SA_REP' then 'D' 
            when job_id='ST_CLERK' then 'E'
            else '0' END "SEARCH_CASE",
DECODE (job_id , 'AD_PRES' , 'A' 
            , 'ST_MAN' ,'B' 
            ,'IT_PROG' , 'C' 
            , 'SA_REP' , 'D' 
            , 'ST_CLERK' , 'E'
            , '0' ) "DECODE"
    from employees;
    
    
    select last_name,to_char(hire_date,'HH24:MI:SS')"Time"
    from employees
    where last_name='Taylor';
    
    select hire_date,
    case when  to_char(hire_date,'mm') between 1 and 3 then 'Q1'
        when  to_char(hire_date,'mm') between 4 and 6 then 'Q2'
        when  to_char(hire_date,'mm') between 7 and 9 then 'Q3'
        when  to_char(hire_date,'mm') between 10 and 12 then 'Q4'
    else 'Invalid_Date' end Quater_of_year
    from employees;
    
    
select lpad('*',round(salary/1000),'*') ,salary from employees;
            
            
--Group Functions
select count(*)
from employees
where department_id=50;

select count(employee_id)-count(distinct(manager_id))
from employees;

select count(distinct(nvl(commission_pct,0))) ,count(employee_id)
from employees;
  
select avg(commission_pct)
from employees;


select avg(nvl(commission_pct,0))
from employees;

select count(nvl(commission_pct,0))--to count null values in the table
from employees
where commission_pct is  NULL;
 
 select  employee_id,first_name
 from employees
 where department_id=30
 order by hire_date desc
 fetch first 1 rows only;
 
 
 select job_id,count(employee_id)
 from employees
 where job_id='IT_PROG'
 group by job_id;


select department_id,job_id,sum(salary)
from employees
group by department_id,job_id
order by department_id,job_id;

select department_id,max(salary)
from employees
group by department_id
having max(salary)>10000;


select job_id,sum(salary) payroll
from employees
where job_id not like '%REP%'
group by job_id
having sum(salary)>13000
order by sum(salary) desc;


select  department_name
from departments join locations
using(location_id)
where city='Seattle';

select d.department_name,e.first_name
from employees e join departments d
on e.employee_id=d.manager_id;

select employee_id,city, department_name,country_name
from employees e
join departments d
using (department_id)
join locations l
using(location_id)
join countries c
using(country_id);


select emp.first_name "Employee name",
mgr.first_name "Manager name"
from employees emp left  outer join employees mgr
on emp.manager_id=mgr.employee_id;

---Subqueries
select employee_id
from employees
where department_id=(select department_id
from departments where department_name='Executive');


select department_name
from departments
where location_id=(select location_id
from locations where city='Seattle');

select last_name,job_id,salary
from employees
where job_id=(select job_id from employees where last_name='Davies')
AND salary>(select salary from employees where last_name='Davies');

select department_name
from departments
where manager_id=(select employee_id from employees where first_name='Den')
AND   location_id=(select location_id from locations where city='Seattle');

select first_name
from employees 
where salary=(select salary from employees order by salary desc offset 1 rows fetch next 1 rows only);

select first_name
from employees 
where salary=(select max(salary) from employees 
where salary<(select max(salary )from employees));

select first_name ,job_id
from employees
where salary < ALL(select salary from employees where job_id=(select job_id from jobs where job_title='Programmer'));

select count(e.employee_id),d.department_name
from employees e join departments d
using(department_id)
group by department_name;

select e.last_name,m.last_name
from employees e join employees m
on e.manager_id=m.employee_id

select salary 
from employees 
order by salary desc 
offset 1 rows 
fetch next 1 rows  
with ties;