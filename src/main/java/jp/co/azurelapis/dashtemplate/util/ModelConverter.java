package jp.co.azurelapis.dashtemplate.util;

import jp.co.azurelapis.dashtemplate.model.graph.bargraph.BarGraphDataSet;
import jp.co.azurelapis.dashtemplate.model.graph.bargraph.BasicBarGraphDataSet;
import org.jetbrains.annotations.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.ui.Model;

/**
 * Viewへ渡すMODELモブジェクトへのマッピングを行う
 */
public class ModelConverter {

    /**
     * 棒グラフのデータを変換する。
     * @param model
     * @param barGraphDataSet
     * @return
     */
    public Model graphDataSetToModel(@NonNull Model model,@NotNull BarGraphDataSet barGraphDataSet){

        model.addAttribute("titile",barGraphDataSet.getGraphTitle());
        model.addAttribute("dataset",barGraphDataSet.getDataSet());



         return model;

    }
}
