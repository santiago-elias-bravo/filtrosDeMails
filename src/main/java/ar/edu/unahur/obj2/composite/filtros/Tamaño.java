package ar.edu.unahur.obj2.composite.filtros;

import ar.edu.unahur.obj2.composite.mail.Mail;

public class Tamaño extends FiltroSimple{
    private Integer valorminimo;

    public Tamaño(Integer valorminimo, Mail mail) {
        super(mail);
        this.valorminimo = valorminimo;
    }

    @Override
    protected Boolean doAplicar() {
        return mail.getTamaño() >= valorminimo;
    }



}
