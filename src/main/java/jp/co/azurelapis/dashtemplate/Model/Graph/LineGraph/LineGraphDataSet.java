package jp.co.azurelapis.dashtemplate.Model.Graph.LineGraph;

import jp.co.azurelapis.dashtemplate.Model.Graph.GraphDataSetBase;
import jp.co.azurelapis.dashtemplate.Model.Graph.PointData.XyGraphPointData;

import java.util.List;

/**
 * 折れ線グラフのデータセットを示す
 */
public interface LineGraphDataSet extends GraphDataSetBase {

    /**
     * 折れ線グラフのデータセットを返す
     * 並び順はデータの小さいものから大きい順へ並ぶものとする
     *
     * @return 折れ線グラフのデータセットを返す
     */
    @Override
    public List<XyGraphPointData> getDataSet();

}
