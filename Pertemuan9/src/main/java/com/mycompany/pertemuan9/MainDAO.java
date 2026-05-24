/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan9;

/**
 *
 * @author fahri
 */
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");

        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
            System.out.println("Data berhasil disimpan ke database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
