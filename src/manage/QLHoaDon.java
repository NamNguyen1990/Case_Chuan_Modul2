package manage;

import model.HoaDon;
import model.Phong;

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

    public void xoaHD (String soCMND) {
        int indexOf = timKiemCMND(soCMND);
        if (indexOf == -1) {
            System.out.println("Không có số CMND này");
        } else {
            hoaDonList.remove(indexOf);
        }
    }

    public int timKiemCMND (String soCMND) {  // Cái này trả về vị trí (chỉ vị trí ko hiển thị thông tin) phục vụ cho việc sửa theo Số CMND nhập vào
        for (int i = 0; i < hoaDonList.size(); i++) {
            if (hoaDonList.get(i).getSoCMND().equals(soCMND)) {
                return i;
            }
        }
        return -1;
    }

    public void timKiemCMND1 (String soCMND) {
        boolean check = false;
        for (int i=0; i<hoaDonList.size(); i++) {
            if (hoaDonList.get(i).getSoCMND().equals(soCMND)) {
                System.out.println(hoaDonList.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println(ANSI_RED + "Nhập không đúng (không có số CMND này trong hóa đơn)" + ANSI_RESET);
        }
    }

    public void hienThiFull() {
        int soHD = 0;
        boolean check = false;
        for (int i=0; i<hoaDonList.size(); i++) {
            System.out.println(hoaDonList.get(i));
            soHD++;
            System.out.println("Số hóa đơn thứ: " + soHD);
            System.out.println("------------------------------------------------------------");
            check = true;
        }

        if (check == false) {
            System.out.println(ANSI_RED + "Chưa có hóa đơn nào được thêm mới!" + ANSI_RESET);
        }
    }
    public void timKiemKhoangTGian (int tGianThap,int tGianCao) {    // Cái này nhập vào khoảng thời gian nào đến thời gian nào.
        boolean check = false;
        for (int i = 0; i < hoaDonList.size(); i++) {
            if (tGianThap <= hoaDonList.get(i).getTgRa() && tGianCao >= hoaDonList.get(i).getTgRa()){
                System.out.println(hoaDonList.get(i));
            }
        }
        if (check == false) {
            System.out.println(ANSI_RED + "Không có hóa đơn nào trong khoảng thời gian này!" + ANSI_RESET);
        }
    }

    public void suaHoaDon (String soCMND, HoaDon hoaDon) {
        int indexOf = timKiemCMND(soCMND);
        if (indexOf == -1) {
            System.out.println(ANSI_RED + "Không có số CMND nào như trên" + ANSI_RESET);
        } else {
            hoaDonList.set(indexOf, hoaDon);
            System.out.println(ANSI_BLUE + "Bạn đã sửa thành công thông tin Hóa Đơn trên" + ANSI_RESET);
        }
    }












    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
