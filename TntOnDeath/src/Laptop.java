import javax.swing.*;

public class Laptop {

    String marke;
    boolean status = true;
    int bildschirmgroesse;

    public Laptop(String marke, boolean status, int bildschirmgroesse) {
        this.marke = marke;
        this.status = status;
        this.bildschirmgroesse = bildschirmgroesse;
    }

    public void setMarke(String s) {
        marke = s;
    }

    public void herunterfahren() {

        JOptionPane.showMessageDialog(null, "fahre herunter");
        status = false;
    }

    public void starten() {
        status = true;
    }

    public boolean getStatus() {
        return status;
    }
}
