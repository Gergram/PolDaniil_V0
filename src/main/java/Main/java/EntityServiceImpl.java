package Main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public abstract class EntityServiceImpl implements EntytiesService {
//Clients---------------------------------------------------------------------------------------------------------------
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientByName(String name) {
        Client client = new Client();
        client.setFull_name(name);
        return clientRepository.findOne(Example.of(client)).orElse(null);
    }

    @Override
    public Client getClientById(Long id) {
        Client client = new Client();
        client.setId(id);
        return clientRepository.findOne(Example.of(client)).orElse(null);
    }
//Orders----------------------------------------------------------------------------------------------------------------
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    @Override
    public Order getOrderById(Long id){
        Order order = new Order();
        order.setId(id);
        return orderRepo.findOne(Example.of(order)).orElse(null);
    }

    @Override
    public Order getOrderByStatus(Integer status){
        Order order = new Order();
        order.setStatus(status);
        return orderRepo.findOne(Example.of(order)).orElse(null);
    }
//Products--------------------------------------------------------------------------------------------------------------
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id){
        Product product = new Product();
        product.setId(id);
        return productRepo.findOne(Example.of(product)).orElse(null);
    }

    @Override
    public Product getProductByName(String name){
        Product product = new Product();
        product.setName(name);
        return productRepo.findOne(Example.of(product)).orElse(null);
    }

    @Override
    public List<Product> getCategoryProducts(Long id){
        return productRepo.findAll();
    }

    @Override
    public Product getProductByCategoryId(Category id_category){
        Product product = new Product();
        product.getId_category();
        return productRepo.findOne(Example.of(product)).orElse(null);
    }

    @Override
    public List<Product> getTopPopular() {
        return null;
    }
//Categories------------------------------------------------------------------------------------------------------------
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<Category> getAllCategories(){
        return categoryRepo.findAll();
    }
//ClientOrder-----------------------------------------------------------------------------------------------------------
   @Autowired
   private ClientOrderRepo clientOrderRepo;

    @Override
    public List<ClientOrder> getProductByClientID(){
        return null;
    }
   }
