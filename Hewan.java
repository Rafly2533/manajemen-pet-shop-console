public class Hewan {
    private String id;
    private String nama;
    private String jenis;
    private int usia;
    private double harga;
    private int stok;
    
    public Hewan(String id, String nama, String jenis, int usia, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getJenis() { return jenis; }
    public int getUsia() { return usia; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }
    
    public void kurangiStok() {
        if (stok > 0) stok--;
    }
    
    public void tampilkanData() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Jenis: " + jenis + 
                         " | Usia: " + usia + " tahun | Harga: Rp" + harga + " | Stok: " + stok);
    }
}