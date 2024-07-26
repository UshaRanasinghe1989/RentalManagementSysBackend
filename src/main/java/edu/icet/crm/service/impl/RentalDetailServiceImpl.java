/*package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.RentalDetailEntity;
import edu.icet.crm.model.RentalDetail;
import edu.icet.crm.repository.RentalDetailRepository;
import edu.icet.crm.service.RentalDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalDetailServiceImpl implements RentalDetailService {
    private final RentalDetailRepository repository;
    private final ObjectMapper mapper;

    @Override
    public RentalDetail persist(RentalDetail rentalDetail) {
        RentalDetailEntity save = repository.save(mapper.convertValue(rentalDetail, RentalDetailEntity.class));
        return mapper.convertValue(save, RentalDetail.class);
    }
}*/
