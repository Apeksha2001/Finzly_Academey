/* final and constructor: Design an application where we need to have
more than one constructor in a class. The final value of productKey should activate the antivirus for all clients
who purchased the antivirus and those who not purchased
they should get the message saying "You are using free version, please upgrade"
 */

package JBKTest1;

class Antivirus {
    private final String productKey;
    private boolean isActivated;

    public Antivirus(String productKey) {
        this.productKey = productKey;
        this.isActivated = false;
    }

    public void activateAntivirus() {
        if (productKey != null && productKey.equals("1234567")) {                                           //HERE 1234567 IS ValidKeyValue
            System.out.println("Antivirus activated ...");
        } else {
            System.out.println("You are using the free version. Please upgrade to activate the antivirus.");
        }
    }
}


public class FinalConstructorEx {
    public static void main(String[] args) {
        Antivirus a1 = new Antivirus(null);             //Invalid Key
        a1.activateAntivirus();

        Antivirus a2 = new Antivirus("1234567");        //Valid Key
        a2.activateAntivirus();

        Antivirus a3 = new Antivirus("123456789");     //Invalid Key
        a3.activateAntivirus();
    }
}


