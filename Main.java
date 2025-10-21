import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("admin", "pass");
        
        System.out.println("=== SELAMAT DATANG DI PET SHOP ===");
        
        // Login sederhana
        boolean loginSuccess = false;
        while (!loginSuccess) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            
            if (admin.login(username, password)) {
                loginSuccess = true;
                System.out.println("Login berhasil!\n");
            } else {
                System.out.println("Username atau password salah!\n");
            }
        }
        
    }
}