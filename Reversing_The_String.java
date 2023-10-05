class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
       char [] s=str.toCharArray();
       for(int i=0,j=str.length()-i-1;i<j;i++,j--){
           char temp=s[i];
           s[i]=s[j];
           s[j]=temp;
       }
       return new String(s);
    }
}
