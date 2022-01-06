-- CREATE list TABLE

CREATE TABLE list
(

    id           int8  NOT NULL GENERATED ALWAYS AS IDENTITY,
    title        VARCHAR(100) NOT NULL,
    done         bool NOT NULL DEFAULT FALSE,
    created_date  timestamptz(0) NOT NULL DEFAULT NOW(),
    created_by    varchar(100) NULL,
    modified_date timestamptz(0) NULL,
    modified_by   varchar(100) NULL,
    deleted       bool         NOT NULL DEFAULT FALSE,

    CONSTRAINT list_pk PRIMARY KEY (id)
);
