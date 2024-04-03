package com.etiyacrm.customerservice.services.rules;

import com.etiyacrm.customerservice.core.crossCusttingConcerns.exceptions.types.BusinessException;
import com.etiyacrm.customerservice.entities.City;
import com.etiyacrm.customerservice.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityBusinessRules {
   private CityRepository cityRepository;

   public void  CityNameCanNotBeDuplicatedWhenInserted(String name){
       Optional<City> city = cityRepository.findByNameIgnoreCase(name);

       if(city.isPresent()){
           throw new BusinessException("");
       }
   }
}
