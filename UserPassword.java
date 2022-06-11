import java.util.Scanner;

public class UserPassword
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String UserName, password,newPassword,oldPassword;
        int changePasswordButton=0;

        System.out.println("***********************  SIGN UP  ***************************\n\n\n");
        System.out.println("Username: ");
        UserName= sc.nextLine();
        System.out.println("Password: ");
        password=sc.nextLine();

        String checkUsername,checkPassword;
        System.out.print("*************************  LOG IN  *************************************\n\n\n");
        System.out.println("Username: "); checkUsername= sc.nextLine();
        System.out.println("Password: "); checkPassword= sc.nextLine();

        if(checkUsername.equals(UserName)&&checkPassword.equals(password))
        {
            System.out.println("Login Success");
        }
        else
        {

            Scanner in=new Scanner(System.in);
            System.out.println("\t\tCheck your Information if you forgot password please press 1 to change password\n\n");
            changePasswordButton=in.nextInt();

        }
        switch (changePasswordButton)
        {
            case 1:

                System.out.println("Please enter a new Password(Can't be the same with old password):  \n");
                newPassword=sc.nextLine();
                if(newPassword.equals(password))
                {
                    System.out.println("Old Password and New password cannot be the same try again \n");
                    newPassword=sc.nextLine();
                }
                else

                    System.out.println("Password is changed Succesfully !!!");

                break;

            default: System.out.println("Try again");
        }

    }
}

//System.out.println("Password is changed Succesfully !!!")::