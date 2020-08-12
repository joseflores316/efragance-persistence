--liquibase formatted sql
--changeset efragance:create-table-ROLES-v1.0.1
DROP TABLE IF EXISTS `ROLES`;
CREATE TABLE `ROLES` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci