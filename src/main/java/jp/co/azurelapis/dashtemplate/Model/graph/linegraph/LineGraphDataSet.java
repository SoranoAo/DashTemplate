package jp.co.azurelapis.dashtemplate.model.graph.linegraph;

import jp.co.azurelapis.dashtemplate.model.graph.GraphDataSetBase;
import jp.co.azurelapis.dashtemplate.model.graph.pointdata.XyGraphPointData;

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
