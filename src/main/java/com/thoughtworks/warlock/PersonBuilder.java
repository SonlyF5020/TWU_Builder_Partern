package com.thoughtworks.warlock;

public interface PersonBuilder {
    public void buildHead();
    public void buildBody();
    public void buildFoot();

    public Person buildPerson();
}
