import java.time.LocalDate;

public class AudioBook extends Book {
    private String narrator;
    private double listeningLength;

    public AudioBook(int id, boolean availability,
                     String name, String description, double weight,
                     double length, double height, double price, String isbn,
                     String author, String publisher, String genre, String language,
                     String format, String edition, int numOfPages,
                     LocalDate publicationDate, String narrator, double listeningLength) {
        super(id, availability, name, description,
                weight, length, height, price, isbn, author, publisher,
                genre, language, format, edition, numOfPages, publicationDate);
        this.narrator = narrator;
        this.listeningLength = listeningLength;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public double getListeningLength() {
        return listeningLength;
    }

    public void setListeningLength(double listeningLength) {
        this.listeningLength = listeningLength;
    }

    @Override
    public String toString() {
        String dataFromProduct = super.toString();
        dataFromProduct +=
                "Narrator: " + narrator + "\n" +
                        "Listening Length: " + listeningLength + "\n";

        return dataFromProduct;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof AudioBook otherBook)
                && super.equals(obj)
                && this.narrator.equals(otherBook.narrator)
                && this.listeningLength == otherBook.listeningLength;
    }

    public void play() {
        System.out.println("Playing: " + getName() + " " + getGenre() + ",");
        System.out.println("Narrated by " + getNarrator());
    }

    public void stopPlay() {
        System.out.println("Stopped playing: " + getName() + " " + getGenre());
    }
}
