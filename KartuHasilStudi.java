import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public void hitungIPS() {
        double totalNilai = 0;
        double totalSKS = 0;
        
        for (Matakuliah mk : daftarMatakuliah) {
            totalSKS += mk.getSKS();
            totalNilai += konversiNilaiKeIndeks(mk.getNilai()) * mk.getSKS();
        }
        
        this.ips = totalSKS > 0 ? totalNilai / totalSKS : 0;
    }

    private double konversiNilaiKeIndeks(String nilai) {
        if (nilai.equals("A")) return 4.0;
        if (nilai.equals("B")) return 3.0;
        if (nilai.equals("C")) return 2.0;
        if (nilai.equals("D")) return 1.0;
        return 0.0;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }

    public double getIPS() { return ips; }
}