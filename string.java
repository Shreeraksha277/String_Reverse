public class StringReverse {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<(sb.length())/2;i++)
         {
           int front = i;
           int last = sb.length()-i-1;
           char frontchar = sb.charAt(front);
           char lastchar = sb.charAt(last);
           sb.setCharAt(last,frontchar);
           sb.setCharAt(front,lastchar);
         }
      System.out.println(sb);
     }
}
