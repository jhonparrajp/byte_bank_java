package com.bytebank.modelo;
/*
 * Comentario por bloque
 */
//Comentario por linea
/**
 * Cuenta va a crear nuevas instancias de de CuentaCorriente
 * Comentario para documentacion
 * @version 1.0
 * @author parra
 *
 */

 public abstract class Cuenta implements Comparable<Cuenta>{

	 //public //accesible desde cualquier parte
	 //--default //accesible dentro de el paquete
	 //--- protected // dafult + clases hijas
	 //----private //solo desde la misma clase
	 
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;
    
    /**
     * Instancia una nueva cuenta sin parametros
     */
    
    public Cuenta() {   	
    }  
    /**
     * Instancia una cuenta usando agencia y numero
     * @param agencia
     * @param numero
     */
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }
    

    public abstract void  deposita(double valor);

    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error
     * devuelve una Excepcion
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) {
        if(this.saldo<valor) {
            throw new SaldoInsuficienteException("No Tienes Saldo");
        }this.saldo -= valor;
        }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
    @Override
    public String toString(){
    	String cuenta = "Numero: "+ this.numero + " ,Agencia: " + this.agencia;
    	return cuenta;
    }
    
    @Override
    public boolean equals(Object obj) {
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia==cuenta.getAgencia() && this.numero==cuenta.getNumero();
    }
    
    @Override
    public int compareTo(Cuenta o) {
    	// TODO Auto-generated method stub
    	return 0;
    }
    }




      