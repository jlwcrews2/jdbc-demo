CREATE TABLE IF NOT EXISTS part
(
    part_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    part_name VARCHAR(255) NOT NULL,
    part_quantity int,
    version int
    );