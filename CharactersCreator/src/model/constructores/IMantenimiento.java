package model.constructores;


import model.objetos.arma.Arma;
import model.objetos.personaje.Personaje;

/**
 * @author jeesquivel
 */

public interface IMantenimiento {

    public void guardar();
    public Object cargarTodo();
    public void cargar();
    public void insertar();
    public void borrar();
    void editarArma(Arma arma);
    void editarPersonaje(Personaje personaje);
    void borrarPersonaje(String name);
    void borrarArma(String name);

}
