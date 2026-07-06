/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin18062026;

/**
 *
 * @author user
 */
public class MahasiswaNilaiController {
    private final MahasiswaNilaiDao dao;

    public MahasiswaNilaiController() {
        this.dao = new MahasiswaNilaiDao(10); 
    }
    
    public String insert(MahasiswaNilai mhsBaru) {
        if(dao.getByNim(mhsBaru.getNim()) != null) {
            return "Mahasiswa Sudah Ada";
        }
        boolean hasil = dao.Simpan(mhsBaru);
        if(hasil) {
            return "Sukses";
        } else {
            return "Gagal";
        } 
    }
    
    public String update(String nim, MahasiswaNilai mhs) {
        boolean hasil = dao.update(nim, mhs);
        if(hasil) {
            return "Sukses";
        } else {
            return "Gagal";
        } 
    }
    
    public MahasiswaNilai[] getAll() {
        return dao.getAll();
    }
    
    public MahasiswaNilai getByNim(String nim) {
        return dao.getByNim(nim);
    }
}


