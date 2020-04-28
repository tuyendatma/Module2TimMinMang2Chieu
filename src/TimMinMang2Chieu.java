import java.util.Scanner;

public class TimMinMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chieu rong ma tran");
        int width = scanner.nextInt();
        System.out.println("moi ban nhap chieu dai ma tran");
        int height = scanner.nextInt();
        int[][] matrix = new int[width][height];
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                System.out.print("nhap gia tri tai x= "+i+" y= "+j+"\t");
                matrix[i][j]=scanner.nextInt();
            }
        }
        int max=timMin(matrix);
        System.out.println("gia tri nho nhat cua mang la");
        System.out.println(max);
    }
    public static int timMin(int[][] arr){
        int min= arr[0][0];
        for (int[] bien:arr) {
            for (int i = 0; i <arr[0].length ; i++) {
                if(min>bien[i]){
                    min=bien[i];
                }
            }
        }
        return min;
    }
}
