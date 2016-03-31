/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author YolaAdipratama
 */
public class Petugas extends Orang implements Serializable {

    public Petugas(String nama, long id) {
        super(nama, id);
    }

    public void display() {
        System.out.println("Nama Petugas : " + getNama());
        System.out.println("Id Petugas : " + getId());
    }

}
