package br.com.magnetic.paranoias.maratonajava.introducao;

public class ArraysMuichoLoucos {
    public static void main(String[] args) {

        int[][] tabela = new int[2][3];

        System.out.println("------------------------------\n");
        System.out.print("-------Tamanho do array is o Index, as LINHAS, ou seja: ");
        System.out.println(tabela.length);
        System.out.print("-------Tamanho do array dentro do Index, as COLUNAS ou seja: ");
        System.out.println(tabela[0].length+"\n");
        System.out.println("------------------------------");

        //linha 1
        tabela[0][0] = 5; //primeira coluna content
        tabela[0][1] = 5; //segunda coluna content
        tabela[0][2] = 5; //terceira coluna content

        //linha 2
        tabela[1][0] = 10; //primeira coluna content
        tabela[1][1] = 10; //segunda coluna content
        tabela[1][2] = 10; //terceira coluna content

        //linha um   exibe: 15
        //linha dois exibe: 30





        //CALCULO MANUAL
        int []respLinhas = new int[tabela.length];
        respLinhas [0] = tabela[0][0] + tabela[0][1] + tabela[0][2];
        respLinhas [1] = tabela[1][0] + tabela[1][1] + tabela[1][2];



        int []respColunas = new int[3]; //única forma de pôr length automatico no segundo array é com laco de repeticao
        respColunas [0] = tabela[0][0] + tabela[1][0];
        respColunas [1] = tabela[0][1] + tabela[1][1];
        respColunas [2] = tabela[0][2] + tabela[1][2];



        System.out.println("------------MANUAL------------");
        System.out.println("------------------------------");
        System.out.printf("total da linha 1: %d \n", respLinhas[0]);
        System.out.printf("total da linha 2: %d \n", respLinhas[1]);
        System.out.println("------------------------------");

        System.out.println("------------MANUAL2-----------");
        System.out.println("------------------------------");
        System.out.printf("total da coluna 1: %d \n", respColunas[0]);
        System.out.printf("total da coluna 2: %d \n", respColunas[1]);
        System.out.printf("total da coluna 3: %d \n", respColunas[2]);
        System.out.println("------------------------------\n\n\n");




        //CALCULO COM REPETICAO AUTOMATICO
        int []respLinhas2 = new int[tabela.length];
        int []respColunas2 = new int[3];

        for(int i = 0;i < tabela.length; i++){
            for(int x = 0; x < tabela[i].length; x++){
                respLinhas2[i] += tabela[i][x];
            }
            for(int i2 = 0;i2 < tabela[i].length;i2++){
                    respColunas2[i2] += tabela[i][i2];
            }
        }

        System.out.println("--------FLUXO REPETICAO-------");
        System.out.println("------------------------------");
        System.out.printf("TOTAL da linha 1: %d\n", respLinhas2[0]);
        System.out.printf("TOTAL da linha 2: %d\n", respLinhas2[1]);
        System.out.println("------------------------------\n");

        System.out.println("------------------------------");
        System.out.println("-------FLUXO REPETICAO2-------");
        System.out.println("------------------------------");
        System.out.printf("TOTAL da coluna 1: %d\n", respColunas2[0]);
        System.out.printf("TOTAL da coluna 2: %d\n", respColunas2[1]);
        System.out.printf("TOTAL da coluna 3: %d\n", respColunas2[2]);
        System.out.println("------------------------------\n");







          //Mostra tudo
//        for(int[] tabelas:tabela){
//            for(int tabelas2:tabelas) {
//                System.out.println(tabelas2);
//            }
//        }


//        arays devem ser lidos assim: tabela[linha][coluna]
//        pois é assim que são os formatos de suas APIs do banco
//        toda linha tem seu próprio array, indexado pela coluna



//fiz na lógica tabela[indice][eixos/dimensões], está errado, era pra ser tabela[linhas][colunas] // Agora está correto
    }
}