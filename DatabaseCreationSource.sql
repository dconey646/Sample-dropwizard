Drop database Library;
Create database Library;
Use Library;

Create table Book(id int primary key auto_increment, title varchar(256) not null, author varchar(65) not null, yearPublished int not null, 
category varchar(45) not null, isAvailable tinyint not null);
Drop user 'libraryUsrer'@localhost;
Create user 'libraryUser'@localhost identified by 'MySuperSafePassw0rd!';
Grant Select, Update, Delete on Book to 'libraryUser'@'localhost';

Insert into Book(title, author, yearPublished, category, isAvailable) values('Linux Complete', 'Grant Taylor', 1999, 'Technical', 0);
Insert into Book(title, author, yearPublished, category, isAvailable) values('Pandora\'s Box', 'Andrew A. Adams & Rachel J. McCrindle', 1969, 'Delivery - Project Management', 0);
Insert into Book(title, author, yearPublished, category, isAvailable) values('The Project Management', 'Richard Newton', 1964, 'Technical - Project Management', 0); 
Insert into Book(title, author, yearPublished, category, isAvailable) values('Refractoring Databases', 'Scott W.Ambler & Pramod J. Sadalage', 2006, 'Technical - Database Administration', 0);
Insert into Book(title, author, yearPublished, category, isAvailable) values('TCP/IP Network Administration', 'Craig Hunt', 1994, 'Technical - Networking', 0);
Insert into Book(title, author, yearPublished, category, isAvailable) values('TCP/IP Network Administration', 'Craig Hunt', 1994, 'Technical -Networking', 1);

