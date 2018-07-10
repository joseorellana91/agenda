package com.agenda.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericDao <entity> {

    private Session sesion;
    private Transaction tx;


    protected void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    protected void terminaOperacion() {
        sesion.getTransaction().commit();
        sesion.close();
    }




    /** Save a entity
     *
     * @param entity
     */

    public void saveObject(entity entity) {

        try{

            iniciaOperacion();
            sesion.save(entity);
            tx.commit();

        }catch(HibernateException e ){
            tx.rollback();
            throw e;

        }finally {
            sesion.close();
        }

         }//end class saveObject


    /**
     * Update a entity
     * @param entity
     */

    public void updateObject (entity entity){


        try {

            iniciaOperacion();
            sesion.update(entity);
            tx.commit();

        }catch(HibernateException he) {

            tx.rollback();
            throw he;

        } finally {
                sesion.close();
            }

        }//end of class updateObject


    /**
     * Delete de indicate entity
     * @param entity
     */


    public void deleteEntidad (entity entity){

        try{

            iniciaOperacion();
            sesion.delete(entity);
            tx.commit();

        }
        catch(HibernateException he){

            tx.rollback();
            throw he;


        }


    }//end of class deleteEntity


    /**
     * Return a list of the entity passed as parametter
     * @param clase
     * @return
     */



    public List<entity> getEntityList(Class clase){


        List<entity> entityList = new ArrayList<entity>();


        try{
            iniciaOperacion();
            entityList = sesion.createQuery("from "+clase.getName()).list();


        }
        catch(HibernateException he){

            throw he;

        }
        finally {
            sesion.close();

        }

        return entityList;

    }//end of class getEntityList


}
