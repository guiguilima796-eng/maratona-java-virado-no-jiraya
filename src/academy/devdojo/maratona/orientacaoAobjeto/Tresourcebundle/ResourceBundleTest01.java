package academy.devdojo.maratona.orientacaoAobjeto.Tresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    static void main() {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
    }
}
