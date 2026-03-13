package site.magnetic.maratonajava.introducao;

public class Aula10EstruturasRepeticao {
    public static void main(String[] args) {

        //While, do while, for, for  each


        //While

        int i = 0;

        while(i<10) {
            i++;
            System.out.println("Número: " + i);
        }



        //do while

        do{
            System.out.println("Este número deve ser 10: " + i++);
            System.out.println("Agora i é 11");
        }while (i < 10);



        //for
        //for (criar variável; define a condição; incremento caso verdadeiro) {acontece a cada verdadeiro}

        for(int a=0 ; a<10; a++){
            System.out.println("for is in: "+ a);
        };

    }
}