package models;

public class Papagaio extends Ave implements AnimalQueVoa {
    public Papagaio(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: 'Olá, tudo bem?'");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando alto no céu!");
    }
}