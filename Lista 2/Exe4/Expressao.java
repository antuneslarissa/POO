package Exe4;
/**
 * 
 * @author Larissa Zózimo Antunes e Júlia Roberta Andreatta
 *
 */
public class Expressao {
	
	 public Expressao(String exp) {
		 estaCorretaSintaticamente(exp);
		 getQtdeDivisores(exp);
		 getPosicaoOperador(exp);
	 }
	 

	public boolean estaCorretaSintaticamente(String exp) {
		 int conta = 0;
		 
		 for(int i=0; i < exp.length(); i++) {
			 if(exp.charAt(i) == '(' ) {
				 conta++;
			 }else
			 	if(exp.charAt(i) == ')') {
				 conta--;
				 if(conta < 0) {
					 return false;
				 }
			 }
		 }
		 
		 return conta == 0;
	 }
	
	 public int getQtdeDivisores(String exp) {
		 int qtdiv = 0;
		 
		 for(int i = 0; i < exp.length(); i++) {
			 if(exp.charAt(i) == '/') {
				 qtdiv++;
			 }
		 }
		 return qtdiv;
	 }
	 
	 public int getPosicaoOperador(String exp) {
		
		
		 for(int i = 0; i < exp.length(); i++) {
			 if(exp.charAt(i)== '+' || exp.charAt(i)=='-'||exp.charAt(i)=='*'||exp.charAt(i)=='/') {
				 return i;
			 }
		 }
		 
		 return -1;
	 }
	 
	
	/* public static void main(String[]args) {
		 Expressao exp = new Expressao ("(a+10)/(23*(10.5-b)-2.59/(b*a))");
		 System.out.println(exp.estaCorretaSintaticamente("(a+10)/(23*(10.5-b)-2.59/(b*a))"));
		 System.out.println(exp.getQtdeDivisores("(a+10)/(23*(10.5-b)-2.59/(b*a))"));
		 System.out.println(exp.getPosicaoOperador("(a+10)/(23*(10.5-b)-2.59/(b*a))"));
	 }*/
}


