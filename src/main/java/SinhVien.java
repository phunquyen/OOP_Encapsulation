public class SinhVien {
    private String ten;
    private int tuoi;

    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()) {
            this.ten = "Khong ton tai";
        } else {
            this.ten = ten;
        }
    }

    public void setTuoi(int tuoi) {
        if(tuoi < 0) {
            this.tuoi = 0;
        }
        else {
            this.tuoi = tuoi;
        }
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
