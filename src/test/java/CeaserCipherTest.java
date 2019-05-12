import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void CeaserCipher_testinginghidingmethod(){
        CeaserCipherTest peter = new CeaserCipherTest();
   assertEquals("retep", peter.hide("kangogo", 1));
    }
@Test
    public void CeaserCipher_testinghidingmethod(){
        CeaserCipherTest peter = new CeaserCipherTest();
        assertEquals("kangogo", peter.hide("retep",1));
}


}