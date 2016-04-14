package eu.jajugoshy.javadev;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args) {
        XmasTreeCreator creator =  new XmasTreeCreator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj literę: ");
        String text = sc.next();
        System.out.print("Podaj liczbę wierszy: ");
        int count = sc.nextInt();
        System.out.print("Podaj kierunek [left,right,down,default=top]:");
        String side=null;
        side = sc.next();
        if(side.equals("") || side==null) side = "top";
        System.out.println(creator.createXmasTree(text,count,side));
    }

}
