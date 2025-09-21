public class HollowRhombusPattern {
    public static void main(String[] args) {
        int n=5;
        int m=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-1;j++){
                System.out.print(" ");
            }
        for(int j=1; j<=m; j++){
            if(i==1 && j>n-1 || i==n && j<n-1 || i+j==6 || i+j==9){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}
