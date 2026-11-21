# Midterm Exam — OOP Answers 📝

My answered problems from the **OOP Midterm Examination** (repo: [Karumuii/Midterm](https://github.com/Karumuii/Midterm)). Only the problems I answered are included — each folder is named after **what the problem actually is**, with the original problem number kept for reference.

> **Note:** every folder name is also its Java package name, so compile and run **from inside this `OOP/Midterm_OOP` folder** (not from the repo root or `OOP/` — the package path must match the folder you run from):
>
> ```bash
> javac EncapsulationTuitionAccount/*.java
> java EncapsulationTuitionAccount.Problem2
> ```

---

## 📖 Problem Guide

| Folder | Original | The problem | OOP concepts shown | Files |
|---|---|---|---|---|
| `AbstractionCampusRequests` | **Problem 1** | Campus Service Request System — students & faculty submit different service requests behind one common interface | **Abstract class** (`CampusRequester`) with abstract `getType()/getServices()/processRequest()` + template method `submitRequest()`; subclasses implement their own rules; `ArrayList<CampusRequester>` holds mixed types (polymorphism) | Problem1 (main), CampusRequester, StudentRequester, FacultyRequester |
| `EncapsulationTuitionAccount` | **Problem 2** | Student Account System — manage tuition balance safely: no negative payments, no overpayment, no direct balance modification | **Encapsulation**: private fields, getters, validated `makePayment()` — the only way to touch the balance | Problem2 (main), StudentAccount |
| `EncapsulationWellnessAppointments` | **Problem 3** | Student Wellness Appointment System — pick a service (Counseling ₱0 / Academic ₱100 / Career ₱150 / Wellness ₱200), protect personal info | **Encapsulation** (private `studentId/studentName/service/fee` + `assignService()`) + **switch-case** menu driven by parallel `SERVICES[]`/`FEES[]` arrays | Problem3 (main), StudentAppointment |
| `AbstractionServiceRequests` | **Problem 5** | University Service Request System — IT Support, Maintenance, Library Assistance process requests differently but through **one common reference** | **Abstract class** (`ServiceRequest`) whose `submitRequest()` validates then delegates to abstract `process()`; array of `ServiceRequest` → polymorphic dispatch | Problem5 (main), ServiceRequest, ITSupport, Maintenance, LibraryAssistance |

*Problems 4 (Digital Wallet) and 6 (Utility Billing) were not answered, so they are not included.*

---

## ▶️ How to Run (examples)

```bash
# from inside the Midterm folder
javac AbstractionCampusRequests/*.java
java AbstractionCampusRequests.Problem1

javac EncapsulationTuitionAccount/*.java
java EncapsulationTuitionAccount.Problem2

javac EncapsulationWellnessAppointments/*.java
java EncapsulationWellnessAppointments.Problem3

javac AbstractionServiceRequests/*.java
java AbstractionServiceRequests.Problem5
```

Or compile all four at once (PowerShell):

```powershell
javac (Get-ChildItem -Recurse -Filter *.java | Resolve-Path -Relative)
```

Each program is interactive — it prompts for IDs, names, and menu choices, and loops until you answer `N`.
