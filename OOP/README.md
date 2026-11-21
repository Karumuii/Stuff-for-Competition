# OOP Activities 📚

Java OOP activities from **BSIT2B_Activties_Sentillas** — each folder is named after the **topic it teaches**, in learning order. All programs are plain Java (no external libraries).

> **Note:** every folder name is also its Java package name, so compile and run **from inside this `OOP` folder**, using the folder name with dots:
>
> ```bash
> javac Constructors/Main.java
> java Constructors.Main
> ```

---

## 📖 Topic Guide (in learning order)

| # | Folder | Topic | Original activity | Files |
|---|---|---|---|---|
| 1 | `ClassesAndObjects` | Classes, fields & methods — a `Business` class that displays customer/product info | firstActivity1 | Main |
| 2 | `ClassMethods` | Class behavior — bank account with withdraw & deposit methods (`OOP1.java` is the runner) | secondActivity2 | Banking, OOP1 |
| 3 | `ObjectsAndUserInput` | Objects + Scanner — creating a `Car` object and interacting with it (rent logic) | thirdActivity3 | Main, Car |
| 4 | `Constructors` | Parameterized constructors — `SalaryCalculator` with chained calculation methods | fourthActivity4 | Main, SalaryCalculator |
| 5 | `Encapsulation` | Getters & setters — private fields in `Square` | fifthActivity5 | Main, Square |
| 6 | `EncapsulationWithValidation` | Setters that reject invalid data — `Crop` farm records | sixthactivity6 | Main, Crop |
| 7 | `EncapsulationWithUpdates` | Protecting object state — `PIS` update methods that block bad price/quantity changes | seventhActivity7 | Main, PIS |
| 8 | `EncapsulationWithDiscounts` | Encapsulation + business logic — `Pds` product with discount tiers | eightActivity8 | Main, Pds |
| 9 | `InheritanceAndPolymorphism` | Abstract `Shape` → `Rectangle` / `Circle`, called through parent references | ninethactivity9 | Main, Shape, Rectangle, Circle |
| 10 | `Inheritance` | Abstract `Employee` → `Teacher` / `Technician` overriding `Employeework()` | tenthactivity10 | Main, Employee, Teacher, Technician |
| 11 | `AbstractClasses` | Abstract `LibraryUser` with `Student` / `Faculty` subclasses | eleventhactivity11 | Main, LibraryUser, Student, Faculty |
| 12 | `AbstractClasses2` | Abstract `MathActivity` → `Addition` / `Subtraction` quiz (second abstract activity) | twelveActivity12 | Main, MathActivity, AdditionActivity, SubtractionActivity |
| 13 | `Inheritance2` | `Employee` → `Teacher` / `ITStaff` with display overrides | FinalsFirstActivity1 | Main, Employee, Teacher, ITStaff |
| 14 | `Polymorphism` | Method overriding — `Customer` → `Regular` / `Premium` pricing | FinalsSecondActivity2 | Main, Customer, Regular, Premium |
| 15 | `InheritanceAndOverriding` | `WaterOrder` → `DeliveryOrder` with delivery-fee logic | FinalsThirdActivity3 | Main, WaterOrder, DeliveryOrder |
| — | `PracticeFiles` | Extra practice — shopping system with customer types (inheritance + polymorphism) | test | ShoppingSystem |

> Folders with a `2` suffix (e.g. `Inheritance2`, `AbstractClasses2`) are a **second activity on the same topic** — the number keeps folder names unique so they can stay identical to the Java package name.

---

## ▶️ How to Run (examples)

```bash
# from inside the OOP folder
javac Encapsulation/Main.java
java Encapsulation.Main

javac Polymorphism/Main.java
java Polymorphism.Main

# ClassMethods has no Main.java — its runner class is OOP1:
javac ClassMethods/*.java
java ClassMethods.OOP1
```

Compile every activity at once (PowerShell):

```powershell
javac (Get-ChildItem -Recurse -Filter *.java | Resolve-Path -Relative)
```
