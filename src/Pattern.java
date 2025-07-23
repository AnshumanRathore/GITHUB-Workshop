import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter :");
        int n=sc.nextInt();
        int a=1,b=n*n+1;
        
        for (int i=n; i >= 1; i--){
            for (int h=0; h<n-1; h++)
            System.out.print("--");
            for(int j=0; j<i; j++)
                System.out.print(a++ + "*");
            for(int k=0; k<i-1; k++)
                System.out.print(b++ + "*");
                System.out.println(b);
                b=b-2*(i-1);
                }
            }
        }
        
        
        
        
        