package Nedelja1;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int[][]arr = new int[3][3];
        int suma =0;
        for(int i =0; i<arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i =0; i<arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                suma +=arr[i][j];
            }
        }
        System.out.println("Suma je " +suma);
    }
}
