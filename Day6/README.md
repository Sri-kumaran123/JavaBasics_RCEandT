# 📘 Java Concepts Documentation

## 1. ⚠️ Exceptions in Java

Java exceptions are events that disrupt the normal flow of a program. They allow developers to handle errors gracefully and maintain application stability.

### Types of Exceptions

#### ✅ Checked Exceptions
- Must be handled at compile-time using `try-catch` or declared with `throws`.
- **Examples**: `IOException`, `SQLException`

#### ⚠️ Unchecked Exceptions
- Also called runtime exceptions; handling is optional.
- **Examples**: `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`

#### 🛠️ User-Defined Exceptions
- Custom exceptions created by programmers to handle specific application scenarios.
- Typically extend `Exception` or `RuntimeException`.

### Key Points
- Exceptions improve program reliability by catching errors before they crash the program.
- `try-catch` blocks are used to handle exceptions.
- The `finally` block is used to execute code regardless of exception occurrence.

---

## 2. 🧵 Threads in Java

Threads allow concurrent execution of multiple tasks within a single program. They are the basis of multithreading and are widely used in real-time applications.

### Thread Concepts

- **Thread**: A lightweight process that runs independently.
- **Main Thread**: Every Java program starts with a main thread.
- **Runnable**: Interface used to define tasks for threads.
- **Concurrency**: Multiple threads execute simultaneously, improving performance for I/O or long-running tasks.

### Key Points
- Threads can be created by extending `Thread` or implementing `Runnable`.
- Thread safety is important when multiple threads access shared resources.
- Java provides `synchronized` methods and blocks to prevent race conditions.
- Threads improve responsiveness, e.g., in GUI applications or server-side programs.

---

## 3. 📂 File Handling in Java

File handling is used to store and retrieve data from files. Java provides classes for reading, writing, and manipulating files.

### Types of File Operations

#### 📖 Reading Files
- Input from files using classes like `FileReader`, `BufferedReader`.
- Helps to load data into the program.

#### ✍️ Writing Files
- Output to files using classes like `FileWriter`, `BufferedWriter`.
- Allows the program to store results or logs persistently.

#### 🗃️ File Management
- Creating, deleting, and checking file existence using `File` class.
- Ensures proper data handling and storage.

### Key Points
- File handling is essential for persistent storage.
- Always handle exceptions like `IOException` when performing file operations.
- Proper file handling ensures data integrity and error-free program execution.

---

## ✅ Summary Table

| Concept              | Purpose                                                  |
|----------------------|----------------------------------------------------------|
| Exceptions           | Handle runtime errors and maintain program stability     |
| Threads              | Execute multiple tasks concurrently for better performance |
| Synchronized Methods | Ensure thread safety when accessing shared resources     |
| File Handling        | Read/write data from files for persistent storage        |
