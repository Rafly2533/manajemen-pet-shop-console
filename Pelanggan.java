public class Pelanggan {
    private String id;
    private String nama;
    private String telepon;
    
    public Pelanggan(String id, String nama, String telepon) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
    }
    
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getTelepon() { return telepon; }
    
    public void tampilkanData() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Telepon: " + telepon);
    }
}