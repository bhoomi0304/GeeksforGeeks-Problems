String str;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)>=48 && s.charAt(i)<=57  || s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122){
                str[i]=s.charAt(i);//takes the perticular character from the string
            }
            else
                i--;
    }
