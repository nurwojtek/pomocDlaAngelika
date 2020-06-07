package com.company;

public class Kolo extends Figury{
    private Double pole;
    private Double promien;

    public Kolo() {
    }

    public Kolo(String nazwa, Double promien) {
        this.nazwa = nazwa;
        this.promien = promien;
        obliczPole();  // wyłaczyc dla wersji 2
    }

    public Double getPole() {
        return pole;
    }


    public Double getPromien() {
        return promien;
    }

    public void setPromien(Double promien) {
        this.promien = promien;
        obliczPole();  // wyłaczyc dla wersji 2
    }

    @Override
    public void obliczPole() {
        pole = Math.PI*promien*promien;
    }
}
