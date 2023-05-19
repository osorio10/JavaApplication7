
package javaapplication7;

import javax.swing.JOptionPane;

public class JavaApplication7 {

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int sum=0;
        int con=0;
        int A[][]=new int [m][n];
        //Llenar matriz
        int i,j =0;
        for(i=0;i<m;i++){
            for (j=0;j<n;j++){
                int producto= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite productos"));
                A[i][j]=producto;
            }
        }
        
        //imprimir matriz
        i=0;
                while (i<m){
                    j=0;
                    while (j<n){
                        System.out.println(A[i][j]);
                        j++;
                    }
                    i++;
                }
                for(i=0;i<m;i++){
                    for(j=0;j<n;j++){
                    sum=sum+A[i][j];
                    con=con+1;
                    }  
                }//suma
                System.out.println("La sumatoria de los "+con+" elementos de la Matriz "+"["+m+"]"+" X "+"["+n+"]"+" es: "+sum);
                int prom=sum/12;
                //promedio
                int mes3=0;
                System.out.println("promedio"+prom);
    }
    
}
