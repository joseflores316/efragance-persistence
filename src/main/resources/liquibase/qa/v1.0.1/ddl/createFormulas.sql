--liquibase formatted sql
--changeset efragance:create-table-FORMULAS-v1.0.1
DROP TABLE IF EXISTS `FORMULAS`;
CREATE TABLE `FORMULAS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `CODE` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NAME` varchar(400) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TYPE` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_r7dgcw6n2cgm8de6pwlcfch3t` (`CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci