public class Hardware_Basico
{
    private String nome;
    private int capacidade;

    public Hardware_Basico(String nome, int capacidade)
    {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString()
    {
        return nome + " - " + capacidade;
    }
}