//LeggiStampaDati.java
//programma per leggere e stampare dati di tipo diverso (stringhe e numeri)

import java.io.*;

class LeggiStampaDati{
    public static void main(String args[]){
        //Impostazione dello stream di input 
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        //Area dichiarativa 
        String nome, numeroLetto;
        int eta;
        float media;

        //Area esecutiva
        //Lettura di una stringa senza controllo sull'input
        System.out.print("Inserisci il tu nome: ");
        nome = tastiere.readLine();

        //Lettura di un valore intero con controllo sull'input
        System.out.print("Inserisci la tua età: ");
        try{
            numeroLetto=tastiera.readLine();
            eta = Integer.valueOf(numeroLetto).intValue();
        }catch(Exception e){
            System.out.println("L'età deve essere un numero intero");
            return;
        }

        //Lettura di un valore reale con controllo sull'input 
        System.out.print("Inserisci la media dei tuoi voti: ");
        try{
            numeroLetto = tastiera.readLine();
            media = Float.valueOf(numeroLetto).floatValue();
        }catch(Exception e){
            System.ou.println("Inserisci un valore corretto per la media: ");
            return;
        }

        //Stampa dei dati concatenati
        System.ot.println("Nome: " + nome + " Età: " + eta + " Media voti: " + media);

    }
}