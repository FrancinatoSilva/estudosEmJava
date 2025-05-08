package com.loiane.javabasico.poo.aula24.aula25.exercicios;

public class Lampada {

    String estado = "desligada";

    void ligarLampada() {
        if (estado.equalsIgnoreCase("desligada")) {
            this.estado = "ligada";
        }
    }

    void desligarLampada() {
        if (estado.equalsIgnoreCase("ligada")) {
            this.estado = "desligada";
        }
    }
}
