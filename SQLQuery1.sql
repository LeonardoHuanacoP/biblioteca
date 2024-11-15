USE BDt3POO;
GO


CREATE TABLE Libro (
    CodigoLibro VARCHAR(20) PRIMARY KEY,
    TituloLibro VARCHAR(100) NOT NULL,
    AutorLibro VARCHAR(100) NOT NULL,
    Cantidad INT NOT NULL,
    Estado BIT -- En SQL Server, usamos BIT para valores booleanos (TRUE/FALSE)
);
GO

CREATE TABLE Estudiante (
    IdEstudiante VARCHAR(20) PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellido VARCHAR(50) NOT NULL,
    Carrera INT NOT NULL
);
GO


CREATE TABLE Prestamo (
    CodigoPrestamo VARCHAR(20) PRIMARY KEY,
    IdEstudiante VARCHAR(20) NOT NULL,
    FechaPrestamo DATE NOT NULL,
    FechaEstimadaDevolucion DATE NOT NULL,
    Multa FLOAT DEFAULT 0,
    FOREIGN KEY (IdEstudiante) REFERENCES Estudiante(IdEstudiante)
);
GO


CREATE TABLE Prestamo_Libros (
    CodigoPrestamo VARCHAR(20),
    CodigoLibro VARCHAR(20),
    PRIMARY KEY (CodigoPrestamo, CodigoLibro),
    FOREIGN KEY (CodigoPrestamo) REFERENCES Prestamo(CodigoPrestamo),
    FOREIGN KEY (CodigoLibro) REFERENCES Libro(CodigoLibro)
);
GO


INSERT INTO Libro (CodigoLibro, TituloLibro, AutorLibro, Cantidad, Estado)
VALUES
    ('L001', 'Introducción a la Programación', 'Juan Pérez', 10, 1),  -- Estado TRUE = 1
    ('L002', 'Fundamentos de Bases de Datos', 'Ana López', 5, 1), 
    ('L003', 'Estructuras de Datos', 'Carlos García', 3, 0); -- Estado FALSE = 0
GO


INSERT INTO Estudiante (IdEstudiante, Nombre, Apellido, Carrera)
VALUES
    ('E001', 'María', 'González', 1),
    ('E002', 'Luis', 'Martínez', 2),
    ('E003', 'Pedro', 'Hernández', 4);
GO


INSERT INTO Prestamo (CodigoPrestamo, IdEstudiante, FechaPrestamo, FechaEstimadaDevolucion, Multa)
VALUES
    ('P001', 'E001', '2024-11-01', '2024-11-15', 0),
    ('P002', 'E002', '2024-11-02', '2024-11-16', 5.00);
GO


INSERT INTO Prestamo_Libros (CodigoPrestamo, CodigoLibro)
VALUES
    ('P001', 'L001'),
    ('P001', 'L002'),
    ('P002', 'L003');
GO


SELECT * FROM Libro;
SELECT * FROM Estudiante;
SELECT * FROM Prestamo;
SELECT * FROM Prestamo_Libros;