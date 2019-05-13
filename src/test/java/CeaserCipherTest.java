import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest {
    public CeaserCipherTest() {

    }

    @Test
    public void CeaserCipher_testinginghidingmethod(){
        CeaserCipherTest peter = new CeaserCipherTest();
   assertEquals("retep", peter.hide("kangogo", 1));
    }

    public CeaserCipherTest(String kangogo, int i) {
    }

    @Test
    public void CeaserCipher_testinghidingmethod(){
        CeaserCipherTest peter = new CeaserCipherTest();
        assertEquals("kangogo", peter.hide("retep",1));
}

    public String hide(String retep, int i) {
        return retep;
    }


}