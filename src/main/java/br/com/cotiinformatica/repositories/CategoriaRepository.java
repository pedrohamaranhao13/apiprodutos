package br.com.cotiinformatica.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.entites.Categoria;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class CategoriaRepository {

	public List<Categoria> findAll()  throws Exception {

		var connection = ConnectionFactory.getConnection();
		
		var sql = 	"""
							select * from categoria;
						""";
		
		var statement = connection.prepareStatement(sql);
		var result = statement.executeQuery();
		
		var lista = new ArrayList<Categoria>();
		
		while(result.next()) {
			
			var categoria = new Categoria();
			categoria.setId(UUID.fromString(result.getString("id")));
			categoria.setNome(result.getString("nome"));
			
			lista.add(categoria);
			
		}
		
		connection.close();
		
		return lista;
		
	}
}
