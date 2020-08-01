class ReverseString{
    public static void main(String[] args){
        String input ="My name is Surbhi";
        System.out.println(reverse(input));    
    }

    public static String reverse(String str){
        int len = str.length();
        if(str == null || len < 2){
            return str;
        }
        char[] arr = new char[len];
        for(int i = len-1,j=0 ; i >= 0; i-- ){
            arr[j] = str.charAt(i);
            j++;
        }
        return String.valueOf(arr);
    }


}