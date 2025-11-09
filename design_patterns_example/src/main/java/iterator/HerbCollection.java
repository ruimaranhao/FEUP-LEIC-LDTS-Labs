package iterator;

import java.util.ArrayList;

/**
 * Created by jahnaariellegoldman on 8/3/16.
 */
public class HerbCollection implements Container {
    private ArrayList<String> herbs = new ArrayList<>();

    public HerbCollection() {
        herbs.add("coriander");
        herbs.add("thyme");
        herbs.add("fennel");
    }

    @Override
    public Iterator createIterator() {
        HerbIterator herbIter = new HerbIterator();
        return herbIter;
    }

    private class HerbIterator implements Iterator {
        private int position;
        @Override
        public boolean hasNext() {
            if (position < herbs.size()) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return herbs.get(position++);
            }
            else {
                return null;
            }
        }
    }
}
