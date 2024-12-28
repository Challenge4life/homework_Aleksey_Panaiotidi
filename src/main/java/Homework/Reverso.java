package Homework;
public class Reverso {
public static void main(String[] args) {
    String string = "I love Java";
    turnString(string);
 }
 public static void turnString(String string) {
     String reversed = new StringBuilder(string).reverse().toString();
     System.out.println(reversed);
 }
 }
