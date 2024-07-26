package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalDetail {
    private int rentalId;
    private int itemId;
    private Double totalItemCost;
    private int qty;
}
