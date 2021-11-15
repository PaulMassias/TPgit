package representation;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author pmassias
 */
public class TestZoneGeographique {
    
    @Test
    public void testGetter(){
        ZoneGeographique sect1 = new ZoneGeographique(1,"Centre");
        assertEquals(1,sect1.getNumero(),"Numéro incorrect");
        assertEquals("Centre",sect1.getNom(),"Nom incorrect");
    }
    
    @Test
    public void testToString(){
        ZoneGeographique sect1 = new ZoneGeographique(1,"Centre");
        sect1.setIndemniteRepas(10);
        
        assertEquals("ZoneGeographique{numero=1, nom=Centre, indemniteRepas=10}",);
        //"ZoneGeographique{" + "numero=" + numero + ", nom=" + nom + ", indemniteRepas=" + indemniteRepas + '}';
    }
}
