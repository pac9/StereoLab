import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "DAB");
    }

    @Test
    public void canTune(){
        assertEquals("Radio 1", radio.tune());
    }

    @Test
    public void getMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("DAB", radio.getModel());
    }

}


