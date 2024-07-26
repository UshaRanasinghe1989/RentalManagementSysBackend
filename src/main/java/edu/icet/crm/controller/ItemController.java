package edu.icet.crm.controller;

import edu.icet.crm.model.Item;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {
    private final ItemService service;

    @PostMapping()
    Item persist(@RequestBody Item item){
        Item addItem = Item.builder()
                .itemName(item.getItemName())
                .dailyRent(item.getDailyRent())
                .dailyFine(item.getDailyFine())
                .isAvailable(item.getIsAvailable())
                .build();
        return service.persist(addItem);
    }

    @GetMapping()
    List<Item> retrieve(){
        return service.retrieve();
    }

    @PutMapping()
    Item update(@RequestBody Item item){
        return service.update(item);
    }

    @DeleteMapping()
    void delete(@RequestBody Item item){
        service.delete(item);
    }

    @GetMapping("/{itemName}")
    Item findByItemName(@PathVariable String itemName){
        return service.findByItemName(itemName);
    }
}
