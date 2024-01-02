package LojaVirtual.controller;

import java.util.ArrayList;
import java.util.List;

public class estoquedoVendedor extends Produtos {

	
		public estoquedoVendedor(String nome, float preco) {
		super(nome, preco);
		
	}

		private List<Produtos> produtos;

        public void estoqueVendedor() {
            this.produtos = new ArrayList<>();
            inicializarProdutos();
        }

        private void inicializarProdutos() {
            produtos.add(new Produtos("Caneta com borracha de Gatinho", 10.00f));
            produtos.add(new Produtos("Caderno da Marie", 20.00f));
            produtos.add(new Produtos("Lápis da Marie", 5.00f));
            produtos.add(new Produtos("Borracha em Formato de Gatinho", 3.00f));
            produtos.add(new Produtos("Papel A4", 15.00f));
            produtos.add(new Produtos("Régua", 8.00f));
            produtos.add(new Produtos("Agenda da Marie", 25.00f));
            produtos.add(new Produtos("Estojo da Marie", 12.00f));
            produtos.add(new Produtos("Tesoura", 9.00f));
            produtos.add(new Produtos("Caneta Marca Texto", 15.00f));
            produtos.add(new Produtos("Caneta hidrocor Fabber Castell", 19.00f));
            produtos.add(new Produtos("Estojo de Canetas Coloridas com Glitter", 50.00f));
            produtos.add(new Produtos("Clips", 7.00f));
            produtos.add(new Produtos("Caderno da Marie", 20.00f));
            produtos.add(new Produtos("Lápis da Hello Kitty", 11.00f));
            produtos.add(new Produtos("Borracha em Formato de Gatinho", 3.00f));
            produtos.add(new Produtos("Papel A3", 14.00f));
            produtos.add(new Produtos("Esquadro", 8.00f));
            produtos.add(new Produtos("Quadro Branco", 95.00f));
            produtos.add(new Produtos("Livros da Coleção Vestibular", 12.00f));
            produtos.add(new Produtos("Poster da Marie", 28.00f));
            produtos.add(new Produtos("Livro Infantil de Gatinho para Colorir", 13.00f));
            produtos.add(new Produtos("Caneta Esteriográfica da Fabber Castell", 6.00f));
            produtos.add(new Produtos("Lapís de Desenho da Bic", 24.00f));
            produtos.add(new Produtos("Caneta com borracha de Gatinho", 12.00f));
            produtos.add(new Produtos("Caderno da Hello Kitty", 22.00f));
            produtos.add(new Produtos("Papel A5", 17.00f));
            produtos.add(new Produtos("Agenda da Hello Kitty", 26.00f));
            produtos.add(new Produtos("Estojo da Hello Kitty", 13.00f));
            produtos.add(new Produtos("Tesoura de Gatinho", 18.00f));
            produtos.add(new Produtos("Lápis da Hello Kitty", 6.00f));
            produtos.add(new Produtos("Borracha em Formato da Hello Kitty", 4.00f));
            produtos.add(new Produtos("Livros da Coleção Matemática Elementar", 55.00f));
            produtos.add(new Produtos("Poster da Hello Kitty", 29.00f));
            produtos.add(new Produtos("Livro Infantil de Hello Kitty para Colorir", 17.00f));
        }

        public List<Produtos> getProdutos() {
            return produtos;
        }
    

	}


