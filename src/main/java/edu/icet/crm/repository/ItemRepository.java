package edu.icet.crm.repository;

import edu.icet.crm.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity, Integer> {
    ItemEntity findByItemName(String itemName);
}
