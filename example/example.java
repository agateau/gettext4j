import com.greenyetilab.babelyeti.Translator;
import static com.greenyetilab.babelyeti.Translator.tr;
import static com.greenyetilab.babelyeti.Translator.trn;

class Example {
    public static void main(String[] args) {
        if (args.length == 0 || args.length > 2) {
            System.out.println(tr("Usage: Example <number> [<lang>]"));
            return;
        }
        if (args.length == 2) {
            Translator.init(args[1]);
        }
        int number = Integer.parseInt(args[0]);
        System.out.println(tr("Hello!"));
        System.out.println(trn("%n second left.", "%n seconds left.", number));
    }
}
