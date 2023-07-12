-- begin LOG_CONTRACT
create table LOG_CONTRACT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER varchar(255),
    DATE timestamp,
    STATE varchar(255),
    --
    primary key (ID)
)^
-- end LOG_CONTRACT
