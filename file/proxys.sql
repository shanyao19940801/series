create table proxy(
	id int primary key auto_increment comment 'id',
	port int comment '端口',
	ip varchar(15) comment 'ip',
	datasource varchar(20) comment '来源',
	inserttime timestamp  comment '插入时间',
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间'#如果不插入则自动插入系统时间	
);

alter table proxy auto_increment = 1000

