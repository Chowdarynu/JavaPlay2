package core.strings;

public class RemoveAllSpace {
    public static void main(String[] args) {  
        String str = "India     Is My    Country";  
        //1st way  
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr);  
        //2nd way  
        char[] arr = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != ' ') && (arr[i] != '\t')) {
                stringBuffer.append(arr[i]);
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2);  
    }  
}  