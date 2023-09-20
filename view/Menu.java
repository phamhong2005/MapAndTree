package view;

import manager.StudentManager;
import model.Student;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    Scanner InputInt = new Scanner(System.in);
    Scanner InputString = new Scanner(System.in);

    StudentManager studentManager = new StudentManager();
    int select;

    public void showMenu() {
        do {
            System.out.println(" ===Menu===\n1.Thêm sinh viên\n2.Sửa sinh viên\n3.Sửa thông tin sinh viên \n4.Hiển thị tất cả \n5.Xóa sinh viên ");
            System.out.println("Nhập lựa chọn của bạn");
            select = InputInt.nextInt();
            switch (select) {
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 4:
                    list();
                    break;
                case 5:
                    delete();
                    break;
            }
        } while (select != 0);
    }

    public void add() {
        System.out.println("Nhập id vào đây");
        int id = InputInt.nextInt();
        System.out.println("Nhập tên vào đây");
        String name = InputString.nextLine();
        System.out.println("Nhập điểm toán");
        double math = InputInt.nextDouble();
        System.out.println("Nhập điểm văn");
        double literature = InputString.nextDouble();
        System.out.println("Nhập điểm anh");
        double english = InputString.nextDouble();
        double[] score = {math, literature, english};
        InputString.nextLine();
        System.out.println("Nhập giới tính đi");
        String sex = InputString.nextLine();
        Student student = new Student(id, name, score, sex);
        studentManager.add(student);
        System.out.println("Thêm thành công");
    }

    public void list() {
        System.out.println(studentManager.getAll());
    }

    public void delete() {
        System.out.println("Nhập id muốn xóa");
        int id = InputInt.nextInt();
        studentManager.remove(id);
        System.out.println("Xóa thành công");
    }

    public void update() {
        System.out.println("Nhập id muốn sửa");
        int id = InputInt.nextInt();
        System.out.println("Nhập tên vào đây");
        String name = InputString.nextLine();
        System.out.println("Nhập điểm toán");
        double math = InputInt.nextDouble();
        System.out.println("Nhập điểm văn");
        double literature = InputString.nextDouble();
        System.out.println("Nhập điểm anh");
        double english = InputString.nextDouble();
        double[] score = {math, literature, english};
        InputString.nextLine();
        System.out.println("Nhập giới tính đi");
        String sex = InputString.nextLine();
        Student student = new Student(id, name, score, sex);
        studentManager.update(student);
        System.out.println("Sửa thành công");
    }
}
