import java.util.Scanner;

class patternUtils{

public void squarePattern(int n){
    for(int i = 0; i<n; i++){
    for(int j=0; j<n; j++)
        {System.out.print("*");
    }
    System.out.println();
}}

}


public class pattern {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternUtils p = new patternUtils();
        p.squarePattern(n);
        sc.close();
    }
    
}
