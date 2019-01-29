DROP DATABASE IF EXISTS `shop_0`;

CREATE DATABASE `shop_0`;

USE `shop_0`;

CREATE TABLE `shop_info_0` (
  `shop_id` bigint(80) NOT NULL,
  `shop_name` varchar(45) DEFAULT NULL,
  `account` varchar(45) NOT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `shop_info_1` (
  `shop_id` bigint(80) NOT NULL,
  `shop_name` varchar(45) DEFAULT NULL,
  `account` varchar(45) NOT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP DATABASE IF EXISTS `shop_1`;

CREATE DATABASE `shop_1`;

USE `shop_1`;

CREATE TABLE `shop_info_0` (
  `shop_id` bigint(80) NOT NULL,
  `shop_name` varchar(45) DEFAULT NULL,
  `account` varchar(45) NOT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `shop_info_1` (
  `shop_id` bigint(80) NOT NULL,
  `shop_name` varchar(45) DEFAULT NULL,
  `account` varchar(45) NOT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
