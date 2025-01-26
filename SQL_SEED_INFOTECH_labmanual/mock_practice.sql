--1)
select employee_id,last_name,first_name
from employees;

--2)
select distinct(department_name)
from departments;

--3)
select distinct(region_name)
from regions;

--4)
select country_id,country_name
from countries;

--5)
select street_address,postal_code,city
from locations;


--6)
select first_name||' '||last_name as "Name"
from employees;

--7)
select first_name||' '||last_name||' '||job_id as "Employee Details"
from employees;

--8)
select salary ,salary+700 as "Revised salary"
from  employees;

--9)
select e.first_name||' is a '||j.job_title "employee"
from employees e join  jobs j
on e.job_id=j.job_id;

--10)
select department_id||' '||department_name "department info"
from departments;


--11)
select distinct(job_id)
from employees;

--12)
select (salary*5)+1000
from employees;


--13)
select salary ,salary+500*10
from employees;

--14)
select employee_id,last_name,salary,department_id,department_name
from employees natural join departments
where department_id=80;

select distinct(employee_id),department_id
from employees
where department_id=80;

--15)
select *
from departments cross join locations;

--16)
select *
from departments  d left outer join locations l
on l.location_id=d.location_id;


--17)

select count(*)
from departments  d left outer join locations l
on l.location_id=d.location_id;



--18)
select min(hire_date)
from employees
group by department_id
having department_id=80;

--19)
select max(salary)
from employees
group by department_id
having department_id=90;

--20)
select avg(distinct(salary))
from employees;


--21)
select sum(commission_pct)
from employees;

--22)
select distinct(department_name)
from departments;

--23)
select count(distinct(department_name))
from departments;


--24)

select first_name,last_name,job_id
from employees
where department_id=;


--25)

select first_name 
from employees
where department_id=50;

--26)
select count(employee_id)
from employees
where department_id=80
group by job_id;

--27)
select min(salary)
from employees 
group by department_id;

--28)
select avg(salary),department_id
from employees 
where department_id IN(30,50,80)
group by department_id;

--29)
select department_id, employee_id
from employees e
where department_id IN (
    select department_id
    from employees
    group by department_id
    having min(salary) > 5000);

 --28)
select  d.department_id,
    d.department_name,
    avg(e.salary) as average_salary
from employees e join
    departments d on 
    e.department_id = d.department_id
    where d.department_id IN (30, 50, 80) 
  group by  d.department_id, d.department_name;

--30)

select max(avg(salary))
from employees
group by department_id;

--31)
select department_id,job_id,sum(salary)
from employees
group by department_id,job_id
having job_id='IT_PROG';








--32)
select department_id,job_id,avg(salary)
from employees
where job_id='ST_CLERK'
group by department_id,job_id;

--33)
select first_name,salary
from employees
where salary>(select avg(salary) from employees where salary>8000);

--34)
select *
from employees 
where department_id=60;

--35)
select employee_id,first_name,job_id
from employees
where job_id IN('IT_PROG', 'SA_REP','SH_CLERK');

--36)
select 8
from employees
where salary>5000;

--37)
select department_id 
from departments
where location_id between 2100 and 2700;

--38)
select country_name
from countries 
where region_id IN(10,20,40);

--39)
select employee_id,salary,first_name,commission_pct
from employees
where commission_pct is null;

--40)
select employee_id,salary,first_name,commission_pct
from employees
where commission_pct is not null;

--41)
select *
from employees
order by department_id
fetch first 3 rows only;

--42)
select employee_id,first_name||' '||last_name as "Name"
from employees
where salary>8000;

--43)
select *
from employees
where salary>8000
order by department_id;

--44)
select *
from employees
fetch first 10 rows only;

--45)

select * 
from employees
fetch first 15 rows  with ties;


--46)

select employee_id,first_name,job_id 
from employees
order by first_name
fetch first 15 rows with ties;

--47)
select *
from employees
offset 10 rows
fetch next 10 rows only;

--48)

select Upper(first_name)
from employees;

--49)
select UPPER(first_name||' '||last_name)
from employees;

--50)
select lower(first_name||' '||last_name||' is a employee')
from employees;

--51)
select upper(first_name),length(first_name)
from employees;

--52)
select first_name,salary,substr(first_name,3,5)
from employees;

--53)
select lpad(department_name,20,'*')
from departments;

--54)
select first_name ,round(salary,3)
from employees;

--55)
select first_name ,round(salary,3)
from employees;

--56)
select first_name,employee_id,salary
from employees
where mod(salary,2)=0;

--57)
select *
from employees
where mod(employee_id,2)=1;

--58)
select employee_id,first_name,job_id,salary
from employees
where department_id=&department_id;

--59)
select employee_id,first_name||' '||last_name as "Emp name" ,department_id
from employees
where salary>10000 and department_id=90;

--60)
select department_name
from departments
where location_id=&location_id;


select hire_date,job_id
from employees
group by hire_date,job_id;


