public abstract class Shape implements ShippingCostCalculator, MassConverter, MassCalculable, ThreeDimensional, PiRequired {
    private String name;

    protected static final double PI = 22.0 / 7.0;
    protected static final double DENSITY = 8;
    protected static final double THICKNESS = 0.5;
    protected static final int PRICE_PER_KG = 2000;

    public Shape() {
        this.name = "NABATH NUUR MUHAMMAD";
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public abstract void printInfo();
}
