package ventas;
/**
 *
 * @author pacheco
 */
public class Ventas {
    public static void main(String[] args) {
        empleado empleado=new empleado();
        producto producto[]=new producto[10];
        ticket Ticket=new ticket();
        empleado.setNombre("Luis");
        empleado.setaPaterno("López");
        empleado.setaMaterno("González");
        for(int v_cont=0;v_cont<10;v_cont++)
            producto[v_cont]=new producto();
        producto[0].setNombre("Atún");
        producto[0].setPrecio_venta(12.60);
        Ticket.agreProducto(producto[0], 5.0);
        producto[1].setNombre("Coca-Cola");
        producto[1].setPrecio_venta(10.0);
        Ticket.agreProducto(producto[1], 2);
        Ticket.imprimir(empleado);
    }
}