CREATE TABLE employee
(
  id        INTEGER NOT NULL
    CONSTRAINT employee_pkey
    PRIMARY KEY,
  firstname TEXT,
  lastname  TEXT,
  address   TEXT
);
