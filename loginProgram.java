import java.util.*;

public class loginProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "user123", password = "Pass@35";
        String user,pass;


        while(true){
            System.out.print("Username: ");
            user = scanner.nextLine();
            System.out.print("Password: ");
            pass = scanner.nextLine();

            if ( user.equals(username) && pass.equals(password) ){
                System.out.println("Login successful!");
                break;
            }else{
                System.out.println("Username/Password is wrong !");
                System.out.print("Do you want to reset you password? Type yes/no\n>>");
                String answer;
                answer = scanner.nextLine().toLowerCase();
                if (answer.equals("yes")){
                    System.out.print("Type your new password: ");
                    String newPassword;
                    newPassword = scanner.nextLine();
                    if (newPassword.equals(password)){
                        System.out.println("Your password can not be your old password. Type different password !");
                        System.out.println("Try again to login!");
                    }else {
                        password = newPassword;
                        System.out.println("You reset your password. Try to login again...");
                    }
                }
            }
        }




    }
}
