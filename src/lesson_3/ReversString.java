package lesson_3;

public class ReversString {
    public static void main(String[] args) {
        System.out.println(revers("Hello my darling world!"));
        System.out.println(reversWord("Hello my darling world!"));
    }


    public static String revers(String str){
        MyStack<Character> stack = new MyStack<>();
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++){
            stack.push(chars[i]);
        }

        String reversString = "";
        while (!stack.isEmpty()) {
            reversString += stack.pop().toString();
        }
        return reversString;
    }

    public static String reversWord(String str){
        MyStack<String> stack = new MyStack<>();
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            stack.push(words[i]);
        }

        String reversString = "";
        while (!stack.isEmpty()) {
            reversString += stack.pop() + " ";
        }
        return reversString;
    }
}
