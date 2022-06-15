package realbucksavage;

import java.util.concurrent.Callable;

import net.revelc.code.formatter.FormatterMojo;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "jfmt",
    version = "0.1.0",
    mixinStandardHelpOptions = true
)
public class App implements Callable<Integer> {

    final FormatterMojo formatterMojo = new FormatterMojo();

    @Override
    public Integer call() throws Exception {
        System.out.println("test");
        formatterMojo.execute();
        return 0;
    }

    public static void main( String[] args ) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
