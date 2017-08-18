/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


public class Abonados {
    String PrimerNombre;
    String PrimerApelido;
    String SegundoApellido;
    String CedulaDeUsuario;

    public Abonados(String PrimerNombre, String PrimerApelido, String SegundoApellido, String CedulaDeUsuario) {
        this.PrimerNombre = PrimerNombre;
        this.PrimerApelido = PrimerApelido;
        this.SegundoApellido = SegundoApellido;
        this.CedulaDeUsuario = CedulaDeUsuario;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getPrimerApelido() {
        return PrimerApelido;
    }

    public void setPrimerApelido(String PrimerApelido) {
        this.PrimerApelido = PrimerApelido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getCedulaDeUsuario() {
        return CedulaDeUsuario;
    }

    public void setCedulaDeUsuario(String CedulaDeUsuario) {
        this.CedulaDeUsuario = CedulaDeUsuario;
    }
     
}
