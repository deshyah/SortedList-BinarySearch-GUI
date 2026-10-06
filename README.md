# Java Sorted Array List & Binary Search Engine

A desktop GUI application built in Java that implements a custom auto-sorting array list data structure powered by an explicitly coded binary search algorithm.

## 📌 Overview

Developed for IT 2045C: Computer Programming II at the University of Cincinnati, this project demonstrates custom data structure implementation and logarithmic search algorithms. Instead of relying on Java's built-in Collections.binarySearch(), the underlying SortedList class uses a custom binary search algorithm to perform search operations and pinpoint exact insertion indices for incoming elements to maintain continuous lexicographical order.

---

## ✨ Key Features

* **Self-Sorting Data Structure:** Maintains string elements in ascending lexicographical order automatically upon insertion.
* **Custom Binary Search Algorithm:** Fully manual binary search implementation that eliminates dependence on built-in Java search utility methods.
* **Insertion Index Resolution:** Determines the exact index where a non-existent element belongs if inserted.
* **Interactive Swing GUI:** Features dedicated text input fields for adding and searching strings alongside action buttons.
* **Real-Time Operation Logging:** Utilizes a JTextArea scroll pane to display the active state of the sorted list and log search query outcomes.

---

## 🛠️ Tech Stack & Architecture

* **Language:** Java 17+
* **GUI Framework:** Java Swing (JFrame, JTextArea, JTextField, JButton, JScrollPane)
* **Algorithm:** Custom Iterative/Recursive Binary Search (O(log n))
* **IDE:** JetBrains IntelliJ IDEA

---

## 📁 Repository Structure

    src/
    ├── SortedList.java         # Custom ArrayList equivalent maintaining sorted order via manual binary search
    └── SortedListFrame.java    # Swing GUI frame handling user interaction and operation logging
    README.md

---

## 🚀 How to Run

### Prerequisites
* Java Development Kit (JDK 17 or higher installed)
* An IDE such as IntelliJ IDEA, Eclipse, or VS Code

### Execution Steps
1. Clone the repository to your local system:

   git clone https://github.com/deshyah/SortedList-BinarySearch-GUI.git

2. Open the project in your Java IDE.
3. Locate src/SortedListFrame.java (or main execution entry point) and run the application.
4. Enter strings into the Add String field to build out the list.
5. Enter queries into the Search String field to test element location lookups and index predictions.

---

## 💡 Key Engineering Takeaways

* **Algorithmic Insertion Positioning:** Leveraging binary search to locate where missing items belong enables efficient insertion into pre-sorted dynamic arrays without needing secondary full-list sorting algorithms.
* **Decoupled Architecture:** Separating core data manipulation logic (SortedList) from presentation GUI components (SortedListFrame) ensures modular, testable, and clean OOP design.
* **Lexicographical Comparison:** Implementing custom string comparisons (compareTo) directly in binary search logic ensures strict alphabetical order retention.
