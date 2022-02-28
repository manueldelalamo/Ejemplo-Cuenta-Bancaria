package banco;
/**
 * 
 * @author Campus FP
 *
 */
public class Cuenta {
	private int numero;
	private String cliente;
	private float saldo;
	
	/**
	 * Constructor
	 * 
	 * @param numero
	 * @param cliente
	 * @param saldo
	 */
	
	public Cuenta(int numero, String cliente, float saldo) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	/**
	 * Constructor predeterminado
	 */
	
	public Cuenta() {
		super();
		this.numero = 0;
		this.cliente = "Desconocido";
		this.saldo = 0;
	}
	/**
	 * Retorna el número de cunta bancaria
	 * 
	 * @return int
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Establece el número de cuenta
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Retorno el nombre del cliente de la cuenta
	 * 
	 * @return string
	 */
	public String getCliente() {
		return cliente;
	}
	/**
	 * Establece nombre del cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente.toUpperCase();
	}
	/**
	 * Retorna el saldo de la cuenta
	 * 
	 * @return float
	 */
	public float getSaldo() {
		return saldo;
	}
	/**
	 * Establece el saldo inicial de la cuenta
	 * 
	 * @param saldo inical
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	/**
	 * Realiza un ingreso en la cuenta
	 * 
	 * @param cuanto importe a ingresar
	 */
	public void ingresar(float cuanto) {
		this.saldo = this.saldo + cuanto;
	}
	/**
	 * Realiza una retirada en la cuenta
	 * 
	 * @param cuanto importe a retirar
	 */
	public void retirar(float cuanto) {
		this.saldo = this.saldo - cuanto;
	}
	/**
	 * Retorna un string con toda la información
	 * 
	 * @return string
	 */
	public String informacion() {
		return "La cuenta nº " + numero + " de "
				+ cliente + " tiene un saldo de " 
				+ saldo;
	}
}
