package abstractfactory;

import abstractfactory.cake.CakeCourier;
import abstractfactory.cookies.CookiesMaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractFactoryTest {

    @Test
    public void cookiesMakerTest() {
        CookiesMaker cookiesMaker = new CookiesMaker();
        String actual = cookiesMaker.makeConfectionery();
        String expected = "Cookiesmaker makes cookies";
        assertEquals(expected,actual);
    }

    @Test
    public void packerTest() {
        CakeCourier cakeCourier = new CakeCourier();
        String actual = cakeCourier.deliverConfectionery();
        String expected = "Courier delivers a cake";
        assertEquals(expected,actual);
    }
}