use LeonPower

create table house(
	houseId int not null primary key identity(1,1),
	houseName nvarchar(50) not null
)

insert into house(houseName) values('sweet house')
insert into house(houseName) values('happy house')

select * from house

create table Account(
	Id int not null primary key identity(1,1),
	username nvarchar(50) not null,
	userpwd nvarchar(50) not null
);

insert into Account (username ,userpwd) values('dusty','test123')
insert into Account (username ,userpwd) values('rabbit','123test')


select * from Account


use LeonPower;

create table Picture(
id int not null primary key identity(1,1),
fliename nvarchar(50) not null,
picture varbinary(max)not null
)


select * from Picture


create table Profiles(
id int not null primary key identity(1000,1),
name nvarchar(50) not null,
address nvarchar(50) not null,
phone nvarchar(50) not null

)

insert into Profiles(name ,address,phone)values('june','taipei','02-2453-5514');
insert into Profiles(name ,address,phone)values('erir','taichung','04-2658-8874');
insert into Profiles(name ,address,phone)values('larry','kaohsiung','07-742-8824');

select * from Profiles

create table users(
id int primary key not null  identity(1001,1),
userName nvarchar(50) not null
)

insert into users(userName) values('maverick');
insert into users(userName) values('goose');

select * from users

use LeonPower

create table Bird(
bid int not null primary key identity(100,1),
bname nvarchar(50) not null,
size nvarchar(1) not null,
color nvarchar(20) not null,
age int not null
)

insert into Bird(bname, size, color, age) values('dove','s','white', 3);
insert into Bird(bname, size, color, age) values('bluebird','m','blue', 5);

select * from Bird;

use LeonPower

select * from users

create table userProfiles(
id int not null primary key identity(1000,1),
name nvarchar(50) not null,
emailaddress nvarchar(50) not null,
 address nvarchar(50) not null,
password nvarchar(2000) not null,
phone nvarchar(50) not null
)
select * from userProfiles


create table Product(
	PID int not null primary key identity(10000,1),
	PNAME nvarchar(50) not null ,
	PRICE int not null,
	QUANTITY int not null,
	PDATE date not null,
	NOTE nvarchar(200) not null

);
insert into Product(pname, price, quantity, pdate, note) values('banana',20,6,'2022-03-15','expensive');
insert into Product(pname, price, quantity, pdate, note) values('apple',40,10,'2022-04-25','good');
insert into Product(pname, price, quantity, pdate, note) values('grape',90,3,'2022-05-10','yummy');
insert into Product(pname, price, quantity, pdate, note) values('pineapple',50,7,'2022-07-03','none');
insert into Product(pname, price, quantity, pdate, note) values('jackfruit',499,2,'2022-09-27','southeast');
insert into Product(pname, price, quantity, pdate, note) values('durian',699,3,'2022-06-30','nice');
insert into Product(pname, price, quantity, pdate, note) values('lichi',10,20,'2022-01-01','good to eat');

select * from Product;

create table purchaseOrder(
oid int not null primary key identity(10000,1),
amount int not null,
odate date not null,
userid int not null,
productid int not null
);
