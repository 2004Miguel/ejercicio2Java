-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 26-09-2024 a las 21:46:45
-- Versión del servidor: 8.0.39-0ubuntu0.22.04.1
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Ejercicio2Java`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `computador`
--

CREATE TABLE `computador` (
  `id` bigint NOT NULL,
  `marca` varchar(50) NOT NULL,
  `procesador` varchar(50) NOT NULL,
  `gpu` varchar(50) NOT NULL,
  `cantidad_ram` int NOT NULL,
  `cantidad_espacio` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `computador`
--

INSERT INTO `computador` (`id`, `marca`, `procesador`, `gpu`, `cantidad_ram`, `cantidad_espacio`) VALUES
(2, 'Dell', 'AMD', 'cualquiera', 16, 500),
(4, 'ASUS', 'intel', 'cualquiera', 32, 800);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `computador`
--
ALTER TABLE `computador`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `computador`
--
ALTER TABLE `computador`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
