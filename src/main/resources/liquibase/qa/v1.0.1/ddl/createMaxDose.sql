--liquibase formatted sql
--changeset efragance:create-table-MAX_DOSE-v1.0.1
DROP TABLE IF EXISTS `MAX_DOSE`;
CREATE TABLE `MAX_DOSE` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `APPLICATION_ID` bigint(20) NOT NULL,
  `DOSE` decimal(5,0) NOT NULL,
  `FORMULA_ID` bigint(20) NOT NULL,
  `REGULATION` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKear4se97rf4wbcsirh4m7n2n0` (`APPLICATION_ID`),
  KEY `FKojw3kwusrlioq2ux3u6dl933e` (`FORMULA_ID`),
  CONSTRAINT `FKear4se97rf4wbcsirh4m7n2n0` FOREIGN KEY (`APPLICATION_ID`) REFERENCES `APPLICATIONS` (`ID`),
  CONSTRAINT `FKojw3kwusrlioq2ux3u6dl933e` FOREIGN KEY (`FORMULA_ID`) REFERENCES `FORMULAS` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci