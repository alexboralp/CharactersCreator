/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.objetos.personaje;

import java.util.ArrayList;

/**
 *
 * @author alexander
 * @param <T>
 */
public interface IBuscadorEnemigos<T extends IMovible> {
    public T buscarObjetivo(ArrayList<T> enemigos);
}