package ejercicios07Interfaces.ejercicio3;

public class Secretario implements Empleado{

    private Informe informe;
    private String Empresa;
    private String Email;

    @Override
    public String toString() {
        return "Secretario{" +
                "informe=" + informe +
                ", Empresa='" + Empresa + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    public Secretario() {
    }

    public Secretario(Informe informe, String empresa, String email) {
        this.informe = informe;
        Empresa = empresa;
        Email = email;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String getTareas() {
            return "Hacer muchissimas tareas de secretario";
    }

    @Override
    public String getInforme() {
        return "hacer infomrmes categoria secretario";
    }
}
