package edu.icet.crm.controller;

import edu.icet.crm.model.Rental;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/rental")
@RequiredArgsConstructor
public class RentalController {
    private final RentalService service;
    @PostMapping()
    Rental persist(@RequestBody Rental rental){
        return service.persist(rental);
    }
}
