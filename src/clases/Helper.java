/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String recibir(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void habilitar(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitar(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void limpiar(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static void DiagonalSecundaria(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = nf - 1; i >= 0; i--) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (nf - 1 - i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void TriangularSuperior(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i <= j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void TriangularInferior(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i >= j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    
    

    public static void LetraZ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = nf - 1; i >= 0; i--) {
            for (int j = 0; j < nf; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (nf - 1 - i == j || i == 0 || i == nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void letraT(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nf / 2 || j == nf - 1 / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraV(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        if(nc%2==1){
            for (int i = (nf-1)/2; i >=0; i--) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ( i==j || nf-1-i==j ) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
        }else{
            Helper.mensaje(null, "para esta letra el número de filas debe ser impar", "error", 1);
        }
        
    }public static void letraE(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i==0 || j==0 || i==nf-1 || i==nf/2 || i==nf-1/2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
}public static void letraF(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i==0 || j==0  || i==nf/2 || i==nf-1/2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
}public static void LetraI(JTable tabla1, JTable tabla2){
    int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j==nc/2 || j==nc-1/2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
}public static void LetraN(JTable tabla1, JTable tabla2){
    int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i==j || j==0 || j==nc-1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

}public static void LetraY(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        if(nf%2==1){
            for (int i = (nf-1)/2; i >=0; i--) {
            for (int j = nc-1; j >=0; j--) {
                aux = (int) tabla1.getValueAt(i, j);
                if ( i==j || nf-1-i==j   ) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
        }else{
            Helper.mensaje(null, "para esta letra el número de filas debe ser impar", "error", 1);
        }for (int i = nf-1; i >=0; i--) {
             for (int j = 0; j < 10; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if(j==nc/2 && i>=nf/2){
                    tabla2.setValueAt(aux, i, j);
                }
            }
   
            }
        
        } public static void LetraX(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = nf - 1; i >= 0; i--) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (nf - 1 - i == j || i==j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }public static void LetraA(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i==0 || j==0  || i==nf/2 || i==nf-1/2 || j==nc-1 ) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

}
    }public static void letraP(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i==0 || j==0  || i==nf/2 || i==nf-1/2  ) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }for (int i = nf/2; i >=0; i--) {
                for (int j = 0; j < 10; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if(j==nc-1){
                    tabla2.setValueAt(aux, i, j);
                }
            }
            }
    }public static void Transpuesta(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                
                    tabla2.setValueAt(aux, j, i);
                }
            }
}
    }

