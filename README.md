# Stuff for Competition 🎯

A collection of **Java practice programs and cheat sheets** for programming competition prep. Each folder covers one topic — basics, loops, input validation, and data structures — with small, well-commented programs you can read, run, and modify, plus cheat sheets (HTML + PDF) for quick revision.

---

## 📁 What's Inside

Everything lives under the `TerminalProjects/` folder:

```
Stuff for Competition/
└── TerminalProjects/
    ├── Student_Grade_Calculator.java   # Reads 3 marks, validates them, prints the average
    ├── Odd_OR_Even.java                # Checks if a number is even or odd
    ├── Basics/
    │   ├── TypeCastingDemo.java        # Widening/narrowing casts, char ↔ int, String parsing
    │   ├── MathFunctionsDemo.java      # Math.max, pow, sqrt, round, random numbers
    │   └── java-conditionals.html      # Guide: if / else-if / switch statements
    ├── Loops/
    │   ├── PracticalLoopDemo.java      # Real-world loop: validated score input with quit option
    │   ├── LoopControlDemo.java        # break, continue, return, and labeled loops
    │   └── java-loop-control.html      # Guide: loop control keywords
    ├── Validation/
    │   ├── BeginnerValidation.java     # Simple beginner-style input checking
    │   ├── InputValidation.java        # Reusable integer-in-range reader (rejects bad input)
    │   ├── StringFieldValidation.java  # Rejects numbers where text is expected
    │   └── java-input-validation-rules.html  # Guide: input validation rules
    ├── DSA/
    │   ├── SinglyLinkedList.java       # Singly linked list (insert at start, display)
    │   ├── BinarySearchTree.java       # BST insert, search, traversals
    │   ├── QuickSort.java              # Quick sort with Lomuto partition
    │   ├── MergeSort.java              # Merge sort (divide and conquer)
    │   └── DSA_CheatSheet.html         # Guide: DSA quick reference
    └── PDFs/                           # All 4 cheat sheets as ready-to-print PDFs
        ├── Java DSA Cheat Sheet.pdf
        ├── Java Conditionals Cheat Sheet.pdf
        ├── Java Input Validation — Rules to Remember.pdf
        └── Java Loop Control — Cheat Sheet.pdf
```

- **`.java` files** → runnable demo programs with comments explaining each step.
- **`.html` files** → open in any browser for a visual walkthrough of the topic.
- **`.pdf` files** → the same cheat sheets, easy to download and print.

---

## 📥 How to Download

### Option 1: Download as ZIP (no tools needed)

1. Go to the repo page on GitHub: **https://github.com/Karumuii/Stuff-for-Competition**
2. Click the green **`<> Code`** button.
3. Click **Download ZIP**.
4. Extract the ZIP anywhere on your computer — you're done.

### Option 2: Clone with Git (recommended if you want updates)

**Prerequisite:** [Git](https://git-scm.com/downloads) installed.

Open a terminal (Command Prompt, PowerShell, or Terminal) and run:

```bash
git clone https://github.com/Karumuii/Stuff-for-Competition.git
```

This creates a folder called `Stuff-for-Competition` with the full project inside.

To move into the folder:

```bash
cd Stuff-for-Competition
```

To get the latest changes later:

```bash
git pull
```

---

## ▶️ How to Run the Programs

**Prerequisite:** the [Java JDK](https://adoptium.net/) (version 8 or newer). Check with:

```bash
java -version
```

The files use `package` declarations, so compile and run them **from the `TerminalProjects` parent folder** (the repo root):

```bash
# Compile
javac TerminalProjects/Odd_OR_Even.java

# Run — use the full package name with dots, not slashes
java TerminalProjects.Odd_OR_Even
```

More examples:

```bash
javac TerminalProjects/DSA/QuickSort.java
java TerminalProjects.DSA.QuickSort

javac TerminalProjects/Loops/LoopControlDemo.java
java TerminalProjects.Loops.LoopControlDemo
```

Or compile everything at once:

```bash
javac TerminalProjects/*.java TerminalProjects/*/*.java
```

> 💡 **Using VS Code?** Install the *Extension Pack for Java*, open the repo folder, and press the **Run** button above any `main` method — no terminal commands needed.

---

## 🧭 Suggested Learning Order

1. **Basics** → casting, math functions, conditionals
2. **Validation** → reading user input safely (a competition essential)
3. **Loops** → loop control: `break`, `continue`, labels
4. **DSA** → linked list, BST, sorting algorithms
5. Keep the **PDFs** handy for last-minute revision.

---

## 📄 License

Free to use for learning and competition prep. Give credit if you fork it. ⭐
