import java.time.LocalDate;
import java.util.Comparator;

public class Book extends Product {
    private String isbn;
    private String author;
    private String publisher;
    private String genre;
    private String language;
    private String format;
    private String edition;
    private int numOfPages;
    private LocalDate publicationDate;

    private static final String DEFAULT_BOOK_CATEGORY = "book";

    public static final Comparator<Book> AUTHOR_LAST_NAME_COMPARATOR = new AuthorLastNameComparator();
    public static final Comparator<Book> PUBLICATION_DATE_COMPARATOR = new PublicationDateComparator();
    public static final Comparator<Book> GENRE_COMPARATOR = new GenreComparator();

    // M3 HOMEWORK ENUM USE
    public Book(ProductFactory.ProductType type, int id, boolean availability,
                String name, String description,
                double weight, double length, double height,
                double price, String isbn, String author, String publisher,
                String genre, String language, String format,
                String edition, int numOfPages, LocalDate publicationDate) {
        super(type, id, availability, DEFAULT_BOOK_CATEGORY, name, description, weight, length, height, price);


        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.language = language;
        this.format = format;
        this.edition = edition;
        this.numOfPages = numOfPages;
        this.publicationDate = publicationDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        String dataFromProduct = super.toString();
        dataFromProduct +=
                "ISBN: " + isbn + "\n" +
                        "Author: " + author + "\n" +
                        "Publisher: " + publisher + "\n" +
                        "Genre: " + genre + "\n" +
                        "Language: " + language + "\n" +
                        "Format: " + format + "\n" +
                        "Edition: " + edition + "\n" +
                        "Number of pages: " + numOfPages + "\n" +
                        "Publication date: " + publicationDate + "\n";

        return dataFromProduct;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Book otherBook)
                && super.equals(obj)
                && this.isbn.equals(otherBook.isbn)
                && this.author.equals(otherBook.author)
                && this.publisher.equals(otherBook.publisher)
                && this.genre.equals(otherBook.genre)
                && this.language.equals(otherBook.language)
                && this.format.equals(otherBook.format)
                && this.edition.equals(otherBook.edition)
                && this.numOfPages == otherBook.numOfPages
                && this.publicationDate.isEqual(otherBook.publicationDate);
    }


    public double calculateShippingCost() {
        if (getWeight() > 3) return 2.99;
        return 0.00;
    }

    public static class AuthorLastNameComparator implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            String authorLastName1 = extractAuthorLastName(book1.getAuthor());
            String authorLastName2 = extractAuthorLastName(book2.getAuthor());
            return authorLastName1.compareToIgnoreCase(authorLastName2);
        }
        
        private String extractAuthorLastName(String authorFullName) {
            String[] splittedFullname = authorFullName.split(" ");
            return splittedFullname[splittedFullname.length - 1];
        }
    }

    public static class PublicationDateComparator implements Comparator<Book>{
        @Override
        public int compare(Book book1, Book book2) {
            return book1.publicationDate.compareTo(book2.publicationDate);
        }    
    }

    public static class GenreComparator implements Comparator<Book> {
        @Override
        public int compare(Book book1, Book book2) {
            return book1.genre.compareToIgnoreCase(book2.genre);
        }
    }



}
