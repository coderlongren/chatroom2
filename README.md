# chatroom2
使用severlet ajax 实现的一个网页版的聊天室




创建数据库:
create database chatroom;
use chatroom;
create table user(
	id int primary key auto_increment,
	username varchar(20),
	password varchar(20),
	type varchar(20)
);


insert into user values (null,'aaa','aaa','admin');
insert into user values (null,'bbb','bbb','user');
insert into user values (null,'ccc','ccc','admin');
insert into user values (null,'ddd','ddd','user');


系统架构:
Servlet+JSP+JavaBean+JDBC
导入Jar包:
* MYSQL:
* 数据库驱动.
* C3P0连接池:
* C3P0
* DBUtils:
* DBUtils
* JavaBean:(可选)
* BeanUtils
* JSP:
* JSTL
