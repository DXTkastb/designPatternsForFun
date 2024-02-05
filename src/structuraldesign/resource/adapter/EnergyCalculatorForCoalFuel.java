package structuraldesign.resource.adapter;

public class EnergyCalculatorForCoalFuel {
    private Coal coalFuel;
    private double heatLoss;
    public void setCoalFuel(Coal coalFuel) {
        this.coalFuel = coalFuel;
    }
    public void setHeatLoss(double heatLoss) {
        this.heatLoss = heatLoss;
    }
    public double getTrueEnergyPerUnit() {
        return coalFuel.getPowerPerUnit() - coalFuel.getPowerPerUnit() * Coal.energyCoefficient * heatLoss;
    }
}
