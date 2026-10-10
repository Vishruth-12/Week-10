# Week 10 — Data Structure Practice

## Part A — Coding Problems

1. Vowel and Consonant Counter
2. Word Reverser and Palindrome Checker
3. Even and Odd Numbers in a List
4. In-Place Array Reversal
5. Digit Sum and Number Reversal
6. Prime Number Checker
7. Factorial Calculation
8. Student Grade Assignment
9. Leap Year Detector
10. Student Result Card Generator

## Part B — Quiz Answer Key

1. D — `==` compares references while `equals()` compares String contents.
2. B — `StringBuilder` reverses `Java Lab` to `baL avaJ`.
3. B — `Student(String name)` is selected; it delegates to the two-argument constructor.
4. D — Both references point to the same Wallet object, so both see balance 700.
5. C — The shared static count becomes 3.
6. A — The loop prints `45 78 92 60 85`.
7. B — `continue` skips 3, so output is `1 2 4 5`.
8. A — Primitive arguments are passed by value; `x` remains 5.
9. C — `250 / 3.0` prints approximately `83.33333333333333`.
10. B — The Card implementation adds a 2% fee, producing `Paid 510.0 by card`.
11. B — Strings are immutable; `name` remains `java` and `upperName` refers to `JAVA`.
12. B — The literal is pooled, and `new String("hello")` creates one additional object: 2 objects total.
13. A — The length is 6 and `letterAt(2)` is `m` (`Campus` uses zero-based indexing).
14. A — The `@` character is at index 4.
15. B — The default constructor sets title to `Unknown` and price to `0.0`.
16. A — The parameterized constructor sets title and price to the supplied values.
17. B — There are two Wallet objects; `w1` and `w2` point to the first.
18. C — Both references show balance 700 because they share the same object.
19. C — `s1` becomes `Anu`; `s2` remains `Ravi`.
20. C — Three Visitor objects increment the shared static count to 3.

## Part C — Concept Answers

### 1. String immutability and performance
A Java `String` cannot be changed after creation. Operations that appear to modify a string create a new `String`, which may cause extra allocations and copying when repeated many times. For repeated concatenation or reversal, use `StringBuilder` to modify a mutable sequence efficiently.

### 2. The `this` keyword in constructors
When a parameter has the same name as an instance field, `this.field` refers to the object's field while the unqualified name refers to the parameter. For example, `Student(String name) { this.name = name; }` assigns the parameter to the field.

### 3. Object vs reference variable
An object is the allocated instance containing state; a reference variable stores a reference to that instance. Assigning `w2 = w1` copies the reference, not the object, so both variables can access the same object's state. Mutating that object through either reference is visible through both.

### 4. Static vs instance variables
A static variable belongs to the class and is shared by all instances, so it suits a visitor counter or common configuration. An instance variable belongs to each object, so it suits a student's name or a wallet's balance, which differs per object.

### 5. `for`, `while`, and `do-while`
Use `for` when the number of iterations or index progression is known, such as traversing an array. Use `while` when repetition depends on a condition and the iteration count may not be known. Use `do-while` when the body must execute at least once, such as prompting for input before validating it.

### 6. Pass-by-value in Java
Java passes arguments by value. For primitives, the method receives a copy of the primitive, so changing the parameter does not change the caller's variable. For objects, the copied value is a reference: the method can mutate the referenced object, but reassigning its local reference does not change the caller's reference.

### 7. Integer division
When both operands are integers, Java integer division discards the fractional part; for example, `250 / 3` is `83`. Use a floating-point operand or cast, such as `250.0 / 3` or `(double) total / count`, when a fractional result is required.

### 8. Encapsulation
Encapsulation keeps an object's state behind a controlled interface. Declaring fields `private` prevents direct outside access, while public getters and validated setters expose only the operations needed and help preserve valid state.

### 9. `==` vs `equals()`
For object references, `==` checks whether both variables refer to the same object. `equals()` checks logical equality as defined by the class; String overrides it to compare character content. A custom class can override `equals()` to compare meaningful fields.

### 10. Overloading vs overriding
Overloading uses the same method name with different parameter lists and is selected at compile time, for example `print(int)` and `print(String)`. Overriding supplies a subclass implementation with the same signature as an inherited instance method; the implementation is selected at runtime based on the actual object type.
