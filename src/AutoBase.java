public class AutoBase {
    private int release;
    private String model;
    private int price;
    private String color;

    public AutoBase() {
    }

    public AutoBase(int release, String model, int price, String color) {
        this.release = release;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AutoBase{" +
                "release=" + release +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
