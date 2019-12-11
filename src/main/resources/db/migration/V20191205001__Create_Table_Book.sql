create table book(
    id varchar(36) NOT NULL,
    code varchar(20) not null,
    name varchar(255) not null,
    primary key (id),
    unique (code)
)
