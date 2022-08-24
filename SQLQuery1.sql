use LeonPower

create table house(
	houseId int not null primary key identity(1,1),
	houseName nvarchar(50) not null
)

insert into house(houseName) values('sweet house')
insert into house(houseName) values('happy house')

select * from house