class Calculator
{
   public static void main(String args[])
    {
       int a=5,b=3,choice=1,result;
        switch(choice)
          {
             case 1:
                   System.out.println("Addition");
                   result=a+b;
                   System.out.println("Addition="+result);
                   break;
             case 2:
                   System.out.println("Subtraction");
                   result=a-b;
                   System.out.println("Subtraction="+result);
                   break;
             case 3:
                   System.out.println("Division");
                   result=a/b;
                   System.out.println("Division="+result);
                   break;
             case 4:
                   System.out.println("Multiplication");
                   result=a*b;
                   System.out.println("Multiplication="+result);


          }
          
            
    }
}