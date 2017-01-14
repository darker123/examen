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
public class Tunel extends Thread {
    private Monitor monitor;
	public Tunel(Monitor monitor,String numeroTunel)
	{
		this.monitor=monitor;
		this.setName(numeroTunel);
	}
	public void run()
	{
		while(true)
		{
			monitor.entraVehiculo(getName());
			try {
				sleep(1000);
			} catch (Exception e) {}
			monitor.saleVehiculo(getName());
			System.out.println("Tunel"+getName()+" salio vehiculo ");
		}
	}
}
