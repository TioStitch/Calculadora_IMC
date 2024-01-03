import java.util.Scanner;

public final class Main {

    private final String PREFIXO = RGBANSI(200, 150, 100) + "[IMC] ";

    private Main() {
        Scanner sc = new Scanner(System.in);

        printar("Olá, insira o seu peso em quilogramas: ");
        final double peso = sc.nextDouble();

        printar("O peso registrado é: " + peso);

        printar("Agora insira a sua altura: ");
        final double altura = sc.nextDouble();

        printar("A sua altura registrada é: " + altura);;
        printar("O seu Índice de Massa Corporal é: " + Math.floor(Math.pow(peso/altura, 2)));
    }

    public static void main(String[] args) {
        new Main();
    }

    private void printar(String msg) {
        System.out.println(PREFIXO + RGBANSI(255, 255, 255) + msg);
    }

    private String RGBANSI(int R, int G, int B) {
        return "\u001B[38;2;" + R + ";" + G + ";" + B + "m";
    }
}
