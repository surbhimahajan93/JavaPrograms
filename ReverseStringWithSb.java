
class ReverseStringWithSb{
     public static void main(String[] args){
         String input ="My name is Surbhi";
         System.out.println(reverse(input));
          System.out.println(reverse2(input));
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static String reverse2(String s){
       return new StringBuilder(s).reverse().toString();
    }
}