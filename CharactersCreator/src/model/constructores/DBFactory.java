package model.constructores;

/**
 * @author jeesquivel
 *
 */

import BaseDatos.IBDArma;
import BaseDatos.JsonDBArmas;

public class DBFactory {


    public IBDArma getDefaultDBArma()  {
            return new JsonDBArmas();
    };



}
