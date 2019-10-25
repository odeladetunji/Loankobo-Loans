package com.FactoryProducers;

public class ProducerFactory {
    public static AbstractFactory getProducer(){
        return new EntityFactory();
    }
}
