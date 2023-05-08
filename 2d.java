import java.util.*;
public class 2d{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]=new int[3][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
        }
    }
}
