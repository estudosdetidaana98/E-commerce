package conta.repository;

import conta.model.ContaVendedor;

public abstract class ContaVendedorRepositoryImpl implements ContaVendedorRepository {

	@Override
	public void cadastrarVendedor(ContaVendedor contaVendedor) {
		System.out.println("\n\nVendedor cadastrado com sucesso!");
		
		
	}

	@Override
	public ContaVendedor fazerLogin(String nomeUsuario, String senha) {
		
		return null;
	}

	@Override
	public void adicionarEndereco(ContaVendedor contaVendedor, String endereco) {
		contaVendedor.setEndereco(endereco);
        System.out.println("Endereço adicionado: " + endereco);
		
		
	}

	@Override
	public void confirmarEndereco(ContaVendedor contaVendedor) {
	      System.out.println("Endereço para enviar o pedido confirmado com sucesso!");
		
	}

	@Override
	public void escolherMeioPagamento(ContaVendedor contaVendedor, String meioPagamento) {
		 contaVendedor.setMeioPagamento(meioPagamento);
	        System.out.println("Meio de pagamento escolhido: " + meioPagamento);
	    }
		
		
	                 

	@Override
	public void receberPagamentoNoCredito(ContaVendedor contaVendedor) {
		System.out.println("Pagamento no crédito recebido com sucesso!");
		
		
	}

	@Override
	public void receberPagamentoNoDebito(ContaVendedor contaVendedor) {
		 System.out.println("Pagamento no débito recebido com sucesso!");
		
		
	}

	@Override
	public void receberPagamentoNoPix(ContaVendedor contaVendedor) {
		 System.out.println("Pagamento via Pix recebido com sucesso!");
		
		
	}

}
