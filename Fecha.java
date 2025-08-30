package aed;

public class Fecha {
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        new Fecha(this.dia, this.mes);
    }

    public Integer dia() {
        return this.dia;
    }

    public Integer mes() {
        return this.mes;
    }

    public String toString() {
        // Implementar
        return this.dia + "/" + this.mes;
    }

    @Override
    public boolean equals(Object otra) {
        return otra != null && otra.getClass() == this.getClass() && this.dia == ((Fecha)otra).dia && this.mes == ((Fecha)otra).mes;
    }

    public void incrementarDia() {
        if (dia < diasEnMes(mes)){
            dia ++;
        }
        else{
            if (this.dia == diasEnMes(mes) && this.mes == 12){
                this.dia = 1;
                this.mes = 1;
        }
            else {
                this.dia = 1;
                this.mes++;
            }
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
