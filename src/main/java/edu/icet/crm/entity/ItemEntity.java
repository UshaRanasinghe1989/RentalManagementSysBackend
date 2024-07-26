package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String itemName;
    @Column(name = "daily_rent")
    private Double dailyRent;
    @Column(name = "daily_fine")
    private Double dailyFine;
    @Column(name = "is_available")
    private Boolean isAvailable;
}
