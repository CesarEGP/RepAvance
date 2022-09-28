package Libreria;
import java.util.*;

public class Objeto {
    private Date fechacorte;
    private String uuid;
    private Date fechamuestra;
    private int edad;
    private String sexo;
    private String institucion;
    private String ubigeo;
    private String departamento;
    private String provincia;
    private String distrito;
    private String ubigeomuestra;
    private String departamentomuestra;    
    private String provinciamuestra;
    private String distritomuestra;
    private String tipomuestra;
    private String resultado;    
    //Constructor
    public Objeto(Date fechacorte, String uuid, Date fechamuestra, int edad, String sexo, String institucion, String ubigeo, String departamento, String provincia, String distrito, String ubigeomuestra, String departamentomuestra, String provinciamuestra, String distritomuestra, String tipomuestra, String resultado) {
        this.fechacorte = fechacorte;
        this.uuid = uuid;
        this.fechamuestra = fechamuestra;
        this.edad = edad;
        this.sexo = sexo;
        this.institucion = institucion;
        this.ubigeo = ubigeo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.ubigeomuestra = ubigeomuestra;
        this.departamentomuestra = departamentomuestra;
        this.provinciamuestra = provinciamuestra;
        this.distritomuestra = distritomuestra;
        this.tipomuestra = tipomuestra;
        this.resultado = resultado;
    }
    //Getter and Setter
    public Date getFechacorte() {
        return fechacorte;
    }

    public void setFechacorte(Date fechacorte) {
        this.fechacorte = fechacorte;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getFechamuestra() {
        return fechamuestra;
    }

    public void setFechamuestra(Date fechamuestra) {
        this.fechamuestra = fechamuestra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getUbigeomuestra() {
        return ubigeomuestra;
    }

    public void setUbigeomuestra(String ubigeomuestra) {
        this.ubigeomuestra = ubigeomuestra;
    }

    public String getDepartamentomuestra() {
        return departamentomuestra;
    }

    public void setDepartamentomuestra(String departamentomuestra) {
        this.departamentomuestra = departamentomuestra;
    }

    public String getProvinciamuestra() {
        return provinciamuestra;
    }

    public void setProvinciamuestra(String provinciamuestra) {
        this.provinciamuestra = provinciamuestra;
    }

    public String getDistritomuestra() {
        return distritomuestra;
    }

    public void setDistritomuestra(String distritomuestra) {
        this.distritomuestra = distritomuestra;
    }

    public String getTipomuestra() {
        return tipomuestra;
    }

    public void setTipomuestra(String tipomuestra) {
        this.tipomuestra = tipomuestra;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    //To String

    @Override
    public String toString() {
        return "Objeto{" + "fechacorte=" + fechacorte + ", uuid=" + uuid + ", fechamuestra=" + fechamuestra + ", edad=" + edad + ", sexo=" + sexo + ", institucion=" + institucion + ", ubigeo=" + ubigeo + ", departamento=" + departamento + ", provincia=" + provincia + ", distrito=" + distrito + ", ubigeomuestra=" + ubigeomuestra + ", departamentomuestra=" + departamentomuestra + ", provinciamuestra=" + provinciamuestra + ", distritomuestra=" + distritomuestra + ", tipomuestra=" + tipomuestra + ", resultado=" + resultado + '}';
    }
    
    
    
    
    
    
}


