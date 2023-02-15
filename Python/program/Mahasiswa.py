# Saya Muhamad Firdaus [2101995] mengerjakan
# soal Latihan 1 dalam mata kuliah DPBO
# untuk keberkahanNya maka saya tidak melakukan kecurangan 
# seperti yang telah dispesifikasikan. Aamiin.

# Deklarasi class
class MahasiswaData:
    # private atribut
    __nama = ""
    __nim = ""
    __studi = ""
    __fakultas = ""
    __data = []

    # Constructor
    def __init__(self, nama = "", nim = "", studi = "", fakultas = ""):
        self.__nama = nama
        self.__nim = nim
        self.__studi = studi
        self.__fakultas = fakultas
    
    # Get nama
    def get_nama(self):
        return self.__nama
    
    # Set nama
    def set_nama(self, nama):
        self.__nama = nama
    
    # Get nim
    def get_nim(self):
        return self.__nim
    
    # Set nim
    def set_nim(self, nim):
        self.__nim = nim
    
    # Get studi
    def get_studi(self):
        return self.__studi
    
    # Set studi
    def set_studi(self, studi):
        self.__studi = studi
    
    # Get fakultas
    def get_fakultas(self):
        return self.__fakultas
    
    # Set fakultas
    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas
    
    # Menambah mahasiswa
    def addMahasiswa(self, nama, nim, studi, fakultas):
        mhs = {"nama": nama, "nim": nim, "studi": studi, "fakultas": fakultas}
        # Menggunakan .append untuk menambahkan data di akhir list
        self.__data.append(mhs)
    
    # Mengedit data mahasiswa dengan patokan nim
    def editMahasiswa(self, nim, nama=None, studi=None, fakultas=None):
        for mhs in self.__data:
            # Jika ada nim di data sama dengan nim yang di-input-kan
            if mhs["nim"] == nim:
                # Jika input tidak kosong maka akan diganti dengan data sesuai input
                if nama is not None:
                    mhs["nama"] = nama
                if studi is not None:
                    mhs["studi"] = studi
                if fakultas is not None:
                    mhs["fakultas"] = fakultas
                break
    
    # Menghapus data mahasiswa dengan patokan nim 
    def deleteMahasiswa(self, nim):
        for mhs in self.__data:
            # Jika ada nim di data sama dengan nim yang di-input-kan
            if mhs["nim"] == nim:
                # Menggunakan .remove untuk menghapus list dalam objek mhs
                self.__data.remove(mhs)
                break
                
    # Menampilkan tabel data mahasiswa
    def dataTabel(self):
        print("\nDaftar Mahasiswa:")
        print("__________________________________________________________________________________________")
        print("No. | Nama              | NIM               | Program Studi    | Fakultas              ")
        print("====|===================|===================|==================|==========================")
        for i, mhs in enumerate(self.__data):
            # Menggunakan format ":<" untuk menghasilkan rata kiri dan angka
            # sebelah kanan sebagai jumlah spasi
            print(" {:<2} | {:<17} | {:<17} | {:<16} | {:<17}".format
                  (i+1, mhs["nama"], mhs["nim"], mhs["studi"], mhs["fakultas"]))
        
        print("__________________________________________________________________________________________\n")