package test;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		int numeroTabuadas=Integer.parseInt(JOptionPane.showInputDialog("Numero de tabuadas"));		
		int[] tabuadas= new int[numeroTabuadas];
		for (int i = 0 ; i <numeroTabuadas; i++) {
			tabuadas[i] = n1 + i*2;
		}
		for (int i : tabuadas) {
			System.out.println(i);
		}
		/*
		int n2 = n1 + 2;
		int n3 = n1 + 4;
		
		//for(int n2; P <= 10; n2= N1 + 2)
		
		String temp1=(n1+ " * " +10+ " = " +(n1*10));
		String temp2=(n2+ " * " +10+ " = " +(n2*10));
		String s =temp1.;
		int comp1 = temp1.length();
		int comp2 = temp2.length();
		String maisumalinha= "%-"+(comp1+2)+"s %-"+(comp2+2)+"s %s";
		
		for(p = 1; p <= 10; p=p+1) {
			String maior1=(n1+ " * " +p+ " = " +(n1*p));
			String maior2=(n2+ " * " +p+ " = " +(n2*p));
			String maior3=(n3+ " * " +p+ " = " +(n3*p));
			System.out.printf(maisumalinha,maior1,maior2,maior3);
			System.out.println();	

		}//*/

	}

}
