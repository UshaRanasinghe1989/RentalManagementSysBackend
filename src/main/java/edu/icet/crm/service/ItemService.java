package edu.icet.crm.service;

import edu.icet.crm.model.Item;

import java.util.List;

public interface ItemService {
    Item persist(Item item);

    List<Item> retrieve();

    Item update(Item item);

    void delete(Item item);

    Item findByItemName(String itemName);
}
