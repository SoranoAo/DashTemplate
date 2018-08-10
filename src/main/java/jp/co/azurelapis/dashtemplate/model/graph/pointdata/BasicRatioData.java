package jp.co.azurelapis.dashtemplate.model.graph.pointdata;

/**
 * 基本的な割合データの１要素を示す
 */
public class BasicRatioData implements RatioData {

    private String itemName;

    private double itemRate;


    public BasicRatioData() {

    }

    public BasicRatioData(String itemName, double itemRate) {
        this.itemName = itemName;
        this.itemRate = itemRate;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemRate(double itemRate) {
        this.itemRate = itemRate;
    }

    @Override
    public String getItemName() {
        return this.itemName;
    }

    @Override
    public double getItemRate() {
        return this.itemRate;
    }
}
