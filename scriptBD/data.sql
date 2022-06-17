----------------------------------------------------------------------
------------PERSONA---------------------------------------------------
----------------------------------------------------------------------
INSERT INTO persona VALUES('18010001', 'Maria','Garcia Marin');
INSERT INTO persona VALUES('18020003', 'Edegardo','Carmona Domínguez');
INSERT INTO persona VALUES('18030004', 'Martin','Gomez Torres');
INSERT INTO persona VALUES('18040005', 'Gerardo','Parral Montero');
INSERT INTO persona VALUES('18050006', 'Jorge','Garcia Montalban');
INSERT INTO persona VALUES('18060002', 'Edwin','Garcia Quiterio');
SELECT * FROM persona;
----------------------------------------------------------------------
------------CARRERA---------------------------------------------------
----------------------------------------------------------------------
INSERT INTO carrera VALUES(1, 'Ingenieria En Gestion Empresarial',5);
INSERT INTO carrera VALUES(2, 'Ingenieria En Robotica',5);
INSERT INTO carrera VALUES(3, 'Ingenieria Electromecanica',5);
INSERT INTO carrera VALUES(4, 'Ingenieria Civil',5);
INSERT INTO carrera VALUES(5, 'Licenciatura En Contabilidad',5);
INSERT INTO carrera VALUES(6, 'Ingenieria En Tecnologías De La Información Y Comunicaciones',5);
SELECT * FROM carrera;
----------------------------------------------------------------------
------------INSCRIPCIONES---------------------------------------------
----------------------------------------------------------------------
INSERT INTO inscripcion VALUES(1,'18010001',1,TO_TIMESTAMP('08/07/2018 17:30:00','DD/MM/YYYY HH24:MI:SS'));
INSERT INTO inscripcion VALUES(2,'18020003',2,TO_TIMESTAMP('08/07/2018 17:30:00','DD/MM/YYYY HH24:MI:SS'));
INSERT INTO inscripcion VALUES(3,'18030004',3,TO_TIMESTAMP('08/07/2018 17:30:00','DD/MM/YYYY HH24:MI:SS'));
INSERT INTO inscripcion VALUES(4,'18040005',4,TO_TIMESTAMP('08/07/2018 17:30:00','DD/MM/YYYY HH24:MI:SS'));
INSERT INTO inscripcion VALUES(5,'18050006',5,TO_TIMESTAMP('08/07/2018 17:30:00','DD/MM/YYYY HH24:MI:SS'));
INSERT INTO inscripcion VALUES(6,'18060002',6,TO_TIMESTAMP('08/07/2018 17:30:00','DD/MM/YYYY HH24:MI:SS'));
SELECT * FROM inscripcion;

--------------------------------
-----Set de datos iniciales-----
--------------------------------
SELECT setval('public.carrera_id_carrera_seq', 6, true);
SELECT setval('public.inscripcion_id_seq', 6, true);













