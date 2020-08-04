package core.strings;

class StringFormatter {
    public static String capitalizeWord(String str) {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        return capitalizeWord.trim();
    }
    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }

    //tOGGLE
    public static String toggle(String str){
        String words[]=str.split("\\s");
        String toggle="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";
        }
        return toggle.trim();
    }
}

public class CapitaliseString {
    public static void main(String[] args) {
        System.out.println(StringFormatter.capitalizeWord("my name is khan"));
        System.out.println(StringFormatter.toggle("I am sonoo jaiswal"));
    }
}