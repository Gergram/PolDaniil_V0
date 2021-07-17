package Main.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestQueryController {
//Clients---------------------------------------------------------------------------------------------------------------
    private final EntytiesService entityService;

    public RestQueryController(EntityServiceImpl entityService)
    {
        this.entityService = entityService;
    }
    @GetMapping("/rest/client")
    public List<Client> getAllClients(){
        return entityService.getAllClients();
    }

    @RequestMapping(value = "/rest/client?name=",params = {"name"})
    public Client getClientByName(@RequestParam String name)
    {
        return entityService.getClientByName(name);
    }

    @RequestMapping(value = "/rest/client?id=",params = {"id"})
    public Client getClientById(@RequestParam Long id)
    {
        return entityService.getClientById(id);
    }
//Orders----------------------------------------------------------------------------------------------------------------
    @GetMapping("/rest/orders")
    public List<Order> getAllOrders(){
        return entityService.getAllOrders();
    }

    @RequestMapping(value = "/rest/order?status=", params = {"status"})
    public Order getOrdersByName(@RequestParam Integer status) {
        return entityService.getOrderByStatus(status);
    }

    @RequestMapping(value = "/rest/orders?id=", params = {"id"})
    public Order getOrdersById(@RequestParam Long id)
    {
        return entityService.getOrderById(id);
    }
//Products--------------------------------------------------------------------------------------------------------------
    @GetMapping("/rest/products")
    public List<Product> getAllProducts(){
        return entityService.getAllProducts();
    }

    @RequestMapping(value = "/rest/products?id=", params = {"id"})
    public Product getProductsById(@RequestParam Long id){
        return entityService.getProductById(id);
    }

    @RequestMapping(value = "/rest/products?name=",params = {"name"})
    public Product getProductsByName(@RequestParam String name){
        return entityService.getProductByName(name);
    }

    @RequestMapping(value = "/rest/products?categoryId=", params = {"id_category"})
    public Product getProductByCategoryId(@RequestParam Category id_category){
        return entityService.getProductByCategoryId(id_category);
    }

//Categories------------------------------------------------------------------------------------------------------------
    @GetMapping("/rest/categories")
    public List<Category> getAllCategories(){
        return entityService.getAllCategories();
    }

}


