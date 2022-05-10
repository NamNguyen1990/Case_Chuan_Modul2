package file;

import model.Phong;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class GhiDocFile1 {
    public static void writeToFile (String path, List<Phong> phongList) throws IOException {
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        String str = "Phòng Số, Loại Phòng, Giá Phòng, Trạng Thái" +"\n";
        for (Phong i: phongList) {
            str += i.getPhongSo() + "," + i.getLoaiPhong() + "," + i.getGiaPhong() + "," + i.getTrangThai() +"\n";
        }
        pw.write(str);
        pw.close();
    }


    public static List<Phong> readFromFile (String path,List<Phong> phongList) throws IOException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while (sc.hasNext()) {
            String a = sc.nextLine();
            String[] value = a.split(",");
            phongList.add(new Phong(Integer.parseInt(value[0]), value[1], Integer.parseInt(value[2]), value[3]));
            System.out.println(a);
        }
        sc.close();
        return phongList;
    }

}
