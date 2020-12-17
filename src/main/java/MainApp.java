public class MainApp {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        sinhVien1.setTen("");
        sinhVien1.setTuoi(18);

        sinhVien2.setTen("Phu");
        sinhVien2.setTuoi(-1);

        System.out.println(sinhVien1);
        System.out.println(sinhVien2);
    }
}
