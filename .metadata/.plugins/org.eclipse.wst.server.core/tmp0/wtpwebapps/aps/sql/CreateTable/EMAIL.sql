CREATE TABLE `email` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sender` varchar(100) NOT NULL,
  `receive` varchar(100) NOT NULL,
  `subject` varchar(100) NOT NULL, 
  `message` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;