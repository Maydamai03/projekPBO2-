/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import DAOdatarental.datarentalDAO;
import DAOimplement.datarentalimplement;
import model.*;
import view.*;

public class datarentalcontroller {
    frameTampilData frame1;
    frameInputData frame2;
    frameEditData frame3;
    datarentalimplement impldatarental;
    List<datarental> dp;

    public datarentalcontroller(frameTampilData frame1) {
        this.frame1 = frame1;
        impldatarental = new datarentalDAO();
        dp = impldatarental.getAll();
    }

    public datarentalcontroller(frameInputData frame2) {
        this.frame2 = frame2;
        impldatarental = new datarentalDAO();
        dp = impldatarental.getAll();
    }
    
    public datarentalcontroller(frameEditData frame3) {
        this.frame3 = frame3;
        impldatarental = new datarentalDAO();
        dp = impldatarental.getAll();
    }

    public void isitabel() {
        modeltabeldatarental mp = new modeltabeldatarental(dp);
        frame1.getTabelDatarental().setModel(mp);
    }

    public void insert() {
        if (frame2 != null) {
            datarental dp = new datarental();
            dp.setNama_customer(frame2.getJTxtNamaCustomer().getText());
            dp.setNo_telp_customer(frame2.getJTxtnoHp().getText());

            if (frame2.getJradiobtn1().isSelected()) {
                dp.setTipe_kendaraan("Mobil");
            } else {
                dp.setTipe_kendaraan("Motor");
            }

            dp.setNama_kendaraan(frame2.getJDropKendaraan().getSelectedItem().toString());
            try {
                int biayaPerJam = Integer.parseInt(frame2.getJFieldBiayaPerjam().getText());
                int lamaSewa = Integer.parseInt(frame2.getJFieldLamaSewa().getText());

                dp.setBiaya_perjam(biayaPerJam);
                dp.setLama_waktu_sewa(lamaSewa);

                impldatarental.insert(dp);

                if (frame1 != null) {
                    isitabel();
                }

            } catch (NumberFormatException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } else {
            System.err.println("Error: frame2 is null");
        }
    }
    
    public void update(){
        if (frame3 != null) {
            datarental dp = new datarental();
            dp.setNama_customer(frame3.getJTxtNamaCustomer().getText());
            dp.setNo_telp_customer(frame3.getJTxtnoHp().getText());

            if (frame3.getJradiobtn1().isSelected()) {
                dp.setTipe_kendaraan("Mobil");
            } else {
                dp.setTipe_kendaraan("Motor");
            }

            dp.setNama_kendaraan(frame3.getJDropKendaraan().getSelectedItem().toString());
            try {
                int biayaPerJam = Integer.parseInt(frame3.getJFieldBiayaPerjam().getText());
                int lamaSewa = Integer.parseInt(frame3.getJFieldLamaSewa().getText());

                dp.setBiaya_perjam(biayaPerJam);
                dp.setLama_waktu_sewa(lamaSewa);

                impldatarental.insert(dp);

                if (frame1 != null) {
                    isitabel();
                }

            } catch (NumberFormatException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } else {
            System.err.println("Error: frame3 is null");
        }
        
    
}

    public void delete() {
        int selectedRow = frame1.getTabelDatarental().getSelectedRow();
        if (selectedRow != -1) {
            int kode_rental = (int) frame1.getTabelDatarental().getValueAt(selectedRow, 0);

            impldatarental.delete(kode_rental);
            isitabel();
        } else {
            System.err.println("Error: No row selected");
        }
    }
    
    
    public void search(String keyword) {
    List<datarental> result = impldatarental.search(keyword); 
    modeltabeldatarental mp = new modeltabeldatarental(result);
    if (frame1 != null) {
        frame1.getTabelDatarental().setModel(mp);
    }
}
    
}


