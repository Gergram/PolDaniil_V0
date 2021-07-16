import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCalassClient {
    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void createTwoclients(){
        Client client1 = new Client();
        client1.setAddress("address1");
        client1.setEx_id(1);
        client1.setFull_name("fullName1");
        clientRepository.save(client1);
        Client client2 = new Client();
        client2.setAddress("address1");
        client2.setEx_id(1);
        client2.setFull_name("fullName1");
        clientRepository.save(client2);
    }
}
