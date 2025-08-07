CREATE TABLE "user" (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(150),
    age INTEGER,
    country VARCHAR(100)
);
