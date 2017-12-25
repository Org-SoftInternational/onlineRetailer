/*
Navicat MySQL Data Transfer

Source Server         : tmall
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : tmall_ssm

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2017-12-03 15:56:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productType` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
