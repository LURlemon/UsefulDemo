/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : easyer

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 25/08/2020 12:28:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for testdemo
-- ----------------------------
DROP TABLE IF EXISTS `testdemo`;
CREATE TABLE `testdemo`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `magic_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `first_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of testdemo
-- ----------------------------
INSERT INTO `testdemo` VALUES (1, '123', 'dan', 'liu');

SET FOREIGN_KEY_CHECKS = 1;
