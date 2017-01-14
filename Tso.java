/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tso;

/**
 *
 * @author Usuario
 */
public class Tso extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor monitor=new Monitor(0,0);
        Tunel tunel1=new Tunel(monitor,"1");
        VehiculosEntran vehiculosEntran=new VehiculosEntran(monitor);
        VehiculosSalen vehiculosSalen=new VehiculosSalen(monitor);
        vehiculosEntran.start();
        vehiculosSalen.start(); 
        tunel1.start(); 
    }
    
}
