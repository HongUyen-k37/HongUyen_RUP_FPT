package Modal.Bean;

import java.util.Date;

public class SinhVien {
	private String maSinhVien;
	private String tenSinhVien;
	private String matKhau;
	private Date ngaySinh;
	private String gioiTinh;
	private String cMND;
	private String soDienThoai;
	private String noiCuTru;
	private String eMail;
	private String noiSinh;
	public SinhVien(String maSinhVien, String tenSinhVien, String matKhau,
			Date ngaySinh, String gioiTinh, String cMND, String soDienThoai,
			String noiCuTru, String eMail, String noiSinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.matKhau = matKhau;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.cMND = cMND;
		this.soDienThoai = soDienThoai;
		this.noiCuTru = noiCuTru;
		this.eMail = eMail;
		this.noiSinh = noiSinh;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getcMND() {
		return cMND;
	}
	public void setcMND(String cMND) {
		this.cMND = cMND;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getNoiCuTru() {
		return noiCuTru;
	}
	public void setNoiCuTru(String noiCuTru) {
		this.noiCuTru = noiCuTru;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getNoiSinh() {
		return noiSinh;
	}
	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	
}
