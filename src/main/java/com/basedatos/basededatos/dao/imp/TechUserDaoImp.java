package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.TechUser_Dao;
import com.basedatos.basededatos.models.TechUserModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@Transactional
@CrossOrigin

public class TechUserDaoImp implements TechUser_Dao {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<TechUserModel> getTAll(){
        String hql = "FROM TechUserModel as u";
        return (List<TechUserModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public TechUserModel getT( long id){
        return entityManager.find(TechUserModel.class, id);

    }
    @Transactional
    @Override
    public TechUserModel registerT( TechUserModel techUserModel){
        entityManager.merge(techUserModel);
        return techUserModel;
    }
    @Transactional
    @Override
    public TechUserModel updateT(TechUserModel techUserModel){
        entityManager.merge(techUserModel);
        return techUserModel;
    }
    @Transactional
    @Override
    public void deleteT(long id){
        TechUserModel techUserModel = getT(id);
        entityManager.remove(techUserModel);
    }

}
