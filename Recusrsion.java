
public class Recusrsion {

    public static int display(int n){
        if(n==0){
            return 0;
        }else{
            System.out.println(n);
            return display(n-1);
        }
    }
    public static void main(String[] args){
        int n = 5;
        
        System.out.println(display(n-1));

    }
}
