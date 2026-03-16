package stu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DanhSach_SinhVien {
    public static void main(String[] args) {
        //Khai báo mảng
        Student[] list;
        //Khai báo số phần tử của mảng (chính là số sinh viên)
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập vào số sinh viên: ");
            n = Integer.parseInt(sc.nextLine());
            if(n<1){
                System.out.println("Nhập lại n");
            }
        }while(n<1);

        //Khởi tạo mảng
        list = new Student[n];

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin sinh viên thứ "+(i+1));
            Student s = new Student();
            System.out.println("Nhập mã sinh viên: ");
            s.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập họ tên: ");
            s.setFullName(sc.nextLine());
            System.out.println("Nhập giới tính: ");
            s.setGender(Boolean.parseBoolean(sc.nextLine()));
            System.out.println("Nhập ngày sinh: ");
            s.setBirthday(LocalDate.parse(sc.nextLine(),dtf));
            System.out.println("Nhập quê quán: ");
            s.setAddress(sc.nextLine());
            System.out.println("Nhập lớp học: ");
            s.setClassName(sc.nextLine());

            list[i]=s;
        }

        System.out.println("\nThông tin các sinh viên: ");
        int index = 1;
        for(Student s:list){
            System.out.println("Sinh viên: "+index++);
            System.out.println("\tMã sinh viên: "+s.getId());
            System.out.println("\tHọ tên: "+s.getFullName());
            System.out.println("\tGiới tính: "+(s.getGender()?"Nam":"Nữ"));
            System.out.println("\tNgày sinh: "+dtf.format(s.getBirthday()));
            System.out.println("\tQuê quán: "+s.getAddress());
            System.out.println("\tLớp học: "+s.getClassName());
        }
    }
}
