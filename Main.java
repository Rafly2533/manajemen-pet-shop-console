import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetShopApp app = new PetShopApp();  // Ganti dari Admin ke PetShopApp
        
        System.out.println("=== SELAMAT DATANG DI PET SHOP ===");
        
        boolean loginSuccess = false;
        while (!loginSuccess) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            
            if (app.login(username, password)) {
                loginSuccess = true;
                System.out.println("Login berhasil!\n");
            } else {
                System.out.println("Username atau password salah!\n");
            }
        }
        
        boolean running = true;
        while (running) {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Kelola Hewan");
            System.out.println("2. Kelola Pelanggan");
            System.out.println("3. Penjualan Hewan");
            System.out.println("4. Layanan Kesehatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu [1-5]: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    menuHewan(app, scanner);
                    break;
                case 2:
                    menuPelanggan(app, scanner);
                    break;
                case 3:
                    app.jualHewan(scanner);
                    break;
                case 4:
                    app.layananKesehatan(scanner);
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan sistem!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        }
        scanner.close();
    }
    
    private static void menuHewan(PetShopApp app, Scanner scanner) {
        System.out.println("\n=== KELOLA HEWAN ===");
        System.out.println("1. Tambah Hewan");
        System.out.println("2. Lihat Hewan");
        System.out.println("3. Kembali");
        System.out.print("Pilih [1-3]: ");
        
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        
        switch (pilihan) {
            case 1:
                app.tambahHewan(scanner);
                break;
            case 2:
                app.lihatHewan();
                break;
            case 3:
                return;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
    
    private static void menuPelanggan(PetShopApp app, Scanner scanner) {
        System.out.println("\n=== KELOLA PELANGGAN ===");
        System.out.println("1. Tambah Pelanggan");
        System.out.println("2. Lihat Pelanggan");
        System.out.println("3. Kembali");
        System.out.print("Pilih [1-3]: ");
        
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        
        switch (pilihan) {
            case 1:
                app.tambahPelanggan(scanner);
                break;
            case 2:
                app.lihatPelanggan();
                break;
            case 3:
                return;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}