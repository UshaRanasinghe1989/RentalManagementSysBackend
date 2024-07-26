package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.model.Rental;
import edu.icet.crm.repository.RentalRepository;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    private final RentalRepository repository;
    private final ObjectMapper mapper;

    @Override
    public Rental persist(Rental rental) {
        Rental rentalObj = Rental.builder()
                .rentalDate(rental.getRentalDate())
                .dueDate(rental.getDueDate())
                .returnedDate(rental.getReturnedDate())
                .totalRentalCost(rental.getTotalRentalCost())
                .fineAmount(rental.getFineAmount())
                .build();

        RentalEntity save = repository.save(mapper.convertValue(rentalObj, RentalEntity.class));
        return mapper.convertValue(save, Rental.class);
    }
}
