import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("Positive number");
        }
        else if(n<=0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid week day number");
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        
        int j=3;
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=j);
    }
}
