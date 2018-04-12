-- phpMyAdmin SQL Dump
-- version 4.4.15.7
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Апр 12 2018 г., 19:37
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
  `email_autors` varchar(200) NOT NULL
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
  `answer_coments` int(11) NOT NULL,
  `country_coments` varchar(50) NOT NULL
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
  `tegs_news` mediumtext NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `news`
--

INSERT INTO `news` (`id_news`, `title_news`, `data_news`, `time_news`, `text_news`, `autor_news`, `tegs_news`) VALUES
(1, 'jjasljd', '2023-03-20', '14:45:00', 'jdlafad', 'Lol', 'LOL'),
(3, 'hkjhlk', '2020-05-20', '21:45:00', 'kghjfghvbnkhgjftghvjbkghjbklkvgh', 'kaxa', 'kaxa');

-- --------------------------------------------------------

--
-- Структура таблицы `tegs`
--

CREATE TABLE IF NOT EXISTS `tegs` (
  `id_tegs` int(11) NOT NULL,
  `text_tegs` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tegs`
--

INSERT INTO `tegs` (`id_tegs`, `text_tegs`) VALUES
(1, '2'),
(2, 'LOL');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `autors`
--
ALTER TABLE `autors`
  ADD PRIMARY KEY (`id_autors`);

--
-- Индексы таблицы `coments`
--
ALTER TABLE `coments`
  ADD PRIMARY KEY (`id_coments`);

--
-- Индексы таблицы `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id_news`);

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
-- AUTO_INCREMENT для таблицы `coments`
--
ALTER TABLE `coments`
  MODIFY `id_coments` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT для таблицы `news`
--
ALTER TABLE `news`
  MODIFY `id_news` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT для таблицы `tegs`
--
ALTER TABLE `tegs`
  MODIFY `id_tegs` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
