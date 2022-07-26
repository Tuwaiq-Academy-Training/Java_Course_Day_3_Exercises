import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Please choose your role: \n1-Admin \n2-SuperUser \n3-User");
String role=scan.next().toLowerCase();

      if(role.equals("admin")){
          System.out.println("welcome admin");
      } else if (role.equals("superuser")) {
          System.out.println("welcome superuser");
      } else if (role.equals("user")) {
          System.out.println("welcome user");

      }else {
          System.out.println("invalid role");
      }
        for (int i = 0; i < 20; i++) {
            if(i==9){
                break;
            }
        }
        for (int i = 0; i <20 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println("odd number: "+i);
        }
        for (int i = 1; i <= 100; i++) {
             if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");

            } else if (i%3==0) {
                System.out.println("Fizz");

            }else {
                System.out.println(i);
            }
        }
    }

}
