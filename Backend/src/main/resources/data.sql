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

-- Insertar recargos
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
       (40001, 99999999, 'kilometraje', 'furgoneta', 0.2),

       (0, 5, 'antiguedad', 'sedan', 0),
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


--Insertar Bonos
INSERT INTO public.bonuses(brand, quantity, amount)
VALUES ('Toyota', 5, 70000),
       ('Ford', 2, 50000),
       ('Hyundai', 1, 30000),
       ('Honda', 7, 40000);


-- Insertar automoviles
INSERT INTO public.cars(patent, brand, model, type, year, engine, seats, mileage)
VALUES ('CFYF55', 'Hyundai', 'Getz', 'Sedan', 2010, 'Gasolina', 5,15000),
       ('TW6977', 'Ford', 'Grand i10', 'Hatchback', 2021, 'Gasolina', 5,4000),
       ('FHKJ23', 'Toyota', 'Corolla', 'Sedan', 2015, 'Hibrido', 5,10000),
       ('NMQP98', 'Ford', 'Ranger', 'Pickup', 2018, 'Diesel', 5,35000),
       ('KDJW65', 'Chevrolet', 'Spark', 'Hatchback', 2019, 'Gasolina', 4,50000);


--Crear una tabla sin entidad
--CREATE TABLE example_table (
--     id SERIAL PRIMARY KEY,
--     name VARCHAR(255) NOT NULL,
--     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
-- );


