package manage;

import model.DKDN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class QLDKDN {
    List<DKDN> dkdnList = new ArrayList<>();
    int count = 0;

    public void them(DKDN dkdn) {
        dkdnList.add(dkdn);
        count++;
    }

    public void hienThi() {
        boolean check = false;
        for (int i = 0; i < dkdnList.size(); i++) {
            System.out.println(dkdnList.get(i));
            check = true;
        }
        if (check == false) {
            System.out.println(ANSI_RED + "Chưa có tài khoản đăng ký" + ANSI_RESET);
        }
    }

    public void dangNhap(String ten, String maukhau) {
        if (count == 0) {
            System.out.println(ANSI_RED + "Bạn chưa đăng ký tài khoản, xin mời đăng ký trước tài khoản!" + ANSI_RESET);
        }
        else {
            for (int i = 0; i < dkdnList.size(); i++) {
                if (dkdnList.get(i).getTen().equals(ten) && dkdnList.get(i).getMauKhau().equals(maukhau)) {
                    System.out.println(ANSI_BLUE + "Bạn đã đăng nhập thành công" + ANSI_RESET);
                }
                if (dkdnList.get(i).getTen().equals(ten) == false || dkdnList.get(i).getMauKhau().equals(maukhau) == false) {
                    System.out.println(ANSI_RED + "Không đúng tài khoản đăng nhập" + ANSI_RESET);
                }
            }

        }
    }

    public int timKiemTen(String ten, String matkhau) {
        for (int i = 0; i < dkdnList.size(); i++) {
            if (dkdnList.get(i).getTen().equals(ten) && dkdnList.get(i).getMauKhau().equals(matkhau)) {
                return i;
            }
        }
        return -1;
    }

    public void suaTen(String ten, String matkhau, DKDN dkdn) {
        if (count == 0) {
            System.out.println("Bạn chưa đăng ký tài khoản, xin mời đăng ký trước tài khoản!");
        }
        else {
            int indexOf = timKiemTen(ten,matkhau);
            if (indexOf == -1) {
                System.out.println("Nhập sai tài khoản đăng ký cũ, mời nhập lại!");
            } else {
                dkdnList.set(timKiemTen(ten,matkhau), dkdn);
                System.out.println(ANSI_BLUE + "Mật khẩu đã được đổi thành công" + ANSI_RESET);
            }
        }
    }


    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
