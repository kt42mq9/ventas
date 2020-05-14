package ventas;

import java.util.Date;

/**
 *
 * @author pacheco
 */
public class ticket {
    private Integer clave;
    private Date fecha_compra;
    private Double total;
    private double articulos;
    private Integer a;
    private String a_productos[]=new String[10];
    private Double a_cantidades[]=new Double[10];
    private Double a_precios[]=new Double[10];
    private Double a_subTotales[]=new Double[10];
    ticket(){
        this.total=0.0;
        this.articulos=0.0;
        this.a=0;
    }
    
    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total += total;
    }
    
    public void agreProducto(producto producto, double cantidad){
        Double subTotal;
        subTotal=producto.getPrecio_venta()*cantidad;
        this.a_productos[this.a]=producto.getNombre();
        this.a_cantidades[this.a]=cantidad;
        this.a_precios[this.a]=producto.getPrecio_venta();
        this.a_subTotales[this.a]=subTotal;
        this.setTotal(subTotal);
        this.a++;
        this.articulos+=cantidad;
    }
    
    public void imprimir(empleado empleado){
        System.out.println(empleado.getNombre()+" "+empleado.getaPaterno()+" "+empleado.getaMaterno());
        System.out.println("Cantidad de productos: "+this.articulos);
        for (int i = 0; i < this.a; i++)
            System.out.println(this.a_productos[i]+" "+this.a_cantidades[i]+" "+this.a_precios[i]+" "+this.a_subTotales[i]);
        System.out.println("Total: "+this.getTotal());
    }
}
