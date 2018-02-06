/**
 * Created by Kurmo on 21.03.2016.
 */
/**
 * Car shop interface.
 */
public interface CarShop {
    /**
     * Car shop buys a car. Car will be added to the owned cars.
     * @param car Car to buy.
     */
    void buyCar(Car car);

    /**
     * Car shop sells a car with the specified model.
     * Car will be removed from the owned cars.
     * @param model Car with the specified model is sold.
     * @return Car to be sold. Null if no car with the specified model found.
     */
    double sellCar(String model);

    /**
     * Gets the amount of cars with specified model. If no cars
     * with specified model exist, returns 0. If specified model is null,
     * returns the amount of all the cars.
     * @param model Model to count. If null, the amount of all the cars is returned.
     * @return The amount of cars with specified model. If model is null,
     * total amount of cars.
     */
    int getAmount(String model);
}