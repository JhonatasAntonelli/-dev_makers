public enum TipoCliente {
    PF (0),
    PJ (0.05),
    VIP (0.15);

    private final double desconto;

    TipoCliente (double desconto){
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
    public static double calcularDesconto(TipoCliente tipoCliente, double valorTotal){
        return (tipoCliente.getDesconto() * valorTotal);
    }
}


