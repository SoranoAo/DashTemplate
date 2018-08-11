package jp.co.azurelapis.dashtemplate;

import jp.co.azurelapis.dashtemplate.model.graph.pointdata.BasicRatioData;

import static org.junit.Assert.*;

public class BasicRatioDataTest {


    @org.junit.Test
    public void getItemName() {

        String graphName = "test graph";

        BasicRatioData basicRatioData = new BasicRatioData();
        basicRatioData.setItemName(graphName);

        assertEquals(basicRatioData.getItemName(),graphName);

    }

    @org.junit.Test
    public void getItemRate() {

        double testRate = 0.06d;

        BasicRatioData basicRatioData = new BasicRatioData();
        basicRatioData.setItemRate(testRate);

        assertEquals(basicRatioData.getItemRate(),testRate,0.0001);
    }
}