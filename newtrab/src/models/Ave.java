package models;

public abstract class Ave extends Animal {
    protected boolean podeVoar;

    public Ave(String nome, int idade, boolean podeVoar) {
        super(nome, idade);
        this.podeVoar = podeVoar;
    }
}
