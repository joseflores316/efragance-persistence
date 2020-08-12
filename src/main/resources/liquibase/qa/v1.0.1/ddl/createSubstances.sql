--liquibase formatted sql
--changeset efragance:create-table-SUBSTANCES-v1.0.1
DROP TABLE IF EXISTS `SUBSTANCES`;
CREATE TABLE `SUBSTANCES` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `CAS_NR` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SUBSTANCE` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_ta52ke247v4u8vxaoisochpnj` (`SUBSTANCE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci