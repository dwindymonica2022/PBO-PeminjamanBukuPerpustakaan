package com.pbo;

class Buku{
    String judul, penulis, penerbit;
    int halaman;

    Buku(String judul, String penulis, String penerbit, int halaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.halaman = halaman;
    }

    void dataBuku() {
        System.out.println("\nDETAIL BUKU\n=======================\n");
        System.out.println();
        System.out.println("Judul = " + judul);
        System.out.println("Penulis = " + penulis);
        System.out.println("Penerbit = " + penerbit);
        System.out.println("Jumlah Halaman = " + halaman);
        System.out.println("==================================");
    }

}

class Peminjam{
    String nama, NPM, jurusan, prodi;

    Buku buku;

    void pinjamBuku(Buku buku){
        this.buku = buku;
    }

    Peminjam(String nama, String NPM, String jurusan, String prodi){
        this.nama = nama;
        this.NPM = NPM;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }

    void dataPeminjam(){
        System.out.println("****** Data Peminjaman Buku ******");
        System.out.println();
        System.out.println("Nama = " + nama);
        System.out.println("NPM  = " + NPM);
        System.out.println("Jurusan = " + jurusan);
        System.out.println("Program Studi = " + prodi);
        buku.dataBuku();
    }

}

public class Main {

    public static void main(String[] args){
        Peminjam peminjam1 = new Peminjam("Dwindy Monica", "2015061022", "Teknik Elektro", "Teknik Informatika");
        Buku buku1 = new Buku("Pemrograman Bahasa C++","Asep Muhidin", "Zeyrank Offset", 56);

        peminjam1.pinjamBuku(buku1);
        peminjam1.dataPeminjam();
    }
}

