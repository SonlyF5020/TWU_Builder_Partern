package com.thoughtworks.warlock;

public class Director {

    public Person constructWarlock(PersonBuilder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();
        return builder.buildPerson();
    }
}
