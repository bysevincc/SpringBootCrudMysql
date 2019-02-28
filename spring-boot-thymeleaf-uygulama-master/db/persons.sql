-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1:3306
-- Üretim Zamanı: 19 Nis 2018, 14:02:39
-- Sunucu sürümü: 5.7.19
-- PHP Sürümü: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `persons`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `person_information`
--

DROP TABLE IF EXISTS `person_information`;
CREATE TABLE IF NOT EXISTS `person_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` varchar(255) CHARACTER SET utf8 NOT NULL,
  `hobby` varchar(255) CHARACTER SET utf8 NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `person_information`
--

INSERT INTO `person_information` (`id`, `age`, `hobby`, `name`) VALUES
(1, '44', 'Rafting', 'Mehmet'),
(12, '24', 'Yamaç', 'Ayşe');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
