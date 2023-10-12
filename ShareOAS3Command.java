

import picocli.CommandLine;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "share", mixinStandardHelpOptions = true, version = "HomiCli 0.0.7",
        description = "Share Open API Specification 3.X file with the platform")
public class ShareOAS3Command implements Callable<Integer> {


    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec; // injected by picocli

    @CommandLine.Option(names = { "--file" , "-f" } , description = "Full path to the OAS file.")
    private String absolutePath;




    @Override
    public Integer call() throws Exception {

        String filename = "dbexport-" + absolutePath + ".json";



        return 0;
    }







}
