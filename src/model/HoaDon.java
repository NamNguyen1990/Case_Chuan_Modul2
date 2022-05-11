package model;

public class HoaDon {
    private String soCMND;
    private String ten;
    private int tgVao;
    private int tgRa;
    private int tAnUong;
    private Phong phong;

    public HoaDon() {
    }

    public HoaDon(String soCMND, String ten, int tgVao, int tgRa, int tAnUong, Phong phong) {
        this.soCMND = soCMND;
        this.ten = ten;
        this.tgVao = tgVao;
        this.tgRa = tgRa;
        this.tAnUong = tAnUong;
        this.phong = phong;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTgVao() {
        return tgVao;
    }

    public void setTgVao(int tgVao) {
        this.tgVao = tgVao;
    }

    public int getTgRa() {
        return tgRa;
    }

    public void setTgRa(int tgRa) {
        this.tgRa = tgRa;
    }

    public int gettAnUong() {
        return tAnUong;
    }

    public void settAnUong(int tAnUong) {
        this.tAnUong = tAnUong;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                ANSI_RED + "Số CMND = " + soCMND + ANSI_RESET +
                ", Tên = " + ten +
                ", TGian vào = " + tgVao +
                ", TGian ra = " + tgRa +
                ", Tiền ăn uống = " + tAnUong +
                ", Phòng = " + phong +
                '}';
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
