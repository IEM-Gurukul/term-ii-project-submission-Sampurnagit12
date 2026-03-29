[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)

# PCCCS495 – Term II Project

## Project Title
Hospital Appointment Booking System (Java Swing)

---

## Problem Statement (max 150 words)
Manual hospital appointment systems are often inefficient, time-consuming, and prone to errors such as double bookings and poor record management. Patients face difficulties in scheduling appointments and keeping track of their bookings. This project aims to develop a simple and functional Hospital Appointment Booking System using Java Swing GUI. The system allows users to register, log in, book appointments with available doctors, and view their previous appointments. It improves efficiency by digitizing the process and ensures better data management through file handling. The system is designed to be user-friendly and demonstrates practical implementation of object-oriented programming concepts.

---

## Target User
- Patients who want to book appointments easily  
- Small clinics or hospitals needing a simple digital system  

---

## Core Features

- User Registration and Login Authentication  
- Doctor Selection from predefined list  
- Appointment Booking with date and time  
- View Previously Booked Appointments  
- Data Storage using File Handling  

---

## OOP Concepts Used

- **Abstraction:**  
  Appointment is implemented as an abstract class with different types like InPersonAppointment and TelehealthAppointment.

- **Inheritance:**  
  Patient and Doctor classes inherit from a common base class (Person).

- **Polymorphism:**  
  Appointment reference is used to handle different appointment types dynamically.

- **Exception Handling:**  
  Used for input validation, empty fields, and file handling errors using try-catch blocks.

- **Collections / Threads:**  
  ArrayList is used to store and manage multiple patients and appointments dynamically.

---

## Proposed Architecture Description
The system follows a simple layered architecture. The GUI layer is built using Java Swing (LoginPage, RegisterPage, BookingPage, ViewAppointmentsPage). The model layer includes classes like Patient, Doctor, and Appointment (with subclasses). The FileHandler class manages data persistence using file handling. User interactions trigger GUI events, which process data using object-oriented classes and store/retrieve information from text files. This ensures modularity, maintainability, and proper separation of concerns.

---

## How to Run

1. Open terminal in the project directory  
2. Navigate to `src` folder  
3. Compile all Java files:


