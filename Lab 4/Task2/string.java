public class string {
    public static void main(String [] args){
        String str="Abdullah";

        for (int index = 0; index < str.length(); index++) {
            if(str.charAt(index)=='b'){
                str[index]='B';
            }
        }
    }
}
