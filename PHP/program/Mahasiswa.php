<!-- Saya Muhamad Firdaus [2101995] mengerjakan
soal Latihan 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin. -->

<?php
// Deklarasi class Mahasiswa
class Mahasiswa{
    // Private atribut
    public $nama;
    public $nim;
    public $studi;
    public $fakultas;

    // Constructor
    function __construct($nama = "", $nim = "", $studi = "", $fakultas = ""){
        $this->nama = $nama;
        $this->nim = $nim;
        $this->studi = $studi;
        $this->fakultas = $fakultas;
    }
    
    // Get Nama
    function getNama(){
        return $this->nama;
    }
    
    // Set Nama
    function setNama($nama){
        $this->nama = $nama;
    }
    
    // Get Nim
    function getNim(){
        return $this->nim;
    }
    
    // Set Nim
    function setNim($nim){
        $this->nim = $nim;
    }
    
    // Get Studi
    function getStudi(){
        return $this->studi;
    }
    
    // Set Studi
    function setStudi($studi){
        $this->studi = $studi;
    }
    
    // Get Fakultas
    function getFakultas(){
        return $this->fakultas;
    }
    
    // Set Fakultas
    function setFakultas($fakultas){
        $this->fakultas = $fakultas;
    }

    // Untuk menyimpan data mahasiswa
    public $data = [];
    // Untuk ukuran data
    public $size = 0;
    // Untuk nomor baris
    public $no = 0;

    // Menambah mahasiswa
    function addMahasiswa($nama, $nim, $studi, $fakultas){
        $this->data[] = new Mahasiswa($nama, $nim, $studi, $fakultas);
        $this->size = count($this->data);
    }
    
    // Mengedit data mahasiswa dengan patokan nim
    function editMahasiswa($nim, $nama, $studi, $fakultas){
        for ($i = 0; $i < $this->size; $i++){
            // Jika ada nim di data sama dengan nim yang di-input-kan
            if ($this->data[$i]->nim == $nim){
                // Jika input tidak kosong maka akan diganti dengan data sesuai input
                if ($nama != ""){
                    $this->data[$i]->setNama($nama);
                }
                if ($studi != ""){
                    $this->data[$i]->setStudi($studi);
                }
                if ($fakultas != ""){
                    $this->data[$i]->setFakultas($fakultas);
                }
                break;
            }
        }
    }

    // Menghapus data mahasiswa dengan patokan nim
    function deleteMahasiswa($nim){
        for ($i = 0; $i < $this->size; $i++){
            // Jika ada nim di data sama dengan nim yang di-input-kan
            if ($this->data[$i]->nim == $nim){
                // Maka ukuran data akan dikurangi
                for ($j = $i; $j < $this->size - 1; $j++){
                    $this->data[$j] = $this->data[$j + 1];
                }
                $this->size--;
                break;
            }
        }
    }

    // Menampilkan tabel data mahasiswa
    function show_table(){
        if ($this->size == 0){
            echo "Data Kosong.";
            return;
        }
        
        // Output Header
        echo "<table border='1' align='center'>";
        echo "<tr>";
        echo "<th>No</th>";
        echo "<th>Nama</th>";
        echo "<th>NIM</th>";
        echo "<th>Program Studi</th>";
        echo "<th>Fakultas</th>";
        echo "</tr>";
    
        // Output tabel data
        foreach($this->data as $datas){
            echo "<tr>";
            echo "<td>" . ($this->no + 1) . "</td>";
            echo "<td>" . $datas->nama . "</td>";
            echo "<td>" . $datas->nim . "</td>";
            echo "<td>" . $datas->studi . "</td>";
            echo "<td>" . $datas->fakultas . "</td>";
            echo "</tr>";
        }
        echo "</table>";
    }
    
}
