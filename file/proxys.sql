create table proxy(
	id int primary key auto_increment comment 'id',
	port int comment '�˿�',
	ip varchar(15) comment 'ip',
	datasource varchar(20) comment '��Դ',
	inserttime timestamp  comment '����ʱ��',
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '����ʱ��'#������������Զ�����ϵͳʱ��	
);

alter table proxy auto_increment = 1000

