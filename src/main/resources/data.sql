DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  dob VARCHAR(250) DEFAULT NULL
);

INSERT INTO customer (first_name, last_name, dob) VALUES
  ('Aliko', 'Dangote', '18th MAY 1974'),
  ('Bill', 'Gates', '17th MAY 1976'),
  ('Folrunsho', 'Alakija', '16th MAY 1975');