package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "rental_date")
    private Date rentalDate;
    @Column(name = "due_date")
    private Date dueDate;
    @Column(name = "returned_date")
    private Date returnedDate;
    @Column(name = "total_rental_cost")
    private float totalRentalCost;
    @Column(name = "fine_amount")
    private float fineAmount;
}
