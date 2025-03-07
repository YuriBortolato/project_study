package models;

public abstract class Peixe extends Animal {
    protected boolean temEscamas;

    public Peixe(String nome, int idade, boolean temEscamas) {
        super(nome, idade);
        this.temEscamas = temEscamas;
    }

    public void nadar() {
        System.out.println(nome + " está nadando rapidamente.");
    }
}