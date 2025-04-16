import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Book {
    private int pages;
    private String title;
    private LocalDate release;

    public Book(int pages, String title, LocalDate release){
        this.pages = pages;
        this.title = title;
        this.release = release;
    }
    {Property(locatedIn, public, Class(Library, {Property(name, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922708, None, is_derived=False), Property(address, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922771, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922791, None, is_abstract=False, is_derived=False), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922948, None, is_derived=False), Property(has, public, Class(Book, {Property(pages, public, PrimitiveDataType(int, 2025-04-16 13:54:28.303545, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922846, None, is_derived=False), Property(title, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922835, None, is_derived=False), Property(release, public, PrimitiveDataType(datetime, 2025-04-16 13:54:28.303574, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922855, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922865, None, is_abstract=False, is_derived=False), Multiplicity(0, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922965, None, is_derived=False)}
    TBD
    {Property(publishes, public, Class(Book, {Property(pages, public, PrimitiveDataType(int, 2025-04-16 13:54:28.303545, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922846, None, is_derived=False), Property(title, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922835, None, is_derived=False), Property(release, public, PrimitiveDataType(datetime, 2025-04-16 13:54:28.303574, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922855, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922865, None, is_abstract=False, is_derived=False), Multiplicity(0, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.923016, None, is_derived=False), Property(writedBy, public, Class(Author, {Property(name, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922895, None, is_derived=False), Property(email, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922905, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922917, None, is_abstract=False, is_derived=False), Multiplicity(1, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.923029, None, is_derived=False)}
    TBD

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
    public LocalDate getRelease() {
        return release;
    }
    public void setRelease(LocalDate release) {
        this.release = release;
    }

}
public class Library {
    private String name;
    private String address;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }
    {Property(locatedIn, public, Class(Library, {Property(name, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922708, None, is_derived=False), Property(address, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922771, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922791, None, is_abstract=False, is_derived=False), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922948, None, is_derived=False), Property(has, public, Class(Book, {Property(pages, public, PrimitiveDataType(int, 2025-04-16 13:54:28.303545, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922846, None, is_derived=False), Property(title, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922835, None, is_derived=False), Property(release, public, PrimitiveDataType(datetime, 2025-04-16 13:54:28.303574, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922855, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922865, None, is_abstract=False, is_derived=False), Multiplicity(0, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922965, None, is_derived=False)}
    TBD
    {Property(publishes, public, Class(Book, {Property(pages, public, PrimitiveDataType(int, 2025-04-16 13:54:28.303545, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922846, None, is_derived=False), Property(title, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922835, None, is_derived=False), Property(release, public, PrimitiveDataType(datetime, 2025-04-16 13:54:28.303574, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922855, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922865, None, is_abstract=False, is_derived=False), Multiplicity(0, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.923016, None, is_derived=False), Property(writedBy, public, Class(Author, {Property(name, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922895, None, is_derived=False), Property(email, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922905, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922917, None, is_abstract=False, is_derived=False), Multiplicity(1, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.923029, None, is_derived=False)}
    TBD

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

}
public class Author {
    private String name;
    private String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }
    {Property(locatedIn, public, Class(Library, {Property(name, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922708, None, is_derived=False), Property(address, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922771, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922791, None, is_abstract=False, is_derived=False), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922948, None, is_derived=False), Property(has, public, Class(Book, {Property(pages, public, PrimitiveDataType(int, 2025-04-16 13:54:28.303545, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922846, None, is_derived=False), Property(title, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922835, None, is_derived=False), Property(release, public, PrimitiveDataType(datetime, 2025-04-16 13:54:28.303574, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922855, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922865, None, is_abstract=False, is_derived=False), Multiplicity(0, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922965, None, is_derived=False)}
    TBD
    {Property(publishes, public, Class(Book, {Property(pages, public, PrimitiveDataType(int, 2025-04-16 13:54:28.303545, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922846, None, is_derived=False), Property(title, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922835, None, is_derived=False), Property(release, public, PrimitiveDataType(datetime, 2025-04-16 13:54:28.303574, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922855, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922865, None, is_abstract=False, is_derived=False), Multiplicity(0, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.923016, None, is_derived=False), Property(writedBy, public, Class(Author, {Property(name, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922895, None, is_derived=False), Property(email, public, PrimitiveDataType(str, 2025-04-16 13:54:28.303507, None), Multiplicity(1, 1, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.922905, None, is_derived=False)}, set(), 2025-04-16 13:54:28.922917, None, is_abstract=False, is_derived=False), Multiplicity(1, 9999, is_derived=False), is_composite=False, is_id=False, is_read_only=False, 2025-04-16 13:54:28.923029, None, is_derived=False)}
    TBD

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

}
