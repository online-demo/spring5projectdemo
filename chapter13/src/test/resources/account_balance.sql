CREATE TABLE `account_balance` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customerId` int(11) NOT NULL COMMENT '客户号',
  `balance` decimal(10,0) DEFAULT NULL COMMENT '账户余额',
  `adddate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `updatedate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8