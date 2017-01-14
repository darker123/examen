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
public class Monitor extends Thread{
    int tunelOcupado;
    int autosDentroTunel;
	public Monitor (int tunelOcupado,int autosDentroTunel) 
	{
		this.tunelOcupado=tunelOcupado;
		this.autosDentroTunel=autosDentroTunel;
	}
    synchronized public void entraVehiculo(String numeroTunel)
	{
		if(autosDentroTunel==0)
		{
			System.out.println("Tunel"+numeroTunel+" vacio");
			try {
				wait();
				System.out.println("Tunel"+numeroTunel+" lleno");
			} catch (Exception e) {}
		}
		System.out.println("Tunel"+numeroTunel+" entra un vehiculo");
		autosDentroTunel--;
		tunelOcupado++;
	}  
    synchronized public void saleVehiculo(String numeroVehiculo)
	{
			if(autosDentroTunel<1)
			{
				autosDentroTunel++;
				if(autosDentroTunel<5)
				notify();
				System.out.println("llego Vehiculo"+numeroVehiculo+" esperando esperando entrar al tunel");
				
			}else
				System.out.println("Vehiculo"+numeroVehiculo+" se volvio a la cuidad xD");
	}
    synchronized public void saleVehiculoTunel(String numeroTunel)
	{
		autosDentroTunel--;
	}
}
