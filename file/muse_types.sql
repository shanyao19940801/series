create table muse_data_dict(
	id int primary key,
	name varchar(20) comment '美剧名称',
	value int comment '枚举值',
	type varchar(20) comment '枚举类型',
	inserttime timestamp  comment '插入时间',
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间'#如果不插入则自动插入系统时间	
);

alter table muse_data_dict auto_increment = 1000;