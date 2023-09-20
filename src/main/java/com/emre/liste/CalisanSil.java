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
public class CalisanSil {
    //SYSTEM.pr_Calisansil

    public void CalisanSil(int id) {


        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "Emre");
             CallableStatement cs = con.prepareCall("{call SYSTEM.pr_Calisansil(?)}")) {

            cs.setInt(1,id);
            cs.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
