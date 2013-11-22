import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vm
 * Date: 11/22/13
 * Time: 5:40 PM
 */


public class WebDriverFactory {
    public List<WebDriver> getDrivers(Class... drivers) {
        List<WebDriver> list = new ArrayList<WebDriver>();
        for (Class dr: drivers) {
            if (dr.getClass())
            WebDriver wb = new dr.getClass();
            list.add(wb);
        }

        return list;
    }
}