package model.basedatos;

import model.objetos.arma.Arma;
import model.objetos.IArma;

import java.util.ArrayList;

public interface IBDArma {
    public void editarArmas(String nameArma, String atributo,  long valor);
    public void cargarArmas();
    public void guardarArma(IArma arma);
    public void borrarArma(IArma arma);
    void cargarPersonajes();
    void cargarEstados();
    void cargarTiposGenerales();
    void cargarTiposArmas();
}
