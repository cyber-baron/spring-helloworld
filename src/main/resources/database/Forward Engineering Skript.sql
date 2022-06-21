-- ************************************** "Читатель"

CREATE TABLE "Читатель"
(
 "ID_Пользователя"       numeric(18,0) NOT NULL,
 "Имя_Пользователя"      char(50) NOT NULL,
 "Фамилия_Пользователя"  char(50) NOT NULL,
 "Отчество_Пользователя" char(50) NULL,
 "Номер_Телефона"        numeric(18,0) NOT NULL,
 CONSTRAINT PK_43 PRIMARY KEY ( "ID_Пользователя" )
);

-- ************************************** "Книга"

CREATE TABLE "Книга"
(
 "ID_Книги"    numeric(18,0) NOT NULL,
 "Название"    char(50) NOT NULL,
 "Год_Издания" int NOT NULL,
 CONSTRAINT PK_5 PRIMARY KEY ( "ID_Книги" )
);

-- ************************************** "База Жанров"

CREATE TABLE "База Жанров"
(
 "ID_Жанров"      numeric(18,0) NOT NULL,
 "Название_Жанра" char(50) NOT NULL,
 CONSTRAINT PK_10 PRIMARY KEY ( "ID_Жанров" )
);

-- ************************************** "Книга-Жанр"

CREATE TABLE "Книга-Жанр"
(
 "ID_Книги"  numeric(18,0) NOT NULL,
 "ID_Жанров" numeric(18,0) NOT NULL,
 CONSTRAINT PK_14 PRIMARY KEY ( "ID_Книги", "ID_Жанров" ),
 CONSTRAINT FK_20 FOREIGN KEY ( "ID_Книги" ) REFERENCES "Книга" ( "ID_Книги" ),
 CONSTRAINT FK_23 FOREIGN KEY ( "ID_Жанров" ) REFERENCES "База Жанров" ( "ID_Жанров" )
);

CREATE INDEX FK_22 ON "Книга-Жанр"
(
 "ID_Книги"
);

CREATE INDEX FK_25 ON "Книга-Жанр"
(
 "ID_Жанров"
);

-- ************************************** "База Авторов"

CREATE TABLE "База Авторов"
(
 "ID_Автора"       char(50) NOT NULL,
 "Имя_Автора"      char(50) NOT NULL,
 "Фамилия_Автора"  char(50) NOT NULL,
 "Отчество_Автора" char(50) NULL,
 "Год_Рождения"    int NOT NULL,
 CONSTRAINT PK_28 PRIMARY KEY ( "ID_Автора" )
);

-- ************************************** "Книга-Автор"

CREATE TABLE "Книга-Автор"
(
 "ID_Книги"  numeric(18,0) NOT NULL,
 "ID_Автора" char(50) NOT NULL,
 CONSTRAINT PK_40 PRIMARY KEY ( "ID_Книги", "ID_Автора" ),
 CONSTRAINT FK_34 FOREIGN KEY ( "ID_Книги" ) REFERENCES "Книга" ( "ID_Книги" ),
 CONSTRAINT FK_37 FOREIGN KEY ( "ID_Автора" ) REFERENCES "База Авторов" ( "ID_Автора" )
);

CREATE INDEX FK_36 ON "Книга-Автор"
(
 "ID_Книги"
);

CREATE INDEX FK_39 ON "Книга-Автор"
(
 "ID_Автора"
);

-- ************************************** "Выдача Книг"

CREATE TABLE "Выдача Книг"
(
 "ID_Выдачи"       numeric(18,0) NOT NULL,
 "ID_Пользователя" numeric(18,0) NOT NULL,
 "ID_Книги"        numeric(18,0) NOT NULL,
 "Дата_Выдачи"     date NOT NULL,
 "Дата_Возврата"   date NOT NULL,
 CONSTRAINT PK_50 PRIMARY KEY ( "ID_Выдачи" ),
 CONSTRAINT FK_53 FOREIGN KEY ( "ID_Пользователя" ) REFERENCES "Читатель" ( "ID_Пользователя" ),
 CONSTRAINT FK_56 FOREIGN KEY ( "ID_Книги" ) REFERENCES "Книга" ( "ID_Книги" )
);

CREATE INDEX FK_55 ON "Выдача Книг"
(
 "ID_Пользователя"
);

CREATE INDEX FK_58 ON "Выдача Книг"
(
 "ID_Книги"
);
