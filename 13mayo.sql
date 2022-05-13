create database MiEmpresa;

use MiEmpresa;

create table empleado(
	
	dni INT NOT NULL,
	apellido VARCHAR(20),
	nombre VARCHAR(20),
	telefono_particular int,
	nro_de_interno int,
	celular int,
	estado_civil varchar(1), -- s, c, v ,d
	hijos int,
	nacimiento date,
	ingreso date

);


create table sueldo(

	basico decimal,
	retenciones decimal,
	asignaciones decimal,
	comisiones decimal,
	mes int,
	sueldo_neto decimal
	
);


create table producto(
	
	id_producto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	descripcion VARCHAR(20),
	stock int,
	stock_minimo int,
	costo,
	precio_venta,
	demora time,

);

create table control_horas(

	fecha date,
	hora_inicio time,
	hora_fin time
	
);

create table producto_x_vendedor (
	
	dni_empleado int,
	id_producto,
	fecha_venta
);


	
SELECT * FROM empleados WHERE YEAR(ingreso) > 1994;

SELECT * FROM empleados WHERE MONTH(nacimiento) = 10;

SELECT * FROM empleados WHERE MONTH(nacimiento) = 1 AND DAY(nacimiento) <= 15;

SELECT Años AS (YEAR(curdate())-YEAR(ingreso) FROM empleados ORDER BY ingreso DESC;


SELECT Entrega as (curdate()+demora) FROM producto WHERE stock <= stock_minimo;


SELECT * FROM empleados WHERE dni IN (SELECT dni_empleado FROM producto_x_vendedor ORDER BY COUNT(dni_empleado) LIMIT 10);

SELECT empleado.nombre, empleado.apellido, dni_empleado, COUNT(dni_empleado) FROM producto_x_vendedor WHERE YEAR(fecha_venta) = 2017 INNER JOIN empleado ON empleado.dni = dni_empleado GROUP BY MONTH(fecha_venta);


SELECT producto_x_vendedor.id_producto, COUNT(producto_x_vendedor.id_producto), producto.descripcion FROM
producto_x_vendedor WHERE YEAR(fecha_venta) = 2017 INNER JOIN producto ON producto.id_producto = producto_x_vendedor.id_producto GROUP BY MONTH(fecha_venta);

 -- 13
 
SELECT (CONCAT(nombre, apellido)) AS nombre_empleado FROM empleados;
	
UPDATE TABLE SET descripcion = 'TV' WHERE descripcion = 'televisor';

UPDATE TABLE SET descripcion = TRIM(descripcion) WHERE descripcion LIKE '% ' AND descripcion LIKE ' %';
	
SELECT nombre, apellido, (select ifnull(hijos, "no tiene")) FROM empleados;

SELECT descripcion, (select if(precio<3000, "barato")), (select if(precio<6000, "caro"), (select if(precio>6000, "muy caro")) FROM producto;

SELECT nombre, apellido, sueldo_neto (select if(sueldo_neto<15000, "bajo")), (select if(sueldo_neto<50000, "medio"), (select if(sueldo_neto>50000, "alto")) FROM producto;

-- 20
