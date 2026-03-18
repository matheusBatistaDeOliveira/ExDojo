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

        int []respLinhas = new int[compensa.length];
        respLinhas [0] = compensa[0][0] + compensa[0][1] + compensa[0][2];
        respLinhas [1] = compensa[1][0] + compensa[1][1] + compensa[1][2];


        System.out.println("------------MANUAL------------");
        System.out.println("------------------------------");
        System.out.printf("eixo Y, total das colunas: %d", respLinhas[0]);
        System.out.println("");
        System.out.printf("eixo X, total das linhas: %d", respLinhas[1]);
        System.out.println("");
        System.out.println("------------------------------");

        for(int i = 0;i < compensa.length; i++){
            for(int x = 0; x < compensa[i].length; x++){
                respLinhas[i] += compensa[i][x];
            }
        }
        System.out.println("--------FLUXO REPETICAO-------");
        System.out.println("------------------------------");
        System.out.printf("TOTAL de linhas: %d", respLinhas[0]);
        System.out.println(""); //fiz na lógica tabela[indice][eixos/dimensões], está errado, era pra ser tabela[linhas][colunas]
        System.out.printf("TOTAL de colunas: %d", respLinhas[1]);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");



          //Mostra tudo
//        for(int[] compensas:compensa){
//            for(int compensas2:compensas) {
//                System.out.println(compensas2);
//            }
//        }


//        arays devem ser lidos assim: tabela[linha][coluna]
//        pois é assim que são os formatos de suas APIs do banco
//        toda linha tem seu próprio array, indexado pela coluna
    }
}