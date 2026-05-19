package com.synet.demoBack;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "valoraciones_casos")
public class ValoracionCaso {

    @Id
    private String id;
    private String casoId;
    private int precision;
    private int claridad;
    private int relevancia;
    private int adecuacion;
    private int nivel;
    private String observaciones;
    private String fecha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCasoId() {
        return casoId;
    }

    public void setCasoId(String casoId) {
        this.casoId = casoId;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getClaridad() {
        return claridad;
    }

    public void setClaridad(int claridad) {
        this.claridad = claridad;
    }

    public int getRelevancia() {
        return relevancia;
    }

    public void setRelevancia(int relevancia) {
        this.relevancia = relevancia;
    }

    public int getAdecuacion() {
        return adecuacion;
    }

    public void setAdecuacion(int adecuacion) {
        this.adecuacion = adecuacion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
