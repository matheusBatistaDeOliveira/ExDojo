package site.magnetic.maratonajava.introducao;

public class Aula14Arrays01 {

        public static void main(String[]args){

            //váriaveis de referência, objetos, podem ser nulos
            int [] idades = null;
            String nome = null;

            //variáveis primitivas não podem ser nulas, apenas objetos.
            //int idade = null;


            idades = new int[3];

            idades[0] = 21;
            idades[1] = 15;
            idades[2] = 11;



            System.out.println(idades[0]);

        }

}