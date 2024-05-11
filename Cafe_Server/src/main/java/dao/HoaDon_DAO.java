package dao;

import java.util.List;

import Entities.ChiTietHoaDon;
import Entities.HoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;


public class HoaDon_DAO {
	private EntityManager entityManager;

    public HoaDon_DAO(EntityManager em) {
       super();
       this.entityManager =em;
    }

    public List<HoaDon> getAllHoaDon() {
        TypedQuery<HoaDon> query = (TypedQuery<HoaDon>) entityManager.createQuery("SELECT t FROM HoaDon t ", HoaDon.class);
        return query.getResultList();
    }
    
    public void insertHoaDon(HoaDon hd) {
        entityManager.getTransaction().begin();
        entityManager.persist(hd);
        entityManager.getTransaction().commit();
    }

    public HoaDon getHoaDonById(String maHD) {
        return entityManager.find(HoaDon.class, maHD);
    }
    
    public ChiTietHoaDon getChiTietHoaDonById(String maHD) {
        return entityManager.find(ChiTietHoaDon.class, maHD);
    }
    

    public String getNextMaHD() {
        String queryStr = "SELECT MAX(n.maHD) FROM HoaDon n";
        Query query = entityManager.createQuery(queryStr);
        String maxMaTK = (String) query.getSingleResult();
        if (maxMaTK == null) {
            return "HDAA0001";
        } else {

            String numericPart = maxMaTK.substring(5);
            int num = Integer.parseInt(numericPart);
            num++;
            String newMaTK = maxMaTK.substring(0, 4) + String.format("%04d", num);
            return newMaTK;
        }
    }

    
    public List<ChiTietHoaDon> getCTHDBymaHD(String maHD) {
    	TypedQuery<ChiTietHoaDon> query = entityManager.createQuery("SELECT n FROM ChiTietHoaDon n where n.hoaDon.maHD = :maHD", ChiTietHoaDon.class);
    	query.setParameter("maHD", maHD);
        return query.getResultList();
    }
    
    public void insertChiTietHoaDon(ChiTietHoaDon cthd) {
        entityManager.getTransaction().begin();
        entityManager.persist(cthd);
        entityManager.getTransaction().commit();
    }

    
    
    public void close() {
        entityManager.close();
    }
}
