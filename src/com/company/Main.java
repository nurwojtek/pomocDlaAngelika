package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Kolo kolo1 = new Kolo();  // z wykorzystaniem konstruktora bezparametrowego
        kolo1.nazwa = "kolo1";
        kolo1.setPromien(2.1);
//        kolo1.obliczPole();  // dla wersji 2
        Kolo kolo2 = new Kolo("Kolo2", 4.5);
//        kolo2.obliczPole(); // dla wersji 2


        // jeśli masz kumasz listy
        List<Kolo> listaFigur = new ArrayList();
        listaFigur.add(kolo1);
        listaFigur.add(kolo2);

        for (int i = 0; i < listaFigur.size() ; i++) {
            System.out.println(listaFigur.get(i).nazwa + " – pole powierzchni: " + listaFigur.get(i).getPole());
        }

        // gdy nie kumasz list
        System.out.println("\nw wersji bez list\n");
        System.out.println(kolo1.nazwa + " – pole powierzchni: " + kolo1.getPole());
        System.out.println(kolo2.nazwa + " – pole powierzchni: " + kolo2.getPole());

    }
}
