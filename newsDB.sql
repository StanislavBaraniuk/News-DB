-- phpMyAdmin SQL Dump
-- version 4.4.15.7
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Апр 19 2018 г., 21:11
-- Версия сервера: 5.6.37
-- Версия PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `newsDB`
--
CREATE DATABASE IF NOT EXISTS `newsDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `newsDB`;

-- --------------------------------------------------------

--
-- Структура таблицы `autors`
--

CREATE TABLE IF NOT EXISTS `autors` (
  `id_autors` int(11) NOT NULL,
  `name_autors` varchar(50) NOT NULL,
  `surname_autors` varchar(50) NOT NULL,
  `avatar_autors` varchar(2000) NOT NULL,
  `burthday_autors` date NOT NULL,
  `sex_autors` tinyint(1) NOT NULL,
  `country_autors` varchar(50) NOT NULL,
  `speciality_autors` varchar(100) NOT NULL,
  `about_autors` mediumtext NOT NULL,
  `email_autors` varchar(200) NOT NULL,
  `password_autors` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `cities_pogoda`
--

CREATE TABLE IF NOT EXISTS `cities_pogoda` (
  `id_cities_pogoda` int(11) NOT NULL,
  `name_cities_pogoda` varchar(200) NOT NULL,
  `temperature_cities_pogoda` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `coments`
--

CREATE TABLE IF NOT EXISTS `coments` (
  `id_coments` int(11) NOT NULL,
  `text_coments` varchar(2000) NOT NULL,
  `autor_coments` varchar(200) NOT NULL,
  `data_coments` date NOT NULL,
  `time_coments` time NOT NULL,
  `like_coments` int(11) NOT NULL,
  `answer_coments` int(11) DEFAULT NULL,
  `country_coments` varchar(50) NOT NULL,
  `news_comments` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `kategori`
--

CREATE TABLE IF NOT EXISTS `kategori` (
  `id_kategori` int(11) NOT NULL,
  `title_kategori` varchar(200) NOT NULL,
  `news_kategori` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `kurse_valute`
--

CREATE TABLE IF NOT EXISTS `kurse_valute` (
  `id_kurse_valute` int(11) NOT NULL,
  `name_kurse_valute` varchar(20) NOT NULL,
  `value_kurse_valute` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `news`
--

CREATE TABLE IF NOT EXISTS `news` (
  `id_news` int(11) NOT NULL,
  `title_news` varchar(100) NOT NULL,
  `data_news` date NOT NULL,
  `time_news` time NOT NULL,
  `text_news` mediumtext NOT NULL,
  `autor_news` varchar(50) NOT NULL,
  `tegs_news` mediumtext NOT NULL,
  `photo_news` varchar(200) NOT NULL,
  `photoTitle_news` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `news`
--

INSERT INTO `news` (`id_news`, `title_news`, `data_news`, `time_news`, `text_news`, `autor_news`, `tegs_news`, `photo_news`, `photoTitle_news`) VALUES
(1, 'HDKJ;fsdgfhjhgfjghfjjgfjg', '2018-04-18', '02:28:55', 'Hgjhjsfd', 'Korica', 'ADA, LADA CALINA, КАПЕЦЬ', 'jk', 'Chot tam'),
(2, 'add', '2018-04-18', '02:29:53', 'ADADADA', 'Ofo', 'ADA, NE ADA', 'link', 'nelik'),
(3, 'jkhj', '2018-04-20', '12:03:06', 'kjhj', 'hjg', 'bn', 'hj', 'kjhj');

-- --------------------------------------------------------

--
-- Структура таблицы `opros`
--

CREATE TABLE IF NOT EXISTS `opros` (
  `id_opros` int(11) NOT NULL,
  `title_opros` varchar(200) NOT NULL,
  `data_opros` date NOT NULL,
  `time_opros` time NOT NULL,
  `result_opros` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `partner_news`
--

CREATE TABLE IF NOT EXISTS `partner_news` (
  `id_partner_news` int(11) NOT NULL,
  `title_partner_news` varchar(200) NOT NULL,
  `link_partner_news` varchar(200) NOT NULL,
  `photo_partner_news` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `podkategori`
--

CREATE TABLE IF NOT EXISTS `podkategori` (
  `id_podkategori` int(11) NOT NULL,
  `title_podkategori` varchar(200) NOT NULL,
  `kategori_podkategori` varchar(200) NOT NULL,
  `news_podkategori` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `result_opros`
--

CREATE TABLE IF NOT EXISTS `result_opros` (
  `id_result_opros` int(11) NOT NULL,
  `id_opros` int(11) NOT NULL,
  `text_result_opros` varchar(200) NOT NULL,
  `counter_result_opros` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `tegs`
--

CREATE TABLE IF NOT EXISTS `tegs` (
  `id_tegs` int(11) NOT NULL,
  `text_tegs` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=565 DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tegs`
--

INSERT INTO `tegs` (`id_tegs`, `text_tegs`) VALUES
(1, 'fh'),
(564, 'gjhh');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `autors`
--
ALTER TABLE `autors`
  ADD PRIMARY KEY (`id_autors`);

--
-- Индексы таблицы `cities_pogoda`
--
ALTER TABLE `cities_pogoda`
  ADD PRIMARY KEY (`id_cities_pogoda`);

--
-- Индексы таблицы `coments`
--
ALTER TABLE `coments`
  ADD PRIMARY KEY (`id_coments`);

--
-- Индексы таблицы `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Индексы таблицы `kurse_valute`
--
ALTER TABLE `kurse_valute`
  ADD PRIMARY KEY (`id_kurse_valute`);

--
-- Индексы таблицы `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id_news`);

--
-- Индексы таблицы `opros`
--
ALTER TABLE `opros`
  ADD PRIMARY KEY (`id_opros`);

--
-- Индексы таблицы `partner_news`
--
ALTER TABLE `partner_news`
  ADD PRIMARY KEY (`id_partner_news`);

--
-- Индексы таблицы `podkategori`
--
ALTER TABLE `podkategori`
  ADD PRIMARY KEY (`id_podkategori`);

--
-- Индексы таблицы `result_opros`
--
ALTER TABLE `result_opros`
  ADD PRIMARY KEY (`id_result_opros`);

--
-- Индексы таблицы `tegs`
--
ALTER TABLE `tegs`
  ADD PRIMARY KEY (`id_tegs`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `autors`
--
ALTER TABLE `autors`
  MODIFY `id_autors` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `cities_pogoda`
--
ALTER TABLE `cities_pogoda`
  MODIFY `id_cities_pogoda` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `coments`
--
ALTER TABLE `coments`
  MODIFY `id_coments` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id_kategori` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `kurse_valute`
--
ALTER TABLE `kurse_valute`
  MODIFY `id_kurse_valute` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `news`
--
ALTER TABLE `news`
  MODIFY `id_news` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT для таблицы `opros`
--
ALTER TABLE `opros`
  MODIFY `id_opros` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `partner_news`
--
ALTER TABLE `partner_news`
  MODIFY `id_partner_news` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `podkategori`
--
ALTER TABLE `podkategori`
  MODIFY `id_podkategori` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `result_opros`
--
ALTER TABLE `result_opros`
  MODIFY `id_result_opros` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `tegs`
--
ALTER TABLE `tegs`
  MODIFY `id_tegs` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=565;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
