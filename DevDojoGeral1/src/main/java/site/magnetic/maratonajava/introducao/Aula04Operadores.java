package site.magnetic.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSoma = numero1 + numero2;
        int resultadoSubtracao = numero1 - numero2;
        int resultadoMultiplicacao = numero1 * numero2;
        int resultadoDivisao = numero1 / numero2;
        int resultadoResto = numero1 % numero2;

        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
        System.out.println("Resultado do resto: " + resultadoResto);

        //-----------------------------------------------------------

        int resto = 1400 % 2;

        //se houver valor resto em uma divisão por 2, o número é ímpar, caso contrário, é par
        System.out.println("Resto da divisão de 21 por 2: " + resto);

        //-----------------------------------------------------------

        String nome = "Willian";
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade < 30 && salario >= 4612;

        boolean isDentroDaLei = isDentroDaLeiMaiorTrinta && isDentroDaLeiMenorTrinta;
        System.out.println(isDentroDaLei);


        //-------


        //example 2 OR (||)

        double valorTotalContaCorrente = 2000;
        double valorTotalContaPoupanca = 10000;
        int valorPlaystationCinco = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystationCinco || valorTotalContaPoupanca >= valorPlaystationCinco;
        System.out.println("Play5 é comprável? " + isPlaystationCincoCompravel);

        //-----------------------------------------------------------


        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        System.out.println("Bonus: " + bonus); // 2800

        double bonusMinus = 1800;
        bonusMinus -= 1000;
        System.out.println("Bonus: " + bonusMinus); // 800

        double bonusProduto = 1800;
        bonusProduto *= 2;
        System.out.println("Bonus Multiplicado por 2: " + bonusProduto); // 3600

        double bonusDivisao = 1800;
        bonusDivisao /= 1000;
        System.out.println("Bonus Dividido por 2: " + bonusDivisao); // 900

        double bonusResto = 1800;
        bonusResto %= 2;
        System.out.println("Bonus Resto de Divisão por 2: " + bonusResto); // 0


        //-----------------------------------------------------------

        // i Contador

        int contador = 0;
        contador += 1; // contador = contador + 1

        contador++;
        contador--;

        ++contador;
        --contador;

        //pôr o processo atrás faz o processo ser realizado antes de usar a variavel


        //exibição normal do contador
        System.out.println("Contador: " + contador); // mostrou

        //não adiciona mais um ao exibir
        System.out.println("Contador: " + contador++); //adicionou 1, mas mostrou 0

        //adiciona mais um ao exibir
        System.out.println("Contador: " + ++contador); //adicionou 1 e mostrou
    }
}