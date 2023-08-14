package sky.pro.hw_spring.Service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addItems(List<Integer> items) {
        items.forEach(item -> cart.addItem(item));

    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
