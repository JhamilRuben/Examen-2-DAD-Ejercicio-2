package simulaci�nbancaria;

public class HiloCliente implements Runnable{
    Cuenta cuenta;
    int cantidad;

    public HiloCliente(Cuenta cuenta, int cantidad) {
    	System.out.println("se hizo accion con "+cantidad+" soles");
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        /* Forzamos la maquinaria: repetimos
        la operaci�n much�simas veces para
        intentar verificar si la simulaci�n es
        correcta
        */
        for (int i=0; i<100; i++){
            cuenta.hacerMovimiento(cantidad);
        }
    }
}
