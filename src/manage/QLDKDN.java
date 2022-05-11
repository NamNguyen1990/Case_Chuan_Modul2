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


//    public String checkTenDK () {
//        Scanner sc = new Scanner(System.in);
//        String tenDK = "";
//        while (true) {
//            System.out.println("Nhập tên đăng ký");
//            System.out.println(ANSI_RED + "Note: Tên đăng ký phải có ít nhất 1 ký tự viết hoa, 1 ký tự viết thường, 1 số, 1 ký tự đặc biệt và số lượng ký tự nằm trong khoảng (6-10)" + ANSI_RESET);
//            tenDK = sc.nextLine();
//            Pattern pHoa = Pattern.compile("^.*[A-Z]+.*$");  // Ít nhất 1 ký tự viết hoa
//            Pattern pThuong = Pattern.compile("^.*[a-z]+.*$");   // Ít nhất 1 ký tự viết thường
//            Pattern pSo = Pattern.compile("^.*[0-9]+.*$");   //  Nhất nhất 1 số
//            Pattern pKTDB = Pattern.compile("^.*[#?!@$%^&*-]+.*$");  //  Ít nhất 1 ký tự đặc biệt
//            Pattern pDodai = Pattern.compile("^.{6,10}$");  //  Tổng số ký tự nằm trong khoảng nào
//
//
//            if (pHoa.matcher(tenDK).find() && pThuong.matcher(tenDK).find() && pSo.matcher(tenDK).find()
//            && pKTDB.matcher(tenDK).find() && pDodai.matcher(tenDK).find()) {
//                break;
//            } else {
//                System.out.println(ANSI_RED + "Nhập tên đăng ký không đúng!" + ANSI_RESET);
//            }
//        }
//        return tenDK;
//    }


//    public String matKhauDK () {
//        Scanner sc = new Scanner(System.in);
//        String matKhauDK = "";
//        while (true) {
//            System.out.println("Nhập Mật khẩu đăng ký");
//            System.out.println(ANSI_RED + "Note: Mật khẩu đăng ký phải có ít nhất 1 ký tự viết hoa, 1 ký tự viết thường, 1 số, 1 ký tự đặc biệt và số lượng ký tự nằm trong khoảng (6-10)" + ANSI_RESET);
//            matKhauDK = sc.nextLine();
//            Pattern pHoa = Pattern.compile("^.*[A-Z]+.*$");  // Ít nhất 1 ký tự viết hoa
//            Pattern pThuong = Pattern.compile("^.*[a-z]+.*$");   // Ít nhất 1 ký tự viết thường
//            Pattern pSo = Pattern.compile("^.*[0-9]+.*$");   //  Nhất nhất 1 số
//            Pattern pKTDB = Pattern.compile("^.*[#?!@$%^&*-]+.*$");  //  Ít nhất 1 ký tự đặc biệt
//            Pattern pDodai = Pattern.compile("^.{6,10}$");  //  Tổng số ký tự nằm trong khoảng nào
//
//
//            if (pHoa.matcher(matKhauDK).find() && pThuong.matcher(matKhauDK).find() && pSo.matcher(matKhauDK).find()
//                    && pKTDB.matcher(matKhauDK).find() && pDodai.matcher(matKhauDK).find()) {
//                break;
//            } else {
//                System.out.println(ANSI_RED + "Mật khẩu đăng ký không đúng!" + ANSI_RESET);
//            }
//        }
//        return matKhauDK;
//    }


    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
