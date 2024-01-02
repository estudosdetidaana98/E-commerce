package conta.repository;

import conta.model.ContaComprador;

public interface ContaCompradorRepository {
	public void cadastrarUsuario(ContaComprador contaComprador);
    ContaComprador fazerLogin(String nomeUsuario, String senha);
    public void adicionarEnderecoEntrega(ContaComprador contaComprador, String endereco);
    public void confirmarEndereco(ContaComprador contaComprador);
    public void escolherMeioPagamento(ContaComprador contaComprador, String meioPagamento);
    public void pagarNoCredito(ContaComprador contaComprador);
    public void pagarNoDebito(ContaComprador contaComprador);
    public void pagarNoPix(ContaComprador contaComprador);
	public void escolherMeioPagamento(ContaComprador comprador);
	void escolherMeioPagamento(ContaComprador contaComprador, float meioPagamento);
	
	

}
