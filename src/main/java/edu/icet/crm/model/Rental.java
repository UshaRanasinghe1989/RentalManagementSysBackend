package edu.icet.crm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rental {
    private int id;
    private Date rentalDate;
    private Date dueDate;
    private Date returnedDate;
    private float totalRentalCost;
    private float fineAmount;
}
