

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PropertyTest
{
    private Property property;
    /**
     * Construtor default para a classe de teste PropertyTest
     */
    public PropertyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }
    
    @Test
    public void testConstructor(){
        this.property = new Property("descrição", 2.5);
        assertEquals("descrição", this.property.getDescription());
        assertEquals(2.5, this.property.getPrice());
    }
    
    @Test
    public void testToString(){
        this.property = new Property("bla bla bla", 4.5);
        assertEquals( "descrição: " + "bla bla bla" + "/n" + "Preço: " + 4.5 + "Euros", this.property.toString());
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
