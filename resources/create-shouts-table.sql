-- Create db structure
CREATE TABLE shouts(
       id INT PRIMARY KEY NOT NULL,
       body varchar NOT NULL,
       created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP)
