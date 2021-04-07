package br.com.tecnicoqi.logica.aulas;

public class ExecutaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Pedro");
		f1.setSalarioBase(900);

		f1.dobrarSalario();
		f1.descontarAdiantamento(300);
		
		double ferias = f1.calcularFerias();
		double horasExtras = f1.calcularHorasExtras(10);
		
		System.out.println("Ol� " +f1.getNome() + ", seu sal�rio � de: " +f1.getSalarioBase());
		System.out.println("Voc� receber� de f�rias: "+ferias);
		System.out.println("O valor das suas horas extras s�o: "+horasExtras);
	}

}
