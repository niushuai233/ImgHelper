package cc.niushuai.projects.imghelper.enums;

/**
 * 符号枚举类
 *
 * @author niushuai
 * @date 2021/10/26 15:57:42
 */
public enum Symbols {

    /**
     * 逗号
     */
    COMMA(",", "逗号"),

    /**
     * 分号
     */
    SEMICOLON(";", "分号"),

    /**
     * 点
     */
    POINT(".", "点"),

    /**
     * 空串
     */
    EMPTY_STRING("", "空串"),

    /**
     * 空格
     */
    SPACE(" ", "空格");


    private String symbol;
    private String desc;

    Symbols(String symbol, String desc) {
        this.symbol = symbol;
        this.desc = desc;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
