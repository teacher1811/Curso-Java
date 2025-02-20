class Producto {
    private String nombre;
    private double precio;
    private boolean enStock;

    public Producto(String nombre, double precio, boolean enStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.enStock = enStock;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public boolean isEnStock() { return enStock; }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
