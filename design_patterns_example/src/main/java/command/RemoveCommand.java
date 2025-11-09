package command;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class RemoveCommand implements Command {
    private ShoppingCart shoppingCart;
    public RemoveCommand(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    @Override
    public void execute() {
        shoppingCart.removeItem();

    }
}
