CREATE TABLE public."user"
(
    id bigint NOT NULL,
    username text NOT NULL,
    password_encoded text NOT NULL,
    dishes_id bigint[],
    resepies_id bigint[],
    PRIMARY KEY (id)
);

ALTER TABLE public."user"
    OWNER to postgres;