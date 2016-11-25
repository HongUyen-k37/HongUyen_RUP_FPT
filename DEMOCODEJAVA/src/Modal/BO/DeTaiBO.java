package Modal.BO;

import java.util.ArrayList;

import Modal.Bean.DeTai;
import Modal.DAO.DeTaiDAO;

public class DeTaiBO {
	DeTaiDAO d = new DeTaiDAO();
	
	public ArrayList<DeTai> getDT() throws Exception{
		return d.getDT();
	}
}
