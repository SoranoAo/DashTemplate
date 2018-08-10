package jp.co.azurelapis.dashtemplate.model.graph.pointdata;

public class BasicXyGraphPointData implements XyGraphPointData {


    private double x;

    private double y;

    public BasicXyGraphPointData() {

    }

    BasicXyGraphPointData(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
