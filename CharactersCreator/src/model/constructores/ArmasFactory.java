package model.constructores;


import model.objetos.arma.Arma;

public class ArmasFactory {

    public static Arma crearArma(String nombre, int alcance, int danno, int nivel, int rango, int nivelMaximo, int nivelAparicion, String apariencia) {
        return new Arma(nombre, alcance, danno, nivel, rango, nivelMaximo, nivelAparicion, apariencia);
    }

}
