package Main.java;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Product", path = "Product")
public interface ProductRepo extends JpaRepository<Product, Long>
{
    String GET_TOP_POPULAR_QUERTY = "select o.product from OrderProduct as o group by o.product.id order by" + "sum(o.countProduct) desc";
    @Query(GET_TOP_POPULAR_QUERTY)
    List<Product> getTopPopular();
}
