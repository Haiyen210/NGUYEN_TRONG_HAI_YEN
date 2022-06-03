create database WEBSERVICE_Exam_03;
go
use WEBSERVICE_Exam_03;
go

create table TblComputer
(
	ComId int primary key identity,
	ComName nvarchar(200),
	Producer nvarchar(100),
	Price float,
	Description ntext
)
go
delete from TblComputer
