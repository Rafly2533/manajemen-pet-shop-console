public class Layanan {
    private String id;
    private String nama;
    private double harga;
    
    public Layanan(String id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getId() { return id; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    
    public void tampilkanData() {
        System.out.println("ID: " + id + " | Layanan: " + nama + " | Harga: Rp" + harga);
    }
}