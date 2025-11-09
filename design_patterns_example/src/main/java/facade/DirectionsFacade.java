package facade;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class DirectionsFacade {
    private PublicTransitRouteFinder transitroutefinder = new PublicTransitRouteFinder();
    private WalkingRouteFinder walkingroutefinder = new WalkingRouteFinder();
    public String getAllDirections() {
        String walking = walkingroutefinder.getDirections();
        String pubtransit = transitroutefinder.getDirections();
        return walking + " \n" + pubtransit;

    }
}
