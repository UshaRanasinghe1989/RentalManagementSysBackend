package edu.icet.crm.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
    private int id;
    private String customerName;
    private String city;
    private String contactNo;
}
