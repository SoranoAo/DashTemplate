package jp.co.azurelapis.dashtemplate;


import jp.co.azurelapis.dashtemplate.model.graph.pointdata.BasicXyGraphPointData;

import static org.junit.Assert.*;

public class BasicXyGraphPointDataTest {

    @org.junit.Test
    public void getX() {

        double xData = 1.2347564212d;

        BasicXyGraphPointData basicXyGraphPointData = new BasicXyGraphPointData();

        basicXyGraphPointData.setX(xData);

        assertEquals(xData,basicXyGraphPointData.getX(),0.0000001);

    }

    @org.junit.Test
    public void getY() {

        double yData = 1.2347564212d;

        BasicXyGraphPointData basicXyGraphPointData = new BasicXyGraphPointData();

        basicXyGraphPointData.setY(yData);

        assertEquals(yData,basicXyGraphPointData.getY(),0.0000001);
    }
}