package br.com.cotiinformatica.repositories;

import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.entites.Produto;
import br.com.cotiinformatica.factories.ConnectionFactory;

public class ProdutoRepository {
	
	public void insert(Produto produto) throws Exception {
		
		var connection = ConnectionFactory.getConnection();
		
		var sql = 	"""
							insert into produto(id, nome, preco, quantidade, datahoracriacao, ativo, categoria_id)
							values(?, ?, ?, ? , ?, ?, ?)
						""";
		
		var statement = connection.prepareStatement(sql);
		
	}
	
	public boolean update(Produto produto) throws Exception {
		
		var conncetion = ConnectionFactory.getConnection();
		
		var sql =  	"""
							update produto set 
								nome = ?,  
								preco = ?, 
								quantidade = ?,  
								datahoracriacao = ?,  
								ativo	 = ?, 
								categoria_id = ?
							where id = ?
						""";
		
		var statement = conncetion.prepareStatement(sql);
		
		return false;
	}
	
	public boolean delete(UUID id) throws Exception {
		
		var connection = ConnectionFactory.getConnection();
		
		var sql =  	"""
							delete from produto
							where id = ?
						""";
		
		var statement = connection.prepareStatement(sql);
		
		return false;
	}
	
	public List<Produto> findAll() throws Exception {
		
		var connection = ConnectionFactory.getConnection();
		
		var sql = 	"""
							select * from produto
						""";
		
		var statement = connection.prepareStatement(sql);
		
		return null;
	}

}
