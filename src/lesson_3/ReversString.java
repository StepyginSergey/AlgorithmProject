package lesson_3;

public class ReversString {
    public static void main(String[] args) {
        System.out.println(reverce("Hello my darling world!"));
        System.out.println(reverceWord("Hello my darling world!"));
    }


    public static String reverce(String str){
        MyStack<Character> stack = new MyStack<>();
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){
            stack.push(chars[i]);
        }

        String reverceString = "";
        while (!stack.isEmpty()) {
            reverceString += stack.pop().toString();
        }
        return reverceString;
    }

    public static String reverceWord(String str){
        MyStack<String> stack = new MyStack<>();
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            stack.push(words[i]);
        }

        String reverceString = "";
        while (!stack.isEmpty()) {
            reverceString += stack.pop() + " ";
        }
        return reverceString;
    }
}
