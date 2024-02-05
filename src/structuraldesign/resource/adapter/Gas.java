package structuraldesign.resource.adapter;

public class Gas implements  Fuel{

    public static final double energyCoefficient = 0.0002;
    private double ppu;

    @Override
    public void setPowerPerUnit(double energyPerUnit) {
        ppu = energyPerUnit;
    }

    @Override
    public double getPowerPerUnit() {
        return ppu;
    }
}
