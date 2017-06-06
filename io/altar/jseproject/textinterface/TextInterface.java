package io.altar.jseproject.textinterface;

package io.altar.jseproject.repositories.ProductRepositoty;
package io.altar.jseproject.repositories.ShelfRepositoty;

//import java.util.ArrayList;
//import java.util.Map;
import java.util.Scanner;

public class TextInterface {
	
	public static void main(String[] args){
		
		welcome();
	}
	
	public static int getInput(int min, int max){
			
			Scanner s = new Scanner(System.in);
			int input = 0;
			
			while(true){ //so termina qdo return
				if(s.hasNextInt()){
					input = s.nextInt();
					if(input >= min && input <= max){
						s.close();
						return input;
					}
					else{
						System.out.println("Por favor introduza um numero entre " + min + " e " + max);
						s.nextInt();
					}
				}
				else{
					System.out.println("Por favor introduza um caracter numerico.");
					s.nextInt();
				}
				}
			}
								
		
			/*while( !s.hasNextInt() ){ //enquanto nao tiver numero inteiro
				System.out.println("Por favor introduza um caracter numerico.");
				s.next(); //pedir uma nova insercao
				}
				input = s.nextInt(); //recolher o input valido
				s.close();
				return input;
			}*/
	
		
		public static void welcome(){  //screen 1
				
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1.Listar produtos");
		System.out.println("2.Listar prateleiras");
		System.out.println("3.Sair");
				
		int input = getInput(1,3);
		
		System.out.println("Escolheu a opcao " + input + ".");
		
		switch (input) {
		
			case 1: 
				getProductListId();
				break;
			case 2: 
				getShelvesList();
				break;
			case 3: 
				welcome();
				break;
			default: 
				System.out.println("Por favor introduza um numero entre " + 1 + " e " + 3);
				s.nextInt();
		}
		
		}	
		
		public static void getProductListId(){   //screen 1.1
							

			System.out.println("Lista de produtos:";
			//ProductRepository.getInstance();
			
			//System.out.println("Lista de produtos: " + productId.toString());

			/*for(Map.Entry<Integer, Product> entry:map.entrySet()){
				Product p = entry.getValue();
				System.out.println("Lista de produtos: " + p.productId);
			}*/
			
			
			
			
			
			
			
			//novas opcoes:
			
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar novo produto");
			System.out.println("2.Editar um produto existente");
			System.out.println("3.Consultar o detalhe de um produto");
			System.out.println("4.Remover um produto");
			System.out.println("5.Voltar ao ecrã anterior");
			
			int input = getInput(1,5);
			
			System.out.println("Escolheu a opcao" + input + ".");//
			
			switch (input) {
			
			case 1: 
				getNewProduct();
				break;
			case 2: 
				getEditProduct();
				break;
			case 3: 
				getViewProductDetails();
				break;
			case 4: 
				getRemoveProduct();
				break;
			case 5: 
				welcome();
				break;
			default: 
			  	System.out.println("Por favor introduza um numero entre " + 1 + " e " + 5);
			  	s.nextInt();
			}
					
		}	
		
		
		
		public static void getShelvesList(){   //screen 1.2
			
			System.out.println("Lista de prateleiras"); 
			
			/*ArrayList<Integer> shelfId = new ArrayList<>();
			
			shelfId.add(1);
			shelfId.add(2);
			shelfId.add(3);
			
			System.out.println("Lista de prateleiras: " + shelfId.toString());*/
			
			//productId, int productVal, double productIVA, double productPVP
			
			
		
			
			
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1.Criar nova lista");
			System.out.println("2.Editar uma prateleira existente");
			System.out.println("3.Consultar o detalhe de uma prateleira");
			System.out.println("4.Remover uma prateleira");
			System.out.println("5.Voltar ao ecrã anterior");
			
			//int input = getInput(1,5);
			
			//System.out.println("Escolheu a opcao" + input + ".");//
					
			/*switch (input) {
			
			case 1: 
				getNewShelf();
				break;
			case 2: 
				getEditshelf();
				break;
			case 3: 
				getViewShelfDetails();
				break;
			case 4: 
				getRemoveShelf();
				break;
			case 5: 
				getBack();
				break;
			default: 
				System.out.println("Por favor introduza um numero entre" + 1 + "e" + 5);
			 	s.nextInt();
			}*/
							
			}	
		
		public static void getNewProduct(){  //screen 1.1.1
			
			int inputproductVal;
			double inputproductIVA;
			double inputproductPVP;
						
			System.out.println("Por favor insira os dados do novo produto.");
			
			ArrayList<Integer> productVal = new ArrayList<>();
			ArrayList<Double> productIVA = new ArrayList<>();
			ArrayList<Double> productPVP = new ArrayList<>();			
			
			
			//Val
			Scanner s1 = new Scanner(System.in);
			System.out.println("Valor unitario de desconto:");
			
			inputproductVal = s1.nextInt();
			System.out.println("Valor unitario de desconto: " + inputproductVal);		
			productVal.add(inputproductVal); //add to array
			s1.close();
					
			//IVA
			Scanner s2 = new Scanner(System.in);
			System.out.println("IVA:");
			
			inputproductIVA = s2.nextDouble();
			System.out.println("IVA: " + inputproductIVA);
			productIVA.add(inputproductIVA); //add to array
			s2.close();
			
			//PVP
			Scanner s3 = new Scanner(System.in);
			System.out.println("PVP:");
			
			inputproductPVP = s3.nextDouble();
			System.out.println("PVP: " + inputproductPVP);
			productPVP.add(inputproductPVP); //add to array
			s3.close();
								
		}
		
		/*public static void getViewProductDetails(){
			return productId; //array?
			
			System.out.println("");
			product[index]
		}*/
		
		public static void getEditProduct(){
			
		}
		
		
		public static void getViewProductDetails(){
			
		}
		
		
		public static void getRemoveProduct(){
			// scan o iput do user - index
			// products = ArrayList.remove(product, index);
			// system.out.printIn("nova lista de produtos" + ArrayList.toString(products))
		}
		
		
		
		
}	
		
		
		
	
	


