import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestCode {

    @Test
    public void testGermany() throws Exception {
        String result = Main.Germany("Oleg");
        Assert.assertEquals("Halo, Ich kenne dein kleines Geheimnis: Oleg", result);
    }

    @Test
    public void testIsOksana() throws Exception {
        String result = Main.Spain("Oksana");
        Assert.assertEquals("Hola, yo se tu secreto: Oksana", result);
    }

}
