public class RA2211003010004_Week_1_question7 { 
    public static void main(String args[]) { 
        System.out.println("Number between 100 - 400 with each digit of a number is an even number."); 
        System.out.print("\nNumbers : "); 
        String str = ""; 
        for(int i = 100 ; i <= 400 ; i++) { 
            if(even_check(i) == 1) { 
                String s = Integer.toString(i); str += s + ","; 
            } 
        } 
        str = str.substring(0,str.length()-1);
        System.out.println(str); 
    }; 
    public static int even_check(int x){ 
        int check = 1 ,temp = x; 
        while(temp > 0) 
        { 
            int digit = temp % 10; 
            if(digit % 2 != 0){ 
                check = 0; break; 
            } 
            temp /= 10; 
        } 
        return check;
    } 
}