/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.donnymvcjdbc.event;

import edu.donnymvcjdbc.entity.Pelanggan;
import edu.donnymvcjdbc.model.PelangganModel;

/**
 *
 * @author Donny Hassan
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
    
}
