--liquibase formatted sql
--changeset efragance:create-table-SAP_INTEGRATIONS-v1.0.1
DROP TABLE IF EXISTS `SAP_INTEGRATIONS`;
CREATE TABLE `SAP_INTEGRATIONS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  `VERSION` bigint(20) NOT NULL,
  `FORMULA_ID` bigint(20) NOT NULL,
  `SAP_CODE` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_die1xsxyfbsorgprgnk6rneqn` (`SAP_CODE`),
  KEY `FKa31o9ik6v5qy2b8ttrud9p7y5` (`FORMULA_ID`),
  CONSTRAINT `FKa31o9ik6v5qy2b8ttrud9p7y5` FOREIGN KEY (`FORMULA_ID`) REFERENCES `FORMULAS` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci