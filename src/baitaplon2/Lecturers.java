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
public class Lecturers extends Person{
    private
        String department_name; 
        String lecturers_id;
        int start_year ;
        String phone;
        String email;
        float salary;

    public Lecturers() {
    }

    public Lecturers(String department_name, String lecturers_id, int start_year, float salary) {
        this.department_name = department_name;
        this.lecturers_id = lecturers_id;
        this.start_year = start_year;
        this.salary = salary;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getLecturers_id() {
        return lecturers_id;
    }

    public void setLecturers_id(String lecturers_id) {
        this.lecturers_id = lecturers_id;
    }

    public int getStart_year() {
        return start_year;
    }

    public void setStart_year(int start_year) {
        this.start_year = start_year;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
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
    
    public void inputLecturers(){
        System.out.println("nhap cmnd: " + this.getCmnd());
        System.out.println("nhap khoa: " + this.getDepartment_name() );
        System.out.println("nhap lecturers ID: " + this.getLecturers_id());
        System.out.println("nhap name:" + this.getName());
        System.out.println("nhap phone: " + this.getPhone());
        System.out.println("nhap email: " + this.getEmail());
        System.out.println("nhap start year: " + this.getStart_year());
        System.out.println("nhap salary: " + this.getSalary());
    }

    @Override
    public String toString() {
        String s = super.toString();
        
        s = "Lecturers{" + "department_name=" + department_name + ", lecturers_id=" + lecturers_id + ", start_year=" + start_year + ", phone=" + phone + ", email=" + email + ", salary=" + salary + '}';
        return s;
    }
}
