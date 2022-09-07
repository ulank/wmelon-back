
CREATE TABLE products.melon
(
    id SERIAL PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    color VARCHAR(25) NOT NULL,
    location VARCHAR(50) NOT NULL,
    count INT NOT NULL ,
    image VARCHAR(500),
    planting_date DATE,
    maturation_date DATE
);
