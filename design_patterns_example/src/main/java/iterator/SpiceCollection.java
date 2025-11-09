package iterator;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class SpiceCollection implements Container {
    private String spices[] = {"cardamom", "paprika", "cinnamon", "garlic powder"};
    @Override
    public Iterator createIterator() {
        SpiceIterator spiceIter= new SpiceIterator();
        return spiceIter;

    }

    private class SpiceIterator implements Iterator {
        private int position;
        @Override
        public boolean hasNext() {
            if (position < spices.length) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return spices[position++];
            }
            else {
                return null;
            }
        }
    }
}

