DROP TABLE IF EXISTS "user";

CREATE TABLE "user" (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(150),
    age INTEGER,
    country VARCHAR(100)
);
