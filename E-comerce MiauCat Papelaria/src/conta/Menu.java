package conta;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import LojaVirtual.controller.Produtos;
import LojaVirtual.controller.Produtos.EstoqueVendedor;
import conta.repository.ContaCompradorRepository;
import conta.repository.ContaCompradorRepositoryImpl;
import conta.repository.ContaVendedorRepository;
import conta.repository.ContaVendedorRepositoryImpl;
import conta.model.ContaComprador;
import conta.model.ContaVendedor;
import conta.model.Pedidos;
import LojaVirtual.LojaVirtual;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		   Scanner leia = new Scanner(System.in);
		   
	       
	  
		   int opcao;
		   
		   while (true) {
			   

				System.out.println(Cores.TEXT_PURPLE +  Cores.ANSI_WHITE_BACKGROUND +
						           "*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                MiauCat Papelaria Virtual            ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 -  Cadastrar Usuário                   ");
				System.out.println("            2 -  Fazer Loguin                        ");
				System.out.println("            3 -  Colocar Endereço de Entrega         ");
				System.out.println("            4 -  Confirmar Endereço                  ");
				System.out.println("            5 -  Agendar Entrega                     ");
				System.out.println("            6 -  Acima de R$ 200,00 Taxa Grátis      ");
				System.out.println("            7 -  Compra Inferior a R$ 200,00         ");
				System.out.println("            8 -  Pagar Taxa de 20,00                 ");
				System.out.println("            9 -  Escolher Produtos do Estoque        ");
				System.out.println("            10 - Verificar Carrinho de Compras       ");
				System.out.println("            11 - Escolher os Meios de Pagamento      ");
				System.out.println("            12 - Pagar no Crédito                    ");
				System.out.println("            13 - Pagar no Dábito                     ");
				System.out.println("            14 - Pagar no Pix                        ");
				System.out.println("            15 - Confirmar Pagamento                 ");
				System.out.println("            16 - Finalizar Compra                    ");
				System.out.println("            17 - Realizar Nova Compra                ");
				System.out.println("            18 - Sair                                ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     "+ Cores.TEXT_RESET);
			   
			   opcao = leia.nextInt();
			   
			   if (opcao == 18) {
					System.out.println(Cores.TEXT_BLUE_BOLD + Cores.ANSI_WHITE_BACKGROUND +"\nMiauCat Papelaria- Temos as melhores soluções para você!");
					sobre();
	                 leia.close();
					System.exit(0);
			   }
					
				int tipo;
				Object menu;
				switch (opcao) {
				         case 1:
				            System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND + "Cadastrar Usuário\n\n");

	                    System.out.println("Digite o seu Nome Completo: ");
	                   leia.nextLine(); 
	                     String nome = leia.nextLine();

	                    System.out.println("Digite o seu email: ");
	                      String email = leia.next();

	                    int tipoEmail;
	                    do {
	            System.out.println("Digite o tipo de email (1 - @gmail.com, 2 - @hotmail.com, 3 - Outlook.com): ");
	            tipoEmail = leia.nextInt();
	        } while (tipoEmail < 1 || tipoEmail > 3);

	   
	        System.out.println("Verifique o código de verificação que chegou no email: ");
	            float codigo = leia.nextFloat();
	               System.out.println("Aceite todos os cookies");
	               System.out.println("1-sim, 2-não");
	                float cookies = leia.nextFloat();
	           
						
						keyPress();
						break;
					case 2:
						System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND +"Fazer Loguin\n\n");
						
						 System.out.println("Digite o seu email cadastrado para efetuar o Login:");
						 String loginEmail = leia.next();			
				        
						
						keyPress();
						break;
					case 3:
						System.out.println(Cores.TEXT_PURPLE_BOLD +Cores.ANSI_WHITE_BACKGROUND + "Colocar Endereço de Entrega\n\n");
				        
						boolean enderecoEncontrado = true;
						if (enderecoEncontrado) {
						    System.out.println("Digite o seu CEP: ");
						    int cep = leia.nextInt();
						    leia.nextLine(); 

						    System.out.println("Digite o Nome da sua Rua: ");
						    String rua = leia.nextLine();

						    System.out.println("Digite o Número da sua Residência: ");
						    int numeroResidencia = leia.nextInt();
						    leia.nextLine(); 

						    System.out.println("Digite o Complemento, caso houver: ");
						    String complemento = leia.nextLine();

						    System.out.println("Digite o Bairro: ");
						    String bairro = leia.nextLine();

						    System.out.println("Digite o nome da sua Cidade: ");
						    String cidade = leia.nextLine();

						    System.out.println("Digite o nome do seu Estado: ");
						    String estado = leia.nextLine();

						    System.out.println("Endereço confirmado com sucesso!");
						} else {
						    System.out.println("Endereço não localizado");
						}
					
				 
						keyPress();
						break;
					case 4:
						System.out.println(Cores.TEXT_PURPLE_BOLD+Cores.ANSI_WHITE_BACKGROUND + "Confirmar Endereço\n\n");
						System.out.println("1-sim, 2-não");
						
						keyPress();
						break;
					
					case 5:
					    System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND +"Agendar Entrega\n\n");


					    System.out.println("Escolha um dos dias úteis da semana (1 - Segunda, 2 - Terça, 3 - Quarta, 4 - Quinta, 5 - Sexta): ");
					    int diaSemana = leia.nextInt();

					    
					    if (diaSemana < 1 || diaSemana > 5) {
					        System.out.println("Dia inválido para entrega. Escolha um dia útil (de segunda a sexta-feira).");
					        keyPress();
					        break;
					    }

					    System.out.println("Digite a data de entrega (no formato DD/MM/AAAA): ");
					    leia.skip("\\R?");
					    String dataEntrega = leia.nextLine();

					    int mes;
					    do {
					        System.out.println("Digite o mês (1 - Janeiro, 2 - Fevereiro, ..., 12 - Dezembro): ");
					        mes = leia.nextInt();
					    } while (mes < 1 || mes > 12);

					    float taxaEntrega = 0;
					    System.out.println("Digite o valor total da compra (R$): ");
					    float valorTotalCompra = leia.nextFloat();

					    
					    if (valorTotalCompra < 200.00f) {
					        taxaEntrega = 20.00f;
					    } else {
					        System.out.println("Digite a taxa de entrega (R$): ");
					        taxaEntrega = leia.nextFloat();
					    }

					
					case 6:
						System.out.println(Cores.TEXT_BLUE_BOLD+Cores.ANSI_WHITE_BACKGROUND + "Acima de R$ 200,00 Taxa Grátis\n\n");
						
						
						keyPress();
						break;
					case 7:
						System.out.println(Cores.TEXT_RED_BOLD+ Cores.ANSI_WHITE_BACKGROUND +"Compra Inferior a R$ 200,00\n\n");
						
						
						keyPress();
						break;
					case 8:
						System.out.println(Cores.TEXT_BLUE_BOLD+ Cores.ANSI_WHITE_BACKGROUND + "Pagar Taxa de 20,00\n\n");
						
						
						keyPress();
						break;
					case 9:
						System.out.println(Cores.TEXT_CYAN_BOLD +Cores.ANSI_WHITE_BACKGROUND + "Escolher Produtos do Estoque\n\n");
						System.out.println("Escolha produtos da loja:\n");
					    String produtos = leia.next();
						     
		
					    keyPress();
						break;
					case 10:
						System.out.println(Cores.TEXT_PURPLE_BOLD +Cores.ANSI_WHITE_BACKGROUND + "Verificar Carrinho de Compras\n\n");

						keyPress();
						break;
					case 11:
						System.out.println(Cores.TEXT_GREEN_BOLD +Cores.ANSI_WHITE_BACKGROUND + "Escolher os Meios de Pagamento\n\n");
						
	
						keyPress();
						break;
					case 12:
						System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND +"Pagar no Crédito\n\n");
						
						 boolean confirmarPagamentoCrédito = true;
						    if (confirmarPagamentoCrédito) {
						        System.out.println("Digite o Número do seu Cartão : ");
						        String numeroCartão = leia.next();

						        System.out.println("Digite a Data de Validade do Cartão(no formato DD/MM): ");
						        String validadeCartãoString = leia.next();

						     
						        String[] partes = validadeCartãoString.split("/");
						        int validadeCartãoDia = Integer.parseInt(partes[0]);
						        int validadeCartãoMes = Integer.parseInt(partes[1]);

						        System.out.println("Digite o Código do Cartão(CVC): ");
						        String codigoCartão = leia.next();

						        System.out.println("Digite o nome que está impresso no Cartão: ");
						        String nomeClienteCartão = leia.next();

						        System.out.println("Confirmar dados do Cartão: ");
						        System.out.println("1-sim, 2-não: ");
						        String confirmardadosCartão = leia.next();

						        System.out.println("Pagamento confirmado com sucesso!");
						    } else {
						        System.out.println("Pagamento não confirmado: Tente novamente!");
						    }

						    keyPress();
						    break;
					case 13:
					     System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND + "Pagar no Dábito\n\n");
					     boolean confirmarPagamentoDébito = true;
					     if (confirmarPagamentoDébito) {
					         System.out.println("Digite o Número do seu Cartão : ");
					         String numeroCartão = leia.next();

					         System.out.println("Digite a Data de Validade do Cartão(no formato DD/MM): ");
					         String validadeCartãoString = leia.next();
					         
					         String[] partes = validadeCartãoString.split("/");
					         int validadeCartãoDia = Integer.parseInt(partes[0]);
					         int validadeCartãoMes = Integer.parseInt(partes[1]);

					         System.out.println("Digite o Código do Cartão(CVC): ");
					         String codigoCartão = leia.next();

					         System.out.println("Digite o nome que está impresso no Cartão: ");
					         String nomeClienteCartão = leia.next();

					         System.out.println("Confirmar dados do Cartão: ");
					         System.out.println("1-sim, 2-não: ");
					         String confirmardadosCartão = leia.next();

					         System.out.println("Pagamento confirmado com sucesso!");
					     } else {
					         System.out.println("Pagamento não confirmado: Tente novamente!");
					     }

					     keyPress();
					     break;
					case 14:
						System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND +"Pagar no Pix\n\n");
						boolean confirmarPagamento = true;
						if (confirmarPagamento) {
					            System.out.println("Digite a sua chave do Pix : ");
					            String numeroCartão = leia.next();

					            System.out.println("Confirmar dados do Pix: ");
					            System.out.println("1-sim, 2-não: ");
					            String confirmardadosPix = leia.next();

					            
					            System.out.println("Pagamento confirmado com sucesso!");
					        } else {
					            System.out.println("Pagamento não confirmado: Tente novamente!");
					        }


						keyPress();
						break;
					case 15:
						System.out.println(Cores.TEXT_BLUE_BOLD+ Cores.ANSI_WHITE_BACKGROUND +"Confirmar Pagamento\n\n");
						System.out.println("1-sim, 2-não");
						
						keyPress();
						break;
					case 16:
						System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_WHITE_BACKGROUND + "Finalizar Compra\n\n");
						System.out.println("1-sim, 2-não: ");
						
						  keyPress();
						break;
					case 17:
						System.out.println(Cores.TEXT_CYAN_BOLD + Cores.ANSI_WHITE_BACKGROUND +"Realizar Nova Compra\n\n");
						System.out.println("1-sim, 2-não: ");
		   
						  keyPress();
						break;
					    default:
						System.out.println(conta.util.Cores.TEXT_RED_BOLD + Cores.ANSI_WHITE_BACKGROUND +"\nOpção Inválida!\n");	
						break;
				
						       
		 		
					    }
					    
					    
				}
		           
				
				}				   
			    
		
	        private static List<Produtos> LojaVirtual() {
		
		return null;
	}


			public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por:   Ana Eliza                      ");
			System.out.println("Generation Brasil - estudo.ti.ana@gmail.com   "             );
			System.out.println("***********************************************************");
			
			
		}

	

      public static void keyPress() {

	try {

		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.out.println("Você pressionou uma tecla diferente de enter!");

	}
      }
		   }
	


