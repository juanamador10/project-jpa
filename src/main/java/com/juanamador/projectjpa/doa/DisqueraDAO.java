/**
 * 
 */
package com.juanamador.projectjpa.doa;

import java.util.List;

import com.juanamador.projectjpa.entity.Disquera;

/**
 * @author Juan Fernando Amador Miranda
 * Interfaz que genera el DAO para las transacciones del CRUD a la tabla disquera
 *
 */
public interface DisqueraDAO {
	void guardar(Disquera disquera);
	void actualizar(Disquera disquera);
	void eliminar (long id);
	List<Disquera> consultar();
	Disquera consultarById(Long id); 

}
