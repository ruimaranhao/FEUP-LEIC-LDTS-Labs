package builder;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class Cookie {

    private String dough = "";
    private String mixin = "";
    private String size = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setMixin(String mixin) {
        this.mixin = mixin;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getDough() {
        return dough;
    }

    public String getMixin() {
        return mixin;
    }

    public String getSize() {
        return size;
    }


}
