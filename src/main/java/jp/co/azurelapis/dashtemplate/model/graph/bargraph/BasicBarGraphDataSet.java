package jp.co.azurelapis.dashtemplate.model.graph.bargraph;


import edu.umd.cs.findbugs.annotations.NonNull;
import jp.co.azurelapis.dashtemplate.model.graph.pointdata.XyGraphPointData;

import java.util.ArrayList;
import java.util.List;

/**
 * graphのデータセットはnullを返さない。
 */
public class BasicBarGraphDataSet implements BarGraphDataSet {


    //グラフタイトル
    private String graphTitle;

    private List<XyGraphPointData> graphPointDataSet = new ArrayList<>();

    public BasicBarGraphDataSet() {

    }

    public BasicBarGraphDataSet(String graphTitle, List<XyGraphPointData> graphPointDataSet) {
        this.graphTitle = graphTitle;
        this.graphPointDataSet = graphPointDataSet;
    }


    //setter & getter
    public void setGraphTitle(String graphTitle) {
        this.graphTitle = graphTitle;
    }

    /**
     * 引数のリストからデータを追加する、
     *
     * @param graphPointDataSet 　追加するデータ・セット
     */
    public void addGraphPointDataSet(List<XyGraphPointData> graphPointDataSet) {

        if (graphPointDataSet != null) {

            this.graphPointDataSet.addAll(graphPointDataSet);

        }
    }

    /**
     * データセットのリストを初期化する
     */
    public void clearGraphDataSet() {
        this.graphPointDataSet.clear();
    }

    @Override
    public String getGraphTitle() {
        return this.graphTitle;
    }

    @Override
    @NonNull
    public List<XyGraphPointData> getDataSet() {
        return this.graphPointDataSet;
    }
}
