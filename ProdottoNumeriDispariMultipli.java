//Calcolare il prodotto di una serie di numeri dispari e mulipli di 5 finchè il prodotto è minore di 100     
import java.io.*;

public class ProdottoNumeriDispariMultipli{
	
	public static void main(String[] args){
		//Impostiamo lo stream di input
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input); 
		//Area dichiarativa
		int prodotto = 1, num;
		String numeroLetto;
		
		//Area esecutiva
		do{
			System.out.print("Inserire un numero: ");
			try{
				numeroLetto=tastiera.readLine();
				num = Integer.valueOf(numeroLetto).intValue();
			}catch(Exception e){
				System.out.println("E' necessario inserire un numero intero");
				return;
			}
			//Controllo se il numero è dispari e divisibile per 5
			if(num%2 !=0 && num%5==0){
				prodotto = prodotto * num;
			}
		}while(prodotto < 100);
		
		System.out.println("Il prodotto dei numeri dispari e multipli di 5 è: "+ prodotto);
	}
}