/**
 * Wczytaj od użytkownika dowolną liczbę całkowitą różną od 0.
 * Jeżeli liczba jest większa od 0 wyświetl na ekranie wszystkie liczby z przedziału [0, N],
 * gdzie N jest liczbą podaną przez użytkownika z odstępem co 0.1.
 * Jeśli liczba jest mniejsza od 0 wyświetl liczby od 0 do N (w porządku malejącym).
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float startNumber = 0;
        System.out.println("podaj liczbę całkowitą, różną od zera");
        int userNumber = scan.nextInt();


        if (userNumber == 0){
            System.out.println("miała być różna od zera, czego nie rozumiesz?");  //anti-idiot protection
        }
        else if(userNumber > 0){                            // gdy liczba podana przez użytkownika jest większa od 0.
            while (startNumber <= userNumber){
                System.out.printf("%.1f ", startNumber);
                startNumber += 0.1;
            }
        }
        else if(userNumber < 0){                            // gdy liczba podana przez użytkownika jest mniejsza od 0.
            while (startNumber >= userNumber){
                System.out.printf("%.1f ", startNumber);
                startNumber -= 0.1;
            }
        }
    }
}
