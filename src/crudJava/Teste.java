package crudJava;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("mathes oliveira");
		a1.setEstado("são paulo");
		a1.setData_nascimento(1985);
		a1.setCpf(4002);
		
       AlunoController con = new AlunoController();
       
       List<Aluno> alunos = con.listar();
       
       for(int i = 0; i < alunos.size(); i++) {
    	   System.out.println("Nome:"+ alunos.get(i).getNome() + "Estado:"+ 
             alunos.get(i).getEstado() +"Cpf:" + alunos.get(i).getCpf() + "Data de nascimento:"+ alunos.get(i).getData_nascimento());
       }
       
	}

}
