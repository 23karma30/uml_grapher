package fr.lernejo.umlgrapher;

import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "launcher", mixinStandardHelpOptions = true, version = "UmlGraph 1.O",
    description = "UmlGraph")
public class launcher implements Callable<Integer> {
    @CommandLine.Option(names = {"-c", "--classes"}, required = true ,description = "renseigner les classes d'où faire partir l'analyse")
    private Class<?>[] classgraph;
    @CommandLine.Option(names = {"-g", "--graph-type"}, defaultValue = "Mermaid"  ,description = "sélectionner le type de graph que l'on souhaite en sortie")
    private String graphtype;

    @Override
    public Integer call() throws Exception {
        UmlGraph graph = new UmlGraph(classgraph);
        System.out.println(graph.as(GraphType.valueOf(graphtype)));
        return null;
    }
    public static void main(String... args) {
        int exitCode = new CommandLine(new launcher()).execute(args);
        System.exit(exitCode);
    }
}
