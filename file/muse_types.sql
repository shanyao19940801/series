create table muse_data_dict(
	id int primary key auto_increment comment 'id',
	name varchar(20) comment '��������',
	value int comment 'ö��ֵ',
	type varchar(20) comment 'ö������',
	inserttime timestamp  comment '����ʱ��',
	updatetime timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '����ʱ��'#������������Զ�����ϵͳʱ��	
);

alter table muse_data_dict auto_increment = 1000


insert into muse_data_dict(name,value,type,inserttime) value('���Ӿ�',1,'Ӱ������',now()),('��Ӱ',2,'Ӱ������',now())
		,('�պ�',1,'����',now())
,('ŷ��',2,'����',now())
,('���',1,'Ӱ��״̬',now())
,('����',2,'Ӱ��״̬',now())
,('����',1,'��Դ����',now())
,('�ٶ���',2,'��Դ����',now())
,('����',1,'������',now())
,('����',2,'������',now())