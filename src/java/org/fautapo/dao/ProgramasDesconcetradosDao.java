/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.fautapo.dao;

import java.util.List;
import org.fautapo.domain.ProgramasDesconcentrados;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Usuario
 */
public interface ProgramasDesconcetradosDao {

    List <ProgramasDesconcentrados> getListarProgramasDesconcentrados() throws DataAccessException;
}
