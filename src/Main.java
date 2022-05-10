import manage.QLDKDN;
import model.DKDN;
import input.CkeckRegex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLDKDN qldkdn = new QLDKDN();
        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        int luaChon = -1;
        System.out.println("=====Menu_ĐăngKý_ĐăngNhập====");
        System.out.println("0 - Thoát khỏi chương trình");
        System.out.println("1 - Đăng ký tài khoản");
        System.out.println("2 - Đăng nhập tài khoản");
        System.out.println("3 - Sửa thông tin tài khoản");
        System.out.println("4 - Xem thông tin tài khoản");
        System.out.println("5 - Xem lại Menu");

        do {
            boolean check0 = false;
            while (!check0) {
                System.out.println("Mời bạn chọn chức năng");
                try {
                    luaChon = sc.nextInt();
                    if (luaChon<0 || luaChon >5) throw new Exception();
                    check0 = true;
                } catch (InputMismatchException e) {
                    System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println(ANSI_RED + "Chỉ được nhập số từ 0 --> 5" + ANSI_RESET);
                }
            }

            if (luaChon == 1) {
//                System.out.println("Nhập tên đăng ký");
                String tenDK = qldkdn.checkTenDK();
//                System.out.println("Nhập mật khẩu đăng ký");
                String matKhauDK = qldkdn.matKhauDK();
                System.out.println(ANSI_BLUE + "Bạn đã đăng ký thành công" + ANSI_RESET);
                System.out.println("Chọn đăng nhập để vào chương trình chính");

                DKDN dkdn = new DKDN(tenDK,matKhauDK);
                qldkdn.them(dkdn);
            }
            else if (luaChon == 2) {
                System.out.println("Nhập tên đăng nhập");
                String tenDN = nhapChu.nextLine();
                System.out.println("Nhập mật khẩu đăng nhập");
                String matKhauDN = nhapChu.nextLine();
                qldkdn.dangNhap(tenDN, matKhauDN);

                if (qldkdn.timKiemTen(tenDN, matKhauDN) != -1) {
                    int luaChon1 = -1;

                    System.out.println("=====Menu chương trình====");
                    System.out.println("0 - Thoát chương trình");
                    System.out.println("1 - Quản lý phòng Vũ Trường");
                    System.out.println("2 - Quản lý hóa đơn");
                    System.out.println("3 - Quản lý nhân viên Vũ Trường");

                    do {
                        boolean check1 = false;
                        while (!check1) {
                            System.out.println("Mời bạn chọn chức năng");
                            try {
                                luaChon1 = sc.nextInt();
                                if (luaChon1<0 || luaChon1 >3) throw new Exception();
                                check1 = true;
                            } catch (InputMismatchException e) {
                                System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                sc.nextLine();
                            } catch (Exception e) {
                                System.out.println(ANSI_RED + "Chỉ được nhập số từ 0 --> 3" + ANSI_RESET);
                            }
                        }
                        if (luaChon1 == 1) {










                        }
                        else if (luaChon1 == 2) {






                        }
                        else if (luaChon1 == 3) {







                        }


                    } while (luaChon1 != 0);




                }

            }
            else if (luaChon == 3) {

                System.out.println("Nhập lại tên đăng nhập cũ");
                String tenDNS = nhapChu.nextLine();
                System.out.println("Nhập lại mật khẩu cũ");
                String matkhauDNS = nhapChu.nextLine();
                System.out.println("Nhập tên đăng nhập mới");
                String tenDNM = qldkdn.checkTenDK();
                System.out.println("Nhập mật khẩu mới");
                String matkhauDNM = qldkdn.matKhauDK();

                DKDN dkdn1 = new DKDN(tenDNM,matkhauDNM);
                qldkdn.suaTen(tenDNS,matkhauDNS,dkdn1);

            }
            else if (luaChon == 4) {
                qldkdn.hienThi();
            }
            else if (luaChon == 5) {

                System.out.println("=====Menu_ĐăngKý_ĐăngNhập====");
                System.out.println("0 - Thoát khỏi chương trình");
                System.out.println("1 - Đăng ký tài khoản");
                System.out.println("2 - Đăng nhập tài khoản");
                System.out.println("3 - Sửa thông tin tài khoản");
                System.out.println("4 - Xem thông tin tài khoản");
                System.out.println("5 - Xem lại Menu");

            }

        } while (luaChon != 0);

    }




    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
