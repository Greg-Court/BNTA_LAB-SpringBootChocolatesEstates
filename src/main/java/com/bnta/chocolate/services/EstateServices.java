package com.bnta.chocolate.services;

@Service
public class EstateServices {

    @Autowired
    EstateRepository estateRepository;

    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

    public Optional<Estate> getEstateById(long id){
        return estateRepository.findById(id);
    }

    public Estate saveEstate(Estate estate){
        estateRepository.save(estate);
        return estate;
    }
}
