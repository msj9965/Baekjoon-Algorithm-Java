import java.util.Scanner;
public class First {
    public static int change(int year){
        return year-543;
    }

    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();
        System.out.println(change(year));


    }
}