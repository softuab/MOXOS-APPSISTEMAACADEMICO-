/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.fautapo.dao.ibatis;

import java.util.List;
import org.fautapo.dao.ProgramasDesconcetradosDao;
import org.fautapo.domain.ProgramasDesconcentrados;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 *
 * @author Usuario
 */
public class SqlMapProgramasDesconcentradosDao extends SqlMapClientDaoSupport implements ProgramasDesconcetradosDao {

    public List<ProgramasDesconcentrados> getListarProgramasDesconcentrados() throws DataAccessException {
        return getSqlMapClientTemplate().queryForList("getListarProgramasDesconcentrados");
    }
}
