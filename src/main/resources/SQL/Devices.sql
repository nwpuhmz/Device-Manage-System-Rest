/*
 Navicat Premium Data Transfer

 Source Server         : Mysql5
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : Devices

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 20/02/2019 22:24:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for airborne_eq
-- ----------------------------
DROP TABLE IF EXISTS `airborne_eq`;
CREATE TABLE `airborne_eq` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL,
  `org_name` varchar(255) DEFAULT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `unified_num` varchar(255) DEFAULT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `equipment_type` varchar(255) DEFAULT NULL,
  `machine_num` varchar(255) DEFAULT NULL,
  `leave_factory_date` date DEFAULT NULL,
  `manufactor` varchar(255) DEFAULT NULL,
  `dep_code` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `original_value` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `use_desc` varchar(255) DEFAULT NULL,
  `install_site` varchar(255) DEFAULT NULL,
  `funding_sources` varchar(255) DEFAULT NULL,
  `Reg_number` varchar(255) DEFAULT NULL,
  `sys_name` varchar(255) DEFAULT NULL,
  `sys_code` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `project_attr` varchar(255) DEFAULT NULL,
  `contract_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of airborne_eq
-- ----------------------------
BEGIN;
INSERT INTO `airborne_eq` VALUES (1, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (4, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (5, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (6, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (7, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (8, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (9, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (10, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (11, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (12, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (13, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `airborne_eq` VALUES (14, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
COMMIT;

-- ----------------------------
-- Table structure for antenna
-- ----------------------------
DROP TABLE IF EXISTS `antenna`;
CREATE TABLE `antenna` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL,
  `org_name` varchar(255) DEFAULT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `unified_num` varchar(255) DEFAULT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `equipment_type` varchar(255) DEFAULT NULL,
  `machine_num` varchar(255) DEFAULT NULL,
  `leave_factory_date` date DEFAULT NULL,
  `manufactor` varchar(255) DEFAULT NULL,
  `dep_code` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `original_value` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `use_desc` varchar(255) DEFAULT NULL,
  `install_site` varchar(255) DEFAULT NULL,
  `funding_sources` varchar(255) DEFAULT NULL,
  `Reg_number` varchar(255) DEFAULT NULL,
  `sys_name` varchar(255) DEFAULT NULL,
  `sys_code` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `project_attr` varchar(255) DEFAULT NULL,
  `contract_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of antenna
-- ----------------------------
BEGIN;
INSERT INTO `antenna` VALUES (1, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (4, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (5, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (6, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (7, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (8, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (9, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (10, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (11, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (12, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (13, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `antenna` VALUES (14, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
COMMIT;

-- ----------------------------
-- Table structure for computer_inbound
-- ----------------------------
DROP TABLE IF EXISTS `computer_inbound`;
CREATE TABLE `computer_inbound` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL COMMENT '类别',
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `unified_num` varchar(255) DEFAULT NULL COMMENT '统一编号（国资编号）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `secret_class` varchar(255) DEFAULT NULL COMMENT '密级',
  `device_name` varchar(255) DEFAULT NULL COMMENT '名称（设备名称）',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `machine_num` varchar(255) DEFAULT NULL COMMENT '机号',
  `leave_factory_date` date DEFAULT NULL COMMENT '出厂时间',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `dep_code` varchar(255) DEFAULT NULL COMMENT '单位代码',
  `country` varchar(255) DEFAULT NULL COMMENT '国别',
  `start_date` date DEFAULT NULL COMMENT '启用时间',
  `original_value` varchar(255) DEFAULT NULL COMMENT '原值',
  `os_version` varchar(255) DEFAULT NULL COMMENT '操作系统版本',
  `os_install_date` date DEFAULT NULL COMMENT '操作系统安装日期',
  `disk_sn` varchar(255) DEFAULT NULL COMMENT '硬盘序列号',
  `ip` varchar(255) DEFAULT NULL COMMENT 'IP地址',
  `mac` varchar(255) DEFAULT NULL COMMENT 'MAC地址',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `install_site` varchar(255) DEFAULT NULL COMMENT '安装地点',
  `funding_sources` varchar(255) DEFAULT NULL COMMENT '经费来源',
  `Reg_number` varchar(255) DEFAULT NULL COMMENT '登记单号',
  `sys_name` varchar(255) DEFAULT NULL COMMENT '系统名称',
  `sys_code` varchar(255) DEFAULT NULL COMMENT '系统代号',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `project_attr` varchar(255) DEFAULT NULL COMMENT '项目归属',
  `contract_number` varchar(255) DEFAULT NULL COMMENT '合同单号',
  `computer_name` varchar(255) DEFAULT NULL COMMENT '计算机名',
  `disk_size` varchar(255) DEFAULT NULL COMMENT '硬盘容量',
  `user_code` varchar(255) DEFAULT NULL COMMENT '责任人工号',
  `print_linkSN` varchar(255) DEFAULT NULL COMMENT '连接打印机的保密编号',
  `internet account internet_account` varchar(255) DEFAULT NULL COMMENT '入网账号',
  `bios_pwd` varchar(255) DEFAULT NULL COMMENT 'BIOS密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of computer_inbound
-- ----------------------------
BEGIN;
INSERT INTO `computer_inbound` VALUES (1, 2, 'aa', 'bb', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for computer_special
-- ----------------------------
DROP TABLE IF EXISTS `computer_special`;
CREATE TABLE `computer_special` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL,
  `org_name` varchar(255) DEFAULT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `unified_num` varchar(255) DEFAULT NULL,
  `security_num` varchar(255) DEFAULT NULL,
  `secret_class` varchar(255) DEFAULT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `equipment_type` varchar(255) DEFAULT NULL,
  `machine_num` varchar(255) DEFAULT NULL,
  `leave_factory_date` date DEFAULT NULL,
  `manufactor` varchar(255) DEFAULT NULL,
  `dep_code` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `original_value` varchar(255) DEFAULT NULL,
  `os_version` varchar(255) DEFAULT NULL,
  `os_install_date` date DEFAULT NULL,
  `disk_sn` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `mac` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `use_desc` varchar(255) DEFAULT NULL,
  `install_site` varchar(255) DEFAULT NULL,
  `funding_sources` varchar(255) DEFAULT NULL,
  `Reg_number` varchar(255) DEFAULT NULL,
  `sys_name` varchar(255) DEFAULT NULL,
  `sys_code` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `project_attr` varchar(255) DEFAULT NULL,
  `contract_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of computer_special
-- ----------------------------
BEGIN;
INSERT INTO `computer_special` VALUES (1, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '秘密', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (4, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '非密', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (5, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '内部', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (6, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '非密', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (7, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '非密', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (8, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '非密', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (9, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '内部', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (10, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '内部', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (11, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '内部', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (12, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '秘密', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (13, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '内部', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `computer_special` VALUES (14, 1, '遥测室', '监控组', '国资号123456', '保密编号123456', '秘密', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', 'WIN7 64位', '2019-02-20', 'SN012345', '192.168.11.11', 'abcd', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
COMMIT;

-- ----------------------------
-- Table structure for display_tv
-- ----------------------------
DROP TABLE IF EXISTS `display_tv`;
CREATE TABLE `display_tv` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL COMMENT '类别',
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `unified_num` varchar(255) DEFAULT NULL COMMENT '统一编号（国资编号）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `machine_num` varchar(255) DEFAULT NULL COMMENT '机号',
  `leave_factory_date` date DEFAULT NULL COMMENT '出厂时间',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `dep_code` varchar(255) DEFAULT NULL COMMENT '单位代码',
  `country` varchar(255) DEFAULT NULL COMMENT '国别',
  `start_date` date DEFAULT NULL COMMENT '启用时间',
  `original_value` varchar(255) DEFAULT NULL COMMENT '原值',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `install_site` varchar(255) DEFAULT NULL COMMENT '安装地点',
  `funding_sources` varchar(255) DEFAULT NULL COMMENT '经费来源',
  `Reg_number` varchar(255) DEFAULT NULL COMMENT '登记单号',
  `sys_name` varchar(255) DEFAULT NULL COMMENT '系统名称',
  `sys_code` varchar(255) DEFAULT NULL COMMENT '系统代号',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `project_attr` varchar(255) DEFAULT NULL COMMENT '项目归属',
  `contract_number` varchar(255) DEFAULT NULL COMMENT '合同单号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of display_tv
-- ----------------------------
BEGIN;
INSERT INTO `display_tv` VALUES (1, 2, 'aa', 'bb', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for interphone
-- ----------------------------
DROP TABLE IF EXISTS `interphone`;
CREATE TABLE `interphone` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `machine_num` varchar(255) DEFAULT NULL COMMENT '机号',
  `start_date` date DEFAULT NULL COMMENT '启用时间',
  `install_site` varchar(255) DEFAULT NULL COMMENT '放置地点',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `usefor` varchar(255) DEFAULT NULL COMMENT '用途',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interphone
-- ----------------------------
BEGIN;
INSERT INTO `interphone` VALUES (1, 'aa', 'bb', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for netdevice_specail
-- ----------------------------
DROP TABLE IF EXISTS `netdevice_specail`;
CREATE TABLE `netdevice_specail` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL COMMENT '类别',
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `unified_num` varchar(255) DEFAULT NULL COMMENT '统一编号（国资编号）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `secret_class` varchar(255) DEFAULT NULL COMMENT '密级',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `machine_num` varchar(255) DEFAULT NULL COMMENT '机号',
  `leave_factory_date` date DEFAULT NULL COMMENT '出厂时间',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `dep_code` varchar(255) DEFAULT NULL COMMENT '单位代码',
  `country` varchar(255) DEFAULT NULL COMMENT '国别',
  `start_date` date DEFAULT NULL COMMENT '启用时间',
  `original_value` varchar(255) DEFAULT NULL COMMENT '原值',
  `ip` varchar(255) DEFAULT NULL COMMENT 'IP地址',
  `user` varchar(255) DEFAULT NULL COMMENT '使用人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `install_site` varchar(255) DEFAULT NULL COMMENT '安装地点',
  `funding_sources` varchar(255) DEFAULT NULL COMMENT '经费来源',
  `Reg_number` varchar(255) DEFAULT NULL COMMENT '登记单号',
  `sys_name` varchar(255) DEFAULT NULL COMMENT '系统名称',
  `sys_code` varchar(255) DEFAULT NULL COMMENT '系统代号',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `project_attr` varchar(255) DEFAULT NULL COMMENT '项目归属',
  `contract_number` varchar(255) DEFAULT NULL COMMENT '合同单号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of netdevice_specail
-- ----------------------------
BEGIN;
INSERT INTO `netdevice_specail` VALUES (1, 2, 'aa', 'bb', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for power
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL COMMENT '类别',
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `start_date` date DEFAULT NULL COMMENT '购买时间',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `install_site` varchar(255) DEFAULT NULL COMMENT '安装地点',
  `test_certif_name` varchar(255) DEFAULT NULL COMMENT '检测证书名称',
  `test_certif_num` varchar(255) DEFAULT NULL COMMENT '检测证书编号',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_code` varchar(255) DEFAULT NULL COMMENT '责任人工号',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of power
-- ----------------------------
BEGIN;
INSERT INTO `power` VALUES (1, 2, 'aa', 'bb', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for projector
-- ----------------------------
DROP TABLE IF EXISTS `projector`;
CREATE TABLE `projector` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL COMMENT '类别',
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `unified_num` varchar(255) DEFAULT NULL COMMENT '统一编号（国资编号）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `secret_class` varchar(255) DEFAULT NULL COMMENT '密级',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `machine_num` varchar(255) DEFAULT NULL COMMENT '机号',
  `leave_factory_date` date DEFAULT NULL COMMENT '出厂时间',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `dep_code` varchar(255) DEFAULT NULL COMMENT '单位代码',
  `country` varchar(255) DEFAULT NULL COMMENT '国别',
  `start_date` date DEFAULT NULL COMMENT '启用时间',
  `original_value` varchar(255) DEFAULT NULL COMMENT '原值',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `install_site` varchar(255) DEFAULT NULL COMMENT '安装地点',
  `funding_sources` varchar(255) DEFAULT NULL COMMENT '经费来源',
  `Reg_number` varchar(255) DEFAULT NULL COMMENT '登记单号',
  `sys_name` varchar(255) DEFAULT NULL COMMENT '系统名称',
  `sys_code` varchar(255) DEFAULT NULL COMMENT '系统代号',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `project_attr` varchar(255) DEFAULT NULL COMMENT '项目归属',
  `contract_number` varchar(255) DEFAULT NULL COMMENT '合同单号',
  `user_code` varchar(255) DEFAULT NULL COMMENT '责任人工号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projector
-- ----------------------------
BEGIN;
INSERT INTO `projector` VALUES (1, 2, 'aa', 'bb', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(125) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
BEGIN;
INSERT INTO `role` VALUES (1, 'ROLE_Admin');
INSERT INTO `role` VALUES (2, 'ROLE_User');
COMMIT;

-- ----------------------------
-- Table structure for rtr
-- ----------------------------
DROP TABLE IF EXISTS `rtr`;
CREATE TABLE `rtr` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL,
  `org_name` varchar(255) DEFAULT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `unified_num` varchar(255) DEFAULT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `equipment_type` varchar(255) DEFAULT NULL,
  `machine_num` varchar(255) DEFAULT NULL,
  `leave_factory_date` date DEFAULT NULL,
  `manufactor` varchar(255) DEFAULT NULL,
  `dep_code` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `original_value` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `use_desc` varchar(255) DEFAULT NULL,
  `install_site` varchar(255) DEFAULT NULL,
  `funding_sources` varchar(255) DEFAULT NULL,
  `Reg_number` varchar(255) DEFAULT NULL,
  `sys_name` varchar(255) DEFAULT NULL,
  `sys_code` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `project_attr` varchar(255) DEFAULT NULL,
  `contract_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rtr
-- ----------------------------
BEGIN;
INSERT INTO `rtr` VALUES (1, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (4, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (5, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (6, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (7, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (8, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (9, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (10, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (11, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (12, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (13, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `rtr` VALUES (14, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
COMMIT;

-- ----------------------------
-- Table structure for shredder
-- ----------------------------
DROP TABLE IF EXISTS `shredder`;
CREATE TABLE `shredder` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `install_site` varchar(255) DEFAULT NULL COMMENT '安装地点',
  `comments` varchar(255) DEFAULT NULL COMMENT '备注',
  `usefor` varchar(255) DEFAULT NULL COMMENT '用途',
  `user_code` varchar(255) DEFAULT NULL COMMENT '责任人工号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shredder
-- ----------------------------
BEGIN;
INSERT INTO `shredder` VALUES (1, 'aa', 'bb', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for square_car
-- ----------------------------
DROP TABLE IF EXISTS `square_car`;
CREATE TABLE `square_car` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL,
  `org_name` varchar(255) DEFAULT NULL,
  `dep_name` varchar(255) DEFAULT NULL,
  `unified_num` varchar(255) DEFAULT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `equipment_type` varchar(255) DEFAULT NULL,
  `machine_num` varchar(255) DEFAULT NULL,
  `leave_factory_date` date DEFAULT NULL,
  `manufactor` varchar(255) DEFAULT NULL,
  `dep_code` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `original_value` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `use_desc` varchar(255) DEFAULT NULL,
  `install_site` varchar(255) DEFAULT NULL,
  `funding_sources` varchar(255) DEFAULT NULL,
  `Reg_number` varchar(255) DEFAULT NULL,
  `sys_name` varchar(255) DEFAULT NULL,
  `sys_code` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `project_attr` varchar(255) DEFAULT NULL,
  `contract_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of square_car
-- ----------------------------
BEGIN;
INSERT INTO `square_car` VALUES (1, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (4, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (5, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (6, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (7, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (8, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (9, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (10, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (11, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (12, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (13, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
INSERT INTO `square_car` VALUES (14, 1, '遥测室', '监控组', '国资号123456', '服务器1', '型号1', '机号123456', '2019-02-18', '联想', '单位代码001', '中国', '2019-02-18', '11', '用户1', '无', '北京', '无', '无', '无', '无', '无', '无', '无');
COMMIT;

-- ----------------------------
-- Table structure for storage
-- ----------------------------
DROP TABLE IF EXISTS `storage`;
CREATE TABLE `storage` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL COMMENT '类别',
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `secret_class` varchar(255) DEFAULT NULL COMMENT '密级',
  `machine_num` varchar(255) DEFAULT NULL COMMENT '机号',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `sn` varchar(255) DEFAULT NULL COMMENT '物理序列号',
  `ip` varchar(255) DEFAULT NULL COMMENT 'IP地址',
  `mac` varchar(255) DEFAULT NULL COMMENT 'MAC地址',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `comments` varchar(255) DEFAULT NULL COMMENT '用途',
  `storage_type` varchar(255) DEFAULT NULL COMMENT '介质类型',
  `storage_size` varchar(255) DEFAULT NULL COMMENT '介质容量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of storage
-- ----------------------------
BEGIN;
INSERT INTO `storage` VALUES (1, 2, 'aa', 'bb', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for usbKey
-- ----------------------------
DROP TABLE IF EXISTS `usbKey`;
CREATE TABLE `usbKey` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `category` int(8) DEFAULT NULL COMMENT '类别',
  `org_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `dep_name` varchar(255) DEFAULT NULL COMMENT '组别（部门名称）',
  `security_num` varchar(255) DEFAULT NULL COMMENT '保密编号',
  `equipment_type` varchar(255) DEFAULT NULL COMMENT '型号（设备型号）',
  `manufactor` varchar(255) DEFAULT NULL COMMENT '厂家',
  `end_date` date DEFAULT NULL COMMENT '有效结束时间',
  `start_date` date DEFAULT NULL COMMENT '有效起始时间',
  `user` varchar(255) DEFAULT NULL COMMENT '责任人',
  `use_desc` varchar(255) DEFAULT NULL COMMENT '使用情况',
  `user_code` varchar(255) DEFAULT NULL COMMENT '责任人工号',
  `digital_sn` varchar(255) DEFAULT NULL COMMENT '数字证书号',
  `corres_pc_security_num` varchar(255) DEFAULT NULL COMMENT '对应计算机保密编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usbKey
-- ----------------------------
BEGIN;
INSERT INTO `usbKey` VALUES (1, 2, 'aa', 'bb', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(125) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'Bob', '123');
INSERT INTO `user` VALUES (2, 'Kyy', '123');
INSERT INTO `user` VALUES (3, 'admin', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
BEGIN;
INSERT INTO `user_role` VALUES (1, 1, 1);
INSERT INTO `user_role` VALUES (2, 2, 2);
INSERT INTO `user_role` VALUES (3, 1, 2);
INSERT INTO `user_role` VALUES (4, 3, 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
