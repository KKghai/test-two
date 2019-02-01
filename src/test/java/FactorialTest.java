import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactorialTest {

    @Test
    public void testCalculateFunction() {
        assertEquals(new BigInteger("4"), Factorial.calculateFunction(4, 3));
        assertEquals(new BigInteger("792"), Factorial.calculateFunction(12, 7));
        assertEquals(new BigInteger("66324638306863423796047200"), Factorial.calculateFunction(100, 69));
        assertEquals(new BigInteger("34569147570568156800"), Factorial.calculateFunction(136, 15));

        assertNotEquals(new BigInteger("12341234"), Factorial.calculateFunction(17, 12));
        assertNotEquals(new BigInteger("355687428096000"), Factorial.calculateFunction(100, 99));
        assertNotEquals(new BigInteger("66324638306863423796047200"), Factorial.calculateFunction(17, 12));
        assertNotEquals(new BigInteger("34569147570568156800"), Factorial.calculateFunction(88, 11));
    }

    @Test
    public void testCalculateFactorial() {
        assertEquals(BigInteger.valueOf(120), Factorial.calculateFactorial(5));
        assertEquals(new BigInteger("7257415615307998967396728211129263114716991681296451376543577798900561843401706157852350749242617459511490991237838520776666022565442753025328900773207510902400430280058295603966612599658257104398558294257568966313439612262571094946806711205568880457193340212661452800000000000000000000000000000000000000000"), Factorial.calculateFactorial(170));
        assertEquals(new BigInteger("355687428096000"), Factorial.calculateFactorial(17));
        assertEquals(new BigInteger("710998587804863451854045647463724949736497978881168458687447040000000000000"), Factorial.calculateFactorial(56));

        assertNotEquals(new BigInteger("123123"), Factorial.calculateFactorial(22));
        assertNotEquals(new BigInteger("1124000727777607680000"), Factorial.calculateFactorial(18));
        assertNotEquals(new BigInteger("39916800"), Factorial.calculateFactorial(100));
        assertNotEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), Factorial.calculateFactorial(101));
    }
}