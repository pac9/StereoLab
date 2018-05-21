import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer  cdplayer;

    @Before
    public void before(){
        cdplayer = new CdPlayer("Sony", "Walkman");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdplayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Walkman", cdplayer.getModel());
    }
}
