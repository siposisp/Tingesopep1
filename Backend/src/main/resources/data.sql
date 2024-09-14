--Insertar Bonos
INSERT INTO public.bond(brand, quantity, amount)
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

-- Insertar automoviles
INSERT INTO public.constants(iva)
VALUES (0.19);

