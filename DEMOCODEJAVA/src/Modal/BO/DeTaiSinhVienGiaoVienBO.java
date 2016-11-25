package Modal.BO;

import java.util.ArrayList;

import Modal.Bean.DeTaiSinhVienGiaoVien;
import Modal.DAO.DeTaiSinhVienGiaoVienDAO;

public class DeTaiSinhVienGiaoVienBO {
	DeTaiSinhVienGiaoVienDAO d = new DeTaiSinhVienGiaoVienDAO();
	
	public ArrayList<DeTaiSinhVienGiaoVien> getDTSVGV() throws Exception{
		return d.getDTSVGV();
	}
	
	public int update(String madetai,int diem)throws Exception{
		return d.update(madetai, diem);
	}
}
