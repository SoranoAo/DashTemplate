package jp.co.azurelapis.dashtemplate.model.graph.pointdata;


public class BasicBarGraphData implements BarGraphData {

    //データのラベbる
    private String label;

    //データの値
    private double value;


    public BasicBarGraphData(){

    }

    public  BasicBarGraphData(String label, double value){

        this.label = label;
        this.value = value;

    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
