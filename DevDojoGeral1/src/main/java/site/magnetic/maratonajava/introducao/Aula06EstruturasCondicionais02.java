package site.magnetic.maratonajava.introducao;

public class Aula06EstruturasCondicionais02 {
    public static void main(String[] args) {

        //if, else, else if

        int idade = 10;
        String categoria;

        if (idade > 15) {
            categoria = ("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            categoria = ("Categoria Juvenil");
        } else {
            categoria = ("Categoria Adulto");
        }

        System.out.println("------------Fim-----------");

        System.out.println(categoria);
    }
}