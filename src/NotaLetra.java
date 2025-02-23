import java.util.Scanner;

public class NotaLetra {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Inicialização do Scanner;
    String encerrarPrograma;

    do {
      System.out.println("Escolha um número entre 0 até 100 e descubra qual letra ele representa");
      int letraNumero = scanner.nextInt(); // Leitura do número dentro do loop;

      switch (letraNumero / 10) {
        case 0: // 0 a 9;
        case 1: // 10 a 19;
        case 2: // 20 a 29;
        case 3: // 30 a 39;
        case 4: // 40 a 49;
        case 5: // 50 a 59;
          System.out.println("E");
          break;
        case 6: // 60 a 69;
          System.out.println("D");
          break;
        case 7: // 70 a 79;
          System.out.println("C");
          break;
        case 8: // 80 a 89;
          System.out.println("B");
          break;
        case 9: // 90 a 99;
          System.out.println("A");
          break;
        default:
          System.out.println("Número digitado é invalido!");
          break;
      }
      System.out.println("Deseja encerrar o programa?? Digite S para encerrar e N para continuar");
      encerrarPrograma = scanner.next(); // Atribuição de valor para variável encerrarPrograma;
    } while (!encerrarPrograma.equals("S")); // Validação da condição para encerrar o programa;

    scanner.close(); // Encerramento da Classe Scanner;
  }
}
