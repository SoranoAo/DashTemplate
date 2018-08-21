package jp.co.azurelapis.dashtemplate.util.data.charjs.dataset;

import java.util.List;

/**
 * CharJS用のデータセット
 */
public class CharJsDataSet {

    //グラフの各要素のの名称
    private List<String> labels;

    //グラフのデータの名称
    private String labebl;

    //グラフの色
    private Color hoverBackgroundColor;

    //グラフのデータ
    private List<Integer> data;




    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getLabebl() {
        return labebl;
    }

    public void setLabebl(String labebl) {
        this.labebl = labebl;
    }

    public Color getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public void setHoverBackgroundColor(Color hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
