package Modal.Bean;

public class DeTaiSinhVienGiaoVien {
	private String maDeTai;
	private String maSinhVien;
	private String maGiaoVien;
	private int Diem;
	public DeTaiSinhVienGiaoVien(String maDeTai, String maSinhVien,
			String maGiaoVien, int diem) {
		super();
		this.maDeTai = maDeTai;
		this.maSinhVien = maSinhVien;
		this.maGiaoVien = maGiaoVien;
		Diem = diem;
	}
	public String getMaDeTai() {
		return maDeTai;
	}
	public void setMaDeTai(String maDeTai) {
		this.maDeTai = maDeTai;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getMaGiaoVien() {
		return maGiaoVien;
	}
	public void setMaGiaoVien(String maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}
	public int getDiem() {
		return Diem;
	}
	public void setDiem(int diem) {
		Diem = diem;
	}
}
