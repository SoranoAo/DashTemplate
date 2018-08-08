package jp.co.azurelapis.dashtemplate.Model.Graph.PointData;

/**
 * 円グラフ等を構成する1つのアイテムの割合を示すデータ
 */
public interface RatioData {


    /**
     * アイテム名を返す
     *
     * @return アイテム名
     */
    public String getItemName();

    /**
     * このアイテムが持つ割合 1.0 = 100%
     *
     * @return アイテムの持つ割合
     */
    public double getItemRate();


}
