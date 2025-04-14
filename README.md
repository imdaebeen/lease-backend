# AutoLeaseHub

**AutoLeaseHub** is a lease contract management system designed for automotive financing, built with **Spring Boot** (backend) and **React** (frontend). This project simulates a real-world leasing platform, allowing users to apply for vehicle leases, administrators to review contracts, and track payment histories. It showcases modern web development practices, secure API design, and a user-friendly interface tailored for financial services.

This project is part of a portfolio to demonstrate backend development skills for **Hyundai Capital**, focusing on automotive finance workflows.

---

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Screenshots](#screenshots)
- [Future Enhancements](#future-enhancements)
- [Contact](#contact)

---

## Features
- **User Features**:
    - Submit lease applications (vehicle model, lease term, monthly payment).
    - View lease contract status (Pending, Approved, Rejected).
- **Admin Features**:
    - Review and update lease contract statuses.
- **Core Functionalities**:
    - Secure REST API for lease management.
    - Relational database for contracts and payments.
    - Responsive frontend for seamless user interaction.

---

## Tech Stack
- **Backend**:
    - **Spring Boot**: REST API framework.
    - **Spring Data JPA**: Database operations.
    - **Spring Security**: Basic authentication.
    - **PostgreSQL**: Relational database.
    - **Gradle**: Build tool.
- **Frontend**:
    - **React**: UI framework.
    - **Axios**: API communication.
    - **Material-UI**: Styling and components.
- **Tools**:
    - IntelliJ IDEA (backend development).
    - VS Code (frontend development).
    - Docker (optional for PostgreSQL).

---

## Architecture
The system follows a client-server architecture:
- **Backend**: Spring Boot serves REST APIs, manages business logic, and interacts with MySQL for data persistence.
- **Frontend**: React SPA consumes APIs and provides an intuitive UI.
- **Database**: MySQL stores lease contracts and payment records.
- **Communication**: Secured via HTTP with CORS enabled for localhost development.

![Architecture Diagram](docs/architecture.png)
*(Placeholder: Include an architecture diagram in the `docs` folder.)*

---

## Installation

### Prerequisites
- **Java 17** or higher
- **Node.js 16** or higher
- **MySQL 8.0** or higher (or Docker)
- **Git**