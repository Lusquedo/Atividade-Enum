import java.util.Scanner;

enum Mes {
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    private final int numero;

    Mes(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public static Mes getMesPorNumero(int numero) {
        for (Mes mes : Mes.values()) {
            if (mes.getNumero() == numero) {
                return mes;
            }
        }
        throw new IllegalArgumentException("Número inválido. Digite um valor entre 1 e 12.");
    }
}

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12: ");
        int numero = scanner.nextInt();

        try {
            Mes mes = Mes.getMesPorNumero(numero);
            System.out.println("Mês correspondente: " + mes);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}