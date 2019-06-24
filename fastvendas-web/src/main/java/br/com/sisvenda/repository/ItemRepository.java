package br.com.sisvenda.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sisvenda.database.AcessoMySql;
import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.model.Item;

public class ItemRepository {

	//construtor vazio
	public ItemRepository() {}
	
	// Acesso ao banco, instancia do banco

	AcessoMySql db = new AcessoMySql();
	
	String sql_insert = "INSERT INTO item (quantidade, fk_produto, fk_venda) VALUES (?,?,?)";
	//String sql_select_clientes = "SELECT * FROM cliente c";
	//String sql_select_nome_cpf = "SELECT * FROM cliente c WHERE c.nome LIKE ? AND c.documento LIKE ?";
	//String sql_delete = "DELETE FROM cliente WHERE id = ?";
	//String sql_update = "UPDATE  cliente c set c.nome = ? , c.sobrenome = ? , c.email = ? , c.documento = ? , c.telefone = ? , c.endereco = ? , c.cep = ? where c.id = ?"; //ATUALIZAR
	//String sql_findById = "SELECT * FROM Cliente WHERE id = ?";
	
	//criando metodo de salvar item no banco
	public void salvarItem(Item item){
		PreparedStatement pstm;
				
		try {
			pstm = db.conectar().prepareStatement(sql_insert);
			pstm.setInt(1, item.getQuantidade());
			pstm.setInt(2, item.getProduto().getId());
			pstm.setInt(3, item.getVenda().getId());
		    pstm.executeUpdate();
			db.desconectar();
						
		} catch (SQLException e) {
			System.out.println("Erro ao executar no banco");
			e.printStackTrace();
		}
		
	}
//	//lista de clientes
//	public List<Cliente> listaDecliente(){
//		
//		PreparedStatement pstm;
//		ResultSet rs;
//		List<Cliente>listando = new ArrayList<>();
//		
//		try {
//			pstm = db.conectar().prepareStatement(sql_select_clientes);
//			rs = pstm.executeQuery();
//			Cliente cliente;
//			
//			
//			while (rs.next()) {
//				cliente = new Cliente();
//				cliente.setId(rs.getInt("id"));
//				cliente.setNome(rs.getString("nome"));
//				cliente.setSobrenome(rs.getString("sobrenome"));
//				cliente.setEmail(rs.getString("email"));
//				cliente.setDocumento(rs.getString("documento"));
//				cliente.setTelefone(rs.getString("telefone"));
//				cliente.setEndereco(rs.getString("endereco"));
//				cliente.setCep(rs.getString("cep"));
//				listando.add(cliente);
//				
//			} 
//			
//		} catch (SQLException e) {
//			System.out.println("Banco fora do Ar.");
//			e.printStackTrace();
//		}
//		return listando;
//		
//	}
//	
//	// listando cliente por nome e cpf
//	public List<Cliente> listClient(String nome, String cpf){
//		PreparedStatement prtm;
//		ResultSet rs;
//		List<Cliente> clientes = new ArrayList<>();
//		
//		try {
//			Cliente cliente = null;
//			prtm = db.conectar().prepareStatement(sql_select_nome_cpf);
//			prtm.setString(1, nome + "%");
//			prtm.setString(2, cpf + "%");
//			rs = prtm.executeQuery();
//			
//			while (rs.next()) {
//				cliente = new Cliente();
//				cliente.setNome(rs.getString("nome"));
//				cliente.setDocumento(rs.getString("cpf"));
//				clientes.add(cliente);
//			}
//			
//		} catch (SQLException e) {
//			System.out.println("Erro de banco." + e.getMessage());
//			e.printStackTrace();
//		}
//		return clientes;		
//	}
//	
//	// deletando pelo id 
//	public void delete(Integer id){
//		PreparedStatement pstm;
//		
//		try {
//			
//			pstm = db.conectar().prepareStatement(sql_delete);
//			pstm.setInt(1, id);
//			pstm.executeUpdate();
//			db.desconectar();
//			
//			System.out.println("Deletado com sucesso.");
//
//			
//		} catch (SQLException e) {
//			System.out.println("Erro ao deletar.");
//			e.printStackTrace();
//		}
//		
//		
//	}
//	// metodo para acessar o id 
//	public Cliente findById(Integer id){
//		PreparedStatement pstm;
//		ResultSet rs;
//		Cliente cliente = null;
//		try {
//			pstm = db.conectar().prepareStatement(sql_findById);
//			pstm.setInt(1, id);
//			rs = pstm.executeQuery();
//			while (rs.next()) {
//				cliente = new Cliente();
//				cliente.setId(rs.getInt("id"));
//				cliente.setNome(rs.getString("nome"));
//				cliente.setSobrenome(rs.getString("sobrenome"));
//				cliente.setEmail(rs.getString("email"));
//				cliente.setDocumento(rs.getString("documento"));
//				cliente.setTelefone(rs.getString("telefone"));
//				cliente.setEndereco(rs.getString("endereco"));
//				cliente.setCep(rs.getString("cep"));
//				
//				
//				
//			}
//			
//	     System.out.println(cliente);		
//	 	} catch (SQLException e) {
//			System.out.println("Erro no findById");
//			e.printStackTrace();
//		}
//		return cliente;
//	}
//	// atualizando o cliente atravez pelo findbyId
//	public void update(Cliente cliente) {
//        PreparedStatement pstm;
//		
//		try {
//			pstm = db.conectar().prepareStatement(sql_update);
//			pstm.setString(1,cliente.getNome());
//			pstm.setString(2, cliente.getSobrenome());
//			pstm.setString(3, cliente.getEmail());
//			pstm.setString(4, cliente.getDocumento());
//			pstm.setString(5, cliente.getTelefone());
//			pstm.setString(6, cliente.getEndereco());
//			pstm.setString(7, cliente.getCep());
//			pstm.setInt(8,cliente.getId());
//			pstm.executeUpdate();
//			db.desconectar();
//			
//			System.out.println("Cliente "+ cliente.getNome() + " Documento"+ cliente.getDocumento()+ " Atualizado com sucesso." );
//			
//		} catch (SQLException e) {
//			System.out.println("Erro ao atualizar");
//			e.printStackTrace();
//		}
//	 
//		
//	}
//	

	
}
