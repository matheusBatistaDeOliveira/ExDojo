package br.com.magnetic.paranoias.maratonajava.introducao;

public class ArraysMuichoLoucos {
    public static void main(String[] args) {

        int[][] compensa = new int[2][3];

        System.out.println("------------------------------");
        System.out.println("");
        System.out.print("-------Tamanho do array is o Index, ou seja: ");
        System.out.println(compensa.length);
        System.out.print("-------Tamanho do array dentro do Index, ou seja: ");
        System.out.println(compensa[0].length);
        System.out.println("");
        System.out.println("------------------------------");

        //x
        compensa[0][0] = 5;
        compensa[0][1] = 5;
        compensa[0][2] = 5;

        //y
        compensa[1][0] = 10;
        compensa[1][1] = 10;
        compensa[1][2] = 10;

        int []resp = new int[compensa.length];
        resp [0] = compensa[0][0] + compensa[0][1] + compensa[0][2];
        resp [1] = compensa[1][0] + compensa[1][1] + compensa[1][2];


        System.out.println("------------MANUAL------------");
        System.out.println("------------------------------");
        System.out.printf("eixo Y, total das colunas: %d", resp[0]);
        System.out.println("");
        System.out.printf("eixo X, total das linhas: %d", resp[1]);
        System.out.println("");
        System.out.println("------------------------------");

        for(int i = 0;i < compensa.length; i++){
            for(int x = 0; x < compensa[i].length; x++){
                resp[i] = compensa[i][x];
            }
        }
        System.out.println("--------FLUXO REPETICAO-------");
        System.out.println("------------------------------");
        System.out.printf("TOTAL de linhas: %d", resp[0]);
        System.out.println("");
        System.out.printf("TOTAL de colunas %d", resp[1]);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");



          //Mostra tudo
//        for(int[] compensas:compensa){
//            for(int compensas2:compensas) {
//                System.out.println(compensas2);
//            }
//        }
    }
}