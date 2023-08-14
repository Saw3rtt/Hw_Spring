package sky.pro.hw_spring.Service;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private List<Integer> items = new ArrayList<>();

    public void addItem(Integer item) {
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
