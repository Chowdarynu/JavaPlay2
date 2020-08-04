package core.pgms;

public class IsPerfectNumber {
 
    public boolean isPerfectNumber(int n){
        int temp = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                temp+=i;
            }
        }
        if(temp == n){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        IsPerfectNumber ipn = new IsPerfectNumber();
        System.out.println("Is perfect number: "+ipn.isPerfectNumber(28));
    }
}

//1+2+4+7+14=28