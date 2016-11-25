package Modal.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import DungChung.CDungChung;

import Modal.Bean.SinhVien;

public class SinhVienDAO {
Connection cn;
	
	public void ketNoi() throws Exception
	{
		// nạp driver
		Class.forName(CDungChung.dr);
		cn = DriverManager.getConnection(CDungChung.url, CDungChung.username, CDungChung.pass);
		
	}
	
	public ArrayList<SinhVien> getSV() throws Exception{
		ketNoi();
		String sql = "select * from SinhVien";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		ResultSet rs = cmd.executeQuery();
		while(rs.next()){
			
			String maSinhVien = rs.getString("MaSinhVien");
			String tenSinhVien = rs.getString("TenSinhVien");
			String matKhau = rs.getString("MatKhau");
			Date ngaySinh = rs.getDate("NgaySinh");
			String gioiTinh = rs.getString("GioiTinh");
			String cMND = rs.getString("CMND");
			String soDienThoai = rs.getString("SoDienThoai");
			String noiCuTru = rs.getString("NoiCuTru");
			String eMail = rs.getString("Email");
			String noiSinh = rs.getString("NoiSinh");
			SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, matKhau, ngaySinh, gioiTinh, cMND, soDienThoai, noiCuTru, eMail, noiSinh);
			ds.add(sv);
		}
		rs.close();
		return ds;
	}
	
	// kiểm tra mật khẩu
	public int kiemTraMatKhau(String maSinhVien,String matKhau)throws Exception 
	{
		ketNoi();
		String sql = "select * from SinhVien where MaSinhVien = ? and MatKhau = ?";
		PreparedStatement cmd = cn.prepareStatement(sql);
		cmd.setString(1, maSinhVien);
		cmd.setString(2, matKhau);
		ResultSet rs = cmd.executeQuery();
		if(rs.next())
			return 1;
		return 0;
	}
}
