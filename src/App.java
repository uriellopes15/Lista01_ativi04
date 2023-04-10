import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int nota1, nota2, nota3, nota4, media;

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite sua 1ª nota: ");
        nota1 = teclado.nextInt();
        System.out.println("digite sua 2ª nota: ");
        nota2 = teclado.nextInt();
        System.out.println("digite sua 3ª nota: ");
        nota3 = teclado.nextInt();
        System.out.println("digite sua 4ª nota: ");
        nota4 = teclado.nextInt();
        teclado.close();
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é " + media);
    }
}
