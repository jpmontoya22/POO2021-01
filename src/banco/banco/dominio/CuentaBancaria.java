package banco.dominio;

import java.util.Date;

public class CuentaBancaria {
    public Banco banco;
    public String tipo; // Si es ahorros o corriente
    public Persona titular;
    public String numero;
    public double saldo;
    public Date fechaApertura;
    public String contraseña;
    public String estado;


    public String consultarSaldo() {
        return " Hola " + this.titular.nombre + " su saldo es: " + saldo;
    }

    public boolean retirar(double valorARetirar) {
        if (valorARetirar <= this.saldo && this.estado.equals("A")) {
            this.saldo = this.saldo - valorARetirar;
            return true;
        }else {
            System.out.println(" El valor a retirar es superior al saldo actual ");
            return false;
        }
    }

    public boolean consignar(double valorAConsignar) {
        if (valorAConsignar > 0 && this.estado.equals("A")) {
            this.saldo = this.saldo + valorAConsignar;
            return true;
        }else {
            return false;
        }
    }

    public boolean transferir(double valorATransferir, CuentaBancaria cuentaDestino) {
        return this.retirar(valorATransferir) && cuentaDestino.consignar(valorATransferir);

    }
}
