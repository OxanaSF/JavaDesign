import java.time.LocalDate;

public class ProductFactory {

    // M3 HOMEWORK ENUM
    public enum ProductType {
        BOOK("book", true),
        AUDIO_BOOK("audiobook", true),
        E_BOOK("ebook", true);

        private String displayProduct;
        private boolean isBook;

        private ProductType(String displayProduct, boolean isBook) {
            this.displayProduct = displayProduct;
            this.isBook = isBook;
        }


        public String getProductType(String displayProduct) {
            return displayProduct;
        }

        public boolean isBook() {
            return isBook;
        }
    }

    public static Product createProduct(
            ProductType type,
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
        if (type.equals(ProductType.BOOK)) {
            if (isbn != null && author != null && publisher != null && genre != null &&
                    language != null && format != null && edition != null && numOfPages > 0 &&
                    publicationDate != null) {
                product = new Book(type, id, availability, name, description, weight, length, height,
                        price, isbn, author, publisher, genre, language, format, edition, numOfPages,
                        publicationDate);
            }
        } else if (type.equals(ProductType.AUDIO_BOOK)) {
            if (narrator != null && listeningLength > 0) {
                product = new AudioBook(type, id, availability, name, description, weight, length, height,
                        price, isbn, author, publisher, genre, language, format, edition, numOfPages,
                        publicationDate, narrator, listeningLength);
            }
        } else if (type.equals(ProductType.E_BOOK)) {
            if (linkToRead != null && fileSize != null) {
                product = new EBook(type, id, availability, name, description, weight, length, height,
                        price, isbn, author, publisher, genre, language, format, edition, numOfPages,
                        publicationDate, linkToRead, fileSize);
            }
        }
        return product;
    }
}
