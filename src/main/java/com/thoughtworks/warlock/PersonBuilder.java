package com.thoughtworks.warlock;

import com.thoughtworks.warlock.Person;

public interface PersonBuilder {
    public void buildHead();
    public void buildBody();
    public void buildFoot();

    public Person buildPerson();
}
