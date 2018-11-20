create table userCenter.uc_user
(
	user_id bigint auto_increment
		primary key,
	user_name varchar(50) default '' not null,
	password varchar(128) default '' not null,
	gender tinyint default '0' not null,
	header_photo varchar(255) default '' not null,
	email varchar(100) default '' not null,
	mobile varchar(20) default '' not null,
	country_code varchar(5) default '' not null,
	type tinyint default '0' not null,
	activate_status bit default b'0' not null,
	activate_code varchar(50) default '' not null,
	reset_password_code varchar(50) default '' not null,
	check_in_time datetime default CURRENT_TIMESTAMP not null,
	status tinyint default '1' not null
)
charset=utf8
;
