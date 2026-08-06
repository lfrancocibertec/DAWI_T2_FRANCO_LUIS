# Solución T2
Solución de T2 del curso Desarrollo de apliciones web - Cibertec 2026

## SQL

CREATE DATABASE bd_docentes;

USE bd_docentes;

CREATE TABLE docente (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nombres VARCHAR(100) NOT NULL,
apellidos VARCHAR(100) NOT NULL,
correo VARCHAR(150) NOT NULL,
telefono VARCHAR(20) NOT NULL,
especialidad VARCHAR(100) NOT NULL,
fecha_ingreso DATE NOT NULL
);

INSERT INTO docente
(nombres, apellidos, correo, telefono, especialidad, fecha_ingreso)
VALUES
('Juan', 'Pérez', 'juan.perez@cibertec.edu.pe', '987654321', 'Programación Java', '2022-03-15'),
('María', 'Gómez', 'maria.gomez@cibertec.edu.pe', '912345678', 'Base de Datos', '2021-08-10'),
('Carlos', 'Ramírez', 'carlos.ramirez@cibertec.edu.pe', '956789123', 'Desarrollo Web', '2023-01-20');
