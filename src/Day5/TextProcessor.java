package Day5;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("this is the first phrase");
        reverseString("noura");
        addSpace("ThisIsSecondPhrase");

    }
    public static void countWords(String text){
        String [] words=text.split(" ");
        //String [] words=text.split("\\. "); .| * + ? ^ $ () {} []
        int numberOfWords= words.length;
        String message= String.format("Your text contins %d words", numberOfWords);
        System.out.println(message);
        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }

    }
    public static void reverseString(String text){
        for (int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
    public static void addSpace(String text){
        StringBuilder modifiedText=new StringBuilder(text);
        for (int i=1; i<modifiedText.length();i++){
            if (Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
            System.out.println(modifiedText);
        }
    }
}
