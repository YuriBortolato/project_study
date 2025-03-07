package models;

public class Leao extends Mamifero {
    public Leao(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " ruge: Rooooar!");
    }
}