package conta.model;

import java.util.Map;

public class ContaVendedor {
    private int taxaEntrega;
    private int taxaGratis;
    private int estoqueInicial;
    private int estoqueFinal;
    private int estoqueDisponivel;
    private int variedadeProduto;
    private int quantidade;
    private String produto;
    private float preco;
    private float meiosPagamentos;

    public ContaVendedor(String nome, String senha) {
        
    }

    public int getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(int taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public int getTaxaGratis() {
        return taxaGratis;
    }

    public void setTaxaGratis(int taxaGratis) {
        this.taxaGratis = taxaGratis;
    }

    public int getEstoqueInicial() {
        return estoqueInicial;
    }

    public void setEstoqueInicial(int estoqueInicial) {
        this.estoqueInicial = estoqueInicial;
    }

    public int getEstoqueFinal() {
        return estoqueFinal;
    }

    public void setEstoqueFinal(int estoqueFinal) {
        this.estoqueFinal = estoqueFinal;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public int getVariedadeProduto() {
        return variedadeProduto;
    }

    public void setVariedadeProduto(int variedadeProduto) {
        this.variedadeProduto = variedadeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getMeiosPagamentos() {
        return meiosPagamentos;
    }

    public void setMeiosPagamentos(float meiosPagamentos) {
        this.meiosPagamentos = meiosPagamentos;
    }

    public void setMeioPagamento(String meioPagamento) {
   
    }

    public void setEndereco(String endereco) {
    }    

    public Object getNomeUsuario() {
        return null;
    }

    public boolean validarSenha(String senha) {
        
        return false;
    }

    public Object carrinho() {
        return null;
    }

    public float calcularValorTotal() {
        float valorTotal = quantidade * preco + taxaEntrega - taxaGratis;

        if (valorTotal > 200) {
            valorTotal -= calcularDesconto();
        }

        return valorTotal;
    }

    public float calcularDesconto() {
        if (calcularValorTotal() > 200) {
            return 0.1f * calcularValorTotal();
        } else {
            return 0;
        }
    }

    public float calcularDescontoAdicional() {
        if (quantidade > 50) {
            return 0.05f * calcularValorTotal();
        } else {
            return 0;
        }
    }

    public void exibirInformacoesProduto() {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Taxa de entrega: " + taxaEntrega);
        System.out.println("Desconto aplicado: " + calcularDesconto());
        System.out.println("Desconto adicional: " + calcularDescontoAdicional());
        System.out.println("Total a pagar: " + calcularValorTotal());
        System.out.println("Estoque Inicial: " + estoqueInicial);
        System.out.println("Estoque Final: " + estoqueFinal);
        System.out.println("Estoque Disponível: " + estoqueDisponivel);
        System.out.println("Variedade de Produtos: " + variedadeProduto);
    }
}     

	


