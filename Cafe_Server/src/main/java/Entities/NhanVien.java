package Entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maNV;
	private String tenNV;
	private String gioiTinh;
	private String ngaySinh;
	private String CMND;
	private String SDT;
	private String trangThaiLamViec;
	private String diaChi;
	private String tK;
	private String mK;
	private String email;
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String maNV, String tenNV, String gioiTinh, String ngaySinh, String cMND, String sDT,
			String trangThaiLamViec, String diaChi, String tK, String mK, String email) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.CMND = cMND;
		this.SDT = sDT;
		this.trangThaiLamViec = trangThaiLamViec;
		this.diaChi = diaChi;
		this.tK = tK;
		this.mK = mK;
		this.email = email;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getTrangThaiLamViec() {
		return trangThaiLamViec;
	}

	public void setTrangThaiLamViec(String trangThaiLamViec) {
		this.trangThaiLamViec = trangThaiLamViec;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String gettK() {
		return tK;
	}

	public void settK(String tK) {
		this.tK = tK;
	}

	public String getmK() {
		return mK;
	}

	public void setmK(String mK) {
		this.mK = mK;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh
				+ ", CMND=" + CMND + ", SDT=" + SDT + ", trangThaiLamViec=" + trangThaiLamViec + ", diaChi=" + diaChi
				+ ", tK=" + tK + ", mK=" + mK + ", email=" + email + "]";
	}
	
	
}
