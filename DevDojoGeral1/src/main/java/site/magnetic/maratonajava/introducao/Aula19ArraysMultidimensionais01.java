package site.magnetic.maratonajava.introducao;

public class Aula19ArraysMultidimensionais01 {

        public static void main(String[]args) {

            //os 3 são a mesma coisa
            int[]numeros = new int[9];
            int[]numeros2 = {1,2,3,4,5,6,7,8,9};
            int[]numeros3 = new int[]{1,2,3,4,5,6,7,8,9};


//            mesma coisa que a variável de referência
//            for(int i = 0; i < numeros2.length; i++){
//                System.out.println(numeros2[i]);
//            };

            //variável de refeência(mesma coisa que o de cima)
            for(int i2:numeros3){
                System.out.println(i2);
            }
        }
}