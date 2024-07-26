package edu.icet.crm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rental_detail_entity")
public class RentalDetailEntity {
    @Column(name = "rental_id")
    private int rentalId;
    @Column(name = "item_id")
    private int itemId;
    @Column(name = "total_item_cost")
    private Double totalItemCost;
    private int qty;
}