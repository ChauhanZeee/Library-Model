package com.geekster.Library.model;

public class LibraryModel {
    private String name;
    private String address;
    private String number;
    private String facilities;
    private int maxStrength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        this.maxStrength = maxStrength;
    }

    public LibraryModel(String name, String address, String number, String facilities, int maxStrength) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.facilities = facilities;
        this.maxStrength = maxStrength;
    }

    @Override
    public String toString() {
        return "LibraryModel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", facilities='" + facilities + '\'' +
                ", maxStrength=" + maxStrength +
                '}';
    }
}
