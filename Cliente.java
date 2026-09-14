public class Cliente
{
    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf, Computador[] computadores)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = computadores;
    }

    public float calculaTotal()
    {
        float total = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }

        return total;
    }
}