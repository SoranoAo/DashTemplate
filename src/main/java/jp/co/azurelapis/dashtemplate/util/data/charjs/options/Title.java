package jp.co.azurelapis.dashtemplate.util.data.charjs.options;

/**
 * CharJsのOptinのtitleを示すクラス
 */
public class Title {

    //タイトルの表示有無
    private boolean display = true;

    //グラフのタイトル
    private String text;

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
