# Hotel Management System

> A JavaFX desktop application for managing hotel offers/rooms and client reservations, with CRUD, search, statistics, and email notifications.

![Java](https://img.shields.io/badge/Java_8-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-0769AD?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JFoenix](https://img.shields.io/badge/JFoenix-26A69A?style=for-the-badge&logo=material-design&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)

## Overview

This is a desktop **hotel management** application built with **JavaFX** (FXML-based UI) on **Java 8**, backed by a **MySQL** database accessed through JDBC. It was developed as an academic project.

The application lets a staff user manage two core entities:

- **Offers / rooms** (`offre`) — a catalogue of items defined by title, image, price, and category.
- **Reservations / clients** (`reservation`) — customer records holding first name, last name, email, city, postal code, address, phone, and an associated image.

Beyond basic data entry, it offers searchable/filterable tables, a statistics pie chart, input validation, and the ability to send an email from within the app.

## Features

Grounded in the current source:

- **Offer/room management** — create, read, update, and delete offers (title, image, price, category) in a JavaFX `TableView` with inline edit and delete actions (`ProductViewControllor`, `AddController`, `ServiceOffre`).
- **Reservation/client management** — add, edit, and delete client reservations with their personal details and a profile image (`commandsControllor`, `ServiceReservation`).
- **Live search & filtering** — filter the reservation table in real time across name, email, city, postal code, and address using a `FilteredList` + `SortedList` bound to a search field.
- **Input validation** — regex-based checks for names, email format, postal code, and price before records are saved.
- **Image selection** — pick an image for an offer or client via a native `FileChooser` (single and multiple file dialogs supported).
- **Statistics view** — a `PieChart` summarizing totals (e.g. customers vs. products) with a date picker, rendered with JavaFX charts (`StatisticsController`, `DatabaseHelper`).
- **Email notifications** — send an email through Gmail SMTP using JavaMail (`javaMail` helper).
- **Animated, themed UI** — modern Material-style controls (JFoenix), Font Awesome icons, AnimateFX transitions, custom CSS themes, and audio playback.

## Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 8 (JDK 1.8 / Amazon Corretto) |
| UI | JavaFX with FXML |
| UI components | JFoenix, ControlsFX, FontAwesomeFX, AnimateFX |
| Database | MySQL (via `mysql-connector-java` 8.0.23, JDBC) |
| Email | JavaMail (`javax.mail`) over Gmail SMTP |
| IDE / project | IntelliJ IDEA (module-based project, JARs bundled in `dependencies/`) |

## Project Structure

```
Hotel-managment-System/
├── dependencies/              # Bundled third-party JARs (JFoenix, ControlsFX,
│                              #   FontAwesomeFX, AnimateFX, JavaMail, MySQL connector)
├── src/
│   ├── sample/                # Application entry point (Main.java)
│   ├── Controllor/            # JavaFX controllers (product view, add, commands,
│   │                          #   statistics, item cards, platform UI)
│   ├── Entity/                # Domain models: offre, reservation
│   ├── IService/              # Generic CRUD service interface (IService<T>)
│   ├── Service/               # Service implementations (ServiceOffre, ServiceReservation)
│   ├── Helpers/               # DB connection, query helpers, JavaMail
│   ├── animations/            # UI animation helpers
│   ├── gui/                   # FXML views
│   ├── css/                   # Stylesheets
│   ├── public/, resources/    # Images, fonts, media, themes
└── project3A.iml              # IntelliJ module definition
```

The codebase follows a layered structure: **Entity** (models) → **IService/Service** (a generic `IService<T>` CRUD contract with concrete services) → **Helpers** (database access) → **Controllor** + **gui** (JavaFX controllers and FXML views).

## Getting Started

> This is an IntelliJ IDEA project with no Maven/Gradle build file; dependencies are the JARs in `dependencies/`.

**Prerequisites**

- JDK 1.8 (Java 8) with JavaFX available (e.g. Oracle JDK 8 or a JavaFX-bundled distribution)
- A running MySQL server
- IntelliJ IDEA (recommended, since the project ships as an `.iml` module)

**Setup**

1. Clone the repository:
   ```bash
   git clone https://github.com/MuhamedHabib/Hotel-managment-System.git
   ```
2. Open the project in IntelliJ IDEA and mark `src/` as the sources root.
3. Add the JARs in `dependencies/` to the project's libraries/classpath.
4. Create a MySQL database and the tables used by the app (`offre`, `reservation`, `category`).
5. Configure the database connection in `src/Helpers/DbConnect.java` (host, port, database name, username, password) to match your local MySQL instance.
6. To use the email feature, set valid SMTP credentials in `src/Helpers/javaMail.java`.
7. Run the application from `src/sample/Main.java`.

## Notes

- This is a **student / academic project**, built to practice JavaFX, JDBC, and a layered service architecture. Some controller methods are placeholders or experiments, and several file paths are hard-coded to the original author's machine — adjust them to your environment before running.
- **Security:** the repository contains hard-coded database and email credentials in the helper classes. Before reusing or deploying this code, move these into local configuration / environment variables and rotate any exposed secrets. Do not commit real credentials.
- Some original UI labels and messages are in French; this README presents the project in English.

---
<p align="center">Built by <b>Mohamed Habib Khattat</b> — <a href="https://github.com/MuhamedHabib">GitHub (@MuhamedHabib)</a> · <a href="https://www.linkedin.com/in/mohamed-habib-khattat-2b206a173">LinkedIn</a></p>
