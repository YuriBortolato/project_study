package models;

public class Tubarao extends Peixe {
    public Tubarao(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " não emite sons audíveis.");
    }
}