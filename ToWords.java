/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towords;

/**
 *
 * @author ACER Aspire
 */
public class ToWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String convert(String totalAmountInString){
        
        int totalAmount = Integer.parseInt(totalAmountInString.substring(0, totalAmountInString.indexOf('.')));
        int cents = Integer.parseInt(totalAmountInString.substring(totalAmountInString.indexOf('.') + 1));
        
        String numInWords = "";
        
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", 
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        
       if(totalAmount > 99){
           numInWords += ones[totalAmount/100] + " hundred";
           totalAmount %= 100;
           
           if(totalAmount > 0)
               numInWords += " ";
       }
        
       if(totalAmount > 19){
         numInWords += tens[totalAmount/10];
         totalAmount %= 10;
         
            if(totalAmount > 0)
               numInWords += " ";
       }
       
        numInWords+= ones[totalAmount];
        
       if(cents > 0){
        
        numInWords += " and ";
        if(cents > 19){
         numInWords += tens[cents/10];
         cents %= 10;
         
            if(cents > 0)
               numInWords += " ";
        }
       
        numInWords+= ones[cents] + " cents";
       } 
      
        return numInWords;
    }
    
}
