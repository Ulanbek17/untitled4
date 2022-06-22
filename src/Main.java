import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        a-=9;
        long s = 0;
        while (a<11){
            s+=a;
            a++;
        }
        System.out.println(s);

    }
}