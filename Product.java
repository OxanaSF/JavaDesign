public abstract class Product {

    private int id;
    private boolean availability;
    private String category;
    private String name;
    private String description;
    private double weight;
    private double length;
    private double height;
    private double price;


    public Product(int id,
                   boolean availability,
                   String category,
                   String name,
                   String description,
                   double weight,
                   double length,
                   double height,
                   double price) {
        this.id = id;
        this.availability = availability;
        this.category = category;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Availability: " + availability + "\n" +
                "Category: " + category + "\n" +
                "Name: " + name + "\n" +
                "Description: " + description + "\n" +
                "Weight: " + weight + "\n" +
                "Length: " + length + "\n" +
                "Height: " + height + "\n" +
                "Price: " + price + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Product otherProduct)
                && this.id == otherProduct.id
                && this.availability == otherProduct.availability
                && this.category.equals(otherProduct.category)
                && this.name.equals(otherProduct.name)
                && this.description.equals(otherProduct.description)
                && this.weight == otherProduct.weight
                && this.length == otherProduct.length
                && this.height == otherProduct.height
                && this.price == otherProduct.price;
    }

}