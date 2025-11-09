package iterator;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class Driver {
    public static void main(String[] args) {
        SpiceCollection spiceCollection = new SpiceCollection();
        Iterator iterator1 = spiceCollection.createIterator();
        System.out.println("Iterator traverses the spice collection: ");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        HerbCollection herbCollection = new HerbCollection();
        Iterator iterator2 = herbCollection.createIterator();
        System.out.println("\nIterator traverses the herb collection: ");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
