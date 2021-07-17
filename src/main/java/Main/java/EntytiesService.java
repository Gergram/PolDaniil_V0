package Main.java;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntytiesService {
    List<Client> getAllClients();//Список всех клиентов

    Client getClientByName(String name);//Возвращение клиента по имени

    Client getClientById(Long id);//Возвращение клиента по id

    List<Order> getAllOrders();//Возвращение всех заказов

    Order getOrderById(Long id);//Возвращение заказа по id

    Order getOrderByStatus(Integer status);//Возвращение заказа по статусу

    List<Product> getAllProducts();// Возвращение списка товаров

    Product getProductById(Long id);// Возвращение товара по id

    Product getProductByName(String name);// Возвращение товара по названию

    List<ClientOrder> getClientOrdersByName(String name);//Возвращает список заказов клиента по его имени param name имя клиента

    List<Category> getAllCategories();// Возвращает список всех категорий+

    String GET_TOP_POPULAR_QUERTY = "select o.product from OrderProduct as o group by o.product.id order by" + "sum(o.countProduct) desc";

    List<Product> getCategoryProducts(Long id);

    Product getProductByCategoryId(Category id_category);

    @Query(GET_TOP_POPULAR_QUERTY)
    List<Product> getTopPopular();


}