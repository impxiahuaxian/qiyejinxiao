/*
SQLyog Community Edition- MySQL GUI v6.54
MySQL - 5.5.25a : Database - jxc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`jxc` /*!40100 DEFAULT CHARACTER SET gb2312 */;

USE `jxc`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `sex` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `addtime` varchar(50) DEFAULT NULL,
  `sf` varchar(50) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=gb2312;

/*Data for the table `admin` */

insert  into `admin`(`id`,`username`,`password`,`realname`,`sex`,`age`,`tel`,`address`,`addtime`,`sf`) values (1,'admin','111','阿飞哥','on','25','13900000000','成都市金牛区','2020-05-03','管理员'),(13,'xs','111','特朗普','on','25','13533333333','白宫','2020-04-11','销售员'),(14,'kg','111','王大','on','22','18688888888','测试','2020-04-11','库管员');

/*Table structure for table `ck` */

DROP TABLE IF EXISTS `ck`;

CREATE TABLE `ck` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `ckbh` varchar(500) DEFAULT NULL,
  `rkbh` varchar(500) DEFAULT NULL,
  `mc` varchar(500) DEFAULT NULL,
  `fl` varchar(500) DEFAULT NULL,
  `rkjg` float DEFAULT NULL,
  `xsjg` float DEFAULT NULL,
  `sl` int(4) DEFAULT NULL,
  `xszj` float DEFAULT NULL,
  `lr` float DEFAULT NULL,
  `sj` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

/*Data for the table `ck` */

insert  into `ck`(`id`,`ckbh`,`rkbh`,`mc`,`fl`,`rkjg`,`xsjg`,`sl`,`xszj`,`lr`,`sj`) values (1,'CK123456','RK123456123','矿泉水','酒水饮料类',1.2,1.5,10,15,3,'2020-05-03'),(2,'CK1234561','RK1234561','康师傅红烧牛肉面','食品类',2.5,3,30,90,15,'2020-05-03'),(4,'CK11111666','RK123456123','矿泉水','酒水饮料类',1.2,1.5,5,7.5,1.5,'2020-05-03'),(5,'CK11111999','RK123456123','矿泉水','酒水饮料类',1.2,1.5,1,1.5,0.3,'2020-04-11');

/*Table structure for table `cp` */

DROP TABLE IF EXISTS `cp`;

CREATE TABLE `cp` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `mc` varchar(500) DEFAULT NULL,
  `xh` varchar(500) DEFAULT NULL,
  `bz` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gb2312;

/*Data for the table `cp` */

insert  into `cp`(`id`,`mc`,`xh`,`bz`) values (1,'矿泉水','50ML','娃哈哈公司'),(2,'康师傅红烧牛肉面','169G','康师傅'),(3,'足球鞋','43','李宁集团');

/*Table structure for table `fl` */

DROP TABLE IF EXISTS `fl`;

CREATE TABLE `fl` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `mc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=gb2312;

/*Data for the table `fl` */

insert  into `fl`(`id`,`mc`) values (13,'服装类'),(14,'鞋帽类'),(15,'食品类'),(16,'酒水饮料类');

/*Table structure for table `gy` */

DROP TABLE IF EXISTS `gy`;

CREATE TABLE `gy` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `mc` varchar(500) DEFAULT NULL,
  `dh` varchar(500) DEFAULT NULL,
  `bz` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

/*Data for the table `gy` */

insert  into `gy`(`id`,`mc`,`dh`,`bz`) values (1,'娃哈哈公司','01088888888','测试'),(2,'李宁集团','02099999999','测试'),(3,'鼎信集团','01088888888','测试');

/*Table structure for table `kf` */

DROP TABLE IF EXISTS `kf`;

CREATE TABLE `kf` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `mc` varchar(500) DEFAULT NULL,
  `bz` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gb2312;

/*Data for the table `kf` */

insert  into `kf`(`id`,`mc`,`bz`) values (3,'XX公司','测试');

/*Table structure for table `rk` */

DROP TABLE IF EXISTS `rk`;

CREATE TABLE `rk` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `rkbh` varchar(500) DEFAULT NULL,
  `mc` varchar(500) DEFAULT NULL,
  `fl` varchar(500) DEFAULT NULL,
  `gy` varchar(500) DEFAULT NULL,
  `kf` varchar(500) DEFAULT NULL,
  `rkjg` float DEFAULT NULL,
  `sl` int(4) DEFAULT NULL,
  `xsjg` float DEFAULT NULL,
  `sj` date DEFAULT NULL,
  `xs` int(4) DEFAULT '0',
  `th` int(4) DEFAULT '0',
  `kc` int(4) DEFAULT '0',
  `lr` float DEFAULT '0',
  `rt` int(4) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gb2312;

/*Data for the table `rk` */

insert  into `rk`(`id`,`rkbh`,`mc`,`fl`,`gy`,`kf`,`rkjg`,`sl`,`xsjg`,`sj`,`xs`,`th`,`kc`,`lr`,`rt`) values (1,'RK123456','足球鞋','鞋帽类','李宁集团','三号库房',150,100,280,'2020-05-03',0,0,100,0,0),(2,'RK1234561','康师傅红烧牛肉面','食品类','鼎信集团','二号库房',2.5,500,3,'2020-05-03',30,5,475,12.5,0),(3,'RK123456123','矿泉水','酒水饮料类','娃哈哈公司','一号库房',1.2,500,1.5,'2020-05-03',16,0,485,4.5,1);

/*Table structure for table `rt` */

DROP TABLE IF EXISTS `rt`;

CREATE TABLE `rt` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `rkbh` varchar(200) DEFAULT NULL,
  `sl` int(4) DEFAULT NULL,
  `yy` varchar(200) DEFAULT NULL,
  `sj` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gb2312;

/*Data for the table `rt` */

insert  into `rt`(`id`,`rkbh`,`sl`,`yy`,`sj`) values (1,'RK123456123',1,'test','2020-05-03');

/*Table structure for table `th` */

DROP TABLE IF EXISTS `th`;

CREATE TABLE `th` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `ckbh` varchar(500) DEFAULT NULL,
  `rkbh` varchar(500) DEFAULT NULL,
  `mc` varchar(500) DEFAULT NULL,
  `fl` varchar(500) DEFAULT NULL,
  `xsjg` float DEFAULT NULL,
  `sl` int(4) DEFAULT NULL,
  `thzj` float DEFAULT NULL,
  `sj` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gb2312;

/*Data for the table `th` */

insert  into `th`(`id`,`ckbh`,`rkbh`,`mc`,`fl`,`xsjg`,`sl`,`thzj`,`sj`) values (1,'CK1234561','RK1234561','康师傅红烧牛肉面','食品类',3,5,15,'2020-05-03');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
