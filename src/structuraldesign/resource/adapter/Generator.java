package structuraldesign.resource.adapter;

public class Generator {
    public double energyGeneratedFromCoal(double mass, EnergyCalculatorForCoalFuel energyCalculatorForCoalFuel) {
        return mass * energyCalculatorForCoalFuel.getTrueEnergyPerUnit();
    }
}
