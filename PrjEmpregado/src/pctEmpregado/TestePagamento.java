package pctEmpregado;

public class TestePagamento {

	public static void main(String[] args) {	
		
		//Criando objetos
		Salario sal = new Salario("Jo�o", "123456789",0, 2500.00);
		
		System.out.println("***Sal�rio Mensal do Empregado***");
		
		System.out.println("Nome"
				+ ":"+sal.getNome());
		System.out.println("Documento"
				+ ":"+sal.getNrDocto());
		System.out.println("Sal�rio Mensal:"
				+ ""+sal.getSalarioMensal());
		
		System.out.println();
		sal.rendimentos();
		System.out.println("Rendimentos:"+sal.getRendimento());
		System.out.println();
		System.out.println();
		
		Horario hor = new Horario("Jo�o", "123456789",0,30.00, 12.00);
		
		System.out.println("***Sal�rio por Hora do Empregado***");
		
		System.out.println("Nome"
				+ ":"+hor.getNome());
		System.out.println("Documento"
				+ ":"+hor.getNrDocto());
		System.out.println("N�mero de Horas Trabalhadas"
				+ ":"+hor.getHoras());
		System.out.println("Valor hora"
				+ ":"+hor.getSalario());
		
		System.out.println();
		hor.rendimentos();
		System.out.println("Rendimentos:"+hor.getRendimento());
		System.out.println();
		System.out.println();
		
		Comissao com = new Comissao("Jo�o", "123456789", 0, 2000.00, 0.45);
		
		System.out.println("***Vendas Brutas & Comiss�es***");
		
		System.out.println("Nome"
				+ ":"+com.getNome());
		System.out.println("Documento"
				+ ":"+com.getNrDocto());
		System.out.println("Taxa de Comiss�o de Vendas"
				+ ":"+com.getTaxaComissao());
		System.out.println("Vendas Brutas"
				+ ":"+com.getVendaBruta());
		
		System.out.println();
		com.rendimentos();
		System.out.println("Rendimentos :"+com.getRendimento());
		System.out.println();
		System.out.println();
		
	}		

}
