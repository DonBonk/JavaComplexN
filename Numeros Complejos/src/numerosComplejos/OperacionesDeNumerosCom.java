package numerosComplejos;

//import javax.swing.JOptionPane;
public class OperacionesDeNumerosCom extends NumeroComplejo {
double real, img;
	
   //constructor to initialize the complex number
   OperacionesDeNumerosCom(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static OperacionesDeNumerosCom sum(OperacionesDeNumerosCom c1, OperacionesDeNumerosCom c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        OperacionesDeNumerosCom temp = new OperacionesDeNumerosCom(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        //returning the output complex number
        return temp;
    }
    public static void despliegueDeSuma() {
	OperacionesDeNumerosCom c1 = new OperacionesDeNumerosCom(5.5, 4);
	OperacionesDeNumerosCom c2 = new OperacionesDeNumerosCom(1.2, 3.5);
        OperacionesDeNumerosCom temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }

}
