public class Sistema_Operacional
{
    private String nome;
    private int tipo;

    public Sistema_Operacional(String nome, int tipo)
    {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nome + " - " + tipo + " bits";
    }
}