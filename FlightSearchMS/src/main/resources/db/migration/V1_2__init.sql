CREATE TABLE flight (
		  flightid int(11) NOT NULL AUTO_INCREMENT,
		  flight_number varchar(100) DEFAULT NULL,
		  flight_src varchar(255) DEFAULT NULL,
		  flight_dest varchar(255) DEFAULT NULL,
		  flight_date datetime DEFAULT NULL,
		  fare double DEFAULT NULL,
		  PRIMARY KEY (flightid)
);

CREATE TABLE  passenger (
		  passid int(11) NOT NULL AUTO_INCREMENT,
		  age int(11) DEFAULT NULL,
		  email_id varchar(255) DEFAULT NULL,
		  name varchar(255) DEFAULT NULL,
		  flight_flightid int(11) DEFAULT NULL,
		  PRIMARY KEY (passid),
		  foreign KEY (flight_flightid) references flight(flightid)
);

CREATE TABLE flight_passengers (
		  flight_flightid int(11) NOT NULL,
		  passengers_passid int(11) NOT NULL,
		  PRIMARY KEY (flight_flightid,passengers_passid)
);


INSERT INTO flight (flightid,flight_number,flight_src,flight_dest,flight_date,fare) 
VALUES  (1,'FL_SIN_1011','BOM','SIN','2019-12-15 12:15:00',50000),
		(2,'FL_BOM_2125','DEL','BOM','2019-12-16 12:15:00',20000);
		
INSERT INTO passenger (passid,age,email_id,name,flight_flightid) 
VALUES 
 (1001,25,'abhi@gmail.com','Abhi ',1),
 (1002,26,'chetan@gmail.com','Chetan M',1),
 (1003,25,'shamali@gmail.com','Shamali ',1),
 (1004,26,'vishal@gmail.com','Gauri J',2),
 (1005,20,'tushar@gmail.com','Tushar K',2),
 (1006,22,'ranjit@gmail.com','Ranjit R',2),
 (1007,25,'abc@gmail.com','ABC',2);
 
INSERT INTO flight_passengers (flight_flightid,passengers_passid) 
VALUES 
 (1,1001),
 (1,1002),
 (1,1003),
 (2,1004),
 (2,1005),
 (2,1006),
 (2,1007);
