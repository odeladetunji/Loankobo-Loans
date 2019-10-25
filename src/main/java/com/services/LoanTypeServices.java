package com.services;

import com.FactoryProducers.AbstractFactory;
import com.FactoryProducers.ProducerFactory;
import com.config.BeanGenerator;
import com.dao.LoanTypesRepository;
import com.models.LoanTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoanTypeServices implements LoanTypeServicesInterface {

   @Autowired
   LoanTypesRepository loanTypesRepository;

   BeanGenerator beanGenerator;

   @Override
   public List<LoanTypes> getLoanTypes(){

       //using abstract factory partern here!
       AbstractFactory aFactory = ProducerFactory.getProducer();
       LoanTypes aLoanType = aFactory.getLoaType();

       loanTypesRepository.findAll().forEach((x) -> {
            aLoanType.type = x.type;
       });

       List<LoanTypes> result = new ArrayList<>();
       result.add(aLoanType);
       return result;
   }

   @Override
   public String deleteLoanType(LoanTypes payload){
       loanTypesRepository.deleteById(payload.getId());
       return "successfully deleted";
   }

   public String addLoanType(String payload){
       com.entity.LoanTypes aLoanType = beanGenerator.getLoanTypeObj();
       aLoanType.type = payload;
       loanTypesRepository.save(aLoanType);
       return "successfully added";
   }

   public String upDateLoanType(LoanTypes payload){
       Optional<com.entity.LoanTypes> result = loanTypesRepository.findById(payload.Id);
       if (result.isEmpty()) return "wrong request";
       com.entity.LoanTypes aLoanType = result.get();
       aLoanType.type =payload.type;
       loanTypesRepository.save(aLoanType);
       return "successfully updated";
   }

}
