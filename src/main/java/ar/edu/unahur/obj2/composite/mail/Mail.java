package ar.edu.unahur.obj2.composite.mail;

import ar.edu.unahur.obj2.composite.agrupable.Agrupable;
import ar.edu.unahur.obj2.composite.filtros.DefaultFiltroSimple;

public class Mail {
    private String from;
    private String to;
    private String asunto;
    private Integer tamaño;
    private Boolean adjunto;
    private String cuerpo;

    private Agrupable filtro;

    public Mail(Boolean adjunto, String asunto, String cuerpo, String from, Integer tamaño, String to) {
        this.adjunto = adjunto;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.from = from;
        this.tamaño = tamaño;
        this.to = to;
        this.filtro = new DefaultFiltroSimple(this);
    }

    public Boolean filtrate(){
        return filtro.aplicar();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAsunto() {
        return asunto;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public Boolean getAdjunto() {
        return adjunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Agrupable getFiltro() {
        return filtro;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setFiltro(Agrupable filtro) {
        this.filtro = filtro;
    }

    
}
