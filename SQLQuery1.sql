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