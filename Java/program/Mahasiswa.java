/*Saya Muhamad Firdaus [2101995] mengerjakan
soal Latihan 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

// Deklarasi class
class Mahasiswa{

    // private atribut
    private static Mahasiswa[] data = new Mahasiswa[88];
    private static int size = 0;
    private String nama;
    private String nim;
    private String studi;
    private String fakultas;
    
    // Constructor
    public Mahasiswa(){
        this.nama = "";
        this.nim = "";
        this.studi = "";
        this.fakultas = "";
    }

    // Constructor dengan parameter
    public Mahasiswa(String nama, String nim, String studi, String fakultas){
        this.nama = nama;
        this.nim = nim;
        this.studi = studi;
        this.fakultas = fakultas;
    }

    // Get Nama
    public String getNama(){
        return nama;
    }

    // Set Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Get Nim
    public String getNim(){
        return nim;
    }

    // Set Nim
    public void setNim(String nim){
        this.nim = nim;
    }

    // Get Studi
    public String getStudi(){
        return studi;
    }

    // Set Studi
    public void setStudi(String studi){
        this.studi = studi;
    }

    // Get Fakultas
    public String getFakultas(){
        return fakultas;
    }

    // Set Fakultas
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    // Menambah mahasiswa
    public void addMahasiswa(String nama, String nim, String studi, String fakultas){
        // ukuran data akan bertambah jika melakukan penambahan data
        data[size++] = new Mahasiswa(nama, nim, studi, fakultas);
    }

    // Mengedit data mahasiswa dengan patokan nim
    public void editMahasiswa(String nim, String nama, String studi, String fakultas){
        for (int i = 0; i < size; i++){
            // Jika ada nim di data sama dengan nim yang di-input-kan
            if (data[i].getNim().equals(nim)){
            // Jika input tidak kosong maka akan diganti dengan data sesuai input
                if (nama != ""){
                    data[i].setNama(nama);
                }
                if (studi != ""){
                    data[i].setStudi(studi);
                }
                if (fakultas != ""){
                    data[i].setFakultas(fakultas);
                }
                break;
            }
        }
    }

    // Menghapus data mahasiswa dengan patokan nim
    public void deleteMahasiswa(String nim){
        for (int i = 0; i < size; i++){
            // Jika ada nim di data sama dengan nim yang di-input-kan
            if (data[i].getNim().equals(nim)){
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
    public void dataTabel(){
        // Patokan panjang maksimal
        int max_nama = 17,
        max_nim = 17,
        max_studi = 17,
        max_fakultas = 17;

        // Menentukan panjang string
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
        System.out.println();
        System.out.println("Daftar Mahasiswa:");
        // Output garis bawah tabel
        System.out.println("_____________________________________________________________________________________");

        // Header kolom
        System.out.print("No. | Nama");
        // Panjang String dikurangi dengan 4 = panjang string "Nama"
        for (int i = 0; i < max_nama - 4; i++){
            System.out.print(" ");
        }

        // Panjang String dikurangi dengan 3 = panjang string "NIM"
        System.out.print(" | NIM");
        for (int i = 0; i < max_nim - 3; i++){
            System.out.print(" ");
        }

        // Panjang String dikurangi dengan 13 = panjang string "Program Studi"
        System.out.print(" | Program Studi");
        for (int i = 0; i < max_studi - 13; i++){
            System.out.print(" ");
        }
        
        // Panjang String dikurangi dengan 9 = panjang string "Fakultas"
        System.out.print(" | Fakultas");
        for (int i = 0; i < max_fakultas - 9; i++){
            System.out.print(" ");
        }

        // Memberi Jarak Enter
        System.out.println();

        // Output data
        for (int i = 0; i < size; i++){
            // Output Nama
            System.out.print(" " + (i + 1) + "  | " + data[i].getNama());
            // Memberi spasi
            for (int j = 0; j < max_nama - data[i].getNama().length(); j++){
                System.out.print(" ");
            }

            // Output Nim
            System.out.print(" | " + data[i].getNim());
            // Memberi spasi
            for (int j = 0; j < max_nim - data[i].getNim().length(); j++){
                System.out.print(" ");
            }

            // Output Studi
            System.out.print(" | " + data[i].getStudi());
            // Memberi spasi
            for (int j = 0; j < max_studi - data[i].getStudi().length(); j++){
                System.out.print(" ");
            }

            //  Output Fakultas
            System.out.print(" | " + data[i].getFakultas());
            // Memberi spasi
            for (int j = 0; j < max_fakultas - data[i].getFakultas().length(); j++){
                System.out.print(" ");
            }
            // Memberi Jarak Enter
            System.out.println();
        }

        // Output garis bawah tabel
        System.out.println("_____________________________________________________________________________________");
    }
}

