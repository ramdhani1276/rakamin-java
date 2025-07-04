package firstProgram;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password :");
        String validPassword = "password";

        //Jika benar maka selamat datang bos
        //Jika salah (else) maka error massage
        if (password.equals(validPassword)){
            System.out.println("Selamat datang bos!");
        } else {
            System.out.println("Password salah, coba lagi");
        }
        System.out.println("Terimakasih sudah menggunakan aplikasi kami");
    }

    private static String prompt(String massage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(massage);
        return scanner.nextLine();
    }
}
