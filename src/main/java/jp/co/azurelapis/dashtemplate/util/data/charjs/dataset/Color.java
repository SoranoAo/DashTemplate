package jp.co.azurelapis.dashtemplate.util.data.charjs.dataset;

/**
 * ChartJs向けに色を表現する区rす
 */
public class Color {



    //赤要素
    private int R;
    //緑要素
    private int G;
    //碧要素
    private int B;

    //透過率
    private int alpha;

    //ChartJSへ渡すパラメータは"rgba(x,x,x,x)"のため
    private static final String RGBA_PARM = "rbga";



    public Color(int R,int B,int G,int alpha){

        this.R = R;
        this.B = B;
        this.G = G;
        this.alpha = alpha;

    }



    /**
     *
     * @return ChartJsへ渡す形式で色情報を返す
     */
    public String getColor(){

        return new StringBuilder()
                .append(RGBA_PARM)
                .append("(")
                .append(R)
                .append(",")
                .append(G)
                .append(",")
                .append(B)
                .append(",")
                .append(alpha)
                .append(")")
                .toString();

    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
}
