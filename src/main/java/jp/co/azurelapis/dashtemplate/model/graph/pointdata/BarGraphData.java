package jp.co.azurelapis.dashtemplate.model.graph.pointdata;

/**
 * 棒グラフの一点を示す
 */
public interface BarGraphData {

    /**
     * 棒グラフの1点を示すX座標点を返す
     *
     * @return 棒グラフの平面座標の1点を示すX座標点
     */
    public String getLabel();

    /**
     * 棒グラフの平面座標の1点を示すY座標点を返す
     *
     * @return 棒グラフの平面座標の1点を示すY座標点
     */
    public double getValue();

}
