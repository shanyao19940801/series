create table muse_data_dict(
	id int primary key auto_increment comment 'id',
	name varchar(20) comment '美剧名称',
	value int comment '枚举值',
	type varchar(20) comment '枚举类型',
	inserttime timestamp  comment '插入时间',
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间'#如果不插入则自动插入系统时间	
);

alter table muse_data_dict auto_increment = 1000


insert into muse_data_dict(name,value,type,inserttime) value('电视剧',1,'影视类型',now()),('电影',2,'影视类型',now())
		,('日韩',1,'地区',now())
,('欧美',2,'地区',now())
,('完结',1,'影视状态',now())
,('连载',2,'影视状态',now())
,('种子',1,'资源类型',now())
,('百度云',2,'资源类型',now())
,('标清',1,'清晰度',now())
,('高清',2,'清晰度',now())