package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.model.Customer;
import edu.icet.crm.model.Rental;
import edu.icet.crm.repository.RentalRepository;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Rental> retrieve() {
        Iterable<RentalEntity> all = repository.findAll();
        List<Rental> rentalList = new ArrayList<>();

        for (RentalEntity entity:all){
            rentalList.add(mapper.convertValue(entity, Rental.class));
        }
        return rentalList;
    }

    @Override
    public Rental update(Rental rental) {
        Optional<RentalEntity> byId = repository.findById(rental.getId());
        RentalEntity entity = null;
        if (byId.isPresent()) {
            entity = repository.save(mapper.convertValue(rental, RentalEntity.class));
        }
        return mapper.convertValue(entity, Rental.class);
    }
}
