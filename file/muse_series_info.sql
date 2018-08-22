create table muse_series_info(
	id int primary key auto_increment comment 'id',
	name varchar(50) comment '名称',
	page_url varchar(200) comment '每集地址',
	type int default 3 comment '类型 3:电视剧，4:电影',
	country varchar(20) comment '国家',
	finish int default 1 comment '是否完结 1：完结，0：未完结',
	inserttime timestamp  comment '插入时间',
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间'#如果不插入则自动插入系统时间
)
#设置主键自增，起始值是100000
alter table muse_series_info AUTO_INCREMENT=100000