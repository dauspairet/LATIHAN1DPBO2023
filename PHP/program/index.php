<!-- Saya Muhamad Firdaus [2101995] mengerjakan
soal Latihan 1 dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin. -->

<?php
// import Mahasiswa.php
include "Mahasiswa.php";

// Deklarasi untuk menggunakan metode class Mahasiswa
$tabel = new Mahasiswa();

// Memeriksa jika form di-submit
if (isset($_POST['submit'])) {
    switch ($_POST['submit']) {
        // Jika memilih Add maka akan menambah data
        case 'Add':
            $tabel->addMahasiswa($_POST['nama'], $_POST['nim'], $_POST['studi'], $_POST['fakultas']);
            break;
        // Jika memilih Edit maka akan mengubah data
        case 'Edit':
            $tabel->editMahasiswa($_POST['nim'], $_POST['nama'], $_POST['studi'], $_POST['fakultas']);
            break;
        // Jika memilih Delete maka akan menghapus data
        case 'Delete':
            $tabel->deleteMahasiswa($_POST['nim']);
            break;
    }
}
?>

<!-- Formulir -->
<form method="POST" align="center">
    <!-- Nama -->
    Nama: <input type="text" name="nama"><br>

    <!-- NIM -->
    NIM: <input type="text" name="nim"><br>

    <!-- Studi -->
    Studi: <input type="text" name="studi"><br>

    <!-- Fakultas -->
    Fakultas: <input type="text" name="fakultas"><br>

    <!-- Tombol -->
    <input type="submit" name="submit" value="Add">
    <input type="submit" name="submit" value="Edit">
    <input type="submit" name="submit" value="Delete">
</form>

<!-- Output Tabel -->
<?php
    $tabel->show_table();
?>
