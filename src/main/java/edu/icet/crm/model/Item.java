package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    private int id;
    private String itemName;
    private Double dailyRent;
    private Double dailyFine;
    private Boolean isAvailable;
}
