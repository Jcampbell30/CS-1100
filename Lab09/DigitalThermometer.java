
/**
 *Jared Campbell
 *RJN259
 */
public class DigitalThermometer
{
    double Vm;
    public DigitalThermometer(double Vm){
        this.Vm = Vm;
    }
    public double getVoltage(){
        return this.Vm;
    }
    public void setVoltage(double Vm){
        this.Vm = Vm;
    }
    public void calculateTemp(){
        if (this.Vm >=12 && this.Vm<=18){
            double Rs = 75;
            double R0 =100;
            double k = .5;
            double Vs = 20;
            double T = ((Rs/k)*(Vm/(Vs-Vm))-(R0/k));
            double R = R0 + (k*T);
            System.out.print(T);
        }
        else{
            System.out.println("Error");
        }
    }
}
