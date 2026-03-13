package br.com.magnetic.paranoias.maratonajava.introducao;

import java.util.Scanner;

public class SwitchCasecContinueMetodos {

    public static void main(String[] args) {

        Scanner show = new Scanner(System.in);


        while (true) {
            String mgs = "";
            double pagamento, valor, troco;
            boolean trocoNegativo = false;
            System.out.println("--------------------------------------------");
            System.out.println("Maça - R$3,00");
            System.out.println("Banana - R$2,00");
            System.out.println("uva - R$4,00");
            System.out.println("--------------------------------------------");
            System.out.println("Qual fruta deseja comprar?");
            String ok = show.next();

            switch (ok.toLowerCase()) {
                case "maça", "maca":
                    System.out.println("R$3,00");
                    valor = 3.00;
                    break;
                case "banana", "Banana", "BANANA":
                    System.out.println("R$2,00");
                    valor = 2.00;
                    break;
                case "uva":
                    System.out.println("R$4,00");
                    valor = 4.00;
                    break;
                default:
                    System.out.println("Inválido! Digite 'exit' para reiniciar: ");
                    show.next();
                case "exit":
                    continue;
            }

            System.out.println("--------------------------------------------");
            System.out.println("Digite a forma de pagamento: ");
            System.out.println("Cartão, Dinheiro ou Pix");

            switch (show.next().toLowerCase()) {
                case "cartao", "cartão":
                    break;
                case "dinheiro":
                    break;
                case "pix":
                    break;
                default:
                    System.out.print("Forma de pagamento inválida! Digite 'exit' para reiniciar: ");
                    show.next();
                case "exit":
                    continue;
            }


            //transforme em metodo
            System.out.println("--------------------------------------------");
            System.out.println("TOTAL: R$" + valor);
            System.out.println("--------------------------------------------");
            System.out.print("Qual o valor do pagamento?: ");
            pagamento = show.nextDouble();
            troco = pagamento - valor;
            System.out.println("--------------------------------------------");


            //transforme em metodo
            if (troco > 0) {
                System.out.println("Aqui está seu troco: R$" + troco);
                show.nextLine();
                System.out.println("--------------------------------------------");
                System.out.println("Pressione ENTER to continue...");
                show.nextLine();
                System.out.println("--------------------------------------------");
            } else if (troco < 0) {
                System.out.println("Restam R$" + Math.abs(troco));
                System.out.println("---------------------------");
                System.out.println("1 - Pagar o restante");
                System.out.println("2 - Mudar a forma de pagamento");
                System.out.println("0 - Reiniciar");

                switch (show.nextInt()) {
                    case 0:
                        continue;
                    case 1:
                        System.out.println("Digite o valor restante recebido: ");
                        pagamento = show.nextDouble();
                        troco = pagamento - troco;
                        //volta pro if else como metodo
                        break;
                    case 2:
                        trocoNegativo = true;
                        //volta pra forma de pagamento como metodo que chama o outro metodo if else
                        break;
                    default:
                        System.out.println("Opção inválida! Digite '0' para reiniciar: ");
                        show.next();
                }
            }


            switch (mgs) {
                case "":
                    System.out.println("Sistema Processando Pagamento...");
                case "0":
                    System.out.println("Pagamento Processado com Sucesso!");
                    break;
                case "error":
                    System.out.println("Erro no pagamento! Tente novamente.");
                    continue;
            }

            System.out.println("--------------------------------------------");
            System.out.println("Obrigado pela compra!");
            show.nextLine();
            show.nextLine();
        }
    }
}
