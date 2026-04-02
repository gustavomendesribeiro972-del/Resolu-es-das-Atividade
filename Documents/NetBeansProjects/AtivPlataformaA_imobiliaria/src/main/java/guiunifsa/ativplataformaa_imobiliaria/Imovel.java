package guiunifsa.ativplataformaa_imobiliaria;

public class Imovel {
    private String endereco;
    private double valorBase;

    public Imovel(String endereco, double valorBase) {
        this.endereco = endereco;
        this.valorBase = valorBase;
    }

    // Getters e Setters
    public String getEndereco() { return endereco; }
    public double getValorBase() { return valorBase; }
    public void setValorBase(double valorBase) { this.valorBase = valorBase; }

    public void exibirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.printf("Valor Base: R$ %.2f%n", valorBase);
    }
}
