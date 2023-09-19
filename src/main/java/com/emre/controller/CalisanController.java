package com.emre.controller;
import com.emre.liste.CalisanListeleme;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emre.entity.Calisan;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;



@CrossOrigin(maxAge = 3600) // REACTTA CORS POLİCY HATASINI ÇÖZMEK İÇİN KULLANDIK
@RestController
public class CalisanController {

    @Autowired
    private CalisanListeleme calisanListeleme; // Assuming CalisanListeleme is a Spring-managed bean

    @GetMapping("/calisanlar")
    public List<Calisan> getCalisanlar() {
        return calisanListeleme.getCalisanList();
    }
}
