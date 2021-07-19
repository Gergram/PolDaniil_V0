package Main.java;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Product", path = "Product")
public interface ProductRepo extends JpaRepository<Product, Long>
{

}
