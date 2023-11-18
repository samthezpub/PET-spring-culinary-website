-- Table: public.dish

-- DROP TABLE public.dish;

CREATE TABLE public.dish
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default" NOT NULL,
    image_url text COLLATE pg_catalog."default" NOT NULL,
    recipies_id bigint[] NOT NULL,
    CONSTRAINT dish_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE public.dish
    OWNER to postgres;