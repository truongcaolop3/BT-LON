/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon2;

/**
 *
 * @author DELL
 */
public class Student extends Person implements StudenShip {

    private 
        String student_id;
        String name;
        String phone;
        String email;
        int start_year;
        int end_year;
        float gba;

    public Student() {
        super();
    }

    public Student(String student_id, String name, String phone, String email, int start_year, int end_year, float gba) {
        this.student_id = student_id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.start_year = start_year;
        this.end_year = end_year;
        this.gba = gba;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStart_year() {
        return start_year;
    }

    public void setStart_year(int start_year) {
        this.start_year = start_year;
    }

    public int getEnd_year() {
        return end_year;
    }

    public void setEnd_year(int end_year) {
        this.end_year = end_year;
    }

    public float getGba() {
        return gba;
    }

    public void setGba(float gba) {
        this.gba = gba;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputstudent() {
        System.out.println("nhap cmnd: " + this.getCmnd());
        System.out.println("nhap studentID: " + this.getStudent_id());
        System.out.println("nhap name: " + this.getName());
        System.out.println("nhap ngay sinh: " + this.getNgaysinh());
        System.out.println("nhap gioi tinh: " + this.getGender());
        System.out.println("nhap phone: " + this.getPhone());
        System.out.println("nhap email: " + this.getEmail());
        System.out.println("nhap start year: " + this.getStart_year());
        System.out.println("nhap end year: " + this.getEnd_year());
        System.out.println("nhap gba: " + this.getGba());

    }

    @Override
    public String toString() {
        String s = super.toString();
        s = "Student{" + "student_id=" + student_id + ", phone=" + phone + ", email=" + email + ", start_year=" + start_year + ", end_year=" + end_year + ", gba=" + gba + '}';
        return s;
    }

    @Override
    public double st_ship(String st_ship_name, float money, String benefit) {
        float hp = 0;
        if (this.gba > 3.2) {
            hp = 1000000;
        } else if (this.gba > 3.6) {
            hp = 2000000;
        }
        return hp;
    }

    int compareTo(Student student) {
        
        return 0;
    }
}
