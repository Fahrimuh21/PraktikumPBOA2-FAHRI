/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan11;

/**
 *
 * @author fahri
 */
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan key dan value,
 *             dimana key adalah NIM dan value adalah nama mahasiswa.
 */
public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new LinkedHashMap<>();

        mahasiswaMap.put("230001", "Adi");
        mahasiswaMap.put("230002", "Bambang");
        mahasiswaMap.put("230003", "Cici");
        mahasiswaMap.put("230004", "Didi");

        // lambda digunakan untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}