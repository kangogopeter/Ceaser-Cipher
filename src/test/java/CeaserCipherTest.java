import org.junit.*;
import static org.junit.Assert.*;
import java.*;

public class CeaserCipherTest{

    @Test 
    public void isEncrypt_ableTo_encrypt() {
        CeaserCipher ceasercipher3 = new CeaserCipher();
        assertEquals("retep", ceasercipher3.isEncrypt("kangogo",1));
    }

    @Test
    public void runDecryptableTo_decrypt() {
        CeaserCipher testCeaserCipher2 = new CeaserCipher();
        assertEquals("kangogo", testCeaserCipher2.runDecrypt("retep", 1));
    }

}