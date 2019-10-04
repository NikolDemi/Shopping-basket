import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OrderLogic {
    private static final Logger LOGGER = Logger.getLogger(OrderLogic.class);

    public void doOrder() {
        //
        System.out.println("заказ оформлен");
        LOGGER.info("SomeText!");
        addToCart();
    }

    private void addToCart() {
        //
        System.out.println("товар добавлен в корзину");
        List<String> strings = new ArrayList<String>();
        try {
            System.out.println(strings.get(5));
        } catch (Exception e) {
            LOGGER.error("SomeERRORText!" + e);
        }
    }
}
