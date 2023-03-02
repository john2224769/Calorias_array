package ejecutable;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        int calorias[], prom=0, max=0, min=0, promt, dm=0, d=0;
        calorias = new int [7];
        String[] semana = new String[]{"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};

        for (int i=0; i<calorias.length; i++)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las calorias del dia "+ semana[i]));
            prom=calorias[i]+prom;
        }
        promt=prom/calorias.length;

        for (int i=0; i<calorias.length; i++)
        {
            if (calorias[i]>max)
            {
                max=calorias[i];
                d=i;
            }
        }
        min=calorias[0];
        for (int i=0; i<calorias.length; i++)
        {
            if (min>calorias[i])
            {
                min=calorias[i];
                dm=i;
            }
        }
        JOptionPane.showMessageDialog(null,"Las calorias consumidas en la semana fueron: "+ Arrays.toString(calorias));
        JOptionPane.showMessageDialog(null," Promedio de calorias de la semana: "+ promt + " calorias " );
        JOptionPane.showMessageDialog(null," El dia de mas calorias en la semana fue el "+semana[d]+" con "+max+" calorias" );
        JOptionPane.showMessageDialog(null," El dia de menos calorias en la semana fue el "+semana[dm]+" con "+min+" calorias" );
        Arrays.sort(calorias);
        JOptionPane.showMessageDialog(null,Arrays.toString(calorias)+ " Orden ascendente" );

    }
}