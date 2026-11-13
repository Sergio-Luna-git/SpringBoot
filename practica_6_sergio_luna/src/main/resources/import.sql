-- Cursos
insert into curso (nombre, ciclo, aula, turno) values ('DAM 1', 'DAM', 'A1', 'MATUTINO');
insert into curso (nombre, ciclo, aula, turno) values ('DAM 2', 'DAM', 'A2', 'MATUTINO');
insert into curso (nombre, ciclo, aula, turno) values ('DAW 1', 'DAW', 'B1', 'VESPERTINO');
insert into curso (nombre, ciclo, aula, turno) values ('DAW 2', 'DAW', 'B2', 'VESPERTINO');

-- Módulos
insert into modulo (nombre, codigo, horas_semanales, horas_totales, curso, optativo, activo) values ('Programacion Aplicaciones Multiplataforma', 'PAM1', 6, 192, 'SEGUNDO', false, true);
insert into modulo (nombre, codigo, horas_semanales, horas_totales, curso, optativo, activo) values ('Acceso a Datos', 'AD01', 5, 160, 'SEGUNDO', false, true);

-- Alumnos
insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('Ana', 'García López', 'ana.garcia.dam1@example.com', 8.75);
insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('Carlos', 'Pérez Martín', 'carlos.perez.dam1@example.com', 7.20);

insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('Lucía', 'Fernández Ruiz', 'lucia.fernandez.dam2@example.com', 9.10);
insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('David', 'Sánchez Torres', 'david.sanchez.dam2@example.com', 6.95);

insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('María', 'Romero Gil', 'maria.romero.daw1@example.com', 8.40);
insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('Javier', 'Morales León', 'javier.morales.daw1@example.com', 7.85);

insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('Elena', 'Ruiz Navarro', 'elena.ruiz.daw2@example.com', 9.30);
insert into alumno (nombre, apellidos, email, notaMediaCursoAnterior) values ('Pablo', 'Gil Herrera', 'pablo.gil.daw2@example.com', 6.60);