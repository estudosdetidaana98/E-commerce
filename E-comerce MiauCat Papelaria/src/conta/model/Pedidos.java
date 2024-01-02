package conta.model;

import java.util.Map;

public class Pedidos {


        private String nomeProduto;
	    private int quantidadeEstoque;
	    private float preco;
	    private String identificador;
	    private String meioPagamento; 

	   
	    public Pedidos(String nomeProduto, int quantidadeEstoque, float preco, String identificador, String meioPagamento) {
	        this.nomeProduto = nomeProduto;
	        this.quantidadeEstoque = quantidadeEstoque;
	        this.preco = preco;
	        this.identificador = identificador;
	        this.meioPagamento = meioPagamento;
	    }


	    public String getNomeProduto() {
	        return nomeProduto;
	    }

	    public void setNomeProduto(String nomeProduto) {
	        this.nomeProduto = nomeProduto;
	    }

	    public int getQuantidadeEstoque() {
	        return quantidadeEstoque;
	    }

	    public void setQuantidadeEstoque(int quantidadeEstoque) {
	        this.quantidadeEstoque = quantidadeEstoque;
	    }

	    public float getPreco() {
	        return preco;
	    }

	    public void setPreco(float preco) {
	        this.preco = preco;
	    }

	    public String getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(String identificador) {
	        this.identificador = identificador;
	    }

	    public String getMeioPagamento() {
	        return meioPagamento;
	    }

	    public void setMeioPagamento(String meioPagamento) {
	        this.meioPagamento = meioPagamento;
	    }
	


      public void exibirInformacoesPedido() {
      System.out.println("Produto: " + nomeProduto);
      System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
      System.out.println("Preço unitário: " + preco);
      System.out.println("Identificador: " + identificador);
      System.out.println("Meio de Pagamento: " + meioPagamento);
    
    
    }
}