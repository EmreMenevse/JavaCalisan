package com.emre.service;

import com.emre.entity.Calisan;
//import com.emre.repository.CalisanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;

/*
@Component
public class CalisanService {


    public void findAllCalisan() {

        Calisan calisan1 = new Calisan();

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "Emre");
            CallableStatement cs = con.prepareCall("{call system.cursor1(?)}");

            cs.registerOutParameter(1, Types.REF_CURSOR);
            cs.executeQuery();

            ResultSet cursor = cs.getObject(1, ResultSet.class);
            while (cursor.next()) {

                System.out.println("name = " + cursor.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }
}


 */