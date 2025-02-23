import java.util.Scanner;

public class DiasDaSemana {
  public static void main(String[] args) {
    // Entrada de dados via terminal.
    Scanner scanner = new Scanner(System.in);
    String encerrarPrograma;
    // Laço de repetição.
    do {

      System.out.println("Para saber o dia da semana, basta digitar um número entre 1 e 7");
      int diaSemana = scanner.nextInt();
      // Estrutura de decisão com Switch case
      switch (diaSemana) {
        case 1:
          System.out.println("Domingo");
          break;
        case 2:
          System.out.println("Segunda-feira");
          break;
        case 3:
          System.out.println("Terça-feira");
          break;
        case 4:
          System.out.println("Quarta-feira");
          break;
        case 5:
          System.out.println("Quinta-feira");
          break;
        case 6:
          System.out.println("Sexta-feira");
          break;
        case 7:
          System.out.println("Sabádo");
          break;
        default:
          System.out.println("Digitar apenas valores entre 1 e 7");
          break;
      }
      System.out.println("Deseja encerrar?? Digite S para encerrar e N para continuar");
      encerrarPrograma = scanner.next();
    } while (!encerrarPrograma.equals("S"));
    // Fim do laço de repetição.
    scanner.close();
    // Encerramento da classe Scanner.
  }
}