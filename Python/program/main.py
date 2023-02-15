# Saya Muhamad Firdaus [2101995] mengerjakan
# soal Latihan 1 dalam mata kuliah DPBO
# untuk keberkahanNya maka saya tidak melakukan kecurangan 
# seperti yang telah dispesifikasikan. Aamiin.

# import class
from Mahasiswa import MahasiswaData
Mahasiswa = MahasiswaData()
    
while True:
    # Output aksi
    print("===python===")
    print("____Aksi____")
    print("===python===")
    
    # Ouput aksi yang dapat dilakukan
    action = input(" > 1: Tambah\n > 2: Edit\n > 3: Hapus\n > 4: Tampilkan\n > 5: Keluar\nPilihan:")
    # Jika input merupakan "1"
    # Akan melakukan penambahan data mahasiswa
    if action == "1":
        # Input Nama
        nama = input("Nama: ")
        
        # Input NIM
        nim = int(input("NIM: "))
        
        # Input Program Studi
        studi = input("Program Studi: ")
        
        # Input Nama
        fakultas = input("Fakultas: ")
        
        # Menambah data mahasiswa
        Mahasiswa.addMahasiswa(nama, nim, studi, fakultas)
    # Jika input merupakan "2"
    # Akan melakukan aksi edit
    elif action == "2":
        # Input NIM
        nim = int(input("NIM: "))
        
        # Input nama
        nama = input("Nama baru (kosongkan jika tidak ingin mengubah): ") or None
        
        # Input studi
        studi = input("Program studi baru (kosongkan jika tidak ingin mengubah): ") or None
        
        # Input fakultas
        fakultas = input("Fakultas baru (kosongkan jika tidak ingin mengubah): ") or None
        
        # Jika nim tidak kosong
        if nim:
            nim = int(nim)
            # Maka akan melakukan edit
            Mahasiswa.editMahasiswa(nim, nama, studi, fakultas)
    # Jika input merupakan "3"
    elif action == "3":
        nim = int(input("NIM: "))
        Mahasiswa.deleteMahasiswa(nim)
    # Jika input merupakan "4"
    # Menampilkan tabel
    elif action == "4":
        Mahasiswa.dataTabel()
    # Jika input merupakan "5"
    elif action == "5":
        print("---------------")
        print("Sampai Jumpa")
        print("---------------")
        break
    # Jika input bukan 1-5
    else:
        print("Pilihan Tak Tersedia, Silakan Coba Lagi")

        
        