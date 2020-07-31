
class ReverseStringWithSb{
     public static void main(String[] args){
         String input ="My name is Surbhi";
         System.out.println(reverse(input));
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}