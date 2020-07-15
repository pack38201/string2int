public class HelloWorld{

     public static void main(String []args){
        String x1 = "ad57fd94";
        

        char[] ch1 = new char[x1.length()]; 

        char[] ch2 = {'0', '1', '2', '3', '4','5','6','7','8','9'};

        String x2 = "";
  
        for (int i = 0; i < x1.length(); i++) { 
            ch1[i] = x1.charAt(i); 
        } 

        for (char c1 : ch1) { 
            for (char c2 : ch2) { 
                if(c1 == c2){
                    x2 = x2 + c1;
                }
            } 
        } 

        //System.out.println(x2);
        
        int i = 0;
    int num = 0;
    boolean isNeg = false;

    if (x2.charAt(0) == '-') {
        isNeg = true;
        i = 1;
    }

    while( i < x2.length()) {
        num *= 10;
        num += x2.charAt(i++) - '0'; 
    }

    if (isNeg)
        num = -num;
    System.out.println(num);
     }
}
