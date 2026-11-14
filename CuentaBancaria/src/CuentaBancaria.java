public class CuentaBancaria {
    private String titular;
    private double saldoInicial;

    //Crear el Constructor.
    public CuentaBancaria(String titular, double saldoInicial) {
        if(titular==null || titular.trim().isEmpty()){
            throw new IllegalArgumentException("El titular no puede ser nulo ni estar vacio,");
        }

        //El saldo al crear la cuenta es negativo se produce un error.
        if(saldoInicial<0){
            throw new IllegalArgumentException("El saldo debe ser mayor o igual que cero.");
        }
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }

    //Crear los getters y setters.
    public String getTitular() {
        return titular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Crear el metodo de retirar dinero.
    public void retirar(double cantidad){
        //No se puede retirar mas del sadlo que se tiene ni cantidades menores de 0.
        if(cantidad<=0){
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");

        }

        if(cantidad>saldoInicial){
            throw new IllegalArgumentException("La cantidad a retirar no puede superrar el saldo.");
        }

        //Resta la cantiddad retirada al saldo que se tiene en la cuenta.
        saldoInicial-=cantidad;
    }

    //Metodo para ingresar dinero.
    public void ingresar(double cantidad){

        //La cantidad ingresada si es negativa se produce un error al ejecutar.
        if(cantidad<=0){
            throw new IllegalArgumentException("Debes ingresar una cantidad mayor que cero.");
        }

        //Sumar la cantidad ingresada al saldo.
        saldoInicial+=cantidad;
    }

    //Para que se inpriman los resultados en la clase TestCuentaBancaria.
    @Override

    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldoInicial=" + saldoInicial +
                '}';
    }
}