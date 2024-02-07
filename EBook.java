import java.time.LocalDate;

public class EBook extends Book {
    private String linkToRead;
    private String fileSize;


    public EBook(int id, boolean availability, String name,
                 String description, double weight, double length,
                 double height, double price, String isbn, String author,
                 String publisher, String genre, String language, String format,
                 String edition, int numOfPages, LocalDate publicationDate,
                 String linkToRead, String fileSize) {
        super(id, availability, name, description,
                weight, length, height, price, isbn, author, publisher,
                genre, language, format, edition, numOfPages, publicationDate);
        this.linkToRead = linkToRead;
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getLinkToRead() {
        return linkToRead;
    }

    public void setLinkToRead(String linkToRead) {
        this.linkToRead = linkToRead;
    }

    @Override
    public String toString() {
        String dataFromProduct = super.toString();
        dataFromProduct +=
                "Link to read: " + linkToRead + "\n" +
                        "File size: " + fileSize + "\n";

        return dataFromProduct;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof EBook otherBook)
                && super.equals(obj)
                && this.linkToRead.equals(otherBook.linkToRead)
                && this.fileSize.equals(otherBook.fileSize);
    }

    public void download() {
        System.out.println("Downloading book: " + getName());
    }
}
