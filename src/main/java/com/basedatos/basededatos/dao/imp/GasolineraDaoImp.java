package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.Gasolinera_Dao;
import com.basedatos.basededatos.models.GasolineraModel;
import com.basedatos.basededatos.models.RegisterModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

    @Repository
    @Transactional
    @CrossOrigin

    public class GasolineraDaoImp implements Gasolinera_Dao{

        @PersistenceContext
        EntityManager entityManager;

        @Transactional
        @Override
        public List<GasolineraModel> getGAll(){
            String hql = "FROM GasolineraModel as u";
            return (List<GasolineraModel>) entityManager.createQuery(hql).getResultList();
        }

        @Transactional
        @Override
        public GasolineraModel getG( long id){
            return entityManager.find(GasolineraModel.class, id);

        }
        @Transactional
        @Override
        public GasolineraModel registerG( GasolineraModel gasolineraModel){
            entityManager.merge(gasolineraModel);
            return gasolineraModel;
        }
        @Transactional
        @Override
        public GasolineraModel updateG(GasolineraModel gasolineraModel){
            entityManager.merge(gasolineraModel);
            return gasolineraModel;
        }
        @Transactional
        @Override
        public void deleteG(  long id){
            GasolineraModel gasolineraModel = getG(id);
            entityManager.remove(gasolineraModel);
        }

        @Override
        public RegisterModel getR(long id) {
            return null;
        }

        @Override
        public RegisterModel registerR(RegisterModel registerModel) {
            return null;
        }

        @Override
        public RegisterModel updateR(RegisterModel registerModel) {
            return null;
        }

        @Override
        public void deleteR(long id) {

        }
    }

