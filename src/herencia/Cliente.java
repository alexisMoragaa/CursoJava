/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

import java.util.Date;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente extends Persona  {
    private  int idCliente;
    private boolean vip;
    private Date fechaRegistro;
    
    private static int contadorCliente;



    public Cliente(boolean vip, Date fechaRegistro, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        Cliente.contadorCliente ++;
        this.idCliente = contadorCliente;
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
    }

    
    public int getIdCliente() {
        return idCliente;
    }

  
    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append('}');
        return sb.toString();
    }

    
 
    
    
    
    
}
