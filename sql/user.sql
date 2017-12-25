/*
Navicat MySQL Data Transfer

Source Server         : tmall
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : tmall_ssm

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2017-12-03 15:55:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `phone` varchar(33) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=919079 DEFAULT CHARSET=utf8;
