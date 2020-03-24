public String MaxReducedString(String str) 
{ 
  
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i-1)) {
            str = str.substring(0, i-1) + str.substring(i+1);
        }
    }
    if (str.length() == 0) {
       return "Empty String";
    } else {
        return str;
    }
} 
