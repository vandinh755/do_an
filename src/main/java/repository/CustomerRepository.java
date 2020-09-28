
package repository;

import entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>{
     CustomerEntity findById(int id);
}
