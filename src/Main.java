import file.GhiDocFile1;
import manage.QLDKDN;
import manage.QLHoaDon;
import manage.QLPhong;
import model.DKDN;
import input.CkeckRegex;
import model.HoaDon;
import model.Phong;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        QLDKDN qldkdn = new QLDKDN();
        CkeckRegex ckeckRegex = new CkeckRegex();

        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        Scanner nhapChu1 = new Scanner(System.in);
        Scanner nhapChu2 = new Scanner(System.in);


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
                String tenDK = ckeckRegex.checkTenDK();
//                System.out.println("Nhập mật khẩu đăng ký");
                String matKhauDK = ckeckRegex.matKhauDK();
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
                    System.out.println("4 - Xem lại danh sách chương trình");

                    do {
                        boolean check1 = false;
                        while (!check1) {
                            System.out.println("Mời bạn chọn chức năng");
                            try {
                                luaChon1 = sc.nextInt();
                                if (luaChon1<0 || luaChon1 >4) throw new Exception();
                                check1 = true;
                            } catch (InputMismatchException e) {
                                System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                sc.nextLine();
                            } catch (Exception e) {
                                System.out.println(ANSI_RED + "Chỉ được nhập số từ 0 --> 4" + ANSI_RESET);
                            }
                        }
                        if (luaChon1 == 1) {

                            QLPhong qlPhong = new QLPhong();
                            int luaChon2 = -1;

                            System.out.println("=====Menu Chọn Phòng====");
                            System.out.println("0 - Thoát");
                            System.out.println("1 - Hiển thị số lượng phòng");
                            System.out.println("2 - Thêm 1 phòng mới");
                            System.out.println("3 - Sửa thông tin phòng theo số phòng");
                            System.out.println("4 - Hiển thị Phòng Còn/Phòng Hết");
                            System.out.println("5 - Cập nhật trạng thái phòng (Từ Còn phòng --> Hết phòng hoặc ngược lại)");
                            System.out.println("6 - Tìm Phòng theo số phòng (hiển thị 1 Phòng duy nhất)");
                            System.out.println("7 - Tìm Phòng theo giá {hiển thị" + " " + ANSI_RED + "(những phòng)" + ANSI_RESET + " " + "cùng mức giá}");
                            System.out.println("8 - Tìm Phòng theo khoảng giá {hiển thị" + " " + ANSI_RED + "(những phòng)" + ANSI_RESET + " " + "trong khoảng giá nhập vào}");
                            System.out.println("9 - Xem lại danh sách Menu chọn Phòng");

                            do {
                                boolean check2 = false;
                                while (!check2) {
                                    System.out.println("Mời bạn chọn chức năng");
                                    try {
                                        luaChon2 = sc.nextInt();
                                        if (luaChon2<0 || luaChon2 >9) throw new Exception();
                                        check2 = true;
                                    } catch (InputMismatchException e) {
                                        System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                        sc.nextLine();
                                    } catch (Exception e) {
                                        System.out.println(ANSI_RED + "Chỉ được nhập số từ 0 --> 9" + ANSI_RESET);
                                    }
                                }

                                if (luaChon2 == 1) {

                                    System.out.println(ANSI_BLUE + "====Danh sách phòng====" + ANSI_RESET);
                                    qlPhong.hienThi();

                                }
                                else if (luaChon2 == 2) {
                                    System.out.println("Mời nhập thông tin phòng mới");
                                    int phongSo = -1;
                                    boolean check3 = false;
                                    while (!check3) {
                                        System.out.println("Nhập vào phòng số");
                                        try {
                                            phongSo = sc.nextInt();
                                            check3 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println("Nhập vào loại phòng");
                                    String loaiPhong = nhapChu.nextLine();

                                    int giaPhong = -1;
                                    boolean check4 = false;
                                    while (!check4) {
                                        System.out.println("Nhập vào giá phòng");
                                        try {
                                            giaPhong = sc.nextInt();
                                            check4 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println("Nhập vào trạng thái của phòng (Còn Phòng" + ANSI_RED + "(Con)" + ANSI_RESET + "/Hết Phòng" + ANSI_RED+ "(Het)"+ ANSI_RESET +")");
                                    String trangThai = nhapChu.nextLine();

                                    Phong phong = new Phong(phongSo,loaiPhong,giaPhong,trangThai);

                                    System.out.println("Bạn có muốn thêm Phòng này vào danh sách phòng mới không?" + ANSI_RED + "[Chọn: Y/E(Exit) hoặc nhập bất kỳ để không thêm]" + ANSI_RESET);
//                System.out.println(ANSI_RED + "NOTE: Nhập 0 lần đầu tiên để hiện thị phòng có sẵn trước khi thêm phòng mới, nếu không sẽ mất toàn bộ dữ liệu!" + ANSI_RESET);
                                    char result, a = 'Y', b = 'E';
                                    result = nhapChu1.next().charAt(0);
                                    if (result == a) {
                                        qlPhong.them(phong);
                                        GhiDocFile1.writeToFile("KtraMD2.csv",qlPhong.phongList);
                                    }
                                    if (result == b) {
                                        System.exit(0);
                                    }
                                }
                                else if (luaChon2 == 3) {

                                    int soPhongS = -1;
                                    boolean check4 = false;
                                    while (!check4) {
                                        System.out.println("Nhập số Phòng muốn sửa là:");
                                        try {
                                            soPhongS = sc.nextInt();
                                            check4 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }

                                    int soPhongM = -1;
                                    boolean check5 = false;
                                    while (!check5) {
                                        System.out.println("Sửa Phòng này thành số mới là:");
                                        try {
                                            soPhongM = sc.nextInt();
                                            check5 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }

                                    System.out.println("Nhập vào loại cho Phòng mới:");
                                    String loaiPhong = nhapChu.nextLine();

                                    int giaPhong = -1;
                                    boolean check6 = false;
                                    while (!check6) {
                                        System.out.println("Nhập vào giá mới cho Phòng này:");
                                        try {
                                            giaPhong = sc.nextInt();
                                            check6 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }

                                    System.out.println("Nhập trạng thái mới cho Phòng này là:");
                                    String trangThai = nhapChu.nextLine();

                                    Phong phong1 = new Phong(soPhongM,loaiPhong,giaPhong,trangThai);
                                    qlPhong.suaPhongSo(soPhongS,phong1);
                                    GhiDocFile1.writeToFile("KtraMD2.csv",qlPhong.phongList);

                                }
                                else if (luaChon2 == 4) {

                                    System.out.println("Bạn muốn hiển thị Phòng ở trạng thái Còn Phòng hay Hết Phòng?" + ANSI_RED + "[Chọn: C/H/E(Exit) hoặc nhập bất kỳ để thoát]" + ANSI_RESET);
                                    char result, a = 'C', b = 'H', c = 'E';
                                    result = nhapChu2.next().charAt(0);

                                    if (result == a) {
                                        qlPhong.timKiemConPhong();
                                    }
                                    if (result == b) {
                                        qlPhong.timKiemHetPhong();
                                    }
                                    if (result == c) {
                                        System.exit(0);
                                    }

                                }
                                else if (luaChon2 == 5) {

                                    int soPhongCN = -1;
                                    boolean check7 = false;
                                    while (!check7) {
                                        System.out.println("Nhập số Phòng cần cập nhật trạng thái!");
                                        try {
                                            soPhongCN = sc.nextInt();
                                            check7 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }

                                    System.out.println("Bạn muốn Cập nhật Phòng này về trạng thái Còn Phòng hay Hết Phòng?" + ANSI_RED + "[Chọn: C/H/E(Exit) hoặc nhập bất kỳ để thoát]" + ANSI_RESET);
                                    char result, a = 'C', b = 'H', c = 'E';
                                    result = nhapChu2.next().charAt(0);

                                    if (result == a) {
                                        qlPhong.chuyensoPHetsangCon(soPhongCN);
                                        GhiDocFile1.writeToFile("KtraMD2.csv",qlPhong.phongList);
                                    }
                                    if (result == b) {
                                        qlPhong.chuyensoPConsangHet(soPhongCN);
                                        GhiDocFile1.writeToFile("KtraMD2.csv",qlPhong.phongList);
                                    }
                                    if (result == c) {
                                        System.exit(0);
                                    }

                                }
                                else if (luaChon2 == 6) {

                                    int phongSo = -1;
                                    boolean check8 = false;
                                    while (!check8) {
                                        System.out.println("Nhập Phòng số mấy cần tìm");
                                        try {
                                            phongSo = sc.nextInt();
                                            check8 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }
                                    qlPhong.timKiemPhongSo(phongSo);

                                }
                                else if (luaChon2 == 7) {

                                    System.out.println("Nhập vào giá Phòng cần tìm");
                                    String giaPhong = nhapChu.nextLine();
                                    qlPhong.timKiemPhongGia(giaPhong);

                                }

                                else if (luaChon2 == 8) {
                                    System.out.println("Nhập vào giá thấp nhất");
                                    int giaPhongThap = sc.nextInt();
                                    System.out.println("Nhập vào giá cao nhất");
                                    int giaPhongCao = sc.nextInt();

                                    qlPhong.timKiemKhoangGia(giaPhongThap,giaPhongCao);
                                }

                                else if (luaChon2 == 9) {

                                    System.out.println("=====Menu Chọn Phòng====");
                                    System.out.println("0 - Thoát");
                                    System.out.println("1 - Hiển thị số lượng phòng");
                                    System.out.println("2 - Thêm 1 phòng mới");
                                    System.out.println("3 - Sửa thông tin phòng theo số phòng");
                                    System.out.println("4 - Hiển thị Phòng Còn/Phòng Hết");
                                    System.out.println("5 - Cập nhật trạng thái phòng (Từ Còn phòng --> Hết phòng hoặc ngược lại)");
                                    System.out.println("6 - Tìm Phòng theo số phòng (hiển thị 1 Phòng duy nhất)");
                                    System.out.println("7 - Tìm Phòng theo giá {hiển thị" + " " + ANSI_RED + "(những phòng)" + ANSI_RESET + " " + "cùng mức giá}");
                                    System.out.println("8 - Tìm Phòng theo khoảng giá {hiển thị" + " " + ANSI_RED + "(những phòng)" + ANSI_RESET + " " + "trong khoảng giá nhập vào}");
                                    System.out.println("9 - Xem lại danh sách Menu chọn Phòng");

                                }

                            } while (luaChon2 != 0);

                        }
                        else if (luaChon1 == 2) {

                            QLHoaDon qlHoaDon = new QLHoaDon();
                            QLPhong qlPhong1 = new QLPhong();

                            int luaChon3 = -1;

                            System.out.println("=====Menu Hóa Đơn====");
                            System.out.println("0 - Thoát");
                            System.out.println("1 - Hiển thị danh sách hóa đơn");
                            System.out.println("2 - Tạo hóa đơn");
                            System.out.println("3 - Sửa thông tin hóa đơn theo số CMND của khách");
                            System.out.println("4 - Tìm kiếm hóa đơn theo khoảng thời gian (Tìm kiếm theo thời gian trả phòng)");
                            System.out.println("5 - Tính tiền hóa đơn - Xóa luôn hóa đơn");
                            System.out.println("6 - Xuất hoá đơn(xuất file csv)");
                            System.out.println("7 - Xem lại Menu!");

                            do {
                                boolean check12 = false;
                                while (!check12) {
                                    System.out.println("Mời bạn chọn chức năng");
                                    try {
                                        luaChon3 = sc.nextInt();
                                        if (luaChon3<0 || luaChon3>7) throw new Exception();
                                        check12 = true;
                                    } catch (InputMismatchException e) {
                                        System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                        sc.nextLine();
                                    } catch (Exception e) {
                                        System.out.println(ANSI_RED + "Chỉ được nhập số từ 0 --> 7" + ANSI_RESET);
                                    }
                                }

                                if (luaChon3 == 1) {

                                    System.out.println(ANSI_BLUE + "====Danh sách hóa đơn!====" + ANSI_RESET);
                                    qlHoaDon.hienThiFull();

                                }
                                else if (luaChon3 == 2) {

                                    System.out.println("Mời nhập vào thông tin hóa đơn");
                                    System.out.println("Mời nhập số CMND của khách chơi phòng");
                                    String soCMND = nhapChu.nextLine();
                                    System.out.println("Nhập họ tên khách làng chơi:");
                                    String ten = nhapChu.nextLine();

                                    int tgVao = -1;
                                    boolean check9 = false;
                                    while (!check9) {
                                        System.out.println("Nhập thời gian khách vào phòng");
                                        try {
                                            tgVao = sc.nextInt();
                                            check9 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }

                                    int tgRa = -1;
                                    boolean check10 = false;
                                    while (!check10) {
                                        System.out.println("Nhập thời gian khách trả phòng");
                                        try {
                                            tgRa = sc.nextInt();
                                            check10 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }

                                    int tAnUong = -1;
                                    boolean check11 = false;
                                    while (!check11) {
                                        System.out.println("Nhập tiền khách ăn uống trong phòng");
                                        try {
                                            tAnUong = sc.nextInt();
                                            check11 = true;
                                        } catch (Exception e) {
                                            System.out.println(ANSI_RED + "Chỉ được nhập số" + ANSI_RESET);
                                            sc.nextLine();
                                        }
                                    }

                                    System.out.println("Chọn phòng khách vào: (Nhập số phòng)");
                                    qlPhong1.timKiemHetPhong();
                                    int idOfPhong1 = sc.nextInt();
                                    Phong phong5 = qlPhong1.timKiemTheoPhong(idOfPhong1);
                                    qlHoaDon.them(new HoaDon(soCMND,ten,tgVao,tgRa,tAnUong,phong5));

                                }
                                else if (luaChon3 == 3) {

                                }
                                else if (luaChon3 == 4) {
                                    System.out.println("Nhập vào khoảng thời gian bắt đầu tìm");
                                    int tGianThap = sc.nextInt();
                                    System.out.println("Nhập vào khoảng thời gian kết thúc tìm");
                                    int tGianCao = sc.nextInt();

                                    qlHoaDon.timKiemKhoangTGian(tGianThap,tGianCao);

                                }
                                else if (luaChon3 == 5) {
                                    int sum = 0;
                                    System.out.println("Nhập vào số CMND của khách");
                                    String soCMND = nhapChu.nextLine();
                                    if (qlHoaDon.timKiemCMND(soCMND) != -1) {
                                        System.out.println("Nhập số phòng khách vào mua vui: ");
                                        qlHoaDon.timKiemCMND1(soCMND);
                                        int idOfPhong = sc.nextInt();
                                        if(qlPhong1.timKiemPhongSo1(idOfPhong) != -1) {
                                            sum = QLPhong.phongList.get(qlPhong1.timKiemPhongSo1(idOfPhong)).getGiaPhong()*(qlHoaDon.getHoaDonList().get(qlHoaDon.timKiemCMND(soCMND)).getTgRa() - qlHoaDon.getHoaDonList().get(qlHoaDon.timKiemCMND(soCMND)).getTgVao()) + qlHoaDon.getHoaDonList().get(qlHoaDon.timKiemCMND(soCMND)).gettAnUong();
                                            System.out.println("Tổng tiền khách phải nôn ra là: " + sum);
                                            qlHoaDon.xoaHD(soCMND);
                                        }
                                        else {
                                            System.out.println("Nhập sai phòng");
                                        }
                                    }
                                    else {
                                        System.out.println("Nhập sai số CMND");
                                    }
//                                    qlHoaDon.timKiemCMND(soCMND);
                                }
                                else if (luaChon3 == 6) {

                                }
                                else if (luaChon3 == 7) {

                                    System.out.println("=====Menu Hóa Đơn====");
                                    System.out.println("0 - Thoát");
                                    System.out.println("1 - Hiển thị danh sách hóa đơn");
                                    System.out.println("2 - Tạo hóa đơn");
                                    System.out.println("3 - Sửa thông tin hóa đơn theo số CMND của khách");
                                    System.out.println("4 - Tìm kiếm hóa đơn theo khoảng thời gian");
                                    System.out.println("5 - Tính tiền hóa đơn - Xóa luôn hóa đơn");
                                    System.out.println("6 - Xuất hoá đơn(xuất file csv)");
                                    System.out.println("7 - Xem lại Menu!");

                                }

                            } while (luaChon3 != 0);









                        }
                        else if (luaChon1 == 3) {




                        }
                        else if (luaChon1 == 4) {
                            System.out.println("=====Menu chương trình====");
                            System.out.println("0 - Thoát chương trình");
                            System.out.println("1 - Quản lý phòng Vũ Trường");
                            System.out.println("2 - Quản lý hóa đơn");
                            System.out.println("3 - Quản lý nhân viên Vũ Trường");
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
                String tenDNM = ckeckRegex.checkTenDK();
                System.out.println("Nhập mật khẩu mới");
                String matkhauDNM = ckeckRegex.matKhauDK();

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
