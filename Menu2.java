package menu;

import java.util.Scanner;

public class Menu2 {
    int somaTimeA = 0;
    int somaTimeB = 0;
    int somaEmpate = 0;
    public void layoutMenu1(){
        System.out.println("1 - Aplicar pesquisa");
        System.out.println("2 - mostrar resultado");
        System.out.println("9 - fim");
    }
    public void layoutMenu2(){
        int opcaoMenu2 = 0;
        Scanner entradaMenu2 = new Scanner(System.in);
        System.out.println("1 – Vencedor Time A");
        System.out.println("2 – Vencedor Time B");
        System.out.println("3 – Empate");
        System.out.println("9 – Sair");
        opcaoMenu2 = entradaMenu2.nextInt();
        incrementaVotacao(opcaoMenu2);
    }
    private void incrementaVotacao(int opcaoMenu2) {
        if(opcaoMenu2==1){
            int timeA=0;
            somaTimeA=timeA++;
            System.out.println(somaTimeA);
            imprimeMenu1();
        }
        if(opcaoMenu2==2){
            int timeB=1;
            timeB++;
            System.out.println(timeB);
            somaTimeB=timeB;
        }
        if(opcaoMenu2==3){
            int empate=1;
            empate++;
            System.out.println(empate);
            somaEmpate=empate;
        }
    }
    private void imprimeSoma() {
        System.out.println("SOMA PESQUISA TIME A" + somaTimeA);
        System.out.println("SOMA PESQUISA TIME A" + somaTimeB);
        System.out.println("SOMA PESQUISA TIME A" + somaEmpate);
    }
    public int imprimeMenu1(){
        int opcaoMenu1 = 0;
        Scanner entradaMenu1 = new Scanner(System.in);
        layoutMenu1();
        opcaoMenu1 = entradaMenu1.nextInt();
        do{
            //layoutMenu1();
            if(opcaoMenu1 == 1){
                System.out.println("Quem ganhou o jogo?");
                layoutMenu2();
            }
            if(opcaoMenu1 == 2) {
                imprimeSoma();
            }
            opcaoMenu1 = entradaMenu1.nextInt();
        }while(opcaoMenu1 !=9);//vai fazer esse código enquanto o do for verdadeiro.
        return opcaoMenu1;
    }
}
