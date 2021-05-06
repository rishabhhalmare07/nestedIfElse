import jdk.internal.jshell.tool.StopDetectingInputStream;

public class App {
    public static void main(String[] args)  {
        int num1 = 12;
        int num2 = 44;
        int num3 = 23;
        int result;

        if(num1 > num2){
            if (num2 > num3){
               result = num1;
            }else{
                result = num3;
            }
        } else{
            if(num2 > num3){
                result = num2;
            }else{
                result = num3;
            }
        }
            System.out.println("the bigger number is " + result);  
        
    }
}
