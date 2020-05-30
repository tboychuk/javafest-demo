CREATE TABLE person
(
    id         BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    email      VARCHAR(255)
);

CREATE TABLE note
(
    text       VARCHAR(255),
    created_at TIMESTAMP,
    person     BIGINT,
    person_key SMALLINT,
    PRIMARY KEY (person, person_key),
    FOREIGN KEY (person) REFERENCES person
);