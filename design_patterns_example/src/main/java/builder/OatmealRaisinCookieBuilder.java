package builder;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class OatmealRaisinCookieBuilder extends CookieBuilder {
    @Override
    public void buildDough() {
        cookie.setDough("oatmeal");
    }

    @Override
    public void buildMixIn() {
        cookie.setMixin("raisin");

    }

    @Override
    public void buildSize() {
        cookie.setSize("medium");

    }
}
