-- Sample records for departments table
INSERT INTO departments (name)
VALUES
    ('HR'),
    ('Finance'),
    ('Marketing'),
    ('IT'),
    ('Sales');

-- Sample records for positions table
INSERT INTO positions (name, department_id)
VALUES
    ('HR Manager', 1),
    ('Accountant', 2),
    ('Marketing Specialist', 3),
    ('Software Engineer', 4),
    ('Sales Representative', 5),
    ('HR Assistant', 1),
    ('Finance Manager', 2),
    ('Marketing Manager', 3),
    ('Database Administrator', 4),
    ('Sales Manager', 5);

-- Sample records for employees table
INSERT INTO employees (full_name, is_male, person_id, dob, native_place, permanent_place, issue_date, issue_place, start_date, department_id, position_id)
VALUES
    ('John Smith', true, '1234567890', '1985-03-15', 'New York', 'New York', '2005-05-20', 'New York', '2020-01-10', 1, 1),
    ('Jane Doe', false, '9876543210', '1990-07-25', 'Los Angeles', 'Los Angeles', '2008-08-30', 'Los Angeles', '2015-02-15', 2, 2),
    ('Michael Johnson', true, '5678901234', '1988-11-10', 'Chicago', 'Chicago', '2006-09-12', 'Chicago', '2018-04-05', 3, 3),
    ('Emily Wilson', false, '3456789012', '1995-04-02', 'Houston', 'Houston', '2010-03-08', 'Houston', '2019-06-20', 4, 4),
    ('David Lee', true, '6543210987', '1980-09-18', 'San Francisco', 'San Francisco', '2007-07-14', 'San Francisco', '2017-11-30', 5, 5),
    ('Lisa Brown', false, '7890123456', '1992-12-07', 'Miami', 'Miami', '2009-12-04', 'Miami', '2022-03-25', 1, 6),
    ('Robert Wilson', true, '2345678901', '1987-06-22', 'Dallas', 'Dallas', '2004-02-19', 'Dallas', '2014-07-12', 2, 7),
    ('Mary Johnson', false, '8901234567', '1983-02-28', 'Phoenix', 'Phoenix', '2005-11-11', 'Phoenix', '2021-08-08', 3, 8),
    ('William Davis', true, '4567890123', '1993-05-14', 'Seattle', 'Seattle', '2007-06-07', 'Seattle', '2016-09-17', 4, 9),
    ('Samantha White', false, '0123456789', '1997-08-03', 'Boston', 'Boston', '2011-10-23', 'Boston', '2020-12-30', 5, 10),
    ('James Johnson', true, '1234509876', '1984-01-09', 'New York', 'New York', '2003-04-15', 'New York', '2017-05-22', 1, 1),
    ('Jennifer Smith', false, '9876123450', '1989-03-21', 'Los Angeles', 'Los Angeles', '2005-07-10', 'Los Angeles', '2019-03-02', 2, 2),
    ('Christopher Brown', true, '5678012345', '1986-07-30', 'Chicago', 'Chicago', '2009-12-01', 'Chicago', '2022-09-14', 3, 3),
    ('Jessica Davis', false, '3456780123', '1996-04-17', 'Houston', 'Houston', '2012-08-27', 'Houston', '2020-11-10', 4, 4),
    ('Andrew Lee', true, '6543012345', '1981-11-15', 'San Francisco', 'San Francisco', '2006-03-09', 'San Francisco', '2018-06-18', 5, 5),
    ('Michelle Brown', false, '7890123456', '1994-02-10', 'Miami', 'Miami', '2010-11-05', 'Miami', '2021-04-09', 1, 6),
    ('Daniel Wilson', true, '2345678901', '1982-09-26', 'Dallas', 'Dallas', '2008-05-20', 'Dallas', '2015-08-02', 2, 7),
    ('Emily Johnson', false, '8901123456', '1990-12-14', 'Phoenix', 'Phoenix', '2003-06-30', 'Phoenix', '2019-10-12', 3, 8),
    ('Joseph Davis', true, '4567890123', '1991-04-28', 'Seattle', 'Seattle', '2007-09-15', 'Seattle', '2020-12-10', 4, 9),
    ('Olivia White', false, '0123456789', '1998-06-05', 'Boston', 'Boston', '2014-03-18', 'Boston', '2022-07-05', 5, 10);
