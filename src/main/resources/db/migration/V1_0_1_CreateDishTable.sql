create table dish (
    id bigserial not null,
    description varchar(255),
    image_url varchar(255),
    name varchar(255),
    user_id bigint,
    primary key (id));
create sequence recipe_seq start with 1 increment by 50