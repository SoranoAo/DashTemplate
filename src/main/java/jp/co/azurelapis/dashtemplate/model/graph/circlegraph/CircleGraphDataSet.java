package jp.co.azurelapis.dashtemplate.model.graph.circlegraph;

import jp.co.azurelapis.dashtemplate.model.graph.GraphDataSetBase;
import jp.co.azurelapis.dashtemplate.model.graph.pointdata.RatioData;

import java.util.List;

public interface CircleGraphDataSet extends GraphDataSetBase {

    /**
     * @return １つの円グラフ全体を構成する割合データの集合を返す
     */
    @Override
    public List<RatioData> getDataSet();

}
