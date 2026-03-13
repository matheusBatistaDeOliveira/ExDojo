package site.magnetic.maratonajava.introducao;

public class Aula11EstruturasRepeticao02 {
    public static void main(String[] args) {

        //imprime os primeiros 25 de 50 e pare;

        for(int i=0; i<50;i++){
            if(i>=25){
                break;
            }
            System.out.println(++i);
        }
    }
}