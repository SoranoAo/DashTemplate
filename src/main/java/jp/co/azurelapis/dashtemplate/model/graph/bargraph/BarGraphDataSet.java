package jp.co.azurelapis.dashtemplate.model.graph.bargraph;

import jp.co.azurelapis.dashtemplate.model.graph.GraphDataSetBase;
import jp.co.azurelapis.dashtemplate.model.graph.pointdata.BarGraphData;

import java.util.List;

/**
 * 棒グラフのデータセット
 */
public interface BarGraphDataSet extends GraphDataSetBase {

    /**
     * 棒グラフの１点分のデータのリストを返却する
     * 並び順はデータの小さいものから大きい順へ並ぶものとする
     *
     * @return 棒グラフの１点分のデータのリストを返却する
     */
    @Override
    public List<BarGraphData> getDataSet();


}
