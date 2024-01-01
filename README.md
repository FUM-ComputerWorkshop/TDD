# Palindrome Checker Project

## Overview
This project demonstrates Test-Driven Development (TDD) with a simple Java application that checks if a given string is a palindrome. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

## How to Run
1. Ensure Java and Maven are properly installed on your system.
2. Navigate to the project directory in your terminal or command prompt.
3. Run `mvn compile` to compile the project files.
4. Execute `mvn test` to run the tests using JUnit.
5. To use the application, run `mvn exec:java -Dexec.mainClass=PalindromeChecker` and input strings as prompted.

## How to Run in IntelliJ IDEA
1. Open IntelliJ IDEA and select "Get from VCS" (Version Control System).
2. In the URL field, enter the repository URL: https://github.com/FUM-ComputerWorkshop/TDD and click "Clone".
3. Once the project is cloned and open in IntelliJ, it may take a moment for IntelliJ to index the files.
4. Click on the "Maven" tab on the right side of the IDE to access Maven projects.
5. Under the "Lifecycle" section, double-click on "compile" to build the project.
6. Navigate to the `src/test/java` directory, right-click on the `PalindromeTest.java` file and select "Run 'PalindromeTest'" to execute the tests.
7. To run the application, navigate to the `src/main/java` directory, right-click on the `PalindromeChecker.java` file and select "Run 'PalindromeChecker.main()'".

## Features
- **Check Palindromes**: Input any string to check if it's a palindrome, considering spaces, punctuation, and case.
- **JUnit Tests**: Comprehensive tests covering various scenarios including palindromes, non-palindromes, mixed cases, spaces, special characters, empty strings, and single characters.

