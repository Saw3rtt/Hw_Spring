package sky.pro.hw_spring.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {

    void addItems(List<Integer> items);

    List<Integer> getItems();
}
