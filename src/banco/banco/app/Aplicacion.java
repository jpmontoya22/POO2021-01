package banco.app;

import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Aplicacion {
    public static void main(String[]args){
        System.out.println("Hola Mundo");

        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria cuentaSebas = new CuentaBancaria();
        Persona pablo = new Persona();
        Persona sebas = new Persona();

        pablo.nombre = "Pablo";
        miCuenta.titular = pablo;
        miCuenta.saldo = 316000;
        miCuenta.estado = "A";

        sebas.nombre = "Sebas";
        cuentaSebas.titular = sebas;
        cuentaSebas.saldo = 0;
        cuentaSebas.estado = "A";



        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());

        boolean resultadoTranferencia = miCuenta.transferir(216000,cuentaSebas);
        System.out.println(resultadoTranferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());
    }
}
