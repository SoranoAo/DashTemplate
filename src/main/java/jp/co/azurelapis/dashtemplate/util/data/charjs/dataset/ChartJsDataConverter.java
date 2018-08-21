package jp.co.azurelapis.dashtemplate.util.data.charjs.dataset;

import jp.co.azurelapis.dashtemplate.model.graph.GraphDataSetBase;
import jp.co.azurelapis.dashtemplate.model.graph.bargraph.BarGraphDataSet;
import jp.co.azurelapis.dashtemplate.model.graph.pointdata.XyGraphPointData;
import jp.co.azurelapis.dashtemplate.util.data.ViewDataConverter;
import org.springframework.lang.NonNull;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Chart用データの変換クラス
 */
public class ChartJsDataConverter implements ViewDataConverter{



    //グラフタイトル
    public static final String GRAPH_TITLE = "title";

    public static final String GRAPH_DATASET = "datasets";



    /**
     * CharJs向けの棒データ変換クラス
     * @param graphDataSet DashTemplate内の汎用グラフデータセット
     * @return グラフのデータを設定したMODEを返却する
     */
    @Override
    public Model ConvertBarDataToModel(@NonNull BarGraphDataSet graphDataSet) {


        CharJsDataSet charJsDataSet = this.ConvertBarDataToChartJsData(graphDataSet);

        

        return null;

    }

    public CharJsDataSet ConvertBarDataToChartJsData(@NonNull BarGraphDataSet graphDataSet) {


        CharJsDataSet charJsDataSet = new CharJsDataSet();

        //グラフtitle
        charJsDataSet.setLabebl(graphDataSet.getGraphTitle());

        //グラフデータ
        List<String> graphLabelDatas = new ArrayList<>();
        List<Integer> graphValueDatas = new ArrayList<>();
        graphDataSet.getDataSet().forEach(poinntData -> {

            if(poinntData == null){
                throw new NullPointerException();
            }

            graphLabelDatas.add(poinntData.getLabel());
            graphValueDatas.add((int)poinntData.getValue());

        });


        charJsDataSet.setData(graphValueDatas);

        //グラフのデータの軸の名前
        charJsDataSet.setLabels(graphLabelDatas);

        //グラフの色
        charJsDataSet.setHoverBackgroundColor(new Color(200,250,230,100));

        return charJsDataSet;

    }

    /**
     *
     * @param model
     * @param graphDataSet Modelに追加するグラフのデータ
     * @return
     */
    @Override
    public Model addBarDataToModel(@NonNull Model model, @NonNull BarGraphDataSet graphDataSet) {

        //TODO ChartJS向けへの変換処理の記載

        CharJsDataSet charJsDataSet = this.ConvertBarDataToChartJsData(graphDataSet);


        model.addAttribute(GRAPH_TITLE,graphDataSet.getGraphTitle());

        model.addAttribute(GRAPH_DATASET,graphDataSet.getDataSet());

        return null;
    }
}
