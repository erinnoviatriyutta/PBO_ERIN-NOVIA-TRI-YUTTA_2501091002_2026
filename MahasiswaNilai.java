/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin18062026;

/**
 *
 * @author user
 */
public class MahasiswaNilai extends Mahasiswa  {
    private Double tugas;
    private Double uts;
    private Double uas;
    private Double nilaiAngka;
    private String nilaiHuruf;

    public MahasiswaNilai() {
    }

    public MahasiswaNilai(Double tugas, Double uts, Double uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public Double getTugas() {
        return tugas;
    }

    public void setTugas(Double tugas) {
        this.tugas = tugas;
    }

    public Double getUts() {
        return uts;
    }

    public void setUts(Double uts) {
        this.uts = uts;
    }

    public Double getUas() {
        return uas;
    }

    public void setUas(Double uas) {
        this.uas = uas;
    }

    public Double getNilaiAngka() {
        nilaiAngka = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
        return nilaiAngka;
    }

    public String getNilaiHuruf() {
        if(nilaiAngka>=85) {
            nilaiHuruf = "A";
        }else if(nilaiAngka>=65){
            nilaiHuruf = "B";
        }else if(nilaiAngka>=55){
            nilaiHuruf = "C";
        }else if(nilaiAngka>=40){
            nilaiHuruf = "D";
        }else if(nilaiAngka>=0){
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }
      
}
