DROP TABLE IF EXISTS patient;
CREATE TABLE patient
(
    ID         INT AUTO_INCREMENT PRIMARY KEY,
    FIRST_NAME VARCHAR(250) NOT NULL,
    LAST_NAME  VARCHAR(250) NOT NULL
);
INSERT INTO patient (FIRST_NAME, LAST_NAME)
VALUES ('Ala', 'Makota'),
       ('Ola', 'Dom'),
       ('Jan', 'Kowalski');