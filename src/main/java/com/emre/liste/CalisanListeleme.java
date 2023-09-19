package com.emre.liste;

import com.emre.entity.Calisan;
import oracle.jdbc.OracleTypes;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Component
public class CalisanListeleme {

    public List<Calisan> getCalisanList() {
        List<Calisan> calisanList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "Emre");
             CallableStatement cs = con.prepareCall("{call system.cursor1(?)}")) {

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();

            ResultSet cursor = cs.getObject(1, ResultSet.class);
            while (cursor.next()) {
                long id = cursor.getLong(1);
                String Ad = cursor.getString(2);
                String Soyad = cursor.getString(3);
                String Unvan = cursor.getString(4);
                int Sicil_no = cursor.getInt(5);

                Calisan calisan1 = new Calisan();
                calisan1.setIdNo(id);
                calisan1.setAd(Ad);
                calisan1.setSoyad(Soyad);
                calisan1.setUnvan(Unvan);
                calisan1.setSICIL_NO(Sicil_no);

                calisanList.add(calisan1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return calisanList;
    }
}
