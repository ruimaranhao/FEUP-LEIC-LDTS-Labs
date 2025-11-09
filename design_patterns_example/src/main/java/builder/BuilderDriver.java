package builder;

import java.net.CookieHandler;
import java.util.ArrayList;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class BuilderDriver {
    public static void main(String[] args) {
        Baker baker = new Baker();
        CookieBuilder gcccBuilder = new GiantChocolateChipCookieBuilder();
        CookieBuilder orcBuilder = new OatmealRaisinCookieBuilder();
        CookieBuilder dccBuilder = new DoubleChocolateCookieBuilder();
        ArrayList<CookieBuilder> cookieBuilders = new ArrayList();
        cookieBuilders.add(gcccBuilder);
        cookieBuilders.add(orcBuilder);
        cookieBuilders.add(dccBuilder);


        for (CookieBuilder cookieBuilder : cookieBuilders) {
            baker.setCookieBuilder(cookieBuilder);
            baker.bakeCookies();
            System.out.println(baker.getCookie().getDough() + " " + baker.getCookie().getMixin() + " " + baker.getCookie().getSize());
        }

    }
}

