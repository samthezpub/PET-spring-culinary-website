create table dish (
    id bigserial not null,
    description varchar(255),
    image_url varchar(255),
    name varchar(255),
    user_id bigint,
    primary key (id),

        CONSTRAINT dish_pkey PRIMARY KEY (id),
    CONSTRAINT fk3h7qfevodvyk24ss68mwu8ap6 FOREIGN KEY (category_id)
        REFERENCES public.category (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkigm8tk56scwc2mog31xdjo0im FOREIGN KEY (user_id)
        REFERENCES public.user_entity (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
create sequence recipe_seq start with 1 increment by 50
