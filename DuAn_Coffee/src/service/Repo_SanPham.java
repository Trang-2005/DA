/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import JDBC.DBConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.Model_SanPham;

public class Repo_SanPham {
    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_SanPham> getAll() {
        ArrayList<Model_SanPham> listSP = new ArrayList<>();
        sql = "Select MaSP,TenSP,SoLuong,GiaTien,TrangThai from SanPham ";
        try {
            con = DBConnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maSP, tenSP, trangThai;
                float giaTien;
                int soLuong;
                maSP = rs.getString(1);
                tenSP = rs.getString(2);
                soLuong = rs.getInt(3);
                giaTien = rs.getFloat(4);
                trangThai = rs.getString(5);
                Model_SanPham sp = new Model_SanPham(maSP, tenSP, soLuong, giaTien, trangThai);
                listSP.add(sp);
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them(Model_SanPham m2) {
        sql = "Insert into SanPham(MaSP,TenSP,SoLuong,GiaTien,TrangThai) values (?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, m2.getMaSP());
            pr.setObject(2, m2.getTenSP());
            pr.setObject(3, m2.getSoLuong());
            pr.setObject(4, m2.getGiaTien());
            pr.setObject(5, m2.getTrangThai());
            return pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean exitByma(String maSP) {
        sql = "select count (*) from SanPham where MaSP =?";
        try {
            con = DBConnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, maSP);
            rs = pr.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int sua(Model_SanPham m2, String maSPcs) {
        sql = "Update SanPham set TenSP =?,SoLuong=?,GiaTien=?,TrangThai=? where MaSP =?";
        try {
            con = DBConnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(5, maSPcs);
            pr.setObject(1, m2.getTenSP());
            pr.setObject(2, m2.getSoLuong());
            pr.setObject(3, m2.getGiaTien());
            pr.setObject(4, m2.getTrangThai());
            return pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int xoa(String maSPcx) {

        try {
            con = DBConnect.getConnection();

            // Bắt đầu giao dịch
            con.setAutoCommit(false);

            // Xóa dữ liệu trong bảng HoaDonChiTiet trước
            String sqlDeleteDetails = "DELETE FROM HoaDonChiTiet WHERE MaSP=?";
            pr = con.prepareStatement(sqlDeleteDetails);
            pr.setObject(1, maSPcx);
            pr.executeUpdate();

            // Xóa dữ liệu trong bảng SanPham
            String sqlDeleteProduct = "DELETE FROM SanPham WHERE MaSP=?";
            pr = con.prepareStatement(sqlDeleteProduct);
            pr.setObject(1, maSPcx);
            int result = pr.executeUpdate();

            // Cam kết giao dịch
            con.commit();

            return result;
        } catch (Exception e) {
            if (con != null) {
                try {
                    // Rollback giao dịch nếu có lỗi
                    con.rollback();
                } catch (Exception rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
            return 0;
        } finally {
            try {
                if (pr != null) pr.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public ArrayList<Model_SanPham> timKiem(String maSPct, String tenSPct, String trangThaict) {
        ArrayList<Model_SanPham> listSP = new ArrayList<>();
        sql = "Select MaSP,TenSP,SoLuong,GiaTien,TrangThai from SanPham where MaSP like ? or TenSP like ? or TrangThai like ? ";
        try {
            con = DBConnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + maSPct + '%');
            pr.setObject(2, '%' + tenSPct + '%');
            pr.setObject(3, '%' + trangThaict + '%');
            rs = pr.executeQuery();
            while (rs.next()) {
                String maSP, tenSP, moTa, trangThai;
                float giaTien;
                int soLuong;
                maSP = rs.getString(1);
                tenSP = rs.getString(2);
                soLuong = rs.getInt(3);
                giaTien = rs.getFloat(4);
                trangThai = rs.getString(5);
                Model_SanPham sp = new Model_SanPham(maSP, tenSP, soLuong, giaTien, trangThai);
                listSP.add(sp);
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model_SanPham> filterProducts(String name, float minPrice, float maxPrice, String trangThai) {
        ArrayList<Model_SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM SanPham WHERE tenSP LIKE ? AND GiaTien BETWEEN ? AND ? AND TrangThai LIKE ?";
        try {
            con = DBConnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + name + '%');
            pr.setObject(2, minPrice);
            pr.setObject(3, maxPrice);
            pr.setObject(4, '%' + trangThai + '%');
            rs = pr.executeQuery();
            while (rs.next()) {
                String maSP, tenSP, trangThaiResult;
                float giaTien;
                int soLuong;
                maSP = rs.getString(1);
                tenSP = rs.getString(2);
                soLuong = rs.getInt(3);
                giaTien = rs.getFloat(4);
                trangThaiResult = rs.getString(5);
                Model_SanPham sp = new Model_SanPham(maSP, tenSP, soLuong, giaTien, trangThaiResult);
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }


}
