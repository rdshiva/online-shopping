
CREATE TABLE category (
    ID int NOT NULL,
    Name varchar(255) NOT NULL,
    Description varchar(255),
    Image_Url varchar(255),
    is_active TINYINT,
    
    PRIMARY KEY (ID)
);
