package builder;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class GiantChocolateChipCookieBuilder extends CookieBuilder {
    @Override
    public void buildDough() {
        cookie.setDough("regular");

    }

    @Override
    public void buildMixIn() {
        cookie.setMixin("chocolate chips");

    }

    @Override
    public void buildSize() {
        cookie.setSize("large");

    }
}
