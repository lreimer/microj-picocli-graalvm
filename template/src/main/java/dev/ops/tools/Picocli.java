package dev.ops.tools;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.Optional;
import java.util.logging.Logger;

@Command(version = "@|yellow DevOps Tools Picocli 1.0|@", mixinStandardHelpOptions = true)
class Picocli implements Runnable {

    private static final Logger LOGGER = Logger.getLogger(Picocli.class.getName());

    // see https://picocli.info/#_options_and_parameters

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Picocli()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        // TODO: implement me
    }
}
