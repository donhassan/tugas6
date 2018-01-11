/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.donnymvcjdbc.main;

import edu.donnymvcjdbc.database.KingsBarbershopDatabase;
import edu.donnymvcjdbc.entity.Pelanggan;
import edu.donnymvcjdbc.error.PelangganException;
import edu.donnymvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Donny Hassan
 * 10116507
 * PBO-11
 */
public class LatihanMVCDAOdonny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        PelangganDao dao = KingsBarbershopDatabase.getPelangganDao();
        
        dao.deletePelanggan(1);
    }
    
}
