-- ************************************** Book

CREATE TABLE Book
(
 Book_ID           numeric(18,0) NOT NULL,
 Book_Name         varchar(30) NOT NULL,
 Book_Publish_Date int(4) NOT NULL,
 CONSTRAINT PK_5 PRIMARY KEY ( Book_ID )
);

-- ************************************** "Author Base"

CREATE TABLE "Author Base"
(
 Author_ID          numeric(18,0) NOT NULL,
 Author_Name        varchar(30) NOT NULL,
 Author_Surname     varchar(30) NOT NULL,
 Author_Second_Name varchar(30) NULL,
 Author_Birth_Date  int(4) NOT NULL,
 CONSTRAINT PK_28 PRIMARY KEY ( Author_ID )
);

-- ************************************** "Book-Authors"

CREATE TABLE "Book-Authors"
(
 Book_ID   numeric(18,0) NOT NULL,
 Author_ID numeric(18,0) NOT NULL,
 CONSTRAINT PK_40 PRIMARY KEY ( Book_ID, Author_ID ),
 CONSTRAINT FK_34 FOREIGN KEY ( Book_ID ) REFERENCES Book ( Book_ID ),
 CONSTRAINT FK_37 FOREIGN KEY ( Author_ID ) REFERENCES "Author Base" ( Author_ID )
);

CREATE INDEX FK_36 ON "Book-Authors"
(
 Book_ID
);

CREATE INDEX FK_39 ON "Book-Authors"
(
 Author_ID
);

-- ************************************** "Genres Base"

CREATE TABLE "Genres Base"
(
 Genre_ID   numeric(18,0) NOT NULL,
 Genre_Name varchar(30) NOT NULL,
 CONSTRAINT PK_10 PRIMARY KEY ( Genre_ID )
);

-- ************************************** "Book-Genres"

CREATE TABLE "Book-Genres"
(
 Book_ID  numeric(18,0) NOT NULL,
 Genre_ID numeric(18,0) NOT NULL,
 CONSTRAINT PK_14 PRIMARY KEY ( Book_ID, Genre_ID ),
 CONSTRAINT FK_20 FOREIGN KEY ( Book_ID ) REFERENCES Book ( Book_ID ),
 CONSTRAINT FK_23 FOREIGN KEY ( Genre_ID ) REFERENCES "Genres Base" ( Genre_ID )
);

CREATE INDEX FK_22 ON "Book-Genres"
(
 Book_ID
);

CREATE INDEX FK_25 ON "Book-Genres"
(
 Genre_ID
);

-- ************************************** "User"

CREATE TABLE "User"
(
 User_ID           numeric(18,0) NOT NULL,
 User_Name         varchar(30) NOT NULL,
 User_Surname      varchar(30) NOT NULL,
 User_Second_Name  varchar(30) NULL,
 User_Phone_Number int NOT NULL,
 CONSTRAINT PK_43 PRIMARY KEY ( User_ID )
);

-- ************************************** "Book Order"

CREATE TABLE "Book Order"
(
 Oreder_ID        numeric(18,0) NOT NULL,
 User_ID          numeric(18,0) NOT NULL,
 Book_ID          numeric(18,0) NOT NULL,
 Order_Start_Date date NOT NULL,
 Order_End_Date   date NOT NULL,
 CONSTRAINT PK_50 PRIMARY KEY ( Oreder_ID ),
 CONSTRAINT FK_53 FOREIGN KEY ( User_ID ) REFERENCES "User" ( User_ID ),
 CONSTRAINT FK_56 FOREIGN KEY ( Book_ID ) REFERENCES Book ( Book_ID )
);

CREATE INDEX FK_55 ON "Book Order"
(
 User_ID
);

CREATE INDEX FK_58 ON "Book Order"
(
 Book_ID
);
