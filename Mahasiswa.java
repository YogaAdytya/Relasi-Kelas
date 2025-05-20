public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa() {
        // Konstruktor default
    }

    public Mahasiswa(String nRP, String nama) {
        super();
        NRP = nRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP: "+ NRP + ", Nama: "+ nama;
    }

    // Getter dan Setter
    public String getNRP() { return NRP; }
    public void setNRP(String nRP) { NRP = nRP; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
}