package site.magnetic.maratonajava.introducao;

public class Aula17Arrays04 {

        public static void main(String[]args) {

            //Adição do metodo length e for

            System.out.println(" ");

            System.out.println("---------------------");
            System.out.println("Codigo");
            System.out.println("---------------------");

            System.out.println("Declaracao");
            System.out.println("");
            String[]nomes = {"Goku","Kurosaki","Luffy", "Janta"};//4 caixas exatamente igual a String[]nomes = new String[4]

            System.out.println("---------------------");
            System.out.println("Next");
            System.out.println("---------------------");

            //reatribuição de array
            nomes[0] = "Naruto";
            nomes[1] = "Ichigo";
            nomes[2] = "Zoro";
            nomes[3] = "Almoco";

            for (int i=0;i<nomes.length;i++ ){//length pega o número de arrays da declaração (line 17)
                if(i==1) {//o segundo array(o 1) não chega no sout
                    continue;
                }
                System.out.println(nomes[i]);
            };

            System.out.println(" ");
        }
}