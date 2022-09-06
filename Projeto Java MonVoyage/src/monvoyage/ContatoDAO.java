package monvoyage;
	
	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;
	
	public class ContatoDAO {
	
		public void save(Contato Contato) {
			
		String sql = "INSERT INTO Contato(Nome, Email, Mensagem)" + " VALUES(?,?,?)"; 
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
	
			conn = ConexaoMySql.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, Contato.getNome());

			pstm.setString(2, Contato.getEmail());
	
			pstm.setString(3, Contato.getMensagem());
	
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			} finally {
		
			try {
			if (pstm != null) {
			pstm.close();
			}
			if (conn != null) {
			conn.close();
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
		public void removeById(int id) {
		
			String sql = "DELETE FROM contato WHERE id = ?";
			Connection conn = null;
			PreparedStatement pstm = null;
			
		try {
			conn = ConexaoMySql.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();
		} catch (Exception e) {
		
			e.printStackTrace();
			
			} finally {
				
				try {
				
					if (pstm != null) {
				pstm.close();
				}
				
					if (conn != null) {
				conn.close();
				}
				
				} catch (Exception e) {
				e.printStackTrace();
				}
			}
		}
	}