create table Child (
   id bigint not null,
    parent_id bigint,
    primary key (id)
);
create table EntityWithManyStringFields (
   id bigint not null,
    field1 varchar(255),
    field2 varchar(255),
    field3 varchar(255),
    field4 varchar(255),
    field5 varchar(255),
    field6 varchar(255),
    field7 varchar(255),
    field8 varchar(255),
    primary key (id)
);
create table EntityWithManyStringFieldsDynamicUpdate (
   id bigint not null,
    field1 varchar(255),
    field2 varchar(255),
    field3 varchar(255),
    field4 varchar(255),
    field5 varchar(255),
    field6 varchar(255),
    field7 varchar(255),
    field8 varchar(255),
    primary key (id)
);
create table Parent (
   id bigint not null,
    primary key (id)
);
create table SimpleEntity (
   id bigint not null,
    field varchar(255),
    primary key (id)
);
create sequence hibernate_sequence start with 1 increment by 1