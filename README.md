# Swiftrelief

🌀 SwiftRelief — Disaster Resource Management System

📖 Project Overview

SwiftRelief is a JavaFX-based Disaster Resource Management System designed to coordinate volunteer efforts and resource distribution efficiently during emergencies. It provides a simple yet powerful interface for managing volunteers, storing their information in a MySQL database, and allowing real-time tracking and updates of available resources.




⚙ Tech Stack

Frontend (GUI): JavaFX

Backend: Java (Maven project)

Database: MySQL

Build Tool: Apache Maven

Language: Java 17





🧩 Features

✅ Register and manage volunteers
✅ Store and fetch data from a MySQL database
✅ Intuitive JavaFX user interface
✅ MVC architecture (Model–View–Controller)
✅ Fully modular and extendable for adding disaster resource data (e.g., food, shelter, medical aid)




📁 Project Structure

SwiftRelief/
│
├── pom.xml                             # Maven configuration
├── src/
│   ├── main/
│   │   ├── java/com/swiftrelief/
│   │   │   ├── App.java
│   │   │   ├── DatabaseConnection.java
│   │   │   ├── MainApp.java
│   │   │   ├── Volunteer.java
│   │   │   ├── VolunteerDAO.java
│   │   │   ├── VolunteerController.java
│   │   └── resources/com/swiftrelief/
│   │       └── volunteer_view.fxml      # GUI layout file
│   └── test/                            # Future test classes
│
└── README.md



🧠 How It Works

1. The application connects to a MySQL database using DatabaseConnection.java.


2. User inputs volunteer details via the JavaFX form (volunteer_view.fxml).


3. VolunteerDAO handles all database interactions (Insert, Retrieve).


4. Data is displayed or updated in real time on the GUI.




🚀 How to Run

Prerequisites:

Java 17+

Apache Maven 3.8+

MySQL Server 8.0+


Steps:

1. Clone the repository:

git clone https://github.com/Utkarsh-151-glitch/SwiftRelief.git
cd SwiftRelief


2. Configure your MySQL connection in DatabaseConnection.java.


3. Create the database:

CREATE DATABASE swiftrelief_db;
USE swiftrelief_db;


4. Build and run:

mvn clean javafx:run




🧩 Future Enhancements

Add modules for resource requests and distribution tracking

Implement user authentication (admin/volunteer roles)

Add real-time disaster updates via APIs

Integrate Google Maps API for location visualization



👨‍💻 Contributors

Utkarsh Vaibhav — Developer & Project Lead
