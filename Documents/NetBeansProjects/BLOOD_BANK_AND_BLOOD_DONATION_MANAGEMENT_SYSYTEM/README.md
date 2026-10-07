# Blood Bank and Blood Donation Management System

A desktop application for managing the day-to-day work of a blood bank: registering donors, recording donations, tracking blood stock, and handling hospital blood requests.

Built with Java Swing in NetBeans as a university project at Mbarara University of Science and Technology (MUST).

> **Status: work in progress.** All screens (frames) are designed. Database connection and button logic are being added module by module.

---

## Features

The system is organised into four areas, matching the main menu.

**Donor Management**
- Donors
- Appointments
- Health Screening
- Donations
- Donation Camps

**Inventory and Lab**
- Blood Units
- Blood Tests
- Blood Groups
- Blood Banks

**Hospitals and Requests**
- Hospitals
- Patients
- Blood Requests (with approve / reject)
- Blood Issues

**Administration (admin only)**
- Staff
- User Accounts

Other screens: a login screen with a show-password option, and a main menu that opens each module.

---

## Tech Stack

- Java (Swing, GUI built with the NetBeans form designer)
- NetBeans IDE
- Database: *to be added*

---

## Project Structure

Each module has its own frame in the `src` folder, for example:

```
src/blood_bank_and_blood_donation_management_system/
├── LoginFrame.java
├── MainMenuFrame.java
├── DonorFrame.java
├── AppointmentFrame.java
├── HealthScreeningFrame.java
├── DonationFrame.java
├── DonationCampFrame.java
├── BloodUnitFrame.java
├── BloodTestFrame.java
├── BloodGroupFrame.java
├── BloodBankFrame.java
├── HospitalFrame.java
├── PatientFrame.java
├── BloodRequestFrame.java
├── BloodIssueFrame.java
├── StaffFrame.java
└── UserAccountFrame.java
```

---

## Screenshots

*Screenshots coming soon.*

<!-- Images to be here:
![Login screen](screenshots/login.png)
![Main menu](screenshots/main-menu.png)
-->

---

## How to Run

1. Install a JDK (version: *add the one you use*) and NetBeans.
2. Clone the repository:
   ```
   git clone https://github.com/elvismark-code/blood-bank-management-system.git
   ```
3. Open the project folder in NetBeans (**File → Open Project**).
4. Make sure the **Swing Layout Extensions** library is on the project's classpath. Some frames use `AbsoluteLayout` from it, and NetBeans normally adds it automatically.
5. Run `LoginFrame.java` to start the application.

---

## Roadmap

- [x] Design all frames
- [ ] Connect to the database
- [ ] Login and role-based access (admin vs. staff)
- [ ] Add / update / delete / search for each module
- [ ] Load dropdowns from the database
- [ ] Reports
- [ ] Input validation and error handling

---

## Author

**Elvis Mark Ssekajigo**
Software Engineering student, Mbarara University of Science and Technology (MUST), Uganda

GitHub: [@elvismark-code](https://github.com/elvismark-code)
