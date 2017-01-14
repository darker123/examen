/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tso;

import static java.lang.Thread.sleep;

/**
 *
 * @author Usuario
 */
public class VehiculosEntran extends Thread{
    Monitor monitor;
    public VehiculosEntran(Monitor monitor)
{
	this.monitor=monitor;
}
public void run() 
{
	int i=1*2;
	while (true)//creamos N clientes (infinitos clientes)
	{			//llegan clientes cada 1 segundo
		try {
			sleep(3000);
		} catch (Exception e) {}
		Vehiculo Vehiculo=new Vehiculo(monitor,i);
		Vehiculo.start();
		i++;
	}
}
}
