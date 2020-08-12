--liquibase formatted sql
--changeset efragance:create-table-USERS-v1.0.1
DROP TABLE IF EXISTS `USERS`;
CREATE TABLE `USERS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `ACTIVE` bit(1) NOT NULL,
  `LANG` varchar(2) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NAME` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PASSWORD` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SURNAME1` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SURNAME2` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `USER_NAME` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_21q8fvry4wix31petp1awxsx9` (`USER_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci