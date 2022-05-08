package Entity;

public class offre {

    private int id;
    private String title;
    private String image;
    private double price;
    private String category;


    public offre(int id, String title, String image, double price, String category) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.category = category;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
