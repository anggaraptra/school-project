package com.tugas;

import java.util.Scanner;

public class MenghitungNilaiAkhir {
    public static void main(String[] args) {

        // input scanner
        Scanner input = new Scanner(System.in);

        // deklarasi inputan identitas
        String nama, kelas;
        int absen;

        // deklarasi inputan nilai
        double tugas1, tugas2, tugas3, tugas4, totalTugas,
            ulangan1, ulangan2, totalUlangan, ulanganAkhir, totalAkhir;

        // output program
        System.out.println("");
        System.out.println("Menghitung nilai akhir");
        System.out.println("< ================== >");
        System.out.println("Masukan indentitas anda");
        System.out.print("Nama Siswa : ");
        nama = input.nextLine();
        System.out.print("Kelas : ");
        kelas = input.nextLine();
        System.out.print("No. Absen : ");
        absen = input.nextInt();
        System.out.println("");
        System.out.println("Masukan nilai anda");
        System.out.print("Nilai tugas 1 : ");
        tugas1 = input.nextInt();
        System.out.print("Nilai tugas 2 : ");
        tugas2 = input.nextInt();
        System.out.print("Nilai tugas 3 : ");
        tugas3 = input.nextInt();
        System.out.print("Nilai tugas 4 : ");
        tugas4 = input.nextInt();
        System.out.print("Nilai ulangan harian 1 : ");
        ulangan1 = input.nextInt();
        System.out.print("Nilai ulangan harian 2 : ");
        ulangan2 = input.nextInt();
        System.out.print("Nilai UAS : ");
        ulanganAkhir = input.nextInt();
        System.out.println("");

        // menghitung total nilai tugas
        totalTugas = (tugas1 + tugas2 + tugas3 + tugas4) / 4;

        // menghitung total nilai ulangan harian
        totalUlangan = (ulangan1 + ulangan2) / 2;

        // menghitung nilai akhir raport
        totalAkhir = totalTugas*40/100 + totalUlangan*30/100 + ulanganAkhir*30/100;

        System.out.println("Nilai raport : " + totalAkhir);
        System.out.print("Grade : ");

        // kondisi menentukan grade nilai
        if (totalAkhir <= 100 && totalAkhir >= 85 ) {
            System.out.println("A");
            System.out.println("");
            System.out.println("Selamat " + nama + ", anda naik ke kelas XII");
        } else if (totalAkhir <= 84 && totalAkhir >= 75) {
            System.out.println("B");
            System.out.println("");
            System.out.println("Selamat " + nama + ", anda naik ke kelas XII");
        } else if (totalAkhir <= 74 && totalAkhir >= 60) {
            System.out.println("C");
            System.out.println("");
            System.out.println("Maaf " + nama + ", anda harus melakukan remidial");
        } else if (totalAkhir <= 59 && totalAkhir >= 40) {
            System.out.println("D");
            System.out.println("");
            System.out.println("Maaf " + nama + ", anda harus melakukan remidial!");
        } else if (totalAkhir >= 0 && totalAkhir <= 49) {
            System.out.println("E");
            System.out.println("");
            System.out.println("Maaf " + nama + ", anda harus melakukan remedia");
        } else {
            System.out.println("-");
            System.out.println("");
            System.out.println("Nilai tidak valid");
        }
    }
}
