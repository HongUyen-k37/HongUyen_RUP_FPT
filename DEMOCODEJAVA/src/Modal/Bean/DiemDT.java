package Modal.Bean;

public class DiemDT {
	private String maSV;
	private String tenSV;
	private int diem;
	private String tenDT;
	private String maDT;
	public DiemDT(String maSV, String tenSV, int diem, String tenDT) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diem = diem;
		this.tenDT = tenDT;
	}
	public DiemDT(String maSV, String tenSV, int diem, String tenDT, String maDT) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diem = diem;
		this.tenDT = tenDT;
		this.maDT = maDT;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	public String getTenDT() {
		return tenDT;
	}
	public void setTenDT(String tenDT) {
		this.tenDT = tenDT;
	}
	public String getMaDT() {
		return maDT;
	}
	public void setMaDT(String maDT) {
		this.maDT = maDT;
	}
	
	
}
