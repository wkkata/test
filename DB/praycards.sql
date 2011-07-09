# SQL-Front 5.1  (Build 4.16)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.0.1    Database: praycards
# ------------------------------------------------------
# Server version 5.5.11

#
# Source for table pccart
#

DROP TABLE IF EXISTS `pccart`;
CREATE TABLE `pccart` (
  `cartID` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) DEFAULT NULL,
  `productID` int(11) DEFAULT NULL,
  `pickDate` datetime DEFAULT NULL,
  `cartState` decimal(1,0) DEFAULT NULL,
  `fromAddr` varchar(255) DEFAULT NULL COMMENT '来自地址',
  `toAddr` varchar(255) DEFAULT NULL COMMENT '目的地址',
  `content` text COMMENT '信件内容',
  `pic` blob COMMENT '信中图片',
  `fromName` varchar(60) DEFAULT NULL COMMENT '来自人名',
  `toName` varchar(60) DEFAULT NULL COMMENT '收信人名',
  PRIMARY KEY (`cartID`),
  KEY `FK_FK_CART_PRODUCT` (`productID`),
  KEY `FK_FK_CART_USER` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车';

#
# Dumping data for table pccart
#

LOCK TABLES `pccart` WRITE;
/*!40000 ALTER TABLE `pccart` DISABLE KEYS */;
/*!40000 ALTER TABLE `pccart` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pcconfig
#

DROP TABLE IF EXISTS `pcconfig`;
CREATE TABLE `pcconfig` (
  `configID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `configKey` varchar(50) DEFAULT NULL COMMENT '配置KEY',
  `configValue` varchar(50) DEFAULT NULL COMMENT '配置值',
  `configData` varchar(255) DEFAULT NULL COMMENT '相关数据',
  `configDesc` varchar(255) DEFAULT NULL COMMENT '配置描述',
  `configName` varchar(50) DEFAULT NULL COMMENT '配置名',
  PRIMARY KEY (`configID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='保存一些可配的参数';

#
# Dumping data for table pcconfig
#

LOCK TABLES `pcconfig` WRITE;
/*!40000 ALTER TABLE `pcconfig` DISABLE KEYS */;
/*!40000 ALTER TABLE `pcconfig` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pcfdestuser
#

DROP TABLE IF EXISTS `pcfdestuser`;
CREATE TABLE `pcfdestuser` (
  `fduID` int(11) NOT NULL AUTO_INCREMENT,
  `fduName` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '姓名',
  `fduAddr` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '地址',
  `fdumailCode` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '邮编',
  `fduTel` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '联系电话',
  `userID` int(11) DEFAULT NULL COMMENT '外键用户',
  PRIMARY KEY (`fduID`),
  KEY `FK_FK_FDUSER_USER` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='常用目的用户';

#
# Dumping data for table pcfdestuser
#

LOCK TABLES `pcfdestuser` WRITE;
/*!40000 ALTER TABLE `pcfdestuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `pcfdestuser` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pcmanagelog
#

DROP TABLE IF EXISTS `pcmanagelog`;
CREATE TABLE `pcmanagelog` (
  `logID` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) DEFAULT NULL,
  `logType` decimal(3,0) DEFAULT NULL COMMENT '日志种类',
  `logDesc` varchar(255) DEFAULT NULL COMMENT '日志描述',
  `logData` blob COMMENT '日志数据',
  `logState` decimal(5,0) DEFAULT NULL COMMENT '日志状态',
  `logDate` datetime DEFAULT NULL COMMENT '日志时间',
  `reserved1` varchar(255) DEFAULT NULL COMMENT '扩展1',
  `reserved2` varchar(255) DEFAULT NULL COMMENT '扩展2',
  PRIMARY KEY (`logID`),
  KEY `FK_FK_MANAGELOG_USER` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理日志';

#
# Dumping data for table pcmanagelog
#

LOCK TABLES `pcmanagelog` WRITE;
/*!40000 ALTER TABLE `pcmanagelog` DISABLE KEYS */;
/*!40000 ALTER TABLE `pcmanagelog` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pcproduct
#

DROP TABLE IF EXISTS `pcproduct`;
CREATE TABLE `pcproduct` (
  `productID` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品主键',
  `productCode` varchar(10) DEFAULT NULL COMMENT '产品代号',
  `productName` varchar(60) DEFAULT NULL COMMENT '产品名',
  `productState` decimal(1,0) DEFAULT NULL COMMENT '产品状态，0为下架，1为正常，2为推荐，-1为注销',
  `importDate` datetime DEFAULT NULL COMMENT '上架时间',
  `productDes` text COMMENT '产品说明',
  `productPrice` decimal(10,2) DEFAULT NULL COMMENT '产品售价',
  PRIMARY KEY (`productID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品';

#
# Dumping data for table pcproduct
#

LOCK TABLES `pcproduct` WRITE;
/*!40000 ALTER TABLE `pcproduct` DISABLE KEYS */;
/*!40000 ALTER TABLE `pcproduct` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pcrolegroup
#

DROP TABLE IF EXISTS `pcrolegroup`;
CREATE TABLE `pcrolegroup` (
  `rgID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色组ID',
  `rgName` varchar(60) DEFAULT NULL COMMENT '角色组名',
  `rgType` decimal(2,0) DEFAULT NULL COMMENT '角色组类型',
  PRIMARY KEY (`rgID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色组';

#
# Dumping data for table pcrolegroup
#

LOCK TABLES `pcrolegroup` WRITE;
/*!40000 ALTER TABLE `pcrolegroup` DISABLE KEYS */;
INSERT INTO `pcrolegroup` VALUES (1,'管理员',1);
INSERT INTO `pcrolegroup` VALUES (2,'普通成员',2);
INSERT INTO `pcrolegroup` VALUES (3,'Vip会员',3);
/*!40000 ALTER TABLE `pcrolegroup` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pcuser
#

DROP TABLE IF EXISTS `pcuser`;
CREATE TABLE `pcuser` (
  `userID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户表逐渐 ，自增',
  `userNO` varchar(40) DEFAULT NULL COMMENT '用户编号，登录名',
  `userName` varchar(60) DEFAULT NULL COMMENT '用户姓名',
  `userGender` decimal(1,0) DEFAULT NULL COMMENT '用户性别， 0为男性， 1为女性',
  `userEmailAddress` varchar(60) DEFAULT NULL,
  `rgID` int(11) DEFAULT NULL COMMENT '用户角色组',
  `userTel` varchar(11) DEFAULT NULL,
  `userState` decimal(1,0) DEFAULT NULL COMMENT '用户状态，0为禁用，1为正常',
  `userRegDate` datetime DEFAULT NULL COMMENT '注册时间',
  `userPassword` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userID`),
  KEY `FK_FK_USER_GROUP` (`rgID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户';

#
# Dumping data for table pcuser
#

LOCK TABLES `pcuser` WRITE;
/*!40000 ALTER TABLE `pcuser` DISABLE KEYS */;
INSERT INTO `pcuser` VALUES (3,'test','test',0,'test@test.test',1,NULL,0,NULL,'test');
INSERT INTO `pcuser` VALUES (4,'111','111',0,'111@111.111',2,NULL,0,'2011-07-08 16:00:19','111111');
/*!40000 ALTER TABLE `pcuser` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pcuserlog
#

DROP TABLE IF EXISTS `pcuserlog`;
CREATE TABLE `pcuserlog` (
  `logID` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) DEFAULT NULL,
  `productID` int(11) DEFAULT NULL COMMENT '相关产品名',
  `logType` decimal(3,0) DEFAULT NULL COMMENT '日志种类',
  `logDesc` varchar(255) DEFAULT NULL COMMENT '日志描述',
  `logData` blob COMMENT '日志数据',
  `logState` decimal(5,0) DEFAULT NULL COMMENT '日志状态',
  `logDate` datetime DEFAULT NULL COMMENT '日志时间',
  `reserved1` varchar(255) DEFAULT NULL COMMENT '扩展1',
  `reserved2` varchar(255) DEFAULT NULL COMMENT '扩展2',
  PRIMARY KEY (`logID`),
  KEY `FK_FK_USERLOG_PRODUCT` (`productID`),
  KEY `FK_FK_USERLOG_USER` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户日志';

#
# Dumping data for table pcuserlog
#

LOCK TABLES `pcuserlog` WRITE;
/*!40000 ALTER TABLE `pcuserlog` DISABLE KEYS */;
/*!40000 ALTER TABLE `pcuserlog` ENABLE KEYS */;
UNLOCK TABLES;

#
#  Foreign keys for table pccart
#

ALTER TABLE `pccart`
ADD CONSTRAINT `FK_FK_CART_PRODUCT` FOREIGN KEY (`productID`) REFERENCES `pcproduct` (`productID`),
ADD CONSTRAINT `FK_FK_CART_USER` FOREIGN KEY (`userID`) REFERENCES `pcuser` (`userID`);

#
#  Foreign keys for table pcfdestuser
#

ALTER TABLE `pcfdestuser`
ADD CONSTRAINT `FK_FK_FDUSER_USER` FOREIGN KEY (`userID`) REFERENCES `pcuser` (`userID`);

#
#  Foreign keys for table pcmanagelog
#

ALTER TABLE `pcmanagelog`
ADD CONSTRAINT `FK_FK_MANAGELOG_USER` FOREIGN KEY (`userID`) REFERENCES `pcuser` (`userID`);

#
#  Foreign keys for table pcuserlog
#

ALTER TABLE `pcuserlog`
ADD CONSTRAINT `FK_FK_USERLOG_PRODUCT` FOREIGN KEY (`productID`) REFERENCES `pcproduct` (`productID`),
ADD CONSTRAINT `FK_FK_USERLOG_USER` FOREIGN KEY (`userID`) REFERENCES `pcuser` (`userID`);


/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
