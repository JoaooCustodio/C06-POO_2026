public class Computador {
    private String marca;
    private float preco;
    private Hardware_Basico processador;
    private Hardware_Basico memoriaRam;
    private Hardware_Basico hd;
    private Memoria_USB memoriaUsb;
    private Sistema_Operacional sistemaOperacional;

    public Computador(String marca, float preco, Hardware_Basico processador, Hardware_Basico memoriaRam, Hardware_Basico hd, Memoria_USB memoriaUsb, Sistema_Operacional sistemaOperacional)
    {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.hd = hd;
        this.memoriaUsb = memoriaUsb;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getMarca()
    {
        return marca;
    }

    public float getPreco()
    {
        return preco;
    }

    public void mostraPCconfig()
    {
        System.out.println("As informações do seu PC comprado são:");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRam);
        System.out.println("HD: " + hd);
        System.out.println("Memória USB: " + memoriaUsb);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }
}