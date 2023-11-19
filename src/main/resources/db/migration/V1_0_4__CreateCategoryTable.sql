-- Table: public.category

-- DROP TABLE public.category;

CREATE TABLE public.category
(
    id bigint NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT category_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE public.category
    OWNER to postgres;