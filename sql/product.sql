/*
Navicat MySQL Data Transfer

Source Server         : tmall
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : tmall_ssm

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2017-12-03 15:56:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(50) NOT NULL,
  `originalPrice` float DEFAULT NULL,
  `promotePrice` float DEFAULT NULL,
  `cParentId` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `modifyTime` datetime DEFAULT NULL,
  `deleteTime` datetime DEFAULT NULL,
  `stock` int(50) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
