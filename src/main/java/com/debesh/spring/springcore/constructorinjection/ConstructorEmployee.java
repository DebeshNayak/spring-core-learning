package com.debesh.spring.springcore.constructorinjection;

public class ConstructorEmployee {

    private int id;
    private ConstructorAddress address;

    public ConstructorEmployee(int id, ConstructorAddress address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ConstructorAddress getAddress() {
        return address;
    }

    public void setAddress(ConstructorAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }
}
