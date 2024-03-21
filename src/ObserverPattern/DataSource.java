package ObserverPattern;

public class DataSource extends Subject {
    private String books;
    private String libraries;




    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
        updateObservers();
    }

    public String getLibraries() {
        return libraries;
    }

    public void setLibraries(String libraries) {
        this.libraries = libraries;
        updateObservers();
    }
}
