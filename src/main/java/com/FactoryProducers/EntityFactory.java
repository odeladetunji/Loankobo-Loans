package com.FactoryProducers;

import com.models.LoanTypes;

public class EntityFactory extends AbstractFactory {
    @Override
    public LoanTypes getLoaType(){
        return new LoanTypes();
    }
}
