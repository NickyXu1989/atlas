DROP TABLE IF EXISTS `cmdb_server_group`;
CREATE TABLE `cmdb_server_group` (
	`id` CHAR(36) NOT NULL ,
	`group_name` VARCHAR(255) NOT NULL,
	`description` VARCHAR(255),
	PRIMARY KEY (`id`),
	UNIQUE KEY (`group_name`)
);

DROP TABLE IF EXISTS `cmdb_network_domain`;
CREATE TABLE `cmdb_network_domain` (
	`id` char(36) NOT NULL,
	`domain_name` VARCHAR(255) NOT NULL,
	`description` VARCHAR(255) ,
	`network_area` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE KEY (`domain_name`)
);


DROP TABLE IF EXISTS `cmdb_server`;
CREATE TABLE `cmdb_server` (
	`id` CHAR(36) NOT NULL,
	`hostname` VARCHAR(255) NOT NULL,
	`ip` VARCHAR(15) NOT NULL,
	`ipv6` VARCHAR(32),
	`network_domain_id`  CHAR(36) NOT NULL,
	`server_group_id`  CHAR(36) NOT NULL,
	PRIMARY KEY (`id`),
	UNIQUE KEY (`hostname`)
);

DROP TABLE IF EXISTS `cmdb_server_credential`;
CREATE TABLE `cmdb_server_credential` (
	`id` CHAR(36) NOT NULL,
	`username` VARCHAR(255) NOT NULL,
	`password` VARCHAR(255) NOT NULL,
	`server_id` CHAR(36) NOT NULL,
	KEY (`id`)
);
