package structuraldesign.resource.adapter;

public class EnergyCalculatorForGasFuel {
    private Gas gasFuel;
    private double heatLoss;
    public void setGasFuel(Gas gasFuel) {
        this.gasFuel = gasFuel;
    }
    public void setHeatLoss(double heatLoss) {
        this.heatLoss = heatLoss;
    }
    public double getTrueEnergyPerUnit() {
        return gasFuel.getPowerPerUnit() - gasFuel.getPowerPerUnit() * Gas.energyCoefficient * heatLoss;
    }
}
