import java.util.Scanner;
public class div5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n%5 ==0){
            System.out.println("it is divisible by 5");
        }
        else{
            System.out.println("it is not divisible");
        }

    }

}