package com.site.magnetic.maratonajava.intermediario.test;

import com.site.magnetic.maratonajava.intermediario.dominio.Estudante;

public class PessoaTest02 {
    public static void main(String[] args) {

        Estudante estudante2 = new Estudante();
        Estudante estudante = new Estudante();

        estudante.nome = "Sanji";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("-----------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
