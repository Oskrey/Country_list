package com.example.countrylist;

public class State {

    public State(String name, String capital, String square, String population, int flagResource) {
        this.name = name;
        this.capital = "Столица: "+ capital;
        this.square = "Площадь: "+square;
        this.population = "Население: "+population+" человек";
        this.flagResource = flagResource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getSquare() {
        return square;
    }

    public String getPopulation() {
        return population;
    }

    public int getFlagResource() {
        return flagResource;
    }

    private String name; // название
    private String capital;  // столица
    private String square;  //площадь
    private String population;  //население
    private int flagResource; // ресурс флага

}