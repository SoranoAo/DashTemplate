package jp.co.azurelapis.dashtemplate.Model.Graph;


import java.util.List;

/**
 * 各種グラフの共通のデータを保持するIF
 */
public interface GraphDataSetBase {

    /**
     * グラフのタイトルを返す
     *
     * @return グラフのタイトルを返す
     */
    public String getGraphTitle();

    /**
     * データセットを返却する
     *
     * @return データセットを返却する
     */
    public abstract List<?> getDataSet();


}
