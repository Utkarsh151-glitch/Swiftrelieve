# SwiftRelief

**A JavaFX desktop app for coordinating disaster relief: track disasters, volunteers, resources and aid requests in one MySQL-backed dashboard.**

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-17-007396)
![MySQL](https://img.shields.io/badge/MySQL-8-4479A1?logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-build-C71A36?logo=apachemaven&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)

> Desktop application: there is no live web demo.

## Screenshots

_To be added: run the app and save screenshots of the login screen and dashboard to `docs/screenshots/`._

## Why

During an emergency, relief teams juggle volunteers, supplies and incoming requests across spreadsheets and phone calls. SwiftRelief keeps them in one place so an admin can see what is needed, what is available and who can help.

## Features

- **Admin login** checked against the `admins` table
- **Dashboard** that switches between the four management views
- **Disasters:** add, list and delete disaster events
- **Volunteers:** add, list and delete volunteers (name, age, contact, location, skill, availability)
- **Resources:** add, list and delete relief resources
- **Requests:** add, list and delete aid requests
- MVC structure: FXML views, controllers, DAOs over JDBC

## Tech stack

Java 17 · JavaFX 17 (FXML) · MySQL 8 (JDBC, `mysql-connector-j`) · Maven with `javafx-maven-plugin`

## Getting started

**Prerequisites:** JDK 17+, Maven 3.9+, MySQL 8.

1. Create the database and load the schema with demo data:
   ```bash
   mysql -u root -p -e "CREATE DATABASE swiftrelief_db"
   mysql -u root -p swiftrelief_db < database/swiftrelief_db.sql
   ```
2. Set the connection settings (see `.env.example`):
   ```bash
   export SWIFTRELIEF_DB_USER=root
   export SWIFTRELIEF_DB_PASSWORD=your_mysql_password
   ```
3. Run:
   ```bash
   mvn javafx:run
   ```
4. Log in with the demo admin account from the dump: `admin` / `admin123`.

## Project structure

```text
SwiftRelief/
├── pom.xml
├── database/
│   └── swiftrelief_db.sql            # schema + demo data
└── src/main/
    ├── java/com/swiftrelief/
    │   ├── MainApp.java              # JavaFX entry point
    │   ├── DBUtil.java               # connection settings from environment variables
    │   ├── *Controller.java          # login, dashboard, disaster, volunteer, resource, request, admin
    │   ├── *DAO.java                 # JDBC data access
    │   └── Admin, Disaster, Request, Resource, Volunteer (models)
    └── resources/com/swiftrelief/
        ├── *.fxml                    # views
        └── style.css
```

## Known limitations

- Admin passwords are stored and compared in plain text; hashing (e.g. BCrypt) is the next step.
- Records can be added and deleted but not edited.
- No automated tests yet.

## Author

Utkarsh Vaibhav · [GitHub](https://github.com/Utkarsh151-glitch) · [LinkedIn](https://www.linkedin.com/in/utkarsh-vaibhav-76aa99300/)
