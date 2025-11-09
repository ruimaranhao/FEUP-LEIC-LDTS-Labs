package builder;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class Baker {

    private CookieBuilder cookieBuilder;
    public void setCookieBuilder(CookieBuilder cookieBuilder) {
        this.cookieBuilder = cookieBuilder;
    }
    public Cookie getCookie() {
        return cookieBuilder.getCookie();
    }
    public void bakeCookies() {
        cookieBuilder.createNewCookie();
        cookieBuilder.buildDough();
        cookieBuilder.buildMixIn();
        cookieBuilder.buildSize();
    }
}
