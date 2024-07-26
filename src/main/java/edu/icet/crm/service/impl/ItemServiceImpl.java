package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.model.Item;
import edu.icet.crm.repository.ItemRepository;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository repository;
    private final ObjectMapper mapper;

    @Override
    public Item persist(Item item) {
        ItemEntity savedObj = repository.save(mapper.convertValue(item, ItemEntity.class));
        return mapper.convertValue(savedObj, Item.class);
    }

    @Override
    public List<Item> retrieve() {
        Iterable<ItemEntity> all = repository.findAll();
        List<Item> itemList = new ArrayList<>();

        for (ItemEntity entity:all){
            itemList.add(mapper.convertValue(entity, Item.class));
        }
        return itemList;
    }

    @Override
    public Item update(Item item) {
        Optional<ItemEntity> byId = repository.findById(item.getId());

        ItemEntity entity = null;
        if (byId.isPresent()) {
            entity = repository.save(mapper.convertValue(item, ItemEntity.class));
        }
        return mapper.convertValue(entity, Item.class);
    }

    @Override
    public void delete(Item item) {
        repository.deleteById(item.getId());
    }

    @Override
    public Item findByItemName(String itemName) {
        ItemEntity byItemName = repository.findByItemName(itemName);
        return mapper.convertValue(byItemName, Item.class);
    }
}
