/**
 * Created by Kurmo on 21.03.2016.
 */
/**
 * Car object which is operated by CarShop.
 */
public class Car {
    /**
     * Model of the car.
     */
    private String model;

    /**
     * Price of the car.
     */
    private double price;

    /**
     * Constructor.
     * @param model Model of the car.
     * @param price Price of the car.
     */
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    /**
     * Gets the price of the car (in euros).
     *
     * @return Car price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the car (in euros).
     *
     * @param price Car price.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the model of the car.
     *
     * @return Model of the car.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car.
     *
     * @param model Model of the car.
     */
    public void setModel(String model) {
        this.model = model;
    }

}