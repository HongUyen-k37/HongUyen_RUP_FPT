package Modal.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DungChung.CDungChung;
import Modal.Bean.DeTaiSinhVienGiaoVien;

public class DeTaiSinhVienGiaoVienDAO {
	Connection cn;
	public void ketNoi() throws Exception
	{
		// nạp driver
		Class.forName(CDungChung.dr);
		cn = DriverManager.getConnection(CDungChung.url, CDungChung.username, CDungChung.pass);
		
	}
	
	public ArrayList<DeTaiSinhVienGiaoVien> getDTSVGV() throws Exception{
		ketNoi();
		String sql = "select * from DeTai_SinhVien_GiaoVien";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ArrayList<DeTaiSinhVienGiaoVien> ds = new ArrayList<DeTaiSinhVienGiaoVien>();
		ResultSet rs = cmd.executeQuery();
		while(rs.next()){
			String maDeTai = rs.getString("maDeTai");
			String maSinhVien = rs.getString("maSinhVien");
			String maGiaoVien = rs.getString("maGiaoVien");
			int diem = rs.getInt("diem");
			DeTaiSinhVienGiaoVien d = new DeTaiSinhVienGiaoVien(maDeTai,maSinhVien,maGiaoVien,diem);
			ds.add(d);
		}
		rs.close();
		return ds;
	}
	
	public int update(String madetai,int diem)throws Exception{
		ketNoi();
		String sql = "insert into DeTai_SinhVien_GiaoVien(diem) values(?) where maDeTai = ?";
		PreparedStatement cmd = cn.prepareStatement(sql);
		cmd.setInt(1, diem);
		cmd.setString(2, madetai);
		return cmd.executeUpdate();
	}
}
