import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Rafly", "123456");
        
        System.out.println("=== SELAMAT DATANG DI PET SHOP ===");
        
        // Login
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

        //MENU UTAMA
        boolean running = true;
        while (running){
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Kelola Hewan");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu [1-2]: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (pilihan) {
                case 1:
                    menuHewan(admin, scanner);
                    break;
                case 2:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        }
        scanner.close();
    }
    // MENU KELOLA HEWAN
    private static void menuHewan(Admin admin, Scanner scanner) {
        System.out.println("\n=== KELOLA HEWAN ===");
        System.out.println("1. Tambah Hewan");
        System.out.println("2. Lihat Hewan");
        System.out.println("3. Kembali");
        System.out.print("Pilih [1-3]: ");
        
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        
        switch (pilihan) {
            case 1:
                admin.tambahHewan(scanner);
                break;
            case 2:
                admin.lihatHewan();
                break;
            case 3:
                return;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}