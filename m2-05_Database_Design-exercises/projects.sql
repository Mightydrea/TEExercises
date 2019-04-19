
DROP TABLE IF EXISTS employee_project;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS jobtitle;


CREATE TABLE jobtitle(     
jobTitle_id SERIAL,
jobTitle_Name varchar(100) NOT NULL,

CONSTRAINT pk_jobTitle_id PRIMARY KEY (jobTitle_id)

);

CREATE TABLE department(     --created
department_id SERIAL, 
department_name varchar(100) NOT NULL,

CONSTRAINT pk_department_id PRIMARY KEY (department_id)
);

CREATE TABLE project(        
project_id SERIAL,
project_name varchar(100) NOT NULL,
start_date DATE NOT NULL,

CONSTRAINT pk_project_id PRIMARY KEY (project_id)

);


CREATE TABLE employee(   --created
employee_id SERIAL,
first_name varchar(100) NOT NULL,
last_name varchar(100) NOT NULL,
gender varchar(6) NOT NULL,
date_of_birth DATE,
date_of_hire DATE NOT NULL,
department_id INT NOT NULL,
jobTitle_id INT NOT NULL,
CONSTRAINT pk_employee_id PRIMARY KEY (employee_id),
CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(department_id),
CONSTRAINT fk_jobTitle_id FOREIGN KEY (jobTitle_id) REFERENCES jobTitle(jobTitle_id)

);

CREATE TABLE employee_project(
employee_id INTEGER NOT NULL,
project_id INTEGER NOT NULL,

CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES project(project_id)
);

--insert jobtitles
https://bitbucket.org/te-cbus-cohort-7/team2-java-blue-week9-pair-exercises/raw/ddb4db62ecc6cbf6760fc51cce0d0cfd2a851882/m3-12_Capstone/src/test/java/com/techelevator/SurveyDAOTest.javahttps://bitbucket.org/te-cbus-cohort-7/team2-java-blue-week9-pair-exercises/raw/ddb4db62ecc6cbf6760fc51cce0d0cfd2a851882/m3-12_Capstone/src/test/java/com/techelevator/SurveyDAOTest.java
INSERT INTO jobtitle (jobTitle_name) VALUES ('Software Engineer');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Procurement Specialist');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Human Resources Specialist');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Project Manager');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Environmental Specialist');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Database Administrator');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Department Manager');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Contract Specialist');

INSERT INTO jobtitle (jobTitle_name) VALUES ('Customer Service Representative');

--insert departments
INSERT INTO department (department_name) VALUES ('Human Resources Office');

INSERT INTO department (department_name) VALUES ('Procurment Office');

INSERT INTO department (department_name) VALUES ('Contracting Office');

INSERT INTO department (department_name) VALUES ('Benefits Administration');

INSERT INTO department (department_name) VALUES ('Environmental Safety');


--inserting employees
INSERT INTO employee (first_name, last_name, gender, date_of_birth, date_of_hire, department_id, jobTitle_id)         
        VALUES ('Andrea', 'Johnson', 'female', '1984-03-09', '2018-12-15', 4, 8);

INSERT INTO employee (first_name, last_name, gender, date_of_birth, date_of_hire, department_id, jobTitle_id)         
         VALUES ('Allen', 'Dancy', 'male','1960-03-07', '2006-12-09', 2, 2);

INSERT INTO employee (first_name, last_name, gender, date_of_birth, date_of_hire, department_id, jobTitle_id)         
        VALUES ('Makenzie', 'Kisor', 'female','2002-11-06', '2019-02-01', 1, 4);

INSERT INTO employee (first_name, last_name, gender, date_of_birth, date_of_hire, department_id, jobTitle_id)         
        VALUES ('Nahshon', 'Johnson', 'male','1965-Oct-18', '1984-03-09', 5, 9);

INSERT INTO employee (first_name, last_name, gender, date_of_hire, department_id, jobTitle_id)         
        VALUES ('Sarah', 'Chu', 'female','1984-03-09', 2, 5);

INSERT INTO employee (first_name, last_name, gender,date_of_hire, department_id, jobTitle_id)         
        VALUES ('George', 'Foreman', 'male','1973-07-15', 1, 10);

INSERT INTO employee (first_name, last_name, gender, date_of_birth, date_of_hire, department_id, jobTitle_id)         
        VALUES ('Roman', 'Reigns', 'male', '1984-09-10', '2005-10-09', 3, 1);

INSERT INTO employee (first_name, last_name, gender, date_of_birth, date_of_hire, department_id, jobTitle_id)         
        VALUES ('Mike', 'Tyson', 'male', '1950-05-23', '2000-06-06', 5, 8);

INSERT INTO employee (first_name, last_name, gender, date_of_birth, date_of_hire, department_id, jobTitle_id)         
         VALUES ('Rebecca', 'Calhoun', 'female', '1990-09-20','1960-05-07', 2, 6);


--inserting projects
INSERT INTO project (project_name, start_date)
        VALUES ('Operation Morning Glory', '2019-01-04');

INSERT INTO project (project_name, start_date)
        VALUES ('Database Conversion', '2019-02-15');

INSERT INTO project (project_name, start_date)
        VALUES ('Querying tables', '2018-05-16');

INSERT INTO project (project_name, start_date)
        VALUES ('Operation Falcon', '2017-08-17');




