import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private String username;
    private String password;
    private ArrayList<Hewan> daftarHewan;

    
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.daftarHewan = new ArrayList<>();
        inisialisasiData();
    }
    
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    private void inisialisasiData() {
        // Data default hewan
        daftarHewan.add(new Hewan("H1", "Persi", "Kucing", 2, 1500000, 3));
        daftarHewan.add(new Hewan("H2", "Bulldog", "Anjing", 1, 2500000, 2));
    }

    // FITUR KELOLA HEWAN
    public void tambahHewan(Scanner scanner) {
        System.out.println("\n--- TAMBAH HEWAN BARU ---");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("Usia (tahun): ");
        int usia = scanner.nextInt();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Hewan hewan = new Hewan(id, nama, jenis, usia, harga, stok);
        daftarHewan.add(hewan);
        System.out.println("Hewan berhasil ditambahkan!");
    }
    
    public void lihatHewan() {
        System.out.println("\n--- DAFTAR HEWAN ---");
        if (daftarHewan.isEmpty()) {
            System.out.println("Tidak ada data hewan.");
        } else {
            for (Hewan hewan : daftarHewan) {
                hewan.tampilkanData();
            }
        }
    }
}