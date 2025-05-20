/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bainopthayday2.bt1;

/**
 *
 * @author DUNG LE
 */
public class student {
    private  String name;
    private int id;
    private static int nextId =1000;

    public student() {
    }

    public student(String name, int id) {
        this.name = name;
        this.id = id;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        student.nextId = nextId;
    }
    public void dispay(){
        System.out.println("Thong tin sinh vien:");
        System.out.println("Ten: " +name );
        System.out.println("Id: " +id);
    }
    public static void main(String[] args) {
        student s1 = new student("Alice", nextId);
        student s2 = new student("Bob", nextId);
        s1.dispay();
        s2.dispay();
    }
}
