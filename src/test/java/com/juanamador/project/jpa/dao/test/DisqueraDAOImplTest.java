/**
 * 
 */
package com.juanamador.project.jpa.dao.test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.juanamador.project.jpa.dao.impl.DisqueraDAOImpl;
import com.juanamador.projectjpa.doa.DisqueraDAO;
import com.juanamador.projectjpa.entity.Disquera;



/**
 * @author User
 *
 */
class DisqueraDAOImplTest {
	
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for {@link com.juanamador.project.jpa.dao.impl.DisqueraDAOImpl#guardar(com.juanamador.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		
		disquera.setDescripcion("YG entertainment");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.juanamador.project.jpa.dao.impl.DisqueraDAOImpl#actualizar(com.juanamador.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(9L);
		
		disqueraConsultada.setDescripcion("JYP entertainment");
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.juanamador.project.jpa.dao.impl.DisqueraDAOImpl#eliminar(com.juanamador.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Long id = 10L;
		this.disqueraDAO.eliminar(id);
	}
	
	@Test
	void consultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();
		assertTrue(disquerasConsultadas.size() >0);
		
		disquerasConsultadas.forEach(disquera -> {
			System.out.println("Disquera: " + disquera.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.juanamador.project.jpa.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(9L);
		System.out.println("Disquera: " + disquera.getDescripcion());
	}

}
