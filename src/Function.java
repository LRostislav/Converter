import javax.swing.*;

public class Function {

    public boolean check(String input){
        try{
            double x = Double.parseDouble(input);
            if (x>=0 || x<0);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public void dollarToNok(double Minput){
        double nok = Minput * 8.2;
        JOptionPane.showMessageDialog(null,"Amount of Nok: "+nok+" kr");
    }

    public void dollarToJPY(double Minput){
        double jpy = Minput * 112.7;
        JOptionPane.showMessageDialog(null,"Amount of Jpy: "+jpy+" yen");
    }
}
