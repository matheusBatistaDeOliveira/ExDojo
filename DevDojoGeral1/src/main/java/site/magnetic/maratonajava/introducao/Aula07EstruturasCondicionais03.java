package site.magnetic.maratonajava.introducao;

public class Aula07EstruturasCondicionais03 {
    public static void main(String[] args) {

        //Operador Ternário (?)
        //(condição) ? verdadeiro : falso

        float salarioF = 6000.00f;
        String mensagemDoar = "Doei pra caridade";
        String mensagemNaoDoar = "Não vou doar à caridade";


        String resultado = (salarioF > 3000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}