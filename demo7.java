import java.util.Scanner;
public class demo7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("enter the username");
    String username = scanner.next();
    System.out.print("enter the age");
    int age = scanner.nextInt();
    System.out.print("enter the password");
    int password = scanner.nextInt();
    System.out.println("username: "+ username);
    System.out.println("age: "+ age);
    System.out.println("password: "+ password);
}
}