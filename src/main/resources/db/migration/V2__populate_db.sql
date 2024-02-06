INSERT INTO client (name) VALUES
    ('First'),
    ('Second'),
    ('Third'),
    ('Four'),
    ('Five'),
    ('Six'),
    ('Seven'),
    ('Eight'),
    ('Nine'),
    ('Ten');


INSERT INTO planet (id, name) VALUES
    ('MAR','Mars'),
    ('SAT','Saturn'),
    ('VEN','Venus'),
    ('URA','Uran'),
    ('UPI','Upiter');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id) VALUES
    (1, 'MAR','SAT'),
    (2, 'MAR','VEN'),
    (3, 'MAR','URA'),
    (4, 'MAR','UPI'),
    (5, 'VEN','MAR'),
    (1, 'VEN','SAT'),
    (2, 'VEN','URA'),
    (3, 'VEN','UPI'),
    (4, 'UPI','VEN'),
    (5, 'UPI','URA');