public class Matakuliah {
    private String kode;
    private String nama;
    private String nilai;
    private int sks;

    public Matakuliah(String kode, String nama, String nilai, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilai = nilai;
        this.sks = sks;
    }

    public String display() {
        return kode + " - " + nama + " - " + nilai + " - " + sks;
    }

    // Getter
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getNilai() { return nilai; }
    public int getSKS() { return sks; }
}