import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CabInvoiceTest {
    CabInvoice ci = new CabInvoice();

   @Test
   public void totalFareJourney() {

        Assertions.assertEquals(25,ci.totalFareJourney(2,5));

    }

}