package prod;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhoiTaoDoiTuong_Product {
    public static void main(String[] args) {
        Product p1 = null,p2; // Khai báo đối tượng

        p1 = new Product(); //Khởi tạo qua constructor không có tham số
        p1.setProId("P01");
        p1.setProName("Máy tính Dell core i7");
        p1.setProducer("Dell");
        p1.setYearMaking(2025);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        p1.setExpireDate(LocalDate.parse("21/12/2025",dtf));

        p1.setQuantity(10);
        p1.setPrice(17000000D);

        System.out.println("Sản phẩm thứ nhất: ");
        System.out.println("\tMã sản phẩm: "+p1.getProId());
        System.out.println("\tTên sản phẩm: "+p1.getProName());
        System.out.println("\tNhà sản xuất: "+p1.getProducer());
        System.out.println("\tNăm sản xuất: "+p1.getYearMaking());
        System.out.println("\tNgày hết hạn: "+dtf.format(p1.getExpireDate()));
        System.out.println("\tSố lượng: "+p1.getQuantity());
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("\tGiá bán: "+nf.format(p1.getPrice()));

        //p2 khởi tạo qua constructor có tham số
        p2 = new Product("P02","Tủ lạnh","Sanyo",2024,LocalDate.parse("15/09/2024",dtf),30,8000000D);
        System.out.println("Sản phẩm thứ hai: ");
        System.out.println("\tMã sản phẩm: "+p2.getProId());
        System.out.println("\tTên sản phẩm: "+p2.getProName());
        System.out.println("\tNhà sản xuất: "+p2.getProducer());
        System.out.println("\tNăm sản xuất: "+p2.getYearMaking());
        System.out.println("\tNgày hết hạn: "+dtf.format(p2.getExpireDate()));
        System.out.println("\tSố lượng: "+p2.getQuantity());
        System.out.println("\tGiá bán: "+nf.format(p2.getPrice()));

    }
}
