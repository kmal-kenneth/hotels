-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 29-11-2017 a las 00:30:26
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `attractive`
--

CREATE TABLE `attractive` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `attractive_hotel`
--

CREATE TABLE `attractive_hotel` (
  `id_attractive` int(11) NOT NULL,
  `id_hotel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `card`
--

CREATE TABLE `card` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `name_holder` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `surname_holder` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `card number` int(16) NOT NULL,
  `security_code` int(11) NOT NULL,
  `month_expiration` int(4) NOT NULL,
  `year_expiration` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `card_card_type`
--

CREATE TABLE `card_card_type` (
  `id_card` int(11) NOT NULL,
  `id_typeCard` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `card_type`
--

CREATE TABLE `card_type` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL,
  `Id_ typeLodging` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `address` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `country` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `numbre_phone` int(11) NOT NULL,
  `foundation_year` year(4) NOT NULL,
  `hotel_size` int(11) NOT NULL,
  `check_in` time NOT NULL,
  `check_out` time NOT NULL,
  `requirements` varchar(535) COLLATE utf8_spanish_ci NOT NULL,
  `stars` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `image`
--

CREATE TABLE `image` (
  `id` int(11) NOT NULL,
  `id_hotel` int(11) NOT NULL,
  `photography` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `surname` char(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `entry_date` datetime NOT NULL,
  `departure_date` datetime NOT NULL,
  `quantity_nights` int(11) NOT NULL,
  `total_rooms` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservation_room`
--

CREATE TABLE `reservation_room` (
  `id_room` int(11) NOT NULL,
  `id_reservation` int(11) NOT NULL,
  `id_person` int(11) NOT NULL,
  `adults_quantity` int(11) NOT NULL,
  `amount children` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `room`
--

CREATE TABLE `room` (
  `id` int(11) NOT NULL,
  `id_season` int(11) NOT NULL,
  `id_typeRoom` int(11) NOT NULL,
  `id_hotel` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `room_type`
--

CREATE TABLE `room_type` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `bed_type` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `number_people` int(11) NOT NULL,
  `size` int(11) NOT NULL,
  `all_inclusive` tinyint(1) NOT NULL,
  `description` varchar(535) COLLATE utf8_spanish_ci NOT NULL,
  `terrace` tinyint(1) NOT NULL,
  `Seaview` tinyint(1) NOT NULL,
  `smoke` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `season`
--

CREATE TABLE `season` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `service`
--

CREATE TABLE `service` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `service_hotel`
--

CREATE TABLE `service_hotel` (
  `id_service` int(11) NOT NULL,
  `id_hotel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `type_lodging`
--

CREATE TABLE `type_lodging` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `surname` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `gender` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `phone` int(11) NOT NULL,
  `e-mail` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `password` char(255) COLLATE utf8_spanish_ci NOT NULL,
  `user_type` char(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `attractive`
--
ALTER TABLE `attractive`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `attractive_hotel`
--
ALTER TABLE `attractive_hotel`
  ADD PRIMARY KEY (`id_attractive`,`id_hotel`),
  ADD KEY `attractive_hotel_hotel` (`id_hotel`);

--
-- Indices de la tabla `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`id`),
  ADD KEY `card_user` (`id_user`);

--
-- Indices de la tabla `card_card_type`
--
ALTER TABLE `card_card_type`
  ADD PRIMARY KEY (`id_card`,`id_typeCard`),
  ADD KEY `card_card_type_card_type` (`id_typeCard`);

--
-- Indices de la tabla `card_type`
--
ALTER TABLE `card_type`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `hotel_type_lodging` (`Id_ typeLodging`);

--
-- Indices de la tabla `image`
--
ALTER TABLE `image`
  ADD PRIMARY KEY (`id`),
  ADD KEY `image_hotel` (`id_hotel`);

--
-- Indices de la tabla `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `reservation_user` (`id_user`);

--
-- Indices de la tabla `reservation_room`
--
ALTER TABLE `reservation_room`
  ADD PRIMARY KEY (`id_room`,`id_reservation`),
  ADD KEY `reservation_rom_person` (`id_person`),
  ADD KEY `reservation_rom_reservation` (`id_reservation`);

--
-- Indices de la tabla `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`id`),
  ADD KEY `rom_hotel` (`id_hotel`),
  ADD KEY `rom_season` (`id_season`),
  ADD KEY `rom_type_rom` (`id_typeRoom`);

--
-- Indices de la tabla `room_type`
--
ALTER TABLE `room_type`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `season`
--
ALTER TABLE `season`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `service_hotel`
--
ALTER TABLE `service_hotel`
  ADD PRIMARY KEY (`id_service`,`id_hotel`),
  ADD KEY `service_hotel_hotel` (`id_hotel`);

--
-- Indices de la tabla `type_lodging`
--
ALTER TABLE `type_lodging`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `attractive`
--
ALTER TABLE `attractive`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `card`
--
ALTER TABLE `card`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `card_type`
--
ALTER TABLE `card_type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hotel`
--
ALTER TABLE `hotel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `image`
--
ALTER TABLE `image`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `person`
--
ALTER TABLE `person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `room`
--
ALTER TABLE `room`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `room_type`
--
ALTER TABLE `room_type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `season`
--
ALTER TABLE `season`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `service`
--
ALTER TABLE `service`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `type_lodging`
--
ALTER TABLE `type_lodging`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `attractive_hotel`
--
ALTER TABLE `attractive_hotel`
  ADD CONSTRAINT `attractive_hotel_attractive` FOREIGN KEY (`id_attractive`) REFERENCES `attractive` (`id`),
  ADD CONSTRAINT `attractive_hotel_hotel` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`);

--
-- Filtros para la tabla `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `card_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);

--
-- Filtros para la tabla `card_card_type`
--
ALTER TABLE `card_card_type`
  ADD CONSTRAINT `card_card_type_car` FOREIGN KEY (`id_card`) REFERENCES `card` (`id`),
  ADD CONSTRAINT `card_card_type_card_type` FOREIGN KEY (`id_typeCard`) REFERENCES `card_type` (`id`);

--
-- Filtros para la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD CONSTRAINT `hotel_type_lodging` FOREIGN KEY (`Id_ typeLodging`) REFERENCES `type_lodging` (`id`);

--
-- Filtros para la tabla `image`
--
ALTER TABLE `image`
  ADD CONSTRAINT `image_hotel` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`);

--
-- Filtros para la tabla `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_user` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);

--
-- Filtros para la tabla `reservation_room`
--
ALTER TABLE `reservation_room`
  ADD CONSTRAINT `reservation_rom_person` FOREIGN KEY (`id_person`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `reservation_rom_reservation` FOREIGN KEY (`id_reservation`) REFERENCES `reservation` (`id`),
  ADD CONSTRAINT `reservation_rom_rom` FOREIGN KEY (`id_room`) REFERENCES `room` (`id`);

--
-- Filtros para la tabla `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `rom_hotel` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`),
  ADD CONSTRAINT `rom_season` FOREIGN KEY (`id_season`) REFERENCES `season` (`id`),
  ADD CONSTRAINT `rom_type_rom` FOREIGN KEY (`id_typeRoom`) REFERENCES `room_type` (`id`);

--
-- Filtros para la tabla `service_hotel`
--
ALTER TABLE `service_hotel`
  ADD CONSTRAINT `service_hotel_hotel` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`),
  ADD CONSTRAINT `service_hotel_service` FOREIGN KEY (`id_service`) REFERENCES `service` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
