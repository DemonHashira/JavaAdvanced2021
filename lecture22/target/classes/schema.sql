CREATE TABLE IF NOT EXISTS USER (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(50) NOT NULL,
    address varchar(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS BOOK (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title varchar(50) NOT NULL,
    price FLOAT NOT NULL
);

CREATE TABLE IF NOT EXISTS ORDERS (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userid INT NOT NULL,
    bookid INT NOT NULL,
    FOREIGN KEY (userid) REFERENCES USER(id),
    FOREIGN KEY (bookid) REFERENCES BOOK(id)
    );