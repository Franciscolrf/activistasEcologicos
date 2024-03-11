CREATE DATABASE activistasecologicos;
USE activistasecologicostelefonoscliente;

CREATE TABLE cliente (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombres VARCHAR(50),
    ap_paterno VARCHAR(50),
    ap_materno VARCHAR(50),
    idDireccion BIGINT
);

CREATE TABLE direccion (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    calle VARCHAR(50),
    colonia VARCHAR(50),
    codigoPostal VARCHAR(20),
    numeroExterior VARCHAR(20),
    idCliente BIGINT
);

CREATE TABLE telefonosCliente (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    idCliente BIGINT,
    telefono VARCHAR(40)
);

CREATE TABLE problema (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    fechaInicio DATE,
    fechaFinal DATE,
    estado VARCHAR(20),
    idCliente BIGINT
);

CREATE TABLE activista (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombres VARCHAR(50),
    ap_paterno VARCHAR(50),
    ap_materno VARCHAR(50),
    telefono VARCHAR(50),
    fechaInicioLabores DATE
);

CREATE TABLE activistasDelProblema (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    idProblema BIGINT,
    idActivista BIGINT
);

ALTER TABLE cliente ADD FOREIGN KEY (idDireccion) REFERENCES direccion (id);
ALTER TABLE direccion ADD FOREIGN KEY (idCliente) REFERENCES cliente (id);
ALTER TABLE problema ADD FOREIGN KEY (idCliente) REFERENCES cliente (id);
ALTER TABLE activistasdelproblema ADD FOREIGN KEY (idActivista) REFERENCES activista(id);
ALTER TABLE activistasdelproblema ADD FOREIGN KEY (idProblema) REFERENCES problema (id);
