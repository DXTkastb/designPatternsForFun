package structuraldesign.resource.adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        Coal coal = new Coal();
        coal.setPowerPerUnit(100);
        Gas gas = new Gas();
        gas.setPowerPerUnit(100);
        EnergyCalculatorForCoalFuel energyCalculatorForCoalFuel = new EnergyCalculatorForCoalFuel();
        energyCalculatorForCoalFuel.setCoalFuel(coal);
        energyCalculatorForCoalFuel.setHeatLoss(5);
        Generator generator = new Generator();
        EnergyCalculatorForGasFuel energyCalculatorForGasFuel = new EnergyCalculatorForGasFuel();
        energyCalculatorForGasFuel.setGasFuel(gas);
        energyCalculatorForGasFuel.setHeatLoss(2);
        System.out.println(generator.energyGeneratedFromCoal(10,energyCalculatorForCoalFuel));
        System.out.println(generator.energyGeneratedFromCoal(10,new GasToCoalEnergyAdapter(energyCalculatorForGasFuel)));
    }
}
