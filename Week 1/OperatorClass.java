public class OperatorClass{
    /**
     * @param args
     */
    public static void main(String[]args){
        /*Arithemetic Operators */
        int a = 10, b = 10;
        int sum = a + b; // here the "+" is an arithemitic operators
        System.out.println("Addition for a+b is" + sum);
        System.out.println("Difference  for a-b is" + (a-b));
        System.out.println("Multiplication for axb is" + (a*b));
        System.out.println("Division  for a/b is" + (a/b));
        System.out.println("Modulo for a and b is "+ (a%b));

        /*Assignment  Operators*/
        int aNumber1;
        aNumber1 = 10;
        /*or declare and assign */
        int aNumber2 = 20;
        /*assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with +=" + (aNumber1+=110));
        aNumber2 -= 30; // same as aNumber2 = aNumber2 - 30;
        System.out.println("Assignment with -=" + aNumber2);

        /*Relational Operators */
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equals to rNumber2?" + (rNumber1 == rNumber2));
        System.out.println("rNumber1 greater than rNumber2?" + (rNumber1 > rNumber2));
        System.out.println("rNumber1 less than or equals to rNumber2?" + (rNumber1 <= rNumber2));
        System.out.println("rNumber1  not equals to rNumber2?" + (rNumber1 != rNumber2));

        /*Logical Operators */
        int lNumber1 = 10, lNumber2 = 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses &&" + (lExpression1 && lExpression2));
        System.out.println("Or operator uses ||" + (lExpression1 || lExpression2));
        System.out.println("Not  operator uses !" + !lExpression1 );

        /*Unary Operator */
        int uNumber1 = 10;
        uNumber1++; // meaning uNumber1 = unumber1+1;
        System.out.println(" Unary for increament is ++" + uNumber1);
        uNumber1--;
        System.out.println("Unary for decrement is --" + uNumber1);

        /*Ternary operator */
        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * One line if else,see the given example in if else
         * String output;
         * if (tExpression == true){
         * output = 'True statement';
         * }else{
         * output = "False Statement"}
         
         */

         String output = tExpression ? "True statemnt" : "False Statement";
         /*Here we can assign a string out with expression 
          * if expression is true it will return the value after the "?"
          if the expression is false it will return the value after the ":"
    
         */

         int numbreOutput = tNumber1 < tNumber2 ? 10 : 20;
         System.out.println(output);
         System.out.println(numbreOutput);

         
         /*Task
           *Write a program to print weather a variable is greater or equal to 18
          */

          int var = 12;
          System.out.println ("The variable is greater than 18?" + (var > 18));

          /*Task2
           * Write a program to print simple interest from variables
           * Make 3 variable for amount, time and rate and save the calculation into a variable
           * Formula;
           * si = amount * time * rate/100;
           */

           int amount = 2000;
           float rate = 2.3f;
           int time = 3;
           float si = (amount * rate  * time ) / 100;
           System.out.println("The simple interest is " + si);



           /*Task3
            * Write a program to print the area and perimeter of rectangle
            *a = l * b
            * p = 2(l + b)
            */

            int lenght = 5;
        int breadth = 8;
        a = lenght * breadth;
        int p = 2 * (lenght + breadth);
        System.out.println("The area of rectangle is" + a);
        System.out.println("The perimeter of rectangle is" + p);
            
    

            /*Task 4
             * Complete the task 1 using ternary operators
             */
           int  var1 = 16;
        boolean testExpression = (var1 > 18);
        String result = testExpression ? "True" : "False";
        System.out.println(result);

             








        
        

    }
}