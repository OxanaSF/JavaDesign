public abstract class Product implements Comparable<Product> {

    private String type;
    private int id;
    private boolean availability;
    private String category;
    private String name;
    private String description;
    private double weight;
    private double length;
    private double height;
    private double price;


    // M2 HOMEWORK STATIC
    private static int numProducts = 0;

    public Product(String type,
                   int id,
                   boolean availability,
                   String category,
                   String name,
                   String description,
                   double weight,
                   double length,
                   double height,
                   double price) {
        this.type = type;
        this.id = id;
        this.availability = availability;
        this.category = category;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.price = price;

        Product.numProducts++;
    }

    // M2 HOMEWORK STATIC
    public static int getNumProducts() {
        return Product.numProducts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "Type: " + type + "\n" +
                "Id: " + id + "\n" +
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
                && this.type.equals(otherProduct.type)
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


    @Override
    public  int compareTo(Product product) {
        if (getName().compareToIgnoreCase(product.getName()) != 0) {
            return getName().compareToIgnoreCase(product.getName());
        } else {
            return Integer.compare(getId(), product.getId());
        }
    }


}