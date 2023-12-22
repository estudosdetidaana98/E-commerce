package conta.repository;

import conta.model.ContaVendedor;

public interface ContaVendedorRepository {
	public void cadastrarVendedor(ContaVendedor contaVendedor);
    ContaVendedor fazerLogin(String nomeUsuario, String senha);
    public void adicionarEndereco(ContaVendedor contaVendedor, String endereco);
    public void confirmarEndereco(ContaVendedor contaVendedor);
    public void escolherMeioPagamento(ContaVendedor contaVendedor, String meioPagamento);
    public void receberPagamentoNoCredito(ContaVendedor contaVendedor);
    public void receberPagamentoNoDebito(ContaVendedor contaVendedor);
    public void receberPagamentoNoPix(ContaVendedor contaVendedor);

}
