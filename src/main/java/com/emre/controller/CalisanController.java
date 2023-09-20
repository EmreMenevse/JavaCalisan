package com.emre.controller;

import com.emre.liste.CalisanGuncelle;
import com.emre.liste.CalisanListeleme;
import com.emre.liste.CalisanSil;
import org.springframework.web.bind.annotation.*;
import com.emre.entity.Calisan;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@CrossOrigin(maxAge = 3600) // REACTTA CORS POLİCY HATASINI ÇÖZMEK İÇİN KULLANDIK
@RestController
public class CalisanController {

    @Autowired
    private CalisanListeleme calisanListeleme;

    @Autowired
    private CalisanGuncelle calisanGuncelle;

    @Autowired
    private CalisanSil calisanSil;



    @PutMapping("/guncelle")
    public void calisanGuncelle(@RequestBody Calisan requestModel) {
        Integer idNo = requestModel.getIdNo();
        String ad = requestModel.getAd();
        String soyad = requestModel.getSoyad();
        String unvan = requestModel.getUnvan();
        Integer sicilNo = requestModel.getSICIL_NO();

        calisanGuncelle.CalisanGuncelle(idNo, ad, soyad, unvan, sicilNo);
    }







    @GetMapping("/calisan")
    public List<Calisan> getCalisanlar() {
        return calisanListeleme.getCalisanList();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void deleteKisi(@PathVariable Integer id) {

        calisanSil.CalisanSil(id);
    }

}
