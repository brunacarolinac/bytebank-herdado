
public class SistemaInterno {
	
	private int senha = 2222;

	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou ) {
			System.out.println("pode entrar no sitema");
		} else {
			System.out.println("nao pode entrar no sistema");
		}
	}
	
}
