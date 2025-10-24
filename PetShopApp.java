import java.util.ArrayList;
import java.util.Scanner;

public class PetShopApp {
    private Admin admin;
    private ArrayList<Hewan> daftarHewan;
    private ArrayList<Pelanggan> daftarPelanggan;
    private ArrayList<Layanan> daftarLayanan;
    
    public PetShopApp() {
        this.admin = new Admin("Rafly", "123456");
        this.daftarHewan = new ArrayList<>();
        this.daftarPelanggan = new ArrayList<>();
        this.daftarLayanan = new ArrayList<>();
        inisialisasiData();
    }
    
    private void inisialisasiData() {
        // Data default hewan
        daftarHewan.add(new Hewan("H1", "Persi", "Kucing", 2, 1500000, 3));
        daftarHewan.add(new Hewan("H2", "Bulldog", "Anjing", 1, 2500000, 2));
        
        // Data default pelanggan
        daftarPelanggan.add(new Pelanggan("P1", "Budi Santoso", "08123456789"));
        
        // Data default layanan
        daftarLayanan.add(new Layanan("L1", "Konsultasi", 50000));
        daftarLayanan.add(new Layanan("L2", "Vaksinasi", 150000));
        daftarLayanan.add(new Layanan("L3", "Grooming", 100000));
    }
    
    public boolean login(String username, String password) {
        return admin.login(username, password);
    }
    
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
        scanner.nextLine();
        
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
    
    public void tambahPelanggan(Scanner scanner) {
        System.out.println("\n--- TAMBAH PELANGGAN BARU ---");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Telepon: ");
        String telepon = scanner.nextLine();
        
        Pelanggan pelanggan = new Pelanggan(id, nama, telepon);
        daftarPelanggan.add(pelanggan);
        System.out.println("Pelanggan berhasil ditambahkan!");
    }
    
    public void lihatPelanggan() {
        System.out.println("\n--- DAFTAR PELANGGAN ---");
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Tidak ada data pelanggan.");
        } else {
            for (Pelanggan pelanggan : daftarPelanggan) {
                pelanggan.tampilkanData();
            }
        }
    }
    
    public void jualHewan(Scanner scanner) {
        System.out.println("\n--- PENJUALAN HEWAN ---");
        lihatHewan();
        System.out.print("Pilih ID Hewan: ");
        String idHewan = scanner.nextLine();
        
        Hewan hewanDipilih = null;
        for (Hewan hewan : daftarHewan) {
            if (hewan.getId().equals(idHewan) && hewan.getStok() > 0) {
                hewanDipilih = hewan;
                break;
            }
        }
        
        if (hewanDipilih != null) {
            hewanDipilih.kurangiStok();
            System.out.println("Penjualan berhasil! Hewan " + hewanDipilih.getNama() + " terjual.");
            System.out.println("Total: Rp" + hewanDipilih.getHarga());
        } else {
            System.out.println("Hewan tidak tersedia atau stok habis!");
        }
    }
    
    public void layananKesehatan(Scanner scanner) {
        System.out.println("\n--- LAYANAN KESEHATAN ---");
        System.out.println("Daftar Layanan:");
        for (Layanan layanan : daftarLayanan) {
            layanan.tampilkanData();
        }
        
        System.out.print("Pilih ID Layanan: ");
        String idLayanan = scanner.nextLine();
        
        Layanan layananDipilih = null;
        for (Layanan layanan : daftarLayanan) {
            if (layanan.getId().equals(idLayanan)) {
                layananDipilih = layanan;
                break;
            }
        }
        
        if (layananDipilih != null) {
            System.out.println("Layanan " + layananDipilih.getNama() + " berhasil diproses!");
            System.out.println("Biaya: Rp" + layananDipilih.getHarga());
        } else {
            System.out.println("Layanan tidak ditemukan!");
        }
    }
}