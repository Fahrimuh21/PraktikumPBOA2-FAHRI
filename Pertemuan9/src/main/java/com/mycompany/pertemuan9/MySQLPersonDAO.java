/* Nama File : MySQLPersonDAO.java
 * Deskripsi : 
 * Pembuat   : Muhammad Fahri
 * Tanggal   : 17 Mei 2026
 */

package com.mycompany.pertemuan9;

/**
 *
 * @author fahri
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLPersonDAO implements PersonDAO {

    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo",
                "root",
                ""
        );

        String query = "INSERT INTO person(name) VALUES (?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.executeUpdate();

        ps.close();
        con.close();
    }
}
