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

        final double finalResult = Math.floor(peso/ (altura * altura));
        printar("O seu Índice de Massa Corporal é: " + finalResult);
        checagemDeSaude(finalResult);
    }

    public static void main(String[] args) {
        new Main();
    }

    private void printar(String msg) {
        System.out.println(PREFIXO + RGBANSI(255, 255, 255) + msg);
    }

    private void checagemDeSaude(double resultado) {
        final String[] prev = {"Magreza", "Normal", "Sobrepeso", "Obesidade Grau I", "Obesidade Grau II", "Obesidade Grau III"};
        final double[] pos = {18.5, 24.9, 29.9, 34.0, 39.9};

        String result = null;
        for (int i = 0; i <= pos.length; i++) {
            if (pos[i] > resultado) {
                result = prev[i];
                break;
            }
        }

        printar("-------------------------------------------------");
        printar("A conclusão do seu IMC estará listada abaixo: ");
        printar("Pedimos que considere o valor estar arredondado.");
        printar("");
        printar("Resultado do IMC: " + result);
        printar("Esperamos que esteja bem!");
        printar("-------------------------------------------------");
    }

    private String RGBANSI(int R, int G, int B) {
        return "\u001B[38;2;" + R + ";" + G + ";" + B + "m";
    }
}
