import banco.Cuenta;
/**
 * Clase principal
 * 
 * @author Campus FP
 *
 */
public class Principal {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(553344, "Amelia", 100);
		
		/*miCuenta.setCliente("Amelia González");
		miCuenta.setNumero(5322444);
		miCuenta.setSaldo(100);
		
		System.out.println(miCuenta.getCliente());
		System.out.println(miCuenta.getSaldo());*/
		
		System.out.println(miCuenta.informacion());
		miCuenta.ingresar(300);
		System.out.println(miCuenta.informacion());
		miCuenta.retirar(50);
		System.out.println(miCuenta.informacion());
		

	}

}
