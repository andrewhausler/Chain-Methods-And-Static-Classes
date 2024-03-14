public class Main {
    public static void main(String[] args) throws Exception {
        
        /**
         * Much more simplicity and readable using chained methods
         * Each method returns the instance of myCar in which myCar is an instance of class Car
         */
        Car myCar = new Car()
            .setBrand("Audi")
            .setColor("Silver")
            .setMileage(30000)
            .setYear("2014")
            .setModel("Quattro")
            .addToMileage(10000);

        System.out.println(myCar);
            
        /**
         * Shows a hidden class inside of Car which is closely related which is called Nested Static Classes
         * Because the other class is static you don't need to make an instance of Car which is the same when having static methods
         * But you cannot access the properties of Car they are both their own types of classes
         */
        Car.Engine myEngine = new Car.Engine()
                .setCylinderSize(8);
        
        System.out.println(myEngine);


    }
}
