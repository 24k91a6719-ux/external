public class palindrome{
    public static void main(String[] args){
        String s="asa";
        String ans="";
        for(int i=s.length()-1;i>-1;i--){
            ans=ans+s.charAt(i);
        }
        if(ans.equals(s)){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("no palindrome");
        }
    }
}