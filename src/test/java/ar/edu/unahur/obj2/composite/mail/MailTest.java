package ar.edu.unahur.obj2.composite.mail;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.agrupable.Agrupable;
import ar.edu.unahur.obj2.composite.filtros.Adjunto;
import ar.edu.unahur.obj2.composite.filtros.AsuntoContiene;
import ar.edu.unahur.obj2.composite.filtros.FiltroCompuesto;
import ar.edu.unahur.obj2.composite.filtros.Tamaño;

public class MailTest {
    @Test
    void dadoUnMailConAsuntoMuyImportanteyTamaño250ConAdjuntoCumpleFiltroConTieneAdjuntoYTamañoMayorA230YAsuntoMuyImportante() {
        Mail mail = new Mail(true, "muy importante", "Reunion consorcio", "jony", 250, "test");
        Agrupable tam = new Tamaño(mail,230);
        Agrupable adj = new Adjunto(mail);
        Agrupable contiene = new AsuntoContiene("importante",mail);

        Agrupable compuesto = new FiltroCompuesto(Arrays.asList(tam,adj,contiene));

        //compuesto.agregarFiltro(compuesto);
        mail.setFiltro(compuesto);
        assertTrue(mail.filtrate());

    }
}
