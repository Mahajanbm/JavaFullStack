CREATE TABLE Employee
(
  EmployeeID INT PRIMARY KEY,
  FullName VARCHAR(50),
  Gender VARCHAR(50),
  ManagerID INT
);

-- Insert the following records
INSERT INTO Employee VALUES(1, 'Pranaya', 'Male', 3);
INSERT INTO Employee VALUES(2, 'Priyanka', 'Female', 1);
INSERT INTO Employee VALUES(3, 'Preety', 'Female', NULL);
INSERT INTO Employee VALUES(4, 'Anurag', 'Male', 1);
INSERT INTO Employee VALUES(5, 'Sambit', 'Male', 1);
INSERT INTO Employee VALUES(6, 'Rajesh', 'Male', 3);
INSERT INTO Employee VALUES(7, 'Hina', 'Female', 3);
