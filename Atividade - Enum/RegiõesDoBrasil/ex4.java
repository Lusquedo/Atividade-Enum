import java.util.Scanner;

enum RegiaoBrasil {
    NORTE("Norte - A Maior em extensão territorial"),
    NORDESTE("Nordeste - A Mais cultural"),
    CENTRO_OESTE("Centro-Oeste - A Mais central"),
    SUDESTE("Sudeste - A Mais populosa"),
    SUL("Sul - A Mais fria");

    private final String descricao;

    RegiaoBrasil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static RegiaoBrasil getPorOrdinal(int ordinal) {
        if (ordinal < 0 || ordinal >= values().length) {
            throw new IllegalArgumentException("Número inválido! Digite entre 0 e " + (values().length - 1));
        }
        return values()[ordinal];
    }
}

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Regiões do Brasil:");
        for (RegiaoBrasil regiao : RegiaoBrasil.values()) {
            System.out.println(regiao.ordinal() + " - " + regiao.getDescricao());
        }

        System.out.print("\nDigite o número da região: ");
        int escolha = scanner.nextInt();

        try {
            RegiaoBrasil regiao = RegiaoBrasil.getPorOrdinal(escolha);
            System.out.println("\nVocê selecionou: " + regiao.getDescricao());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}