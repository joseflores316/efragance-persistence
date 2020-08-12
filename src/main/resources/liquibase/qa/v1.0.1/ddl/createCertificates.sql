--liquibase formatted sql
--changeset efragance:create-table-CERTIFICATES-v1.0.1
DROP TABLE IF EXISTS `CERTIFICATES`;
CREATE TABLE `CERTIFICATES` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `MAX_DOSE_ID` bigint(20) NOT NULL,
  `TYPE` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKkqaak0s8yjnwhtbqwpiyhjj5` (`MAX_DOSE_ID`),
  CONSTRAINT `FKkqaak0s8yjnwhtbqwpiyhjj5` FOREIGN KEY (`MAX_DOSE_ID`) REFERENCES `MAX_DOSE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci