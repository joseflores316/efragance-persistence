--liquibase formatted sql
--changeset efragance:create-table-DILUTIONS-v1.0.1
DROP TABLE IF EXISTS `DILUTIONS`;
CREATE TABLE `DILUTIONS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `NAME` varchar(400) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_iyw2cp0rv9a11p9nruflhqr8h` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci