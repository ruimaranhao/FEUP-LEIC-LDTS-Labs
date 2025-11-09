package builder;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
abstract class CookieBuilder {
    protected Cookie cookie;
    public Cookie getCookie() {
        return cookie;
    }
    public void createNewCookie() {} {
        cookie = new Cookie();
    }

    public abstract void buildDough();
    public abstract void buildMixIn();
    public abstract void buildSize();

}
