package command;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class AddCommand implements Command {
    private ShoppingCart shoppingCart;
    public AddCommand(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    @Override
    public void execute() {
        shoppingCart.addItem();

    }
}
