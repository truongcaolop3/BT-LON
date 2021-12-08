/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon2;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Person {
    private 
        String cmnd ;
        String name;
        Date ngaysinh;
        String gender;

    public Person(String cmnd, String name, Date ngaysinh, String gender) {
        this.cmnd = cmnd;
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.gender = gender;
    }
        

    public Person() {
        super();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
//    public void inputPerson(){
//        
//        System.out.println("nhap cmnd: " + this.getCmnd());
//        System.out.println("nhap name: " + this.getName());
//        System.out.println("nhap ngay sinh: " + this.getNgaysinh());
//        System.out.println("nhap gioi tinh: " + this.getGender());
//        
//    }

    @Override
    public String toString() {
        return "Person{" + "cmnd=" + cmnd + ", name=" + name + ", ngaysinh=" + ngaysinh + ", gender=" + gender + '}';
    }
    
}
