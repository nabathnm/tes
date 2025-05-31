public class Torus extends Shape {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        super();
    }
    
    public Torus(double majorRadius, double minorRadius) {
        super();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }
    
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
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
        System.out.printf("Biaya kirim     : Rp %d\n", (int) calculateCost(gramToKilogram((int) getMass())));
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