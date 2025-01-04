package Homework;

public class wordLenght {
    public static void main (String[] args) {
        System.out.println(lenghtOfTheLastWord("Hello world"));
        System.out.println(lenghtOfTheLastWord("    fly me    to the moon    "));
    }
public static Integer lenghtOfTheLastWord(String string){
    String[] words = string.split(" ");
    return words[words.length - 1].length();
    }
}