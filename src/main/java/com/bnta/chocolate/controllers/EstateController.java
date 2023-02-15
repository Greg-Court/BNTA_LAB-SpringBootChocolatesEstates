package com.bnta.chocolate.controllers;

@RestController
@RequestMapping(value = "/estates")
public class EstateController {

    @Autowired
    EstateServices estateServices;

    @GetMapping
    public ResponseEntity<List<Estate>> getAllEstates(){
        List<Estate> estates = estateServices.getAllEstates();
        return new ResponseEntity<>(estates, HttpStatus.OK);
    }


}
