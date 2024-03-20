

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    
    Company company1;
    User client1, client2, seller1, seller2;
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
    }
    
    @Test
    public void testConstructor(){
        assertTrue(company1.getClients() != null);
        assertTrue(company1.getSellers() != null);
        assertTrue(company1.getProperties() != null);
        assertTrue(company1.getSells() != null);
    }
    
    @Test
    public void testRegisterClient(){
        company1.registerClient(client1);
        assertEquals(client1, company1.getClients().get(0));
    }
    
    @Test
    public void testRegisterClients(){
        company1.registerClient(client1);
        company1.registerClient(client2);
        assertEquals(client1, company1.getClients().get(0));
        assertEquals(client2, company1.getClients().get(1));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        company1.registerClient(client1);
        assertTrue(company1.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertTrue(company1.registerClient(null));
    }
    
    @Test
    public void testCreateSell(){
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
       company1 = new Company();
       client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
       client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
       seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
       seller2 = new User("José Manuel", "966777152", "roro@remax.pt");
       property1 = new Property"descrição", 2.5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
