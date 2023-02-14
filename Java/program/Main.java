/*Saya Muhamad Firdaus [2101995] mengerjakan
soal Latihan 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

// Import library
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Menerima input dari pengguna
        Scanner scan = new Scanner(System.in);

        // Membuat objek Mahasiswa
        Mahasiswa Mahasiswa = new Mahasiswa();

        while (true){
            // Output aksi
            System.out.println("============");
            System.out.println("____Aksi____");
            System.out.println("============");

            // Ouput aksi yang dapat dilakukan
            System.out.println(" > 1: Tambah");
            System.out.println(" > 2: Edit");
            System.out.println(" > 3: Hapus");
            System.out.println(" > 4: Tampilkan");
            System.out.println(" > 5: Keluar");
            System.out.print("Pilihan:");

            // Menerima input dari pengguna
            String action = scan.nextLine();

            // Jika input merupakan "1"
            if (action.equals("1")){
                // Akan melakukan penambahan data mahasiswa
                // Input Nama
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                
                // Input NIM
                System.out.print("NIM: ");
                String nim = scan.nextLine();
                
                // Input Program Studi
                System.out.print("Program Studi: ");
                String studi = scan.nextLine();
                
                // Input Fakultas
                System.out.print("Fakultas: ");
                String fakultas = scan.nextLine();

                // Menambah data mahasiswa
                Mahasiswa.addMahasiswa(nama, nim, studi, fakultas);
            }
            // Jika input merupakan "2"
            else if (action.equals("2")){
                // Akan melakukan aksi edit
                // Input Nim
                System.out.print("NIM: ");
                String nim = scan.nextLine();
                
                // Input Nama
                System.out.print("Nama baru (kosongkan jika tidak ingin mengubah): ");
                String nama = scan.nextLine();

                // Jika kosong maka tidak akan diubah
                if (nama.isEmpty()){
                    nama = "";
                }

                // Input Studi
                System.out.print("Program studi baru (kosongkan jika tidak ingin mengubah): ");
                String studi = scan.nextLine();

                // Jika kosong maka tidak akan diubah
                if (studi.isEmpty()){
                    studi = "";
                }

                // Input fakultas
                System.out.print("Fakultas baru (kosongkan jika tidak ingin mengubah): ");
                String fakultas = scan.nextLine();

                // Jika kosong maka tidak akan diubah
                if (fakultas.isEmpty()){
                    fakultas = "";
                }

                // Mengedit data mahasiswa
                Mahasiswa.editMahasiswa(nim, nama, studi, fakultas);
            }
            // Jika input merupakan "3"
            else if (action.equals("3")){
                // Akan melakukan aksi delete
                // Input Nim
                System.out.print("NIM: ");
                String nim = scan.nextLine();

                // Menghapus data mahasiswa
                Mahasiswa.deleteMahasiswa(nim);
            }
            // Jika input merupakan "4"
            else if (action.equals("4")){
                // Menampilkan tabel
                Mahasiswa.dataTabel();
            }
            // Jika input merupakan "5" maka akan melakukan exit
            else if (action.equals("5")){
                System.out.println("---------------");
                System.out.println("Sampai Jumpa");
                System.out.println("---------------");
                break;
            } 
            // Jika input bukan 1-5
            else{
                System.out.println("Pilihan Tak Tersedia, Silakan Coba Lagi");
            }
        }

        // Mencegah resources leak
        scan.close();
    }
}