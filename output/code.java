import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


public class Book {
    private int pages;
    private String title;
    private LocalDateTime release;

    public Book(int pages, String title, LocalDateTime release){
        this.pages = pages;
        this.title = title;
        this.release = release;
    }
    
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public LocalDateTime getRelease() {
        return release;
    }
    public void setRelease(LocalDateTime release) {
        this.release = release;
    }

 
    public void addLibrary(Library library) {
        if (!librarys.contains(library)) {
            librarys.add(library);
            library.addBook(this);
        }
    }   
 
    public void addAuthor(Author author) {
        if (!authors.contains(author)) {
            authors.add(author);
            author.addBook(this);
        }
    }   

    @Override
    public String toString() {
        return "Book{"pages ='" + pages + "',title ='" + title + "',release ='" + release + "',    + "}";    
    }
}
public class Library {
    private String name;
    private String address;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

 
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            book.addLibrary(this);
        }
    }   
 
    public void add( ) {
        if (!s.contains()) {
            s.add();
            .addLibrary(this);
        }
    }   

    @Override
    public String toString() {
        return "Library{"name ='" + name + "',address ='" + address + "',    + "}";    
    }
}
public class Author {
    private String name;
    private String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

 
    public void add( ) {
        if (!s.contains()) {
            s.add();
            .addAuthor(this);
        }
    }   
 
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            book.addAuthor(this);
        }
    }   

    @Override
    public String toString() {
        return "Author{"name ='" + name + "',email ='" + email + "',    + "}";    
    }
}
