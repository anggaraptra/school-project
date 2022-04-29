package com.tugas;

import java.util.Scanner;

public class PendaftaranSiswaBaru {
    public static void main(String[] args) {
        String nama;
        int jurusan;
        Scanner input = new Scanner(System.in);

        System.out.println("Pendaftaran Siswa Baru");
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.println("");
        System.out.println("Pilihlah Jurusan Anda");
        System.out.println("1. Rekayasa Perangkat Lunak");
        System.out.println("2. Animasi");
        System.out.println("3. Teknik Komputer Jaringan");
        System.out.println("4. Multimedia");
        System.out.println("5. Desain Komunikasi Visual");
        System.out.print("Pilih jurusan : ");
        jurusan = input.nextInt();
        System.out.println("");

        if ( jurusan == 1 ) {
            System.out.println("Selamat " + nama);
            System.out.println("Anda terdaftar di jurusan Rekayasa Perangkat Lunak");
        } else if ( jurusan == 2 ) {
            System.out.println("Selamat " + nama);
            System.out.println("Anda terdaftar di jurusan Animasi");
        } else if ( jurusan == 3 ) {
            System.out.println("Selamat " + nama);
            System.out.println("Anda terdaftar di jurusan Teknik Komputer Jaringan");
        } else if ( jurusan == 4 ) {
            System.out.println("Selamat " + nama);
            System.out.println("Anda terdaftar di jurusan Multimedia");
        } else if ( jurusan == 5 ) {
            System.out.println("Selamat " + nama);
            System.out.println("Anda terdaftar di jurusan Desain Komunikasi Visual");
        } else {
            System.out.println("Jurusan tidak tersedia");
        }
    }
}
