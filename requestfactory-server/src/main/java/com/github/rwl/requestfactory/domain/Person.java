package com.github.rwl.requestfactory.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Person {

    public static final Map<Long, Person> employees = new HashMap<Long, Person>();

    private String displayName;

    private Long id;

    private Integer version;

    private Person parent;

    private Address address;

    private Gender gender;

    private List<Person> children = new ArrayList<Person>();

    public Person() {
        id = new Random().nextLong();
        version = 1;
        employees.put(id, this);
    }

    public static Person findPerson(Long id) {
        return employees.get(id);
    }

    public static List<Person> findAllPeople() {
        return new ArrayList<Person>(employees.values());
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
}
