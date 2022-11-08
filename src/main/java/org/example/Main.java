package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Напиши щось цікаве");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(Spain(name));
        System.out.println(Germany(name));
        System.out.println(IsTrue(name));
    }

    public static String Spain (String a) {
        String s = "Hola, yo se tu secreto: " + a;
        return s;
    }

    public static String Germany (String a) {
        String s = "Halo, Ich kenne dein kleines Geheimnis: " + a;
        return s;
    }

    public static String IsTrue (String a) {
        String s = new String();
        int b = (int) Math.random();
        if(b%2==0){
            s = "Wow! I think it`s true!";
        }
        else{
            s = "Nah... Don`t think it's true...";
        }
        return s;
    }

}
