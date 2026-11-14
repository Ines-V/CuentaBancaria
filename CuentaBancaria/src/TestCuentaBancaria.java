public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaMaria= new CuentaBancaria("María", 100.05);
        CuentaBancaria cuentaCarlos= new CuentaBancaria("Carlitos",2002.0);
        System.out.println(cuentaMaria); //Se imprimen los datos en el toString() de la clase CuentaBancaria.
        System.out.println(cuentaCarlos);
        cuentaCarlos.setTitular("Carlos"); //Para cambiar el nombre del titular.
        System.out.println(cuentaCarlos);
        cuentaCarlos.retirar(200);
        System.out.println(cuentaCarlos);
        cuentaMaria.ingresar(200);
        System.out.println(cuentaMaria);
    }
}
