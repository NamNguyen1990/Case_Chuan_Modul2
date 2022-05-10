package model;

public class DKDN {
    private String ten;
    private String mauKhau;

    public DKDN() {
    }

    public DKDN(String dangKy, String dangNhap) {
        this.ten = dangKy;
        this.mauKhau = dangNhap;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauKhau() {
        return mauKhau;
    }

    public void setMauKhau(String mauKhau) {
        this.mauKhau = mauKhau;
    }

    @Override
    public String toString() {
        return "DKDN{" +
                "tên = " + ten  +
                ", mật khẩu = " + mauKhau +
                '}';
    }

}
