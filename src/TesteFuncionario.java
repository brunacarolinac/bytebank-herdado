
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente bruna = new Gerente();
		bruna.setNome("Bruna Camargo");
		bruna.setCpf("222.222.222-22");
		bruna.setSalario(2600.00);

	
		System.out.println(bruna.getNome());
		System.out.println(bruna.getBonificao());
		
		//bruna.salario = 300.0;
		
	}
}
