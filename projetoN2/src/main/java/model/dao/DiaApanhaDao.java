package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.DiaApanha;
import model.bean.CreateDao;
import model.bean.DeleteDao;
import model.bean.ReadDao;
import model.bean.UpdateDao;
import model.bean.ReadByDateDao;
public class DiaApanhaDao 
{
    public void create(DiaApanha dia)
    {
        CreateDao.create(dia);
    }
    public void update(DiaApanha dia)
    {
        UpdateDao.update(dia);
    }
    public void delete(DiaApanha dia)
    {
        DeleteDao.delete(dia);
    }
    public List<DiaApanha> read()
    {
        List<DiaApanha> apanhas = new ArrayList<>();
        apanhas = ReadDao.read();
        return apanhas;
    }
    public List<DiaApanha> readForDate(int dat, String sql)
    {
        List<DiaApanha> apanhas = new ArrayList<>();
        apanhas = ReadByDateDao.readForDate(dat, sql);
        return apanhas;
    }
}
