import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número do mês
        System.out.print("Digite o numero do : ");
        int numeroMes = scanner.nextInt();

        // Utiliza a instrução switch para determinar o nome do mês
        String nomeMes;
        switch (numeroMes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                nomeMes = "Mês inválido";
                break;
        }

        // Exibe o nome do mês correspondente ou "Mês inválido"
        System.out.println(nomeMes);

        scanner.close();
    }
}