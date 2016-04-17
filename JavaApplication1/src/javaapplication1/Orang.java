/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;

/**
 *
 * @author idoarif
 */
public abstract class Orang implements Serializable{
    private String nama;
    private long id;
    public Orang (String nama,Long id){
        setNama(nama);
        setId(id);
    }

    public Orang() {
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setId (long id){
        this.id=id;
    }
    public String getNama(){
        return nama;
    }
    public long getId(){
        return id;
    }
    public abstract void display();
}
