
# Maven project with  SpringBoot restApi PostgreSQL CRUD

## Requirements
[Install PostgreSql](https://www.postgresql.org/download/windows/)

[Set Enviroment Path MavenCLI](https://maven.apache.org/download.cgi)

###  Maven and Postgresql CLI set in Windows
[How to set the path and environment variables in Window](https://www.computerhope.com/issues/ch000549.htm)


### Create user and database with cli

    // Login database
    psql -U [username]
    CREATE USER book_db_user WITH PASSWORD 'm2m3m4';
    CREATE DATABASE book OWNER book_db_user;

### Run application
Runs tomcat server and automatically migrate database schema

      mvn sping-boot:run



