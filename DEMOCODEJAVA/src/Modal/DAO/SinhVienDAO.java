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
			
			String maSinhVien = rs.getString("maSinhVien");
			String tenSinhVien = rs.getString("tenSinhVien");
			String matKhau = rs.getString("matKhau");
			Date ngaySinh = rs.getDate("ngaySinh");
			String gioiTinh = rs.getString("gioiTinh");
			String cMND = rs.getString("cMND");
			String soDienThoai = rs.getString("soDienThoai");
			String noiCuTru = rs.getString("noiCuTru");
			String eMail = rs.getString("email");
			String noiSinh = rs.getString("noiSinh");
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
		String sql = "select * from SinhVien where maSinhVien = ? and matKhau = ?";
		PreparedStatement cmd = cn.prepareStatement(sql);
		cmd.setString(1, maSinhVien);
		cmd.setString(2, matKhau);
		ResultSet rs = cmd.executeQuery();
		if(rs.next())
			return 1;
		return 0;
	}
}
