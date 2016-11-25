package Modal.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DungChung.CDungChung;
import Modal.Bean.DiemDT;


public class DiemDTDAO {
Connection cn;
	
	public void ketNoi() throws Exception
	{
		// nạp driver
		Class.forName(CDungChung.dr);
		cn = DriverManager.getConnection(CDungChung.url, CDungChung.username, CDungChung.pass);
		
	}
	
	public ArrayList<DiemDT> getDiemDT() throws Exception{
		ketNoi();
		String sql = "select * from DiemDT";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ArrayList<DiemDT> ds = new ArrayList<DiemDT>();
		ResultSet rs = cmd.executeQuery();
		while(rs.next()){
			String maSV = rs.getString("MaSinhVien");
			String tenSV = rs.getString("TenSinhVien");
			String tenDT = rs.getString("TenDeTai");
			int diem = rs.getInt("Diem");
			String maDT = rs.getString("MaDeTai");
			DiemDT  d = new DiemDT(maSV,tenSV,diem,tenDT,maDT);
			ds.add(d);
		}
		rs.close();
		return ds;
	}
}
