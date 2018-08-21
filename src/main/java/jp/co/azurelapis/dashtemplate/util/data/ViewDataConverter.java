package jp.co.azurelapis.dashtemplate.util.data;

import jp.co.azurelapis.dashtemplate.model.graph.GraphDataSetBase;
import jp.co.azurelapis.dashtemplate.model.graph.bargraph.BarGraphDataSet;
import org.springframework.ui.Model;

/**
 * 内部でのデータモデルと各種画面側のライブラリとのデータ変換インターフェイス
 */
public interface ViewDataConverter {

    public Model ConvertBarDataToModel(BarGraphDataSet graphDataSetBase);

    public Model addBarDataToModel(Model model, BarGraphDataSet graphDataSetBase);

}
