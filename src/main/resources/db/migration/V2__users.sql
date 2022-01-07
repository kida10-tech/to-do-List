-- CREATE user TABLE

CREATE TABLE users
(

    id            int8                NOT NULL GENERATED ALWAYS AS IDENTITY,
    username    VARCHAR(100) UNIQUE NOT NULL,
    password     VARCHAR(100)        NOT NULL,
    deleted       bool                NOT NULL DEFAULT false,
    created_date  timestamptz(0)      NOT NULL DEFAULT now(),
    created_by    varchar(100)        NULL,
    modified_date timestamptz(0)      NULL,
    modified_by   varchar(100)        NULL,

    CONSTRAINT user_pk PRIMARY KEY (id)
);