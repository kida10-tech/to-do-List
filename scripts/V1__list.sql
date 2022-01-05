-- CREATE lists TABLE

CREATE TABLE lists
(

    id            int2         NOT NULL,
    title        VARCHAR(100) NOT NULL,
    created_date  timestamptz(0) NOT NULL DEFAULT NOW(),
    created_by    varchar(100) NULL,
    modified_date timestamptz(0) NULL,
    modified_by   varchar(100) NULL,
    deleted       bool         NOT NULL DEFAULT FALSE,

    CONSTRAINT list_pk PRIMARY KEY (id)
);
