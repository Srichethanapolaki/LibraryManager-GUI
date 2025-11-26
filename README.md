# 📚 Library Manager — Java Swing GUI  

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Project-Library%20Manager-green?style=for-the-badge" />
</p>

<p align="center">
  <img src="https://dummyimage.com/900x250/1e293b/ffffff&text=Library+Management+GUI+Application" />
</p>

---

# 📝 Overview  

**Library Manager GUI** is a simple and elegant desktop application made with **Java Swing**.  
It helps users manage their personal library by adding books and viewing the full catalog in a clean UI.

Perfect for:

✔ College mini project  
✔ GitHub portfolio  
✔ Interview demonstration  
✔ Java & OOP practice  

---

# 🚀 Features  

<div align="center">

| 📌 Feature | ⭐ Description |
|-----------|----------------|
| ➕ Add Books | Save title & author |
| 📚 View Books | Displays catalog in UI |
| ✔ Track Availability | Shows "Available" or "Borrowed" |
| 🎨 GUI | Built with Java Swing |
| ⚙ Offline | No database needed |
| 🧩 Clean Code | OOP + ArrayList usage |

</div>

---

# 🎨 Screenshots  

(Add your screenshots inside `/screenshots/` folder)

<p align="center">
  <img src="screenshots/home.png" width="500">
</p>

<p align="center">
  <img src="screenshots/view_books.png" width="500">
</p>

---

# 🧠 UML Diagram  

(Add your UML image inside `/uml/` folder)

<p align="center">
  <img src="uml/class_diagram.png" width="450">
</p>

---

# 💻 Tech Stack  

<p align="center">
  <img src="https://img.shields.io/badge/Java-Swing-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/OOP-Classes-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/ArrayList-Storage-green?style=for-the-badge" />
</p>

---

# 🏗 Project Structure  

```
LibraryManager-GUI/
 ├── src/
 │    └── LibraryManager.java
 ├── screenshots/
 ├── uml/
 └── README.md
```

---

# 🛠 How to Run  

### ✔ Compile:
```
javac src/LibraryManager.java
```

### ✔ Run:
```
java src.LibraryManager
```

---

# 📚 Concepts Used  

- Java Swing GUI  
- Buttons, Labels, TextFields, TextArea  
- OOP (Classes, Objects)  
- ArrayList  
- Event Handling  

---

# 📖 UML Class Diagram (Text Version)

```
+-------------------+
|      Book         |
+-------------------+
| - title : String  |
| - author : String |
| - available: bool |
+-------------------+
| Book(title, auth) |
+-------------------+

+------------------------+
|    LibraryManager      |
+------------------------+
| - books : ArrayList    |
+------------------------+
| + addBook()            |
| + viewBooks()          |
| + GUI Components       |
+------------------------+
```

---

# 🎯 Future Improvements  

- Add Borrow/Return functionality  
- Add Search by Title  
- Add Sorting (A–Z)  
- Add File storage (save books)  
- Add Login system  

---

# 📝 Author  

**Chethana**  
Student Developer  
📌 Building Java GUI apps  

---

# ⭐ If this project helped you, please star the repository ⭐  

<p align="center">⭐⭐⭐⭐⭐</p>
