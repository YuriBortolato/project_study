package main;

import models.*;

public class ZooApp {
    public static void main(String[] args) {
        Animal leao = new Leao("Simba", 5);
        Animal papagaio = new Papagaio("Louro José", 2);
        Animal tubarao = new Tubarao("Bruce", 7);

        System.out.println("=== ANIMAIS NO ZOOLÓGICO ===");

        leao.exibirInformacoes();
        leao.emitirSom();
        System.out.println();

        papagaio.exibirInformacoes();
        papagaio.emitirSom();
        if (papagaio instanceof AnimalQueVoa) {
            ((AnimalQueVoa) papagaio).voar();
        }
        System.out.println();

        tubarao.exibirInformacoes();
        tubarao.emitirSom();
        ((Peixe) tubarao).nadar();
    }
}