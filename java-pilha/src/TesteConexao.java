
public class TesteConexao {

	public static void main(String[] args) {
		
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();

		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
			con.fecha();
		} finally {
			System.out.println("Estou no Finally");
			con.fecha();
		}

	}

}
