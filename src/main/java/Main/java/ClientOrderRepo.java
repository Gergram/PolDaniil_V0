package Main.java;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "clientOrder", path = "clientOrder")
public interface ClientOrderRepo extends JpaRepository <ClientOrder, Long>
{
}
