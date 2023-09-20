package com.emre.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "SYSTEM.TB_MKUCALISANLIST1")
public class Calisan {

    @Id
    @Column(name = "IdNo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdNo;
    private String Ad;
    private String Soyad;
    private String Unvan;
    private int SICIL_NO;

    //-------------------------------
    private Integer idNo;
    private String ad;
    private String soyad;
    private String unvan;
    private Integer sicilNo;






    /*
    public Calisan(String string, String string2, String string3, int i) {
        Ad = string;
        Soyad = string2;
        Unvan = string3;
        SICIL_NO = i;
    }
*/

    public Integer getIdNo() {
        return IdNo;
    }

    public void setIdNo(Integer idNo) {
        IdNo = idNo;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getUnvan() {
        return Unvan;
    }

    public void setUnvan(String unvan) {
        Unvan = unvan;
    }

    public int getSICIL_NO() {
        return SICIL_NO;
    }

    public void setSICIL_NO(int sICIL_NO) {
        SICIL_NO = sICIL_NO;
    }



}

