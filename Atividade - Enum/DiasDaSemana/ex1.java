import java.util.Scanner;

// Enumeração dos dias da semana
enum DiaSemana {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private final int numero;

    DiaSemana(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    // Método para obter o dia da semana pelo número
    public static DiaSemana getDiaPorNumero(int numero) {
        for (DiaSemana dia : DiaSemana.values()) {
            if (dia.getNumero() == numero) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Número inválido: " + numero);
    }
}

public class ex1 {  // Nome da classe alterado para "ex1"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        try {
            DiaSemana dia = DiaSemana.getDiaPorNumero(numero);
            System.out.println("Dia correspondente: " + dia);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}