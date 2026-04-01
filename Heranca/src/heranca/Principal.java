package heranca;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
   
        Aluno a1= new Aluno();
        Professor p1 = new Professor();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("===== Cadastro do Aluno =====");      
        System.out.print("\n\nDigite o nome do aluno: ");
        a1.nome = sc.nextLine();
        
        System.out.print("Digite o RG: ");
        a1.rg = sc.nextLine();
        
        System.out.print("Digite o CPF: ");
        a1.cpf = sc.nextLine();
        
        System.out.print("Digite o RA: ");
        a1.registroAluno = sc.nextInt();
        
        System.out.print("Digite a nota do vestibular: ");
        a1.notaVestibular = sc.nextFloat();
        
        System.out.print("Digite o curso: ");
        a1.curso = sc.nextLine();
        
        System.out.println("Digite a data da matrícula: ");
        a1.dataMatricula = sc.nextLine();
        
        System.out.println("==== Cadastro do Professor ====");
        System.out.println("\n\nDigite o nome do professor: ");
        p1.nome = sc.nextLine();
        
        
        
    }
}
