enum ClassificacaoProduto {
    BASICO("Produto simples"),
    PADRAO("Produto padrão"),
    PREMIUM("Produto de alto nível");

    private final String descricao;

    ClassificacaoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Classificações de Produto:");
        for (ClassificacaoProduto classificacao : ClassificacaoProduto.values()) {
            System.out.println(classificacao.name() + " - " + classificacao.getDescricao());
        }
    }
}