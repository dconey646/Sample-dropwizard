Drop database Library;
Create database Library;
Use Library;
Create table Book(id int primary key, title varchar(256) not null, aurthor varchar(65) not null, datePublished date not null, 
category varchar(32) not null, isAvailable tinyint not null);
Create user 'libraryUser'@'localhost' identified by 'MySuperSafePassw0rd!';
Grant Select, Update, Delete on Book to 'libraryUser'@'localhost';
