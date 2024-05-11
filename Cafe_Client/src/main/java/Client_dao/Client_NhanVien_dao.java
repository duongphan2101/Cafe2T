package Client_dao;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

import Entities.NhanVien;

public class Client_NhanVien_dao {
	private ObjectInputStream in;
	private ObjectOutputStream out;
	
	public Client_NhanVien_dao(Socket socket) throws UnknownHostException, IOException, ClassNotFoundException {
		out = new ObjectOutputStream(socket.getOutputStream());
		in = new ObjectInputStream(socket.getInputStream());
	}
	
	@SuppressWarnings("unchecked")
	public List<NhanVien> getNVbyTK(String tk) throws Exception{
		out.writeUTF("getNVbyTK");
		out.flush();
		
		out.writeUTF(tk);
		out.flush();
		List<NhanVien> nv = (List<NhanVien>) in.readObject();
		return nv;
	}
	
	public boolean getNVbyTKandMK(String tk, String mk) throws Exception{
	    out.writeUTF("getNVbyTKandMK");
	    out.flush();
	    
	    out.writeUTF(tk);
	    out.flush();
	    out.writeUTF(mk);
	    out.flush();
	    
	    boolean nv = in.readBoolean();
	    return nv;
	}

	public void ThemNhanVien(NhanVien nv) throws IOException {
		out.writeUTF("ThemNhanVien");
		out.flush();
		
		out.writeObject(nv);
		out.flush();
	}
	
	public void updateNhanVien(NhanVien nv) throws IOException {
		out.writeUTF("UpdateNhanVien");
		out.flush();
		
		out.writeObject(nv);
		out.flush();
	}
	
	public void xoaNhanVien(String maNV) throws IOException {
		out.writeUTF("XoaNhanVien");
		out.flush();
		
		out.writeUTF(maNV);
		out.flush();
	}
	
	public List<NhanVien> getAllNhanVien() throws IOException, ClassNotFoundException{
		out.writeUTF("getAllNhanVien");
		out.flush();
		
		@SuppressWarnings("unchecked")
		List<NhanVien> nv = (List<NhanVien>) in.readObject();
		return nv;
		
	}
	
	public String maNextNhanVien() throws IOException {
		out.writeUTF("MaNextNhanVien");
		out.flush();
		
		String newMa = in.readUTF();
		return newMa;
		
	}
	
	public String maNextTaiKhoan() throws IOException {
		out.writeUTF("MaNextTaiKhoan");
		out.flush();
		
		String newMa = in.readUTF();
		return newMa;
		
	}
	
	public List<NhanVien> getNVByTen(String ten) throws IOException, ClassNotFoundException{
		out.writeUTF("getNVbyTen");
		out.flush();
		
		out.writeUTF(ten);
		out.flush();
		
		@SuppressWarnings("unchecked")
		List<NhanVien> nv = (List<NhanVien>)in.readObject();
		return nv;
		
	}
	
}
