package sky.pro.hw_spring.Controller;

import org.springframework.web.bind.annotation.*;
import sky.pro.hw_spring.Service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/add")
    public String addItems(@RequestParam List<Integer> items) {
        cartService.addItems(items);
        return "Товары добавлены в корзину";
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
