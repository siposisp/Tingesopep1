-- Insertar constantes
INSERT INTO public.constants(type, percentage)
VALUES ('iva', 0.19);


-- Insertar descuentos
INSERT INTO public.discounts(min, max, type, engine, percentage)
VALUES (0, 0, 'dia', null, 0.1),
       (1, 2, 'quantity', 'gasolina', 0.05),
       (1, 2, 'quantity', 'diesel', 0.07),
       (1, 2, 'quantity', 'hibrido', 0.1),
       (1, 2, 'quantity', 'electrico', 0.08),
       (3, 5, 'quantity', 'gasolina', 0.1),
       (3, 5, 'quantity', 'diesel', 0.12),
       (3, 5, 'quantity', 'hibrido', 0.15),
       (3, 5, 'quantity', 'electrico', 0.13),
       (6, 9, 'quantity', 'gasolina', 0.15),
       (6, 9, 'quantity', 'diesel', 0.17),
       (6, 9, 'quantity', 'hibrido', 0.2),
       (6, 9, 'quantity', 'electrico', 0.18),
       (10, 999, 'quantity', 'gasolina', 0.2),
       (10, 999, 'quantity', 'diesel', 0.22),
       (10, 999, 'quantity', 'hibrido', 0.25),
       (10, 999, 'quantity', 'electrico', 0.23);


--------------------- Insertar recargos ---------------------
-- Insertar recargo kilometraje
INSERT INTO public.surcharges(min, max, type, car_type, percentage)
VALUES (0, 5000, 'kilometraje', 'sedan', 0),
       (0, 5000, 'kilometraje', 'hatchback', 0),
       (0, 5000, 'kilometraje', 'suv', 0),
       (0, 5000, 'kilometraje', 'pickup', 0),
       (0, 5000, 'kilometraje', 'furgoneta', 0),
       (5001, 12000, 'kilometraje', 'sedan', 0.03),
       (5001, 12000, 'kilometraje', 'hatchback', 0.03),
       (5001, 12000, 'kilometraje', 'suv', 0.05),
       (5001, 12000, 'kilometraje', 'pickup', 0.05),
       (5001, 12000, 'kilometraje', 'furgoneta', 0.05),
       (12001, 25000, 'kilometraje', 'sedan', 0.07),
       (12001, 25000, 'kilometraje', 'hatchback', 0.07),
       (12001, 25000, 'kilometraje', 'suv', 0.09),
       (12001, 25000, 'kilometraje', 'pickup', 0.09),
       (12001, 25000, 'kilometraje', 'furgoneta', 0.09),
       (25001, 40000, 'kilometraje', 'sedan', 0.12),
       (25001, 40000, 'kilometraje', 'hatchback', 0.12),
       (25001, 40000, 'kilometraje', 'suv', 0.12),
       (25001, 40000, 'kilometraje', 'pickup', 0.12),
       (25001, 40000, 'kilometraje', 'furgoneta', 0.12),
       (40001, 99999999, 'kilometraje', 'sedan', 0.2),
       (40001, 99999999, 'kilometraje', 'hatchback', 0.2),
       (40001, 99999999, 'kilometraje', 'suv', 0.2),
       (40001, 99999999, 'kilometraje', 'pickup', 0.2),
       (40001, 99999999, 'kilometraje', 'furgoneta', 0.2);
-- Insertar recargo antiguedad
INSERT INTO public.surcharges(min, max, type, car_type, percentage)
VALUES (0, 5, 'antiguedad', 'sedan', 0),
       (0, 5, 'antiguedad', 'hatchback', 0),
       (0, 5, 'antiguedad', 'suv', 0),
       (0, 5, 'antiguedad', 'pickup', 0),
       (0, 5, 'antiguedad', 'furgoneta', 0),
       (6, 10, 'antiguedad', 'sedan', 0.05),
       (6, 10, 'antiguedad', 'hatchback', 0.05),
       (6, 10, 'antiguedad', 'suv', 0.07),
       (6, 10, 'antiguedad', 'pickup', 0.07),
       (6, 10, 'antiguedad', 'furgoneta', 0.07),
       (11, 15, 'antiguedad', 'sedan', 0.09),
       (11, 15, 'antiguedad', 'hatchback', 0.09),
       (11, 15, 'antiguedad', 'suv', 0.11),
       (11, 15, 'antiguedad', 'pickup', 0.11),
       (11, 15, 'antiguedad', 'furgoneta', 0.11),
       (16, 999, 'antiguedad', 'sedan', 0.15),
       (16, 999, 'antiguedad', 'hatchback', 0.15),
       (16, 999, 'antiguedad', 'suv', 0.2),
       (16, 999, 'antiguedad', 'pickup', 0.2),
       (16, 999, 'antiguedad', 'furgoneta', 0.2);


--------------------- Insertar valor de las reparaciones ---------------------

-- Reparaciones del Sistema de Frenos
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Incluye el reemplazo de pastillas de freno, discos, tambores, líneas de freno y reparación o reemplazo del cilindro maestro de frenos.', 'Reparaciones del Sistema de Frenos', 120000, 'gasolina',1),
       ('Incluye el reemplazo de pastillas de freno, discos, tambores, líneas de freno y reparación o reemplazo del cilindro maestro de frenos.', 'Reparaciones del Sistema de Frenos', 120000, 'diesel',1),
       ('Incluye el reemplazo de pastillas de freno, discos, tambores, líneas de freno y reparación o reemplazo del cilindro maestro de frenos.', 'Reparaciones del Sistema de Frenos', 180000, 'hibrido',1),
       ('Incluye el reemplazo de pastillas de freno, discos, tambores, líneas de freno y reparación o reemplazo del cilindro maestro de frenos.', 'Reparaciones del Sistema de Frenos', 220000, 'electrico',1);
-- Servicio del Sistema de Refrigeración
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Reparación o reemplazo de radiadores, bombas de agua, termostatos y mangueras, así como la solución de problemas de sobrecalentamiento.', 'Servicio del Sistema de Refrigeración', 130000, 'gasolina',2),
       ('Reparación o reemplazo de radiadores, bombas de agua, termostatos y mangueras, así como la solución de problemas de sobrecalentamiento.', 'Servicio del Sistema de Refrigeración', 130000, 'diesel',2),
       ('Reparación o reemplazo de radiadores, bombas de agua, termostatos y mangueras, así como la solución de problemas de sobrecalentamiento.', 'Servicio del Sistema de Refrigeración', 190000, 'hibrido',2),
       ('Reparación o reemplazo de radiadores, bombas de agua, termostatos y mangueras, así como la solución de problemas de sobrecalentamiento.', 'Servicio del Sistema de Refrigeración', 230000, 'electrico',2);
-- Reparaciones del Motor
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Desde reparaciones menores como el reemplazo de bujías y cables, hasta reparaciones mayores como la reconstrucción del motor o la reparación de la junta de la culata.', 'Reparaciones del Motor', 350000, 'gasolina',3),
       ('Desde reparaciones menores como el reemplazo de bujías y cables, hasta reparaciones mayores como la reconstrucción del motor o la reparación de la junta de la culata.', 'Reparaciones del Motor', 450000, 'diesel',3),
       ('Desde reparaciones menores como el reemplazo de bujías y cables, hasta reparaciones mayores como la reconstrucción del motor o la reparación de la junta de la culata.', 'Reparaciones del Motor', 700000, 'hibrido',3),
       ('Desde reparaciones menores como el reemplazo de bujías y cables, hasta reparaciones mayores como la reconstrucción del motor o la reparación de la junta de la culata.', 'Reparaciones del Motor', 800000, 'electrico',3);
-- Reparaciones de la Transmisión
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Incluyen la reparación o reemplazo de componentes de la transmisión manual o automática, cambios de líquido y solución de problemas de cambios de marcha.', 'Reparaciones de la Transmisión', 210000, 'gasolina',4),
       ('Incluyen la reparación o reemplazo de componentes de la transmisión manual o automática, cambios de líquido y solución de problemas de cambios de marcha.', 'Reparaciones de la Transmisión', 210000, 'diesel',4),
       ('Incluyen la reparación o reemplazo de componentes de la transmisión manual o automática, cambios de líquido y solución de problemas de cambios de marcha.', 'Reparaciones de la Transmisión', 300000, 'hibrido',4),
       ('Incluyen la reparación o reemplazo de componentes de la transmisión manual o automática, cambios de líquido y solución de problemas de cambios de marcha.', 'Reparaciones de la Transmisión', 300000, 'electrico',4);
-- Reparaciones del Sistema Eléctrico
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Solución de problemas y reparación de alternadores, arrancadores, baterías y sistemas de cableado, así como la reparación de componentes Electricos como faros, intermitentes y sistemas de entretenimiento.', 'Reparaciones del Sistema Electrico', 150000, 'gasolina',5),
       ('Solución de problemas y reparación de alternadores, arrancadores, baterías y sistemas de cableado, así como la reparación de componentes Electricos como faros, intermitentes y sistemas de entretenimiento.', 'Reparaciones del Sistema Electrico', 150000, 'diesel',5),
       ('Solución de problemas y reparación de alternadores, arrancadores, baterías y sistemas de cableado, así como la reparación de componentes Electricos como faros, intermitentes y sistemas de entretenimiento.', 'Reparaciones del Sistema Electrico', 200000, 'hibrido',5),
       ('Solución de problemas y reparación de alternadores, arrancadores, baterías y sistemas de cableado, así como la reparación de componentes Electricos como faros, intermitentes y sistemas de entretenimiento.', 'Reparaciones del Sistema Electrico', 250000, 'electrico',5);
-- Reparaciones del Sistema de Escape
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Incluye el reemplazo del silenciador, tubos de escape, catalizador y la solución de problemas relacionados con las emisiones.', 'Reparaciones del Sistema de Escape', 100000, 'gasolina',6),
       ('Incluye el reemplazo del silenciador, tubos de escape, catalizador y la solución de problemas relacionados con las emisiones.', 'Reparaciones del Sistema de Escape', 120000, 'diesel',6),
       ('Incluye el reemplazo del silenciador, tubos de escape, catalizador y la solución de problemas relacionados con las emisiones.', 'Reparaciones del Sistema de Escape', 450000, 'hibrido',6),
       ('Incluye el reemplazo del silenciador, tubos de escape, catalizador y la solución de problemas relacionados con las emisiones.', 'Reparaciones del Sistema de Escape', 0, 'electrico',6);
-- Reparación de Neumáticos y Ruedas
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Reparación de pinchazos, reemplazo de neumáticos, alineación y balanceo de ruedas.', 'Reparación de Neumáticos y Ruedas', 100000, 'gasolina',7),
       ('Reparación de pinchazos, reemplazo de neumáticos, alineación y balanceo de ruedas.', 'Reparación de Neumáticos y Ruedas', 100000, 'diesel',7),
       ('Reparación de pinchazos, reemplazo de neumáticos, alineación y balanceo de ruedas.', 'Reparación de Neumáticos y Ruedas', 100000, 'hibrido',7),
       ('Reparación de pinchazos, reemplazo de neumáticos, alineación y balanceo de ruedas.', 'Reparación de Neumáticos y Ruedas', 100000, 'electrico',7);
-- Reparaciones de la Suspensión y la Dirección
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Reemplazo de amortiguadores, brazos de control, rótulas y reparación del sistema de dirección asistida.', 'Reparaciones de la Suspensión y la Dirección', 180000, 'gasolina',8),
       ('Reemplazo de amortiguadores, brazos de control, rótulas y reparación del sistema de dirección asistida.', 'Reparaciones de la Suspensión y la Dirección', 180000, 'diesel',8),
       ('Reemplazo de amortiguadores, brazos de control, rótulas y reparación del sistema de dirección asistida.', 'Reparaciones de la Suspensión y la Dirección', 210000, 'hibrido',8),
       ('Reemplazo de amortiguadores, brazos de control, rótulas y reparación del sistema de dirección asistida.', 'Reparaciones de la Suspensión y la Dirección', 250000, 'electrico',8);
-- Reparación del Sistema de Aire Acondicionado y Calefacción
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Incluye la recarga de refrigerante, reparación o reemplazo del compresor, y solución de problemas del sistema de calefacción.', 'Reparación del Sistema de Aire Acondicionado y Calefacción', 150000, 'gasolina',9),
       ('Incluye la recarga de refrigerante, reparación o reemplazo del compresor, y solución de problemas del sistema de calefacción.', 'Reparación del Sistema de Aire Acondicionado y Calefacción', 150000, 'diesel',9),
       ('Incluye la recarga de refrigerante, reparación o reemplazo del compresor, y solución de problemas del sistema de calefacción.', 'Reparación del Sistema de Aire Acondicionado y Calefacción', 180000, 'hibrido',9),
       ('Incluye la recarga de refrigerante, reparación o reemplazo del compresor, y solución de problemas del sistema de calefacción.', 'Reparación del Sistema de Aire Acondicionado y Calefacción', 180000, 'electrico',9);
-- Reparaciones del Sistema de Combustible
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Limpieza o reemplazo de inyectores de combustible, reparación o reemplazo de la bomba de combustible y solución de problemas de suministro de combustible.', 'Reparaciones del Sistema de Combustible', 130000, 'gasolina',10),
       ('Limpieza o reemplazo de inyectores de combustible, reparación o reemplazo de la bomba de combustible y solución de problemas de suministro de combustible.', 'Reparaciones del Sistema de Combustible', 140000, 'diesel',10),
       ('Limpieza o reemplazo de inyectores de combustible, reparación o reemplazo de la bomba de combustible y solución de problemas de suministro de combustible.', 'Reparaciones del Sistema de Combustible', 220000, 'hibrido',10),
       ('Limpieza o reemplazo de inyectores de combustible, reparación o reemplazo de la bomba de combustible y solución de problemas de suministro de combustible.', 'Reparaciones del Sistema de Combustible', 0, 'electrico',10);
-- Reparación y Reemplazo del Parabrisas y Cristales
INSERT INTO public.price_repairs(description, repair_title, amount, engine, repair_number)
VALUES ('Reparación de pequeñas grietas en el parabrisas o reemplazo completo de parabrisas y ventanas dañadas.', 'Reparación y Reemplazo del Parabrisas y Cristales', 80000, 'gasolina',11),
       ('Reparación de pequeñas grietas en el parabrisas o reemplazo completo de parabrisas y ventanas dañadas.', 'Reparación y Reemplazo del Parabrisas y Cristales', 80000, 'diesel',11),
       ('Reparación de pequeñas grietas en el parabrisas o reemplazo completo de parabrisas y ventanas dañadas.', 'Reparación y Reemplazo del Parabrisas y Cristales', 80000, 'hibrido',11),
       ('Reparación de pequeñas grietas en el parabrisas o reemplazo completo de parabrisas y ventanas dañadas.', 'Reparación y Reemplazo del Parabrisas y Cristales', 80000, 'electrico',11);


--Insertar Bonos
INSERT INTO public.bonuses(brand, quantity, amount)
VALUES ('Toyota', 5, 70000),
       ('Ford', 2, 50000),
       ('Hyundai', 1, 30000),
       ('Honda', 7, 40000);


-- Insertar automoviles
INSERT INTO public.cars(patent, brand, model, type, year, engine, seats, mileage)
VALUES ('CFYF55', 'Hyundai', 'Getz', 'sedan', 2010, 'gasolina', 5,15000),
       ('TW6977', 'Ford', 'Grand i10', 'hatchback', 2021, 'gasolina', 5,4000),
       ('FHKJ23', 'Toyota', 'Corolla', 'sedan', 2015, 'hibrido', 5,10000),
       ('NMQP98', 'Ford', 'Ranger', 'pickup', 2018, 'diesel', 5,35000),
       ('KDJW65', 'Chevrolet', 'Spark', 'hatchback', 2019, 'gasolina', 4,50000);


-- Insertar historial de reparaciones
INSERT INTO public.repair_history (discounts, pickup_date, entry_date, exit_date, pickup_hour, entry_hour,
    exit_hour, iva, amount_without_iva, total, total_amount_repairs, state, surchages, patent)
VALUES  (43500, '2022-01-21', '2022-01-18', '2022-01-20', '15:25:00', '10:30:00', '10:30:00', 53808, 240327, 337008, 270000, true, 56700, 'CFYF55'),
        (0, '2023-12-20', '2023-12-15', '2023-12-19', '13:27:00', '12:55:00', '13:30:00', 0, 0, 0, 0, false, 0, 'TW6977');

-- Insertar reparaciones
INSERT INTO public.repairs (
    repair_date,
    repair_hour,
    amount,
    repair_number,
    id_repair_history,
    repair_title,
    patent
)
VALUES
    ('2022-01-18', '10:30:00', 120000, 5, 1, 'Reparación sistema eléctrico', 'CFYF55'),
    ('2022-01-18', '10:30:00', 150000, 1, 1, 'Reparación sistema de frenos', 'CFYF55'),
    ('2023-12-15', '12:55:00', 120000, 1, 2, 'Reparación sistema de frenos', 'TW6977'),
    ('2023-12-15', '12:55:00', 130000, 10, 2, 'Reparación sistema de combustible', 'TW6977');


























--Crear una tabla sin entidad
--CREATE TABLE example_table (
--     id SERIAL PRIMARY KEY,
--     name VARCHAR(255) NOT NULL,
--     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
-- );


