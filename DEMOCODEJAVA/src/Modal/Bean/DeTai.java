package Modal.Bean;

public class DeTai {
	private String maDeTai;
	private String tenDeTai;
	private String moTa;
	public DeTai(String maDeTai, String tenDeTai, String moTa) {
		super();
		this.maDeTai = maDeTai;
		this.tenDeTai = tenDeTai;
		this.moTa = moTa;
	}
	public String getMaDeTai() {
		return maDeTai;
	}
	public void setMaDeTai(String maDeTai) {
		this.maDeTai = maDeTai;
	}
	public String getTenDeTai() {
		return tenDeTai;
	}
	public void setTenDeTai(String tenDeTai) {
		this.tenDeTai = tenDeTai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
}
