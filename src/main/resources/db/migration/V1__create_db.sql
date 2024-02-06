CREATE TABLE if not exists client
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(NAME) >= 3)
);


CREATE TABLE planet
(
    id VARCHAR UNIQUE ,
    name VARCHAR(500) NOT NULL CHECK (LENGTH(NAME) >= 1)
);

CREATE TABLE ticket
(
    id SERIAL PRIMARY KEY,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT now(),
    client_id BIGINT,
    from_planet_id VARCHAR NOT NULL,
    to_planet_id VARCHAR NOT NULL,
    FOREIGN KEY (client_id) REFERENCES client(id),
    FOREIGN KEY (from_planet_id) REFERENCES planet(id),
    FOREIGN KEY (to_planet_id) REFERENCES planet(id)
);