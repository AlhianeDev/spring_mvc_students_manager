# SET SQL_SAFE_UPDATES = 0;

/*

CREATE TABLE users (

	user_id INT PRIMARY KEY AUTO_INCREMENT,
    
    full_name VARCHAR(255) NOT NULL,
    
    username VARCHAR(255) NOT NULL,
    
    password VARCHAR(255) NOT NULL,
    
    enabled INT NOT NULL DEFAULT 1

);

*/

/*

CREATE TABLE user_roles (

	user_role_id INT PRIMARY KEY AUTO_INCREMENT,
    
    username VARCHAR(255) NOT NULL,
    
    role VARCHAR(255) NOT NULL

);

*/

# INSERT INTO users (full_name, username, password) VALUES ("Lahcen Alhiane", "lalhiane", "lalhiane1899");

# INSERT INTO user_roles (username, role) VALUES ("lalhiane", "ROLE_ADMIN");

# INSERT INTO user_roles (username, role) VALUES ("lalhiane", "ROLE_USER");

# SELECT username, password FROM users WHERE username = "aicha1234";

# TRUNCATE users;

/*

CREATE TABLE students (

	id INT PRIMARY KEY AUTO_INCREMENT,
    
    full_name VARCHAR(255) NOT NULL,
    
	age INT NOT NULL,
    
    gender_id INT NOT NULL,
    
    country_id INT NOT NULL

);

*/

# ALTER TABLE students RENAME COLUMN id TO primary_student_id;

# INSERT INTO students (full_name, age, gender_id, country_id) VALUES ("Alhiane Lahcen", 25, 1, 1);

# INSERT INTO students (full_name, age, gender_id, country_id) VALUES ("Alhiane Aicha", 23, 2, 2);

# INSERT INTO students (full_name, age, gender_id, country_id) VALUES ("Alhiane Ahmed", 21, 1, 3);

/*

CREATE TABLE genders (

	id INT PRIMARY KEY AUTO_INCREMENT,
    
	gender VARCHAR(255) NOT NULL

);

*/

# ALTER TABLE genders RENAME COLUMN id TO primary_gender_id;

# INSERT INTO genders (gender) VALUES ("Male");

# INSERT INTO genders (gender) VALUES ("Female");

/*

CREATE TABLE countries (

	id INT PRIMARY KEY AUTO_INCREMENT,
    
	country VARCHAR(255) NOT NULL

);

*/

# ALTER TABLE countries RENAME COLUMN id TO primary_country_id;

# INSERT INTO countries (country) VALUES ("USA");

# INSERT countries (country) VALUES ("Morocco");

# INSERT countries (country) VALUES ("Algeria");

# INSERT countries (country) VALUES ("Palestine");

# INSERT countries (country) VALUES ("Egypt");

# INSERT countries (country) VALUES ("Saudi Arabia");

# DELETE FROM countries WHERE id = 3;

# DELETE FROM users WHERE username = "adb1234";

/*

SELECT * FROM students 

INNER JOIN genders ON genders.primary_gender_id = students.gender_id 

INNER JOIN countries ON countries.primary_country_id = students.country_id

# WHERE students.id = 2;

*/
