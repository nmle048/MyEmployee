CREATE TABLE departments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE positions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(id)
);

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255) NULL,
    is_male BOOLEAN,
    person_id VARCHAR NULL,
    dob DATE,
    native_place VARCHAR,
    permanent_place VARCHAR,
    issue_date DATE,
    issue_place VARCHAR,
    start_date DATE,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(id),
    position_id INT,
    FOREIGN KEY (position_id) REFERENCES positions(id)
);

