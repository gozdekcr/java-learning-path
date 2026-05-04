<div align="center">

# 💮​ Java Learning Path

**My daily journey of learning Java from scratch.**
<br/>
Each folder contains the topic I studied that day, and the code I wrote to practice.

<br/>


</div>

---

### 📂 Folder Structure

```
java-learning-path/
├── day01-basics-and-input/
│   ├── PrintBasics.java
│   ├── ComparisonOperators.java
│   └── ScannerInput.java
├── day02-classes-and-objects/
│   ├── Calculator.java
│   ├── CalculatorApp.java
│   ├── House.java
│   ├── HouseApp.java
│   ├── Smartphone.java
│   └── SmartphoneApp.java
├── day03/
│   ├── CircleAreaCalculator.java
│   ├── GradeCalculator.java
│   ├── SpeedCalculator.java
│   ├── TemperatureConverter.java
│   ├── TipCalculator.java
│   └── VatCalculator.java
├── day04/
│   ├── ComparisonOperators.java
│   ├── ConditionalStatements.java
│   └── LogicalOperators.java
├── day05/
│   ├── BMICalculator.java
│   ├── Calculator.java
│   ├── GradeCalculator.java
│   └── SwitchCase.java
├── day06/
│   ├── LoopExercises.java
│   ├── ForLoopExercises.java
│   └── BreakContinue.java
├── day07/
│   ├── DoWhileExercise.java
│   ├── WhileExercises1.java
│   └── WhileExercises2.java
├── day08/
│   ├── ArmstrongNumbers.java
│   ├── FibonacciSeries.java
│   └── GcdAndLcmCalculator.java
├── day09/
│    ├── MethodBasics.java
│    ├── Overloading.java
│    └── RecursiveMethods.java
├── day10/
|   ├── Array.java
|   ├── Calculator.java
|   ├── EmpDriver.java
|   ├── Employee.java
|   ├── MultidimensionalArray.java
|   └── OOP.java
├── day11/
|   ├── ArrayAverage.java
|   └── GuessNumber.java
├── day12/
│   └── Book.java
|   ├── Encapsulation.java
|   ├── Home.java
|   └── HomeMain.java
├── day13/
│   └── Author.java
|   ├── Books.java
|   ├── Library.java
|   └── Main.java
├── day14/
|   ├── Academician.java
|   ├── Accountant.java
|   ├── Assistant.java
|   ├── Clerk.java
|   ├── Main.java
|   ├── Teacher.java
|   └── Worker.java
├── day15/
|   ├── Circle.java
|   ├── Rectangle.java
|   ├── Shape.java
|   ├── Triangle.java
|   ├── Main.java
├── day17/
└── ```
```
---

### 🗓️ Daily Progress

| Day | Topic | Files | Status |
|:---:|-------|-------|:------:|
| 01 | Print, Operators, Scanner Input | `PrintBasics` `ComparisonOperators` `ScannerInput` | ✅ |
| 02 | Classes & Objects | `Calculator` `House` `Smartphone` + Apps | ✅ |
| 03 | Variables, Scanner, User-input | `GradeCalculator` `VatCalculator` `TemperatureConverter` `CircleAreaCalculator` `SpeedCalculator` `TipCalculator` | ✅ |
| 04 | Comparison, Conditionals, Logical Operators | `ComparisonOperators` `ConditionalStatements` `LogicalOperators` | ✅ |
| 05 | Switch-Case, BMI, Grade Calculator  | `BMICalculator` `Calculator` `GradeCalculator` `SwitchCase` | ✅ |
| 06 | Loops, For Loop, Break & Continue | `LoopExercises` `ForLoopExercises` `BreakContinue` | ✅ |
| 07 | While Loop, Do-While Practices | `DoWhileExercise` `WhileExercises1` `WhileExercises2` | ✅ |
| 08 | Number Problems & Algorithms | `ArmstrongNumbers` `FibonacciSeries` `GcdAndLcmCalculator` | ✅ |
| 09 | Methods, Overloading, Recursion | `MethodBasics` `Overloading` `RecursiveMethods` | ✅ |
| 10 | Arrays & OOP | `Array` `MultidimensionalArray` `Calculator` `Employee` `EmpDriver` `OOP` | ✅ |
| 11 | Array Methods, Mini Projects | `ArrayAverage` `GuessNumber` | ✅ |
| 12 |  Encapsulation | `Book` `Encapsulation` `Home` `HomeMain` | ✅ |
| 13 | Collections, Library Management | `Author` `Books` `Library` `Main` | ✅ |
| 14 | Inheritance & Polymorphism | `Academician` `Accountant` `Assistant` `Clerk` `Main` `Teacher` `Worker` | ✅ |
| 15 | | | ✅ |
| 16 | | | ✅ |
| 17 | | | ⬜ |
| 18 | | | ⬜ |
| 19 | | | ⬜ |
| 20 | | | ⬜ |

> ✅ Completed

---

### 🛠️ Setup
I use VS Code with the Java extension

---

### 📓​ Things I Learned  
- **Class Names:** Class name and File name should be same. Otherwise your file wouldn't work.  
- **Scanner Buffer Issue:** This occurred to me when I write **nextLine** after **nextDouble** in file **"ScannerInput.java"**. Program didn't ask me the str. This is called *Scanner buffer issue* and if you write *nextLine* after *nextInt or nextDouble*, you will see this error. You can get rid of this writing **input.nextLine();** before nextLine.
- **Scanner belongs in main:** I made the mistake of putting `Scanner` inside a recursive method. Every time the method called itself and it asked for a new input.
- **void methods can't be recursive (for calculations):**  I tried to calculate factorial with a `void` method and print the result inside. But recursion works by returning values back up the chain so `void` doesn't work here.
- **Every path must return a value:** If a method is declared as `long` or `int`, Java requires ALL branches (if / else if / else) to have a `return` statement. Even if only one branch is missing it, the code won't work.
- **Polymorphism:** Polymorphism is not just about overriding methods in subclasses. It also means that different objects can be managed through a shared superclass reference (upcasting). Each subclass keeps its own behavior while being treated as the same type. We make it for making the code flexible and independent of specific object types.





