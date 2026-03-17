package com.site.magnetic.maratonajava.intermediario.test;

import com.site.magnetic.maratonajava.intermediario.dominio.Estudante;

public class PessoaTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();//CONTINUE

        estudante.nome = "Matheus";
        estudante.sexo = 'M';
        estudante.idade = 21;
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        Estudante estudanteX = estudante;

        System.out.println(estudanteX);
    }
}
