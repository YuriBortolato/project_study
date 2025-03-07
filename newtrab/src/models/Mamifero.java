package models;

public abstract class Mamifero extends Animal {
    protected boolean temPelos;

    public Mamifero(String nome, int idade, boolean temPelos) {
        super(nome, idade);
        this.temPelos = temPelos;
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando seus filhotes.");
    }
}