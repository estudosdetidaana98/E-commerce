package conta.repository;

import conta.model.ContaComprador;

public abstract class ContaCompradorRepositoryImpl implements ContaCompradorRepository {

    @Override
    public void cadastrarUsuario(ContaComprador contaComprador) {
        System.out.println("\n\nFique à Vontade: Usuário cadastrado com sucesso!");
    }

    @Override
    public ContaComprador fazerLogin(String nomeUsuario, String senha) {
        return null; 
    }

    @Override
    public void adicionarEnderecoEntrega(ContaComprador contaComprador, String endereco) {
        contaComprador.setEnderecoEntrega(endereco);
        System.out.println("Endereço de entrega adicionado: " + endereco);
    }

    @Override
    public void confirmarEndereco(ContaComprador contaComprador) {
        System.out.println("Endereço confirmado com sucesso!");
    }

    @Override
    public void escolherMeioPagamento(ContaComprador contaComprador, float meioPagamento) {
        contaComprador.setMeiosPagamento(meioPagamento);
        System.out.println("Meio de pagamento escolhido: " + meioPagamento);
    }

    @Override
    public void pagarNoCredito(ContaComprador contaComprador) {
        System.out.println("Pagamento no crédito efetuado com sucesso!");
    }

    @Override
    public void pagarNoDebito(ContaComprador contaComprador) {
        System.out.println("Pagamento no débito efetuado com sucesso!");
    }

    @Override
    public void pagarNoPix(ContaComprador contaComprador) {
        System.out.println("Pagamento via Pix efetuado com sucesso!");
    }
}
