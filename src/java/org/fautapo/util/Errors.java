/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fautapo.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FNZABALETAA
 */
public class Errors {

    private List<String> error = null;

    public Errors() {
        error = new ArrayList<>();
    }

    public void add(String error) {
        this.error.add(error);
    }

    public int getCount() { 
        return error.size();
    }

    public List<String> getError() {
        return error;
    }

}
