package manage;

import model.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class QLHoaDon {
    List<HoaDon> hoaDonList = new ArrayList<>();
    private int soHD = 0;

    public QLHoaDon() {
    }

    public QLHoaDon(List<HoaDon> hoaDonList, int soHD) {
        this.hoaDonList = hoaDonList;
        this.soHD = soHD;
    }

    public List<HoaDon> getHoaDonList() {
        return hoaDonList;
    }

    public void setHoaDonList(List<HoaDon> hoaDonList) {
        this.hoaDonList = hoaDonList;
    }

    public int getSoHD() {
        return soHD;
    }

    public void setSoHD(int soHD) {
        this.soHD = soHD;
    }

    public void them (HoaDon hoaDon) {
        hoaDonList.add(hoaDon);
        soHD++;
        System.out.println(ANSI_BLUE + "Bạn đã thêm thành công 1 hóa đơn mới" + ANSI_RESET);
    }












    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
