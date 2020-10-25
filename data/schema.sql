use text_analyzer;

create table if not exists text (
    id int not null auto_increment,
    value text not null,
    primary key (id)
);

create table if not exists word (
    id int not null auto_increment,
    text_id int not null,
    value varchar(255) not null,
    duplicates int not null,
    primary key (id),
    foreign key (text_id) REFERENCES text(id)
);
