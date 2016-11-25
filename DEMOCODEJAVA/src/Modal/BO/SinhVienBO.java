package Modal.BO;

import java.util.ArrayList;

import Modal.Bean.DeTai;
import Modal.Bean.DeTaiSinhVienGiaoVien;
import Modal.Bean.SinhVien;
import Modal.DAO.SinhVienDAO;

public class SinhVienBO {
	SinhVienDAO sv = new SinhVienDAO();
	
	public ArrayList<SinhVien> getSV() throws Exception{
		return sv.getSV();
	}
	
	public int kiemTraMatKhau(String maSinhVien,String matKhau)throws Exception{
		return sv.kiemTraMatKhau(maSinhVien, matKhau);
	}
}
