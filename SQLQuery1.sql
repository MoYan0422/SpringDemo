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
