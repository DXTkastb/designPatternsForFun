package structuraldesign.resource.adapter;

public class GasToCoalEnergyAdapter extends  EnergyCalculatorForCoalFuel{
    private EnergyCalculatorForGasFuel energyCalculatorForGasFuel;

    public GasToCoalEnergyAdapter(EnergyCalculatorForGasFuel energyCalculatorForGasFuel) {
        this.energyCalculatorForGasFuel = energyCalculatorForGasFuel;
    }

    @Override
    public double getTrueEnergyPerUnit() {
        return energyCalculatorForGasFuel.getTrueEnergyPerUnit()*1.53;
    }
}
