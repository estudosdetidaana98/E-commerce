package conta.model;

import java.util.Map;

public  class ContaComprador  {
	private int taxaEntrega;
    private int taxaGratis;
    private int quantidade;
    private String produto;
    private float preco;
    private float meiosPagamento;
    private String enderecoEntrega;
    private Object carrinho;
	public String nomeUsuário;

    public ContaComprador(int taxaEntrega, int taxaGratis, int quantidade, String produto, float preco, float meiosPagamento) {
        this.taxaEntrega = taxaEntrega;
        this.taxaGratis = taxaGratis;
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = preco;
        this.meiosPagamento = meiosPagamento;
    }

    public ContaComprador(String enderecoEntrega, String nomeUsuario, Object carrinho) {
        this.enderecoEntrega = enderecoEntrega;
        this.nomeUsuário = nomeUsuario;
        this.carrinho = carrinho;
    }

    public ContaComprador(String nome, String senha) {

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

    public Object getMeiosPagamento() {
        return meiosPagamento;
    }

    public void setMeiosPagamento(float meioPagamento) {
        this.meiosPagamento = meioPagamento;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getNomeUsuario() {
        return nomeUsuário;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuário = nomeUsuario;
    }

    public Object getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Object carrinho) {
        this.carrinho = carrinho;
    }

    public boolean validarSenha(String senha) {
       
        return false;
    }

    public float calcularValorTotal() {
        float valorTotal = quantidade * preco + taxaEntrega - taxaGratis;

        if (valorTotal > 200) {
            valorTotal -= 0.1f * valorTotal;
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

    public void exibirInformacoesConta() {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Taxa de entrega: " + taxaEntrega);
        System.out.println("Desconto aplicado: " + calcularDesconto());
        System.out.println("Total a pagar: " + calcularValorTotal());
    }

    public void visualizar() {
        String tipo = "";

        switch (this.quantidade) {
            case 1:
                tipo = "ContaComprador";
                break;
            case 2:
                tipo = "Pedidos";
                break;
        }

        System.out.println("Tipo: " + tipo);
    }
}

