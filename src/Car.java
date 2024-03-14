/**
 * Class Of Cars
 */
public class Car
{
    private String brand; // The brand of the car manufacture
    private String model; // The model of the car
    private String year; // The year the car was built
    private String color; // The color of the car
    private int mileage; // The total mileage the car has
    
    /**
     * Default Constructor For Car
     */
    public Car()
    {
        brand = "";
        model = "";
        year = "";
        color = "";
        mileage = 0;
    }

    /**
     * Sets The Brand
     * @param brand the brand to be set  
     * @return returns the instance
     */
    public Car setBrand(String brand)
    {
        this.brand = brand;
        return this;
    }

    /**
     * Set The Model
     * @param model the model to be set
     * @return returns the instance
     */
    public Car setModel(String model)
    {
        this.model = model;
        return this;
    }

    /**
     * Sets The Year
     * @param year the year to be set
     * @return returns the instance
     */
    public Car setYear(String year)
    {
        this.year = year;
        return this;
    }

    /**
     * Sets The Color
     * @param color the color to be set
     * @return returns the instance
     */
    public Car setColor(String color)
    {
        this.color = color;
        return this;
    }

    /**
     * Set The Mileage
     * @param mileage the mileage to be set
     * @return returns the instance
     */
    public Car setMileage(int mileage)
    {
        this.mileage = mileage;
        return this;
    }

    /**
     * Adds More Mileage
     * @param mileage the mileage to be added
     * @return returns the instance
     */
    public Car addToMileage(int mileage)
    {
        this.mileage += mileage;
        return this;
    }

    public static class Engine
    {
        private int cylinderSize;
        
        public Engine()
        {
            cylinderSize = 4;
        }

        public Engine setCylinderSize(int cylinderSize)
        {
            this.cylinderSize = cylinderSize;
            return this;
        }

        public String toString()
        {
            return "Cylinder Size: " + cylinderSize;
        }
    }

    public String toString()
    {
        return "Brand: " + brand + " Model: " + model + " Year: " + year + " Color: " + color + " Mileage: " + mileage;
    }

}