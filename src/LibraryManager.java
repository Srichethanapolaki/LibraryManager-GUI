import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Book {
    String title;
    String author;
    boolean available = true;

    Book(String t, String a) {
        title = t;
        author = a;
    }
}

public class LibraryManager extends JFrame {

    ArrayList<Book> books = new ArrayList<>();
    JTextField titleField, authorField, searchField;
    JTextArea bookArea;

    public LibraryManager() {
        setTitle("Library Manager");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel head = new JLabel("Library Book Manager", SwingConstants.CENTER);
        head.setFont(new Font("Arial", Font.BOLD, 22));
        head.setBounds(100, 10, 300, 40);
        add(head);

        JLabel t1 = new JLabel("Title:");
        t1.setBounds(40, 70, 100, 30);
        add(t1);

        titleField = new JTextField();
        titleField.setBounds(140, 70, 250, 30);
        add(titleField);

        JLabel t2 = new JLabel("Author:");
        t2.setBounds(40, 120, 100, 30);
        add(t2);

        authorField = new JTextField();
        authorField.setBounds(140, 120, 250, 30);
        add(authorField);

        JButton addBtn = new JButton("Add Book");
        addBtn.setBounds(180, 170, 120, 30);
        add(addBtn);

        bookArea = new JTextArea();
        JScrollPane pane = new JScrollPane(bookArea);
        pane.setBounds(40, 220, 400, 250);
        add(pane);

        JButton viewBtn = new JButton("View Books");
        viewBtn.setBounds(180, 490, 120, 30);
        add(viewBtn);

        addBtn.addActionListener(e -> addBook());
        viewBtn.addActionListener(e -> viewBooks());
    }

    void addBook() {
        books.add(new Book(titleField.getText(), authorField.getText()));
        JOptionPane.showMessageDialog(this, "Book Added!");
        titleField.setText("");
        authorField.setText("");
    }

    void viewBooks() {
        StringBuilder sb = new StringBuilder("---- Book List ----\n\n");
        for (Book b : books) {
            sb.append(b.title)
              .append(" by ")
              .append(b.author)
              .append("   [")
              .append(b.available ? "Available" : "Borrowed")
              .append("]\n");
        }
        bookArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        new LibraryManager().setVisible(true);
    }
}
