package jp.co.azurelapis.dashtemplate.model.graph.pointdata;

/**
 * グラフの一点を示すIF
 */
public interface XyGraphPointData {

    /**
     * 折れ線グラフや棒グラフなど平面座標の1点を示すX座標点を返す
     *
     * @return 折れ線グラフや棒グラフなど平面座標の1点を示すX座標点
     */
    public double getX();

    /**
     * 折れ線グラフや棒グラフなど平面座標の1点を示すY座標点を返す
     *
     * @return 折れ線グラフや棒グラフなど平面座標の1点を示すY座標点
     */
    public double getY();


}
