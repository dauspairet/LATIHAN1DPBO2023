/*Saya Muhamad Firdaus [2101995] mengerjakan
soal Latihan 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <string>
#include "Mahasiswa.cpp"

using namespace std;

int main(){
    // Deklarasi untuk menggunakan metode class MahasiswaData
    MahasiswaData Mahasiswa;
    
    while (true){
        // Output aksi
        cout << "=====C++====" << endl;
        cout << "____Aksi____" << endl;
        cout << "=====C++====" << endl;
    
        string action;
        // Ouput aksi yang dapat dilakukan
        cout << " > 1: Tambah" << endl;
        cout << " > 2: Edit" << endl;
        cout << " > 3: Hapus" << endl;
        cout << " > 4: Tampilkan" << endl;
        cout << " > 5: Keluar" << endl;
        cout << "Pilihan:";
        // Menerima input dari pengguna
        getline(cin, action);

        // Jika input merupakan "1"
        if (action == "1"){
            // Akan melakukan penambahan data mahasiswa
            // Input Nama
            string nama;
            string nim;
            string studi;
            string fakultas;
                
            // Input Nama
            cout << "Nama: ";
            getline(cin, nama);

            // Input NIM
            cout << "NIM: ";
            getline(cin, nim);

            // Input Program Studi
            cout << "Program Studi: ";
            getline(cin, studi);

            // Input Fakultas
            cout << "Fakultas: ";
            getline(cin, fakultas);

            // Menambah data mahasiswa
            Mahasiswa.addMahasiswa(nama, nim, studi, fakultas);
        } 
        // Jika input merupakan "2"
        else if (action == "2"){
            string nim;

            // Input NIM
            cout << "NIM: ";
            getline(cin, nim);

            // Input Nama
            string nama;
            cout << "Nama baru (kosongkan jika tidak ingin mengubah): ";
            getline(cin, nama);
            // Jika kosong maka tidak akan diubah
            if (nama.empty()){
                nama = "";
            }

            // Input Program Studi
            string studi;
            cout << "Program studi baru (kosongkan jika tidak ingin mengubah): ";
            getline(cin, studi);
            // Jika kosong maka tidak akan diubah
            if (studi.empty()){
                studi = "";
            }

            // Input Fakultas
            string fakultas;
            cout << "Fakultas baru (kosongkan jika tidak ingin mengubah): ";
            getline(cin, fakultas);
            // Jika kosong maka tidak akan diubah
            if (fakultas.empty()){
                fakultas = "";
            }

            // Mengedit data mahasiswa
            Mahasiswa.editMahasiswa(nim, nama, studi, fakultas);
        } 
        // Jika input merupakan "3"
        else if (action == "3"){
            // Akan melakukan aksi delete
            // Input Nim
            string nim;
            cout << "NIM: ";
            getline(cin, nim);

            // Menghapus data mahasiswa
            Mahasiswa.deleteMahasiswa(nim);
        } 
        // Jika input merupakan "4"
        else if (action == "4"){
            // Menampilkan tabel
            Mahasiswa.dataTabel();
        } 
        // Jika input merupakan "5" maka akan melakukan exit
        else if (action == "5"){
            cout << "---------------" << endl;
            cout << "Sampai Jumpa" << endl;
            cout << "---------------" << endl;
            break;
        } 
        // Jika input bukan 1-5
        else{
            cout << "Pilihan Tak Tersedia, Silakan Coba Lagi" << endl;
        }
    }
    return 0;
}