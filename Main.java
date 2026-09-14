import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {

        Scanner entrada = new Scanner(System.in);

        int mat = 764;

        //Promoção 1
        Hardware_Basico processador1 =  new Hardware_Basico("Core i5", 2200);
        Hardware_Basico memoria1 = new Hardware_Basico("Memória RAM", 8);
        Hardware_Basico hd1 = new Hardware_Basico("HD", 500);

        Memoria_USB usb1 = new Memoria_USB("Pen-drive", 16);

        Sistema_Operacional so1 = new Sistema_Operacional("macOS Sequoia", 64);

        Computador pc1 = new Computador("Apple", mat, processador1, memoria1, hd1, usb1, so1);

        //Promoção 2
        Hardware_Basico processador2 = new Hardware_Basico("Core i7", 3370);
        Hardware_Basico memoria2 = new Hardware_Basico("Memória RAM", 16);
        Hardware_Basico hd2 = new Hardware_Basico("HD", 1000);

        Memoria_USB usb2 = new Memoria_USB("Pen-drive", 32);

        Sistema_Operacional so2 = new Sistema_Operacional("Windows 8", 64);

        Computador pc2 = new Computador("Samsung", mat + 1, processador2, memoria2, hd2, usb2, so2);

        //Promoção 3
        Hardware_Basico processador3 = new Hardware_Basico("Core i7", 4500);
        Hardware_Basico memoria3 = new Hardware_Basico("Memória RAM", 32);
        Hardware_Basico hd3 = new Hardware_Basico("HD", 2000);

        Memoria_USB usb3 = new Memoria_USB("HD Externo", 1000);

        Sistema_Operacional so3 = new Sistema_Operacional("Windows 10", 64);

        Computador pc3 = new Computador("Dell", mat + 2, processador3, memoria3, hd3, usb3, so3);

        //Vetor para armazenamento dos computadores
        Computador[] computadores = new Computador[10];

        int quantidade = 0;
        int x;

        System.out.println("PROMOÇÕES DO DIA");
        System.out.println("-----------------------------");
        System.out.println("Promoção 1: Apple");
        System.out.println("Preço: R$ " + mat);
        System.out.println("-----------------------------");
        System.out.println("Promoção 2: Samsung");
        System.out.println("Preço: R$ " + (mat + 1));
        System.out.println("-----------------------------");
        System.out.println("Promoção 3: Dell");
        System.out.println("Preço: R$ " + (mat + 2));
        System.out.println("-----------------------------");

        System.out.println("Digite qualquer valor (positivo) para iniciar a compra:");
        x = entrada.nextInt();

        while (x != 0)
        {
            System.out.println("Digite a promoção desejada:");
            System.out.println("1 - Apple");
            System.out.println("2 - Samsung");
            System.out.println("3 - Dell");
            System.out.println("0 - Finalizar compra");

            x = entrada.nextInt();

            if (x == 1)
            {
                computadores[quantidade] = pc1;
                quantidade++;
                System.out.println("Apple adicionada ao pedido!");
            }
            else if (x == 2) 
            {
                computadores[quantidade] = pc2;
                quantidade++;
                System.out.println("Samsung adicionada ao pedido!");
            }
            else if (x == 3) 
            {
                computadores[quantidade] = pc3;
                quantidade++;
                System.out.println("Dell adicionada ao pedido!");
            }
            else if (x != 0)
            {
                System.out.println("Opção inválida!");
            }
        }


        //Cliente
        Cliente cliente1 = new Cliente("João", "000.000.000-00", computadores);


        //Mostrando o pedido
        System.out.println("\n========== PEDIDO ==========");

        for (int i = 0; i < quantidade; i++) 
        {
            computadores[i].mostraPCconfig();
            System.out.println("-----------------------------");
        }

        System.out.println("Total da compra: R$ " + cliente1.calculaTotal());

        //Envia o pedido
        Processar_Pedido.enviarPedido(computadores);

        System.out.println("Obrigado por comprar conosco! Volte sempre!");

        entrada.close();
    }
}
