package site.magnetic.maratonajava.introducao;

public class Aula12EstruturasRepeticao03 {
    public static void main(String[] args) {

        //exercício: Uma pessoa quer parcelar uma compra de R$35000,00.
        // Ela quer pagar no máximo R$1000,00 por parcela. Qual é o número máximo de parcelas que ela pode fazer?

        int parcela, valor, i;
        valor = 35000;
        i = 0;

        while (++i * valor / i <= valor) {
            if (valor / i < 1000) {
                break;
            }
            System.out.println("Parcelar por: " + i + " com valor de R$" + valor / i);
            System.out.println(i);
        }
    }
}