package site.magnetic.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos primitivos - tipos númericos com tamanhos diferentes
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        long numeroGrande = 100000000000000L;
        double salarioDouble = 2000.00d;
        float salarioFloat = 2500.000f;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        char caractere = 'M';

        //forçar a conversão de um tipo para outro - ferramenta CAST
        int salarioIntDeValorLong = (int) 100000000000000000L;

        System.out.println("idade " + age + " anos" + "     Sexo: " + caractere);

        //--------------------------------------------


        String nome = "Maria";
        System.out.println("oi, meu nome é " + nome);
    }
}
