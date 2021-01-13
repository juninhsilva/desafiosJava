import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        String notas[] = {"A", "B", "C", "D", "E"};
        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        String conceito = "";
        do{
            nota = scanner.nextInt();
        }while(nota <0 ||nota>100);
        if(nota==0){
            conceito = notas[4];
        }else if(nota >=1 && nota <=35){
            conceito = notas[3];
        }
        else if (nota >= 36 && nota <= 60) {
            conceito = notas[2];
        }
        else if (nota >= 61 && nota <= 85) {
            conceito = notas[1];
        }
        else if (nota >= 86 && nota <= 100) {
            conceito = notas[0];
        }
        
        System.out.println(conceito);
        
    }
}
