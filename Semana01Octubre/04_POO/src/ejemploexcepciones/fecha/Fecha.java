package ejemploexcepciones.fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                '}';
    }

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws EjemploExcepcionPersonalizada {
        if (mes >=1 & mes<=12){
            this.mes = mes;
        }else{
            throw new EjemploExcepcionPersonalizada("Mes no valido");
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
