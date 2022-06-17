create table persona(
    "id_persona" varchar(10) primary key not null,
    "nombre" varchar(50) not null,
    "apellidos" varchar(100) not null
);

create table carrera(
    "id_carrera" serial primary key not null,
    "nombre" varchar(100) not null,
    "creditos" int null
);

create table inscripcion(
    "id" serial primary key not null,
    "id_persona" varchar(10) not null,
    "id_carrera" serial not null,
    "fecha" timestamp null,
    constraint fk_idpersona 
    foreign key ("id_persona")
    references persona("id_persona")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    constraint "fk_idpersona "
    foreign key ("id_carrera") 
    references carrera("id_carrera")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);