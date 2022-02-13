CREATE TABLE IF NOT EXISTS Department (
    name varchar(50) NOT NULL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS Employee (
    name varchar(50) NOT NULL PRIMARY KEY,
    lastName varchar(50) NOT NULL,
    address varchar(50) NOT NULL,
    salary INT NOT NULL,
    department varchar(50) NOT NULL,
    FOREIGN KEY (department) REFERENCES DEPARTMENT(name)
);

CREATE TABLE IF NOT EXISTS Project (
    name varchar(50) NOT NULL PRIMARY KEY,
    department varchar(50) NOT NULL,
    FOREIGN KEY (department) REFERENCES DEPARTMENT(name)
);


