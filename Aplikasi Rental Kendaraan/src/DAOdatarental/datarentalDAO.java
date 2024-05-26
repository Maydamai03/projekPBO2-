/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// datarentalDAO.java

package DAOdatarental;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOimplement.datarentalimplement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class datarentalDAO implements datarentalimplement {
    Connection connection;
    
    final String select = "SELECT * FROM datarental";
    final String insert = "INSERT INTO datarental (nama_customer, no_telp_customer, tipe_kendaraan, nama_kendaraan, biaya_perjam, lama_waktu_sewa, total_biaya) VALUES (?, ?, ?, ?, ?, ?, ?)";
    final String delete = "DELETE FROM datarental WHERE kode_rental = ?"; 
    final String search = "SELECT * FROM datarental WHERE nama_customer LIKE ? OR no_telp_customer LIKE ? OR tipe_kendaraan LIKE ? OR nama_kendaraan LIKE ?";
    final String update = "UPDATE datarental SET nama_customer=?, no_telp_customer=?, tipe_kendaraan=?, nama_kendaraan=?, biaya_perjam=?, lama_waktu_sewa=?, total_biaya=? WHERE kode_rental=?";
    
    public datarentalDAO(){
        connection = connector.connection();
    }

    @Override
    public void insert(datarental p) {
        try {
             int totalBiaya = p.getBiaya_perjam() * p.getLama_waktu_sewa();

            
            PreparedStatement ps = connection.prepareStatement(insert);
            ps.setString(1, p.getNama_customer());
            ps.setString(2, p.getNo_telp_customer());
            ps.setString(3, p.getTipe_kendaraan());
            ps.setString(4, p.getNama_kendaraan());
            ps.setInt(5, p.getBiaya_perjam());
            ps.setInt(6, p.getLama_waktu_sewa());
            ps.setInt(7, totalBiaya);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(datarental p) {
        PreparedStatement ps = null;
    try {
        int totalBiaya = p.getBiaya_perjam() * p.getLama_waktu_sewa();
        
        PreparedStatement psu = connection.prepareStatement(update);


        psu.setString(1, p.getNama_customer());
        psu.setString(2, p.getNo_telp_customer());
        psu.setString(3, p.getTipe_kendaraan());
        psu.setString(4, p.getNama_kendaraan());
        psu.setInt(5, p.getBiaya_perjam());
        psu.setInt(6, p.getLama_waktu_sewa());
        psu.setInt(7, totalBiaya);
        psu.setInt(8, p.getKode_rental());

        psu.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

    @Override
    public void delete(int kode_rental) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, kode_rental);
             
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<datarental> getAll() {
        List<datarental> dp = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                datarental rental = new datarental();
                rental.setKode_rental(rs.getInt("kode_rental"));
                rental.setNama_customer(rs.getString("nama_customer"));
                rental.setNo_telp_customer(rs.getString("no_telp_customer"));
                rental.setTipe_kendaraan(rs.getString("tipe_kendaraan"));
                rental.setNama_kendaraan(rs.getString("nama_kendaraan"));
                rental.setBiaya_perjam(rs.getInt("biaya_perjam"));
                rental.setLama_waktu_sewa(rs.getInt("lama_waktu_sewa"));
                rental.setTotal_biaya(rs.getInt("total_biaya"));
                
                dp.add(rental);
            }
        } catch (SQLException ex) {
            Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dp;
    }
    
    public List<datarental> search(String keyword) {
        List<datarental> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(search);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");
            ps.setString(4, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                datarental dr = new datarental();
                dr.setKode_rental(rs.getInt("kode_rental"));
                dr.setNama_customer(rs.getString("nama_customer"));
                dr.setNo_telp_customer(rs.getString("no_telp_customer"));
                dr.setTipe_kendaraan(rs.getString("tipe_kendaraan"));
                dr.setNama_kendaraan(rs.getString("nama_kendaraan"));
                dr.setBiaya_perjam(rs.getInt("biaya_perjam"));
                dr.setLama_waktu_sewa(rs.getInt("lama_waktu_sewa"));
                dr.setTotal_biaya(rs.getInt("total_biaya"));
                list.add(dr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}


