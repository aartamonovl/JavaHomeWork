package HomeWork2;

public class Scripts {
    public static void changeStringToNormal(String str){
        StringBuffer sb = new StringBuffer(str.trim());
        for (int i = 1; i < sb.length(); i++){
            if (sb.charAt(i) == ' ' && sb.charAt(i-1) == ' '){
                sb.deleteCharAt(i);
                i--;
            }
            else if (Character.isUpperCase(sb.charAt(i))){
                sb.insert(i, ". ");
                i+=2;
                if (sb.charAt(i-3) == ' '){
                    sb.deleteCharAt(i-3);
                }
            }
        }
        sb.append('.');
        System.out.println(sb);
    }
}
