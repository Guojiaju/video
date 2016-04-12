/*
Navicat MySQL Data Transfer

Source Server         : Test
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-04-12 17:59:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_image
-- ----------------------------
DROP TABLE IF EXISTS `t_image`;
CREATE TABLE `t_image` (
  `id` varchar(55) NOT NULL,
  `local_path` varchar(255) DEFAULT NULL,
  `url` varchar(255) NOT NULL,
  `created_by` varchar(55) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_by` varchar(55) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_image
-- ----------------------------
INSERT INTO `t_image` VALUES ('1', null, 'F:\\tv_photos\\main\\a1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('10', null, 'F:\\tv_photos\\like\\b6.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('100', null, 'F:\\tv_photos\\art\\01.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('101', null, 'F:\\tv_photos\\art\\02.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('102', null, 'F:\\tv_photos\\art\\03.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('103', null, 'F:\\tv_photos\\art\\04.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('104', null, 'F:\\tv_photos\\art\\05.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('105', null, 'F:\\tv_photos\\art\\a1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('106', null, 'F:\\tv_photos\\art\\a2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('107', null, 'F:\\tv_photos\\art\\a3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('108', null, 'F:\\tv_photos\\art\\a4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('109', null, 'F:\\tv_photos\\art\\a5.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('11', null, 'F:\\tv_photos\\like\\b7.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('110', null, 'F:\\tv_photos\\art\\a6.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('111', null, 'F:\\tv_photos\\art\\a7.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('112', null, 'F:\\tv_photos\\art\\a8.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('113', null, 'F:\\tv_photos\\art\\a9.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('114', null, 'F:\\tv_photos\\art\\a9.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('115', null, 'F:\\tv_photos\\art\\a1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('116', null, 'F:\\tv_photos\\art\\a2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('117', null, 'F:\\tv_photos\\animation\\01.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('118', null, 'F:\\tv_photos\\animation\\02.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('119', null, 'F:\\tv_photos\\animation\\03.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('12', null, 'F:\\tv_photos\\like\\b8.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('120', null, 'F:\\tv_photos\\animation\\04.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('121', null, 'F:\\tv_photos\\animation\\05.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('122', null, 'F:\\tv_photos\\animation\\06.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('123', null, 'F:\\tv_photos\\animation\\06.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('124', null, 'F:\\tv_photos\\animation\\a1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('125', null, 'F:\\tv_photos\\animation\\a2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('126', null, 'F:\\tv_photos\\animation\\a3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('127', null, 'F:\\tv_photos\\animation\\a4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('128', null, 'F:\\tv_photos\\animation\\a5.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('129', null, 'F:\\tv_photos\\animation\\a6.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('13', null, 'F:\\tv_photos\\like\\b9.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('130', null, 'F:\\tv_photos\\animation\\a7.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('131', null, 'F:\\tv_photos\\animation\\a8.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('132', null, 'F:\\tv_photos\\animation\\a9.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('133', null, 'F:\\tv_photos\\animation\\a10.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('134', null, 'F:\\tv_photos\\animation\\a11.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('135', null, 'F:\\tv_photos\\animation\\a12.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('136', null, 'F:\\tv_photos\\animation\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('137', null, 'F:\\tv_photos\\animation\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('138', null, 'F:\\tv_photos\\animation\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('139', null, 'F:\\tv_photos\\animation\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('14', null, 'F:\\tv_photos\\like\\b10.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('140', null, 'F:\\tv_photos\\animation\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('141', null, 'F:\\tv_photos\\animation\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('142', null, 'F:\\tv_photos\\animation\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('143', null, 'F:\\tv_photos\\animation\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('144', null, 'F:\\tv_photos\\animation\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('145', null, 'F:\\tv_photos\\animation\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('146', null, 'F:\\tv_photos\\animation\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('147', null, 'F:\\tv_photos\\animation\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('148', null, 'F:\\tv_photos\\animation\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('149', null, 'F:\\tv_photos\\fitness\\a1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('15', null, 'F:\\tv_photos\\like\\b10.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('150', null, 'F:\\tv_photos\\fitness\\a2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('151', null, 'F:\\tv_photos\\fitness\\a3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('152', null, 'F:\\tv_photos\\fitness\\a4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('153', null, 'F:\\tv_photos\\fitness\\a5.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('154', null, 'F:\\tv_photos\\fitness\\a6.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('155', null, 'F:\\tv_photos\\fitness\\a7.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('156', null, 'F:\\tv_photos\\fitness\\01.jpeg', null, null, null, null);
INSERT INTO `t_image` VALUES ('157', null, 'F:\\tv_photos\\fitness\\01.jpeg', null, null, null, null);
INSERT INTO `t_image` VALUES ('158', null, 'F:\\tv_photos\\fitness\\02.jpeg', null, null, null, null);
INSERT INTO `t_image` VALUES ('159', null, 'F:\\tv_photos\\fitness\\03.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('16', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('160', null, 'F:\\tv_photos\\fitness\\04.jpeg', null, null, null, null);
INSERT INTO `t_image` VALUES ('161', null, 'F:\\tv_photos\\fitness\\05.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('162', null, 'F:\\tv_photos\\fitness\\06.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('163', null, 'F:\\tv_photos\\fitness\\07.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('164', null, 'F:\\tv_photos\\fitness\\08.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('165', null, 'F:\\tv_photos\\fitness\\09.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('166', null, 'F:\\tv_photos\\fitness\\10.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('167', null, 'F:\\tv_photos\\fitness\\11.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('168', null, 'F:\\tv_photos\\fitness\\12.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('169', null, 'F:\\tv_photos\\fitness\\13.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('17', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('170', null, 'F:\\tv_photos\\teach\\01.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('171', null, 'F:\\tv_photos\\teach\\02.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('172', null, 'F:\\tv_photos\\teach\\03.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('173', null, 'F:\\tv_photos\\teach\\04.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('174', null, 'F:\\tv_photos\\teach\\05.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('175', null, 'F:\\tv_photos\\teach\\06.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('176', null, 'F:\\tv_photos\\teach\\07.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('177', null, 'F:\\tv_photos\\teach\\08.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('178', null, 'F:\\tv_photos\\teach\\01.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('179', null, 'F:\\tv_photos\\teach\\02.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('18', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('180', null, 'F:\\tv_photos\\teach\\03.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('181', null, 'F:\\tv_photos\\teach\\04.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('182', null, 'F:\\tv_photos\\teach\\05.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('19', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('2', null, 'F:\\tv_photos\\main\\a2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('20', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('21', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('22', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('23', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('24', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('25', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('26', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('27', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('28', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('29', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('3', null, 'F:\\tv_photos\\main\\a3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('30', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('31', null, 'F:\\tv_photos\\liquidcarousel\\01.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('32', null, 'F:\\tv_photos\\liquidcarousel\\02.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('33', null, 'F:\\tv_photos\\liquidcarousel\\03.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('34', null, 'F:\\tv_photos\\liquidcarousel\\04.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('35', null, 'F:\\tv_photos\\liquidcarousel\\05.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('36', null, 'F:\\tv_photos\\liquidcarousel\\06.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('37', null, 'F:\\tv_photos\\liquidcarousel\\07.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('38', null, 'F:\\tv_photos\\liquidcarousel\\08.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('39', null, 'F:\\tv_photos\\liquidcarousel\\09.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('4', null, 'F:\\tv_photos\\main\\a3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('40', null, 'F:\\tv_photos\\liquidcarousel\\10.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('41', null, 'F:\\tv_photos\\liquidcarousel\\11.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('42', null, 'F:\\tv_photos\\liquidcarousel\\12.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('43', null, 'F:\\tv_photos\\liquidcarousel\\13.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('44', null, 'F:\\tv_photos\\liquidcarousel\\14.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('45', null, 'F:\\tv_photos\\liquidcarousel\\15.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('46', null, 'F:\\tv_photos\\liquidcarousel\\16.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('47', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('48', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('49', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('5', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('50', null, 'F:\\tv_photos\\like\\b5.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('51', null, 'F:\\tv_photos\\like\\b6.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('52', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('53', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('54', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('55', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('56', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('57', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('58', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('59', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('6', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('60', null, 'F:\\tv_photos\\like\\b1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('61', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('62', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('63', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('64', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('65', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('66', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('67', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('68', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('69', null, 'F:\\tv_photos\\like\\b2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('7', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('70', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('71', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('72', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('73', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('74', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('75', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('76', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('77', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('78', null, 'F:\\tv_photos\\like\\b3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('79', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('8', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('80', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('81', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('82', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('83', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('84', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('85', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('86', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('87', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('88', null, 'F:\\tv_photos\\like\\b4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('89', null, 'F:\\tv_photos\\movie\\a1.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('9', null, 'F:\\tv_photos\\like\\b5.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('90', null, 'F:\\tv_photos\\movie\\a2.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('91', null, 'F:\\tv_photos\\movie\\a3.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('92', null, 'F:\\tv_photos\\movie\\a4.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('93', null, 'F:\\tv_photos\\movie\\a5.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('94', null, 'F:\\tv_photos\\movie\\a6.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('95', null, 'F:\\tv_photos\\movie\\a7.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('96', null, 'F:\\tv_photos\\movie\\a8.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('97', null, 'F:\\tv_photos\\movie\\a9.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('98', null, 'F:\\tv_photos\\movie\\a10.jpg', null, null, null, null);
INSERT INTO `t_image` VALUES ('99', null, 'F:\\tv_photos\\movie\\a11.jpg', null, null, null, null);

-- ----------------------------
-- Table structure for t_movie
-- ----------------------------
DROP TABLE IF EXISTS `t_movie`;
CREATE TABLE `t_movie` (
  `id` varchar(55) NOT NULL,
  `img_id` varchar(55) NOT NULL,
  `name` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `director` varchar(255) DEFAULT NULL,
  `score` varchar(255) NOT NULL,
  `short_message` varchar(255) NOT NULL,
  `staror` varchar(255) DEFAULT NULL,
  `owner_id` varchar(55) NOT NULL,
  `created_by` varchar(55) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_by` varchar(55) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_movie
-- ----------------------------
INSERT INTO `t_movie` VALUES ('1', '1', 'dfs', 'carouselBg', 'sdf', '11', 'sdfs', 'sdfsd', '123', null, '2016-04-05', null, null);
INSERT INTO `t_movie` VALUES ('10', '10', 'sdf', 'likeMovie', 'sf', '7', 'sf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('100', '100', 'sdfsd', 'artCarousel', null, '4', 'ad', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('101', '101', 'sdf', 'artCarousel', null, '5', 'ds', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('102', '102', 'sf', 'artCarousel', null, '3', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('103', '103', 'sdf', 'artCarousel', null, '4', 'df', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('104', '104', 'sdf', 'artCarousel', null, '4', 'af', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('105', '105', 'sdf', 'art', null, '5', 'sd', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('106', '106', 'sdf', 'art', null, '6', 'af', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('107', '107', 'sdf', 'art', null, '3', 'df', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('108', '108', 'sdf', 'art', null, '2', 'w', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('109', '109', 'sdf', 'art', null, '4', 'sdf', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('11', '11', 'sdf', 'likeMovie', null, '4', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('110', '110', 'sdf', 'art', null, '6', 'sf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('111', '111', 'sdf', 'art', null, '7', 'sdf', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('112', '112', 'sdf', 'art', null, '7', 'sf', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('113', '113', 'sdf', 'art', null, '4', 'sf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('114', '114', 'sdf', 'art', null, '2', 'sf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('115', '115', 'sdf', 'art', null, '4', 'sf', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('116', '116', 'sdf', 'art', null, '7', 'sf', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('117', '117', 'adf', 'animationCarousel', null, '5', 'dfg', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('118', '118', 'adf', 'animationCarousel', null, '6', 'fg', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('119', '119', 'afd', 'animationCarousel', null, '7', 'dfg', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('12', '12', 'sdf', 'likeMovie', null, '5', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('120', '120', 'adf', 'animationCarousel', null, '9', 'dg', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('121', '121', 'af', 'animationCarousel', null, '4', 'g', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('122', '122', 'af', 'animationCarousel', null, '4', 'd', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('123', '123', 'df', 'animationCarousel', null, '7', 'g', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('124', '124', 'sdf', 'newAnimation', null, '6', 'sdf', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('125', '125', 'sf', 'newAnimation', null, '8', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('126', '126', 'sdf', 'newAnimation', null, '9', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('127', '127', 'adf', 'newAnimation', null, '6', 'sdf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('128', '128', 'af', 'newAnimation', null, '5', 'sdf', null, '45', null, null, null, null);
INSERT INTO `t_movie` VALUES ('129', '129', 'sdf', 'newAnimation', null, '7', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('13', '13', 'sdf', 'likeMovie', null, '6', 'sf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('130', '130', 'sa', 'newAnimation', null, '8', 'sdf', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('131', '131', 'af', 'newAnimation', null, '3', 'sdf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('132', '132', 'sd', 'newAnimation', null, '4', 'df', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('133', '133', 'adf', 'newAnimation', null, '3', 'sf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('134', '134', 'saf', 'newAnimation', null, '3', 'sdf', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('135', '135', 'df', 'newAnimation', null, '9', 'sdf', null, '9', null, null, null, null);
INSERT INTO `t_movie` VALUES ('136', '136', 'df', 'popularAnimation', null, '4', 'fg', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('137', '137', 'sdf', 'popularAnimation', null, '4', 'df', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('138', '138', 'sd', 'popularAnimation', null, '4', 'sdf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('139', '139', 'sd', 'popularAnimation', null, '4', 'sf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('14', '14', 'sdf', 'likeMovie', null, '5', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('140', '140', 'fd', 'popularAnimation', null, '4', 'sdf', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('141', '141', 'df', 'popularAnimation', null, '4', 'sd', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('142', '142', 'adf', 'popularAnimation', null, '4', 'sdf', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('143', '143', 'sd', 'popularAnimation', null, '4', 'sdf', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('144', '144', 'df', 'popularAnimation', null, '4', 'sdf', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('145', '145', 'fd', 'popularAnimation', null, '4', 'sdf', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('146', '146', 'sd', 'popularAnimation', null, '4', 'sdf', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('147', '147', 'fd', 'popularAnimation', null, '4', 'sdf', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('148', '148', 'sdf', 'popularAnimation', null, '4', 'fd', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('149', '149', 'gf', 'fitnessCarousel', null, '5', 'dgf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('15', '15', 'sdf', 'likeMovie', null, '45', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('150', '150', 'sdf', 'fitnessCarousel', null, '5', 'dfg', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('151', '151', 'sdf', 'fitnessCarousel', null, '5', 'df', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('152', '152', 'sdf', 'fitnessCarousel', null, '5', 'g', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('153', '153', 'sf', 'fitnessCarousel', null, '5', 'fd', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('154', '154', 'sf', 'fitnessCarousel', null, '5', 'df', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('155', '155', 'sf', 'fitnessCarousel', null, '5', 'df', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('156', '156', 'sdf', 'fitness', null, '56', 'gh', null, '9', null, null, null, null);
INSERT INTO `t_movie` VALUES ('157', '157', 'sdf', 'fitness', null, '2', 'gfh', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('158', '158', 'sd', 'fitness', null, '3', 'fgh', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('159', '159', 'sd', 'fitness', null, '8', 'fgh', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('16', '16', 'sdf', 'likeMovie', null, '23', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('160', '160', 'sf', 'fitness', null, '2', 'fgh', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('161', '161', 'sf', 'fitness', null, '1', 'fh', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('162', '162', 'df', 'fitness', null, '7', 'fgh', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('163', '163', 'sdf', 'fitness', null, '1', 'fh', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('164', '164', 'sf', 'fitness', null, '3', 'fh', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('165', '165', 'sf', 'fitness', null, '1', 'fh', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('166', '166', 'sdf', 'fitness', null, '6', 'fgh', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('167', '167', 'sdf', 'fitness', null, '2', 'gh', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('168', '168', 'sf', 'fitness', null, '1', 'fhg', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('169', '169', 'sf', 'fitness', null, '4', 'fh', null, '9', null, null, null, null);
INSERT INTO `t_movie` VALUES ('17', '17', 'sdf', 'likeMovie', null, '2', 'sd', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('170', '170', 'ssd', 'teach', null, '1', 'sd', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('171', '171', 'df', 'teach', null, '2', 'sdf', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('172', '172', 'sdf', 'teach', null, '1', 'sd', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('173', '173', 'sdf', 'teach', null, '1', 'sd', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('174', '174', 'sd', 'teach', null, '1', 'd', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('175', '175', 'dsf', 'teach', null, '1', 'f', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('176', '176', 'sdf', 'teach', null, '1', 'a', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('177', '177', 'sdfsd', 'teach', null, '1', 'df', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('178', '178', 'ds', 'teach', null, '1', 'sd', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('179', '179', 'hd', 'teach', null, '1', 'we', null, '9', null, null, null, null);
INSERT INTO `t_movie` VALUES ('18', '18', 'sf', 'likeMovie', null, '1', 'sdf', null, '233', null, null, null, null);
INSERT INTO `t_movie` VALUES ('180', '180', 'qe', 'teach', null, '1', 'we', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('181', '181', 'df', 'teach', null, '1', 'g', null, '1', null, null, null, null);
INSERT INTO `t_movie` VALUES ('182', '182', 'df', 'teach', null, '1', 'd', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('19', '19', 'sf', 'likeMovie', null, '2', 'sd', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('2', '2', 'dfd', 'carouselBg', 'sdf', '11', 'sdfs', 'sdf', '5465', null, '2016-04-06', null, null);
INSERT INTO `t_movie` VALUES ('20', '20', 'sf', 'likeMovie', null, '3', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('21', '21', 'sdf', 'likeMovie', null, '4', 'sdf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('22', '22', 'sg', 'likeMovie', null, '5', 'sdf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('23', '23', 'sdf', 'likeMovie', null, '6', 'df', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('24', '24', 'we', 'likeMovie', null, '7', 'sdf', null, '43', null, null, null, null);
INSERT INTO `t_movie` VALUES ('25', '25', 'gs', 'likeMovie', null, '8', 'sd', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('26', '26', 'sg', 'likeMovie', null, '9', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('27', '27', 'sgs', 'likeMovie', null, '0', 'sd', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('28', '28', 'sg', 'likeMovie', null, '0', 'sd', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('29', '29', 'sg', 'likeMovie', null, '0', 'sd', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('3', '3', 'df', 'tv', 'sdf', '12', 'sdfsd', 'sdf', 'sdf', null, '2016-04-19', null, null);
INSERT INTO `t_movie` VALUES ('30', '30', 'xcv', 'likeMovie', null, '0', 'dsf', null, '34', null, null, null, null);
INSERT INTO `t_movie` VALUES ('31', '31', 'adf', 'liquidCarousel', null, '23', 'dfs', null, '34', null, null, null, null);
INSERT INTO `t_movie` VALUES ('32', '32', 'sd', 'liquidCarousel', null, '12', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('33', '33', 'sdf', 'liquidCarousel', null, '22', 'df', null, '43', null, null, null, null);
INSERT INTO `t_movie` VALUES ('34', '34', 'sdf', 'liquidCarousel', null, '1', 'dsf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('35', '35', 'sdf', 'liquidCarousel', null, '2', 'sdf', null, '123', null, null, null, null);
INSERT INTO `t_movie` VALUES ('36', '36', 'sdf', 'liquidCarousel', null, '3', 'sdf', null, '32', null, null, null, null);
INSERT INTO `t_movie` VALUES ('37', '37', 'sd', 'liquidCarousel', null, '4', 'g', null, '34', null, null, null, null);
INSERT INTO `t_movie` VALUES ('38', '38', 'sd', 'liquidCarousel', null, '5', 'ds', null, '34', null, null, null, null);
INSERT INTO `t_movie` VALUES ('39', '39', 'df', 'liquidCarousel', null, '6', 'sdf', null, '34', null, null, null, null);
INSERT INTO `t_movie` VALUES ('4', '4', 'df', 'carouselBg', 'sdf', '2', 'sdf', 'sdf', 'sdf', null, '2016-04-25', null, null);
INSERT INTO `t_movie` VALUES ('40', '40', 'df', 'liquidCarousel', null, '7', 'we', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('41', '41', 'df', 'liquidCarousel', null, '4', 'wer', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('42', '42', 'df', 'liquidCarousel', null, '3', 'gs', null, '53', null, null, null, null);
INSERT INTO `t_movie` VALUES ('43', '43', 'df', 'liquidCarousel', null, '5', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('44', '44', 'df', 'liquidCarousel', null, '6', 'gsd', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('45', '45', 'dsf', 'liquidCarousel', null, '7', 'gs', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('46', '46', 'df', 'liquidCarousel', null, '9', 'we', null, '234', null, null, null, null);
INSERT INTO `t_movie` VALUES ('47', '47', 'sdf', 'oldMovie', null, '5', 'dg', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('48', '48', 'sdf', 'oldMovie', null, '4', 'df', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('49', '49', 'saf', 'oldMovie', null, '5', 'dfg', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('5', '5', '大话西游', 'likeMovie', 'ddf', '8', 'sfs', 'dfds', 'sdf', null, '2016-04-14', null, null);
INSERT INTO `t_movie` VALUES ('50', '50', 'sdf', 'oldMovie', null, '6', 'dfg', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('51', '51', 'sdf', 'oldMovie', null, '3', 'dg', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('52', '52', 'dsf', 'oldMovie', null, '4', 'gd', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('53', '53', 'sdf', 'newTv', null, '3', 'sdf', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('54', '54', 'sdf', 'newTv', null, '4', 'sdf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('55', '55', 'sdf', 'newTv', null, '5', 'sdf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('56', '56', 'sdf', 'newTv', null, '6', 'sdf', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('57', '57', 'sdf', 'newTv', null, '7', 'gd', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('58', '58', 'sdf', 'newTv', null, '2', 'sd', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('59', '59', 'sdf', 'newTv', null, '3', 'we', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('6', '6', 'sdf', 'likeMovie', 'df', '7', 'dg', 'dfg', 'fdg', null, '2016-04-20', null, null);
INSERT INTO `t_movie` VALUES ('60', '60', 'sdf', 'newTv', null, '4', 'gg', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('61', '61', 'sdf', 'newTv', null, '5', 'sdf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('62', '62', 'sdf', 'koreaTv', null, '6', 'adf', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('63', '63', 'sdf', 'koreaTv', null, '7', 'gdd', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('64', '64', 'sdf', 'koreaTv', null, '2', 'we', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('65', '65', 'sdf', 'koreaTv', null, '3', 'dfg', null, '9', null, null, null, null);
INSERT INTO `t_movie` VALUES ('66', '66', 'sdf', 'koreaTv', null, '5', 'wer', null, '0', null, null, null, null);
INSERT INTO `t_movie` VALUES ('67', '67', 'sf', 'koreaTv', null, '6', 'wer', null, '8', null, null, null, null);
INSERT INTO `t_movie` VALUES ('68', '68', 'ad', 'koreaTv', null, '4', 'sdf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('69', '69', 'sdf', 'koreaTv', null, '7', 'sa', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('7', '7', 'dg', 'likeMovie', 'sf', '6', 'sdf', 'sdf', 'sdf', null, '2016-04-20', null, null);
INSERT INTO `t_movie` VALUES ('70', '70', 'adf', 'koreaTv', null, '4', 'sdf', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('71', '71', 'sdf', 'englishTv', null, '3', 'sdf', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('72', '72', 'adf', 'englishTv', null, '4', 'dsf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('73', '73', 'df', 'englishTv', null, '5', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('74', '74', 'df', 'englishTv', null, '2', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('75', '75', 'sd', 'englishTv', null, '3', 'aa', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('76', '76', 'sa', 'englishTv', null, '5', 'we', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('77', '77', 'sdf', 'englishTv', null, '3', 'df', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('78', '78', 'ad', 'englishTv', null, '5', 'gd', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('79', '79', 'sf', 'englishTv', null, '6', 'gd', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('8', '8', 'gd', 'likeMovie', 'sdf', '4', 'sdf', 'sf', 'sdf', null, '2016-04-20', null, null);
INSERT INTO `t_movie` VALUES ('80', '80', 'sdf', 'hkTv', null, '6', 'sd', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('81', '81', 'sdf', 'hkTv', null, '4', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('82', '82', 'sdf', 'hkTv', null, '6', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('83', '83', 'sdf', 'hkTv', null, '6', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('84', '84', 'sdf', 'hkTv', null, '6', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('85', '85', 'sdf', 'hkTv', null, '3', 'sfd', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('86', '86', 'gsdg', 'hkTv', null, '6', 'sf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('87', '87', 'sdf', 'hkTv', null, '6', 'sdf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('88', '88', 'sd', 'hkTv', null, '6', 'sf', null, '7', null, null, null, null);
INSERT INTO `t_movie` VALUES ('89', '89', 'sdf', 'movie', null, '6', 'sdf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('9', '9', 'sdf', 'likeMovie', 'sdf', '7', 'sdf', 'sdf', 'sdf', null, '2016-04-12', null, null);
INSERT INTO `t_movie` VALUES ('90', '90', 'sdf', 'movie', null, '4', 'sf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('91', '91', 'sdf', 'movie', null, '7', 'sd', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('92', '92', 'sd', 'movie', null, '8', 'df', null, '6', null, null, null, null);
INSERT INTO `t_movie` VALUES ('93', '93', 'sdf', 'movie', null, '5', 'sdf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('94', '94', 'sdf', 'movie', null, '6', 'sdf', null, '23', null, null, null, null);
INSERT INTO `t_movie` VALUES ('95', '95', 'sdf', 'movie', null, '8', 'sdf', null, '4', null, null, null, null);
INSERT INTO `t_movie` VALUES ('96', '96', 'dsf', 'movie', null, '9', 'sd', null, '5', null, null, null, null);
INSERT INTO `t_movie` VALUES ('97', '97', 'sdf', 'movie', null, '0', 'sdf', null, '2', null, null, null, null);
INSERT INTO `t_movie` VALUES ('98', '98', 'sdf', 'movie', null, '7', 'sdf', null, '3', null, null, null, null);
INSERT INTO `t_movie` VALUES ('99', '99', 'sdf', 'movie', null, '3', 'sd', null, '5', null, null, null, null);

-- ----------------------------
-- Table structure for t_resources
-- ----------------------------
DROP TABLE IF EXISTS `t_resources`;
CREATE TABLE `t_resources` (
  `id` varchar(55) NOT NULL,
  `resource_name` varchar(255) DEFAULT NULL,
  `enable` enum('ENABLE','DISABLE') DEFAULT 'ENABLE',
  `created_by` varchar(55) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_by` varchar(55) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_resources
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` varchar(55) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `enable` enum('DISABLE','ENABLE') DEFAULT 'ENABLE',
  `created_by` varchar(55) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_by` varchar(55) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_role_resources
-- ----------------------------
DROP TABLE IF EXISTS `t_role_resources`;
CREATE TABLE `t_role_resources` (
  `id` varchar(55) NOT NULL,
  `role_id` varchar(55) DEFAULT NULL,
  `resource_id` varchar(55) DEFAULT NULL,
  `created_by` varchar(55) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_by` varchar(55) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_role_resources
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(55) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(55) DEFAULT NULL,
  `img_url` varchar(55) DEFAULT NULL,
  `mobile_phone` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `enable` enum('Disable','Enable') DEFAULT 'Enable',
  `token` varchar(55) NOT NULL,
  `login_time` date DEFAULT NULL,
  `created_by` varchar(55) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_by` varchar(55) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('da6bd109ffeb4d3ab5d2d14a0fb5f4d7', 'eric', 'eric', 'eric', '12312314', '18352172471', 'eric@126.com', 'string', 'Enable', 'string', null, 'string', null, 'string', null);
INSERT INTO `t_user` VALUES ('test', 'xzc', 'xzc', 'xzc', null, null, null, null, null, 'sadasd', null, null, null, null, null);

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `id` varchar(55) NOT NULL,
  `user_id` varchar(55) DEFAULT NULL,
  `role_id` varchar(55) DEFAULT NULL,
  `created_by` varchar(55) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `updated_by` varchar(55) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
