public class CuentaBancaria {
    private String titular;
    private double saldoInicial;

    public CuentaBancaria(String titular, double saldoInicial) {
        if(titular==null || titular.trim().isEmpty()){
            throw new IllegalArgumentException("El titular no puede ser nulo ni estar vacio,");
        }

        if(saldoInicial<0){
            throw new IllegalArgumentException("El saldo debe ser mayor o igual que cero.");
        }
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar(double cantidad){
        if(cantidad<=0){
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");

        }

        if(cantidad>saldoInicial){
            throw new IllegalArgumentException("La cantidad a retirar no puede superrar el saldo.");
        }

        saldoInicial-=cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad<=0){
            throw new IllegalArgumentException("Debes ingresar una cantidad mayor que cero.");
        }
        saldoInicial+=cantidad;
    }

    @Override

    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldoInicial=" + saldoInicial +
                '}';
    }
}