package guiunifsa.ativplataformaa_imobiliaria;

public class AtivPlataformaA_imobiliaria {
    public static void main(String[] args) {
        ImovelNovo imovelModerno = new ImovelNovo("Av. Paulista, 1000", 500000.00, 50000.00);
        ImovelVelho imovelAntigo = new ImovelVelho("Rua das Flores, 123", 300000.00, 20000.00);

        System.out.println("--- Dados do Imóvel Novo ---");
        imovelModerno.exibirDados();

        System.out.println("\n--- Dados do Imóvel Antigo ---");
        imovelAntigo.exibirDados();
    }
}
