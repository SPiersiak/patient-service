DROP TABLE IF EXISTS patient;
DROP TABLE IF EXISTS lek;
DROP TABLE IF EXISTS skierowanie;
DROP TABLE IF EXISTS recepta;
DROP TABLE IF EXISTS badanie;

CREATE TABLE IF NOT EXISTS skierowanie (
  ID INT AUTO_INCREMENT PRIMARY KEY,
  LEKARZ VARCHAR(250) NOT NULL,
  DATA_WYSTAWIENIA TIMESTAMP,
  OPIS VARCHAR(250) NOT NULL
);
INSERT INTO skierowanie (LEKARZ, DATA_WYSTAWIENIA, OPIS) VALUES
('Jan Kowalski', (CAST(N'2021-09-01' AS Date)), 'skierowanie na badanie kontrolne'),
('Janina Kowalska', (CAST(N'2021-10-01' AS Date)), 'skierowanie na badanie ortopedyczne');


CREATE TABLE IF NOT EXISTS patient (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  FIRST_NAME VARCHAR(250) NOT NULL,
  LAST_NAME VARCHAR(250) NOT NULL,
  PESEL VARCHAR(250) NOT NULL,
  MIEJSCOWOSC VARCHAR(250) NOT NULL
);

INSERT INTO patient (FIRST_NAME, LAST_NAME, PESEL, MIEJSCOWOSC) VALUES
  ('Stefan', 'Kołkowski', '123132213321', 'Inowrocław'),
  ('Andrzej', 'Ireneuszowski', '2131321313213', 'Wrocław'),
  ('Mariola', 'Szymonowski', '321321321321', 'Rzeszów'),
  ('Gerwazy', 'Marcinkowski', '3213213123', 'Kraków');

CREATE TABLE IF NOT EXISTS lek (
  ID INT AUTO_INCREMENT PRIMARY KEY,
  NAZWA VARCHAR(250) NOT NULL,
  PRODUCENT VARCHAR(250) NOT NULL,
  CENA INT NOT NULL
);

INSERT INTO lek (NAZWA, PRODUCENT, CENA) VALUES
('Ibum', 'DOZ', 15),
('Tran', 'Millers', 20),
('Witamina C', 'Prawoskrętna i napromieniowana', 32),
('Ashwagandha', 'Ashwagandha to nawet nie jest lek :/', 45);

CREATE TABLE IF NOT EXISTS recepta (
  ID INT AUTO_INCREMENT PRIMARY KEY,
  PESEL VARCHAR(250) NOT NULL,
  DATA_WAZNOSCI TIMESTAMP,
  LEKARZ VARCHAR(250)NOT NULL,
  DATA_WYSTAWIENIA TIMESTAMP
);

INSERT INTO recepta (PESEL, DATA_WAZNOSCI, LEKARZ, DATA_WYSTAWIENIA) VALUES
('32131232131', (CAST(N'2021-06-20' AS Date)), 'Waldemar Kiepski', (CAST(N'2021-07-20' AS Date))),
('32131232132', (CAST(N'2021-05-19' AS Date)), 'Tony Stark', (CAST(N'2021-06-19' AS Date))),
('32131232134', (CAST(N'2021-04-17' AS Date)), 'Neo z Matrixa', (CAST(N'2021-05-17' AS Date))),
('32131232135', (CAST(N'2021-02-01' AS Date)), 'Doktor Żiwago', (CAST(N'2021-03-01' AS Date))),
('32131232137', (CAST(N'2021-07-10' AS Date)), 'Doktor Lubicz', (CAST(N'2021-08-10' AS Date)));

CREATE TABLE IF NOT EXISTS badanie (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    TYP VARCHAR(250) NOT NULL,
    OPIS VARCHAR(250) NOT NULL,
    PESEL VARCHAR(250) NOT NULL,
    DATA_BADANIA TIMESTAMP,
    LEKARZ VARCHAR(250)NOT NULL,
    GODNOSC VARCHAR(250)NOT NULL
    );

INSERT INTO badanie (TYP, OPIS, PESEL, DATA_BADANIA, LEKARZ, GODNOSC) VALUES
('Kolonoskopia', 'badanko takie dziwne', '11111111111', (CAST(N'2021-07-25' AS Date)),'Doktur Lubicz','Waldemar Kiepski'),
('Gastroskopia', 'ciut mniej dziwne badanko', '44444444444', (CAST(N'2021-07-25' AS Date)),'Doktor Strencz','Godność utracona'),
('Badanie_kontrolne', 'zwykle badanko u pana doktura', '22222222222', (CAST(N'2021-07-25' AS Date)),'Doktur Hałs','Jarosław Psikuta');
