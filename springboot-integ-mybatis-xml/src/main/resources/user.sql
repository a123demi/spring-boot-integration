CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `username` varchar(255) NOT NULL,
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱|登录帐号',
  `passWord` varchar(32) DEFAULT NULL COMMENT '密码',
  `regTime` datetime DEFAULT NULL COMMENT '创建时间',
  `sex` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

