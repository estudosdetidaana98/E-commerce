package LojaVirtual;

import LojaVirtual.controller.Produtos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import conta.model.ContaComprador;
import conta.model.ContaVendedor;
import conta.model.Pedidos;


public class LojaVirtual {

    private List<ContaComprador> compradores;
    private List<ContaVendedor> vendedores;
    private Map<String, Pedidos> carrinho;

    public LojaVirtual() {
        this.compradores = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.carrinho = new HashMap<>();
    }

    public void cadastrarComprador(String nome, String senha) {
        ContaComprador novoComprador = new ContaComprador(nome, senha);
        compradores.add(novoComprador);
        System.out.println("Comprador cadastrado com sucesso!");
    }

    public void cadastrarVendedor(String nome, String senha) {
        ContaVendedor novoVendedor = new ContaVendedor(nome, senha);
        vendedores.add(novoVendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
    }

    public void realizarLogin(String nomeUsuario, String senha) throws UsuarioNaoEncontradoException {
        
        for (ContaComprador comprador : compradores) {
            if (comprador.nomeUsuário.equals(nomeUsuario) && comprador.validarSenha(senha)) {
                System.out.println("Login realizado com sucesso como comprador.");
                return;
            }
        }

       
        for (ContaVendedor vendedor : vendedores) {
            if (vendedor.getNomeUsuario().equals(nomeUsuario) && vendedor.validarSenha(senha)) {
                System.out.println("Login realizado com sucesso como vendedor.");
                return;
            }
        }

        throw new UsuarioNaoEncontradoException("Usuário não encontrado.");
    }

    public void adicionarProdutoAoCarrinho(String nomeProduto, int quantidade) {
        
    }

   

    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();
        Scanner scanner = new Scanner(System.in);

        
        try {
            loja.cadastrarComprador("comprador1", "senha1998");
            loja.cadastrarVendedor("vendedor1", "senha1998");
            loja.realizarLogin("comprador1", "senha1998");
            loja.realizarLogin("vendedor1", "senha1998");

            

        } catch (UsuarioNaoEncontradoException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

   class UsuarioNaoEncontradoException extends Exception {
    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }
}

 

