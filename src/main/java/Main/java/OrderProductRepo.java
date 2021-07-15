package Main.java;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "OrderProduct", path = "OrderProduct")
public interface OrderProductRepo extends JpaRepository<OrderProduct, Long>
{
}
