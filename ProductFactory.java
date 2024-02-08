import java.time.LocalDate;

public class ProductFactory {
    public static Product createProduct(
            String type,
            int id,
            boolean availability,
            String name,
            String description,
            double weight,
            double length,
            double height,
            double price,
            String isbn,
            String author,
            String publisher,
            String genre,
            String language,
            String format,
            String edition,
            int numOfPages,
            LocalDate publicationDate,
            String narrator,
            double listeningLength,
            String linkToRead,
            String fileSize
    ) {
        Product product = null;
        if (type.equalsIgnoreCase("book")) {
            if (isbn != null && author != null && publisher != null && genre != null &&
                    language != null && format != null && edition != null && numOfPages > 0 &&
                    publicationDate != null) {
                product = new Book(type, id, availability, name, description, weight, length, height,
                        price, isbn, author, publisher, genre, language, format, edition, numOfPages,
                        publicationDate);
            }
        } else if (type.equalsIgnoreCase("audiobook")) {
            if (narrator != null && listeningLength > 0) {
                product = new AudioBook(type, id, availability, name, description, weight, length, height,
                        price, isbn, author, publisher, genre, language, format, edition, numOfPages,
                        publicationDate, narrator, listeningLength);
            }
        } else if (type.equalsIgnoreCase("ebook")) {
            if (linkToRead != null && fileSize != null) {
                product = new EBook(type, id, availability, name, description, weight, length, height,
                        price, isbn, author, publisher, genre, language, format, edition, numOfPages,
                        publicationDate, linkToRead, fileSize);
            }
        }
        return product;
    }
}
