package Modal.BO;

import java.util.ArrayList;

import Modal.Bean.DiemDT;
import Modal.DAO.DiemDTDAO;

public class DiemDTBO {
	DiemDTDAO d = new DiemDTDAO();
	public ArrayList<DiemDT> getDiemDT() throws Exception{
		return d.getDiemDT();
	}
}
