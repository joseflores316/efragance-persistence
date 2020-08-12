--liquibase formatted sql
--changeset efragance:create-table-ANNEXES-v1.0.1
DROP TABLE IF EXISTS `ANNEXES`;
CREATE TABLE `ANNEXES` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `ANNEXED` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_69dng9o9ctlcpphkpa3m43xar` (`ANNEXED`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci