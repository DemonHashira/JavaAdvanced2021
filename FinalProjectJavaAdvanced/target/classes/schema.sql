CREATE TABLE IF NOT EXISTS Department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50)
);

CREATE TABLE IF NOT EXISTS Employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50),
    lastName varchar(50),
    address varchar(50),
    salary INT,
    employeeDepartment INT NOT NULL,
    FOREIGN KEY (employeeDepartment) REFERENCES Department(id)
);

CREATE TABLE IF NOT EXISTS Project (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50),
    projectDepartment INT NOT NULL,
    FOREIGN KEY (projectDepartment) REFERENCES Department(id)
);


