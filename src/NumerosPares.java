import java.util.Scanner;

public class NumerosPares {

    //Leia cinco pares de valores (a,b) todos inteiros e positivos, um
    //de cada vez. Mostre os números inteiros pares de a até b (inclusive).
    public static void main(String[] args) {

        // Número inicial
        int a;
        // Número final
        int b;
        // Configurar Scanner para leitura dos dados
        Scanner scanner = new Scanner(System.in);

        //Leitura dos 5 pares de números
        for(int i=0;i<5;i++) {
            // Solicitar leitura do primeiro número
            System.out.println("Digite o " + (i+1) + "o. par de números: ");
            System.out.println("Número 1: ");
            // Leitura do primeiro número
            a=scanner.nextInt();
            // Limpeza do buffer ([ENTER] do último nextInt)
            scanner.nextLine();
            // Solicitar leitura do segundo número
            System.out.println("Número 2: ");
            // Leitura do primeiro número
            b=scanner.nextInt();
            // Limpeza do buffer ([ENTER] do último nextInt)
            scanner.nextLine();

            // Imprimindo os número pares entre [a] e [b]
            System.out.println("Número pares entre " + a + " e " + b + ":");
            for(int j=a;j<=b;j++) {
                if(j % 2 == 0) {
                    System.out.println(" " + j + " ");
                }
            }
        }
    }
}
