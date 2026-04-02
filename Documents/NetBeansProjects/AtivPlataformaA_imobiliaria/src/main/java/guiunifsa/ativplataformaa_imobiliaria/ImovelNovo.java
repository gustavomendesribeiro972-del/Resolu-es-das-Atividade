package guiunifsa.ativplataformaa_imobiliaria;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(String endereco, double valorBase, double adicional) {
        super(endereco, valorBase); // Chama o construtor da classe pai
        this.adicional = adicional;
    }

    public double getValorComAdicional() {
        return getValorBase() + adicional;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Adicional: R$ %.2f%n", adicional);
        System.out.printf("Valor Final (Novo): R$ %.2f%n", getValorComAdicional());
    }
}
