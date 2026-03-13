package site.magnetic.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {


        //if, e operador de negação (!)

        int idade = 10;
        boolean maiorDeIdade = idade >= 18;

        if (maiorDeIdade) {
            System.out.println("PÓ BEBE");
        } else {
            System.out.println("PÓDI NN");
        }

        if (!maiorDeIdade) {
            System.out.println("é maió de idade");
        }

        System.out.println("------------Fim------------");
    }
}