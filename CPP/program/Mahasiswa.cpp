/*Saya Muhamad Firdaus [2101995] mengerjakan
soal Latihan 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

#include <iostream>
#include <string>

using namespace std;

// Ukuran array
const int n = 88;

// Deklarasi class
class MahasiswaData{
    // private atribut
    private:
        struct Mahasiswa{
            string nama;
            string nim;
            string studi;
            string fakultas;
            
            // Get Nama
            string getNama(){ 
                return nama;
            }

            // Set Nama
            void setNama(string nama){ 
                this->nama = nama;
            }

            // Get Nim
            string getNim(){ 
                return nim;
            }

            // Set Nim
            void setNim(string nim){ 
                this->nim = nim;
            }

            // Get Studi
            string getStudi(){ 
                return studi;
            }

            // Set Studi
            void setStudi(string studi){ 
                this->studi = studi;
            }

            // Get Fakultas
            string getFakultas(){ 
                return fakultas;
            }

            // Set Fakultas
            void setFakultas(string fakultas){ 
                this->fakultas = fakultas;
            }
        };

    // Deklarasi array objek mahasiswa dengan ukuran n 
    Mahasiswa data[n];

    public:
        // Banyak data
        int size;

        MahasiswaData(){
            size = 0;
        }

        // Menambah data mahasiswa
        void addMahasiswa(string nama, string nim, string studi, string fakultas){
            // ukuran data akan bertambah jika melakukan penambahan data
            Mahasiswa mhs ={nama, nim, studi, fakultas};
            data[size++] = mhs;
        }

        // Mengedit data mahasiswa dengan patokan nim
        void editMahasiswa(string nim, string nama="", string studi="", string fakultas=""){
            for (int i = 0; i < size; i++){
                // Jika ada nim di data sama dengan nim yang di-input-kan
                if (data[i].getNim() == nim){
                    // Jika input tidak kosong maka akan diganti dengan data sesuai input
                    if (!nama.empty()){
                        data[i].setNama(nama);
                    }
                    if (!studi.empty()){
                        data[i].setStudi(studi);
                    }
                    if (!fakultas.empty()){
                        data[i].setFakultas(fakultas);
                    }
                    break;
                }
            }
        }

        // Menghapus data mahasiswa dengan patokan nim
        void deleteMahasiswa(string nim){
            for (int i = 0; i < size; i++){
                // Jika ada nim di data sama dengan nim yang di-input-kan
                if (data[i].getNim() == nim){
                    // Maka ukuran data akan dikurangi
                    for (int j = i; j < size - 1; j++){
                        data[j] = data[j + 1];
                    }
                    size--;
                    break;
                }
            }
        }

        // Menampilkan tabel data mahasiswa
        void dataTabel(){
            // Deklarasi maksimal panjang sebuah string
            int max_nama = 17,
            max_nim = 17,
            max_studi = 17,
            max_fakultas = 17;

            // Menentukan string terpanjang
            for (int i = 0; i < size; i++){
                if (data[i].getNama().length() > max_nama){
                    max_nama = data[i].getNama().length();
                }
                if (data[i].getNim().length() > max_nim){
                    max_nim = data[i].getNim().length();
                }
                if (data[i].getStudi().length() > max_studi){
                    max_studi = data[i].getStudi().length();
                }
                if (data[i].getFakultas().length() > max_fakultas){
                    max_fakultas = data[i].getFakultas().length();
                }
            }

            // Output judul tabel   
            cout << endl << "Daftar Mahasiswa:" << endl;
            cout << "_____________________________________________________________________________________" << endl;
                
            // Header kolom
            cout << "No. | Nama";
            // Panjang String dikurangi dengan 4 = panjang string "Nama"
            for (int i = 0; i < max_nama - 4; i++){
                cout << " ";
            }

            cout << " | NIM";            
            // Panjang String dikurangi dengan 3 = panjang string "NIM"
            for (int i = 0; i < max_nim - 3; i++){
                cout << " ";
            }
            cout << " | Program Studi";
            // Panjang String dikurangi dengan 13 = panjang string "Program Studi"
            for (int i = 0; i < max_studi - 13; i++){
                cout << " ";
            }


            cout << " | Fakultas";
            // Panjang String dikurangi dengan 9 = panjang string "Fakultas"
            for (int i = 0; i < max_fakultas - 9; i++){
                cout << " ";
            }

            // New line
            cout << endl;
                
            // Output data
            for (int i = 0; i < size; i++){
                // Output Nama
                cout << " " << i + 1 << "  | " << data[i].nama;
                // Memberi spasi
                for (int j = 0; j < max_nama - data[i].getNama().length(); j++){
                    cout << " ";
                }

                // Output Nim
                cout << " | " << data[i].nim;
                // Memberi spasi
                for (int j = 0; j < max_nim - data[i].getNim().length(); j++){
                    cout << " ";
                }

                // Output Studi
                cout << " | " << data[i].studi;
                // Memberi spasi
                for (int j = 0; j < max_studi - data[i].getStudi().length(); j++){
                    cout << " ";
                }

                //  Output Fakultas
                cout << " | " << data[i].fakultas;
                // Memberi spasi
                for (int j = 0; j < max_fakultas - data[i].getFakultas().length(); j++){
                    cout << " ";
                }

                // New line
                cout << endl;
            }
            cout << "_____________________________________________________________________________________" << endl;
        }

        // Destructor
        ~MahasiswaData(){
            
        }
    };