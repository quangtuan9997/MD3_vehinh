import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("chọn hình cần in");
        System.out.println("1 hinh chu nhat");
        System.out.println("2 hinh Tam giac cạnh góc vuông ở botton-left");
        System.out.println("3 In hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("4 In hình tam giác cân");
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("nhập chiều dài");
                int a= sc.nextInt();
                System.out.println("nhập chiều rộng");
                int b= sc.nextInt();
                for(int i=0;i<a;i++){

                    for(int j=0;j<b;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 2:
                System.out.println("nhap canh goc vuong");
                int c=sc.nextInt();
                for (int i=0; i<c;i++){
                    for (int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            case 3:
                System.out.println("nhap canh goc vuong");
                int d=sc.nextInt();
                for (int i=0; i<d;i++){
                    for (int j=d;j>i;j--){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            case 4:
                System.out.println("nhap canh chieu cao vuong");
                int e=sc.nextInt();
                int k=0;
                for (int i=0;i<=e;i++){
                    for (int j=e;j>i;j--){
                        System.out.print(" ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println("");
                }

        }
    }
}
