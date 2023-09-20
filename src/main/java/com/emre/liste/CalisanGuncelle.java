package com.emre.liste;

import com.emre.entity.Calisan;
import oracle.jdbc.OracleTypes;
import org.springframework.stereotype.Component;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Component
public class CalisanGuncelle {

    public void CalisanGuncelle(Integer idNo , String ad, String soyad, String unvan, Integer sicil_NO) {





        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "Emre");
             CallableStatement cs = con.prepareCall("{call system.pr_Calisanguncelle(?,?,?,?,?)}")) {

            cs.setInt(1, idNo);
            cs.setString(2, ad);
            cs.setString(3, soyad);
            cs.setString(4, unvan);
            cs.setInt(5, sicil_NO);
            cs.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


