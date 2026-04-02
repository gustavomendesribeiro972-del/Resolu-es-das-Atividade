package guiunifsa.ativplataformaa_imobiliaria;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(String endereco, double valorBase, double desconto) {
        super(endereco, valorBase);
        this.desconto = desconto;
    }

    public double getValorComDesconto() {
        return getValorBase() - desconto;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Desconto por desgaste: R$ %.2f%n", desconto);
        System.out.printf("Valor Final (Usado): R$ %.2f%n", getValorComDesconto());
    }
}
