 /* -- Cliente
INSERT INTO `bdspring`.`clientes` (`nombre`,`edad`,`telefono`,`documento`,`email`) 
VALUES ("cristian",24,44444,1017241658,'crisf@gmail.com');
INSERT INTO `bdspring`.`clientes`(`nombre`,`edad`,`telefono`,`documento`,`email`)
VALUES ('beatriz',25,5555,1012546875,'bea@gmail.com');
insert into `bdspring`.`clientes`(`nombre`,`edad`,`telefono`,`documento`,`email`)
 values ('jenni',35,66666,78520410,'jen@gmail.com');
-- -- Pasaje
insert into `bdspring`.`pasajes` (`clase`,`asiento`,`valor`,`cliente_id`) values ('vip','10',350000,1);
insert into `bdspring`.`pasajes` (`clase`,`asiento`,`valor`,`cliente_id`) values ('vip','5',350000,2);
insert into `bdspring`.`pasajes` (`clase`,`asiento`,`valor`,`cliente_id`) values ('clasico','105',70000,3);
-- Equipaje
insert into `bdspring`.`equipajes` (`peso`,`cliente_id`) values (8,1);
insert into `bdspring`.`equipajes` (`peso`,`cliente_id`) values (4,2);
insert into `bdspring`.`equipajes` (`peso`,`cliente_id`) values (20,3);
-- Itinerario
insert into `bdspring`.`itinerarios` (`hora`,`fecha`) values ('13:35:00','2020-04-24');
insert into `bdspring`.`itinerarios` (`hora`,`fecha`) values ('14:35:00','2020-04-25');
-- Origenes
insert into `bdspring`.`origenes` (`aeropuerto`,`ciudad`,`itinerario_id`) values ('Maria jose','Barranquilla',1);
insert into `bdspring`.`origenes` (`aeropuerto`,`ciudad`,`itinerario_id`) values ('Sekiro','Bogota',2);
--Destinos
insert into `bdspring`.`destinos` (`aeropuerto`,`ciudad`,`itinerario_id`) values ('Rojas','Cali',1);
insert into `bdspring`.`destinos` (`aeropuerto`,`ciudad`,`itinerario_id`) values ('Robert','Medellin',2);
--Vuelos
insert into `bdspring`.`vuelos` (`capacidad`,`fecha`,`hora`,`itinerario_id`,`pasaje_id`) values (45,'2020/4/24','13:00:00',1,1);
insert into `bdspring`.`vuelos` (`capacidad`,`fecha`,`hora`,`itinerario_id`,`pasaje_id`) values (45,'2020/5/04','13:00:00',2,2);
insert into `bdspring`.`vuelos` (`capacidad`,`fecha`,`hora`,`itinerario_id`,`pasaje_id`) values (45,'2020/5/04','13:00:00',2,3); */