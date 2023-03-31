package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.TechUserModel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface TechUser_Dao {



      @Transactional
      List<TechUserModel> getTAll();

      @Transactional
      TechUserModel getT(long id);

      @Transactional
      TechUserModel registerT(TechUserModel techUserModel);

      @Transactional
      TechUserModel updateT(TechUserModel techUserModel);

      @Transactional
      void deleteT(long id);
}
