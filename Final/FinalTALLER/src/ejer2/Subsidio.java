/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

/**
 *
 * @author lauty
 */
public abstract class Subsidio {
    
    private String investigador;
    private String planTrabajo;
    private String fecha;

    public Subsidio(String investigador, String planTrabajo, String fecha) {
        this.investigador = investigador;
        this.planTrabajo = planTrabajo;
        this.fecha = fecha;
    }
    
    public String getInvestigador() {
        return investigador;
    }

    public void setInvestigador(String investigador) {
        this.investigador = investigador;
    }

    public String getPlanTrabajo() {
        return planTrabajo;
    }

    public void setPlanTrabajo(String planTrabajo) {
        this.planTrabajo = planTrabajo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public abstract double montoTotal();
    
    public String toString() {
    	String aux = "Nombre del investigador: "+ this.investigador + "\nPlan de trabajo: "+ 
    		this.planTrabajo+ "\nFecha de solicitud: "+ this.fecha + 
    		 "\nMonto total: "+ this.montoTotal();
    	return aux;	
    }
    
    
}
