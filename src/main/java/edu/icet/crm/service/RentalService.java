package edu.icet.crm.service;

import edu.icet.crm.model.Rental;

import java.util.List;

public interface RentalService {
    Rental persist(Rental rental);

    List<Rental> retrieve();

    Rental update(Rental rental);
}
