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
public class Vehiculo extends Thread{
    private Monitor monitor;
	public Vehiculo(Monitor monitor,int numeroVehiculo)
	{
		this.monitor=monitor;
		this.setName(""+numeroVehiculo);
	}
	public void run()
	{
		monitor.saleVehiculo(this.getName());
	}
}
