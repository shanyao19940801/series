create table muse_data_dict(
	id int primary key,
	name varchar(20) comment '��������',
	value int comment 'ö��ֵ',
	type varchar(20) comment 'ö������',
	inserttime timestamp  comment '����ʱ��',
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '����ʱ��'#������������Զ�����ϵͳʱ��	
);

alter table muse_data_dict auto_increment = 1000;