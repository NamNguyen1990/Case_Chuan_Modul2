package input;
import model.DKDN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CkeckRegex {

    public String checkTenDK () {
        Scanner sc = new Scanner(System.in);
        String tenDK = "";
        while (true) {
            System.out.println("Nhập tên đăng ký");
            System.out.println(ANSI_RED + "Note: Tên đăng ký phải có ít nhất 1 ký tự viết hoa, 1 ký tự viết thường, 1 số, 1 ký tự đặc biệt và số lượng ký tự nằm trong khoảng (6-10)" + ANSI_RESET);
            tenDK = sc.nextLine();
            Pattern pHoa = Pattern.compile("^.*[A-Z]+.*$");  // Ít nhất 1 ký tự viết hoa
            Pattern pThuong = Pattern.compile("^.*[a-z]+.*$");   // Ít nhất 1 ký tự viết thường
            Pattern pSo = Pattern.compile("^.*[0-9]+.*$");   //  Nhất nhất 1 số
            Pattern pKTDB = Pattern.compile("^.*[#?!@$%^&*-]+.*$");  //  Ít nhất 1 ký tự đặc biệt
            Pattern pDodai = Pattern.compile("^.{6,10}$");  //  Tổng số ký tự nằm trong khoảng nào


            if (pHoa.matcher(tenDK).find() && pThuong.matcher(tenDK).find() && pSo.matcher(tenDK).find()
                    && pKTDB.matcher(tenDK).find() && pDodai.matcher(tenDK).find()) {
                break;
            } else {
                System.out.println(ANSI_RED + "Nhập tên đăng ký không đúng!" + ANSI_RESET);
            }
        }
        return tenDK;
    }


    public String matKhauDK () {
        Scanner sc = new Scanner(System.in);
        String matKhauDK = "";
        while (true) {
            System.out.println("Nhập Mật khẩu đăng ký");
            System.out.println(ANSI_RED + "Note: Mật khẩu đăng ký phải có ít nhất 1 ký tự viết hoa, 1 ký tự viết thường, 1 số, 1 ký tự đặc biệt và số lượng ký tự nằm trong khoảng (6-10)" + ANSI_RESET);
            matKhauDK = sc.nextLine();
            Pattern pHoa = Pattern.compile("^.*[A-Z]+.*$");  // Ít nhất 1 ký tự viết hoa
            Pattern pThuong = Pattern.compile("^.*[a-z]+.*$");   // Ít nhất 1 ký tự viết thường
            Pattern pSo = Pattern.compile("^.*[0-9]+.*$");   //  Nhất nhất 1 số
            Pattern pKTDB = Pattern.compile("^.*[#?!@$%^&*-]+.*$");  //  Ít nhất 1 ký tự đặc biệt
            Pattern pDodai = Pattern.compile("^.{6,10}$");  //  Tổng số ký tự nằm trong khoảng nào


            if (pHoa.matcher(matKhauDK).find() && pThuong.matcher(matKhauDK).find() && pSo.matcher(matKhauDK).find()
                    && pKTDB.matcher(matKhauDK).find() && pDodai.matcher(matKhauDK).find()) {
                break;
            } else {
                System.out.println(ANSI_RED + "Mật khẩu đăng ký không đúng!" + ANSI_RESET);
            }
        }
        return matKhauDK;
    }



    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

}
