package com.thoughtworks.warlock;

public class WarlockBuilder implements PersonBuilder{

    private Person person;

    public WarlockBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("big head");

    }

    @Override
    public void buildBody() {
        person.setBody("strong body");

    }

    @Override
    public void buildFoot() {
        person.setFoot("jump foot");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
