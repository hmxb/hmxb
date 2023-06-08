package addressBookListSingleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton sc = null;
    List<AddressDto> addressList = null;

    private Singleton() {
        addressList = new ArrayList<AddressDto>();
    }

    public static Singleton getInstance() {
        if (sc == null) {
            sc = new Singleton();
        }
        return sc;
    }
}
