--liquibase formatted sql
--changeset efragance:create-table-USERS_ROLES-v1.0.1
DROP TABLE IF EXISTS `USERS_ROLES`;
CREATE TABLE `USERS_ROLES` (
  `ROLE_ID` bigint(20) NOT NULL,
  `USER_ID` bigint(20) NOT NULL,
  `CREATED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CREATED_DATE` datetime(6) NOT NULL,
  `MODIFIED_BY` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MODIFIED_DATE` datetime(6) NOT NULL,
  PRIMARY KEY (`ROLE_ID`,`USER_ID`),
  KEY `FK12v220v0594jj67ajy0u6xdvu` (`USER_ID`),
  CONSTRAINT `FK12v220v0594jj67ajy0u6xdvu` FOREIGN KEY (`USER_ID`) REFERENCES `USERS` (`ID`),
  CONSTRAINT `FKoaraxqcxi9fou9oqpjrc4nx68` FOREIGN KEY (`ROLE_ID`) REFERENCES `ROLES` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci