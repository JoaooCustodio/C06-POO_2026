public class Memoria_USB
{
    private String nome;
    private int capacidade;

    public Memoria_USB(String nome, int capacidade)
    {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return nome + " - " + capacidade + " Gb";
    }
}