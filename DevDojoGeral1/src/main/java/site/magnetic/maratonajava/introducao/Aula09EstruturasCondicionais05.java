package site.magnetic.maratonajava.introducao;

public class Aula09EstruturasCondicionais05 {
    public static void main(String[] args) {

        //Switch case
        //funciona somente em char, int, byte, short, enum e String


        byte dia = 5;

        switch (dia) {

            case 7:
                System.out.println("Seg");
            case 6:
                System.out.println("Ter");
            case 5:
                System.out.println("Qua");
            case 4:
                System.out.println("Qui");
            case 3:
                System.out.println("Sex");
            case 2:
                System.out.println("Sab");
            case 1:
                System.out.println("Dom");
        }//Ele começa onde o valor é verdadeiro e executa os posteriores


        //example 2 - Switch case com break
        //dessa forma ele só executa o case verdadeiro e para a execução, como um if-else if-else

        byte dia2 = 10;

        switch (dia2) {

            case 7:
                System.out.println("Seg2");
                break;
            case 6:
                System.out.println("Ter2");
                break;
            case 5:
                System.out.println("Qua2");
                break;
            case 4:
                System.out.println("Qui2");
                break;
            case 3:
                System.out.println("Sex2");
                break;
            case 2:
                System.out.println("Sab2");
                break;
            case 1:
                System.out.println("Dom2");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
            //default pode estar em qualquer posição do switch
        }

        char sexo = 'F';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
        }
    }
}