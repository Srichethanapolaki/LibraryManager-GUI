# 📚 Library Book Manager — Java Swing GUI

A lightweight and modern Java Swing application for managing books in a personal library.  
Users can add books, track authors, and view the entire library catalog easily.

---

## 🚀 Features

- Add books with title & author  
- View all books  
- Track availability (Available / Borrowed)  
- No database — simple ArrayList storage  
- Beginner-friendly  
- Ideal for mini-projects, resumes, and interviews  

---

## 🛠️ Tech Stack

- **Java (JDK 17+)**  
- **Java Swing GUI**  
- **OOP (Classes & Objects)**  
- **ArrayList**  

---

## 📁 Project Structure

```
LibraryManager-GUI/
 ├── src/
 │    └── LibraryManager.java
 ├── screenshots/
 └── README.md
```

---

## 🔧 How to Run

### Compile:
```
javac src/LibraryManager.java
```

### Run:
```
java src.LibraryManager
```

---

## 📐 UML Diagram

```
Book
 ├─ title : String
 ├─ author : String
 └─ available : boolean

LibraryManager
 ├─ books : ArrayList<Book>
 ├─ addBook()
 ├─ viewBooks()
 └─ GUI Components
```

---

## 🎓 Viva Questions

**Q1: What data structure is used and why?**  
ArrayList — dynamic size, easy insertion, fast access.

**Q2: What GUI components are used?**  
JFrame, JLabel, JTextField, JButton, JTextArea, JScrollPane.

**Q3: What are possible improvements?**  
Add search, borrow/return options, file database, login, analytics.

---

## 📝 Resume Description

**Library Manager (Java GUI):**  
Developed a Java Swing desktop application for managing a personal library.  
Users can add and view books using an interactive interface.  
Built using OOP, event-driven programming, and Swing components.
