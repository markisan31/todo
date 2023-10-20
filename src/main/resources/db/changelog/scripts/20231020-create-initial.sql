--liquibase formatted sql

--changeset Mark:0

CREATE TABLE IF NOT EXISTS event
(
    id                  uuid      not null
        primary key,
    event_name          varchar(100),
    created_at          timestamp not null
);