# 📥 Java Input Validation with Custom Exception Handling

## 📄 Exercise Description

The goal of this exercise is to create a utility class called `Entrada` that handles and validates user input via the keyboard using Java's `Scanner` class.

You must implement:

### Input Handling:

- Instantiate a `Scanner` object.
- Create static methods to read various data types from user input.
- Each method receives a `String` message to display and returns a valid value of the corresponding type.

### Validation Rules:

- If the user enters invalid data, catch the exception and **keep prompting** until valid input is received.
- For example: if a `float` is entered with a dot instead of a comma (or vice versa), print:  
  **"Format error"** and ask again.

### Methods to implement:

#### Handle `InputMismatchException`:

```java
public static byte readByte(String message);
public static int readInt(String message);
public static float readFloat(String message);
public static double readDouble(String message);
Handle custom exceptions (extends Exception):
java
Copiar
Editar
public static char readChar(String message);
public static String readString(String message);
public static boolean readYesNo(String message); // "s" → true, "n" → false
This exercise is designed to practice exception handling, custom exceptions, and robust user input validation in Java.

💻 Technologies Used
Java 17

IntelliJ IDEA (Community Edition)

Maven

Git & GitHub

📋 Prerequisites
Java JDK 17 installed

IntelliJ IDEA Community Edition

Git Bash or compatible terminal

GitHub account

🛠️ Installation and Setup
Install:

Java JDK 17

IntelliJ IDEA Community

Git Bash

Clone the repository:

bash
Copiar
Editar
git clone https://github.com/yourusername/input-validation-java.git
cd input-validation-java
Open the project with IntelliJ:

Go to File → Open and select the cloned folder

▶️ Running the Project
In IntelliJ, open the Main.java class.

Right-click the file and choose Run 'Main.main()'.

Test the input methods directly in the console.

🌐 Deployment
This project is console-based and does not require deployment. Run it locally using your IDE or terminal.

🤝 Acknowledgements
Special thanks to Ana, Alejandro, Adrià, and Ignasi for their support in developing this project.
