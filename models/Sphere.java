public class Sphere extends Shape {
    private double radius;

    public Sphere() {
        super();
        this.radius = 0;
    }

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }

    public double getMass() {
        return getSurfaceArea() * THICKNESS * DENSITY;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f\n", getMass());
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram((int) getMass()));
        System.out.printf("Biaya kirim     : Rp %d\n", (int) calculateCost(getMass()));
    }
    
    @Override
    public double gramToKilogram(double grams) {
        return grams / 1000.0;
    }

    @Override
    public double calculateCost(double weight) {
        return weight * PRICE_PER_KG;
    }

}
