import java.util.Scanner;
/*The user enters a letter from the keyboard; the program must
define in what keyboard layout the letter is entered: Latin, if it
is a Latin letter, or Cyrillic, if it refers to Cyrillic. If a figure is
entered, output “figure”. If the character doesn’t belong to letters
or figures, output “Cannot define”.*/
// Решил двумя способами потому что,в начале не получалось решить через тернальный цикл, потом исправил ошибку и получилось


public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter letter");
        String str  = scan.nextLine();
        char letter = str.charAt(0);
        int code = letter;
        char x = 'A';
       char y = 'a';
       char q = 'А';
       char e = 'а';
       char m = '0';
       boolean bool1 = (code>=(int) x && code<=(int) x + 25) || (code>=(int) y && code<= (int) y+25) ;
       boolean bool2=  (code>=(int) q && code<=(int) q+32) || (code>=(int) e) && (code<=(int) e+32);
       boolean bool3 =  (code>= (int) m && code<=(int) m+9);
       if (bool1) { System.out.println("You entered Latin letter");}
       else if (bool2) { System.out.println("Вы ввели букву из кириллицы");}
       else if (bool3) { System.out.println("You entered digit");}
       else  System.out.println("error");


        String answer = (((code >= (int) x) && (code <= (int) x + 25)) || ((code >= (int) y) && (code <= (int) y + 25))) ?
                "You entered Latin letter" : ((code >= (int) q && code <= (int) q + 32) || (code >= (int) e) && (code <= (int) e + 32)) ?
                "Вы ввели букву из кириллицы" : ((code >= (int) m) && (code <= (int) m + 9)) ?
                "You entered digit " : "Error ";
        System.out.println(answer);






       }
}