package structuraldesign.resource.composite;

public abstract class CommodityWrapper implements Commodity {
    private final String commodityName;

    protected CommodityWrapper(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityName() {
        return commodityName;
    }

}
