CREATE TABLE users (username varchar(50) NOT NULL PRIMARY KEY, password varchar(200) NOT NULL, enabled boolean NOT null);
CREATE TABLE authorities ( username varchar(50) NOT NULL, authority varchar(50) NOT NULL, CONSTRAINT fk_authorities_users FOREIGN KEY(username) REFERENCES users(username) );

INSERT INTO users VALUES ('felipe.dspereira@gmail.com', '$2a$10$qsYSd6o1xDiulgzZxITEduAu1gmZBgNrxAoF9gdjrn2Df6PPp98Ey', true);
INSERT INTO authorities VALUES ('felipe.dspereira@gmail.com', 'USER');