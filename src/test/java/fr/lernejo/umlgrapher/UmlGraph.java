package fr.lernejo.umlgrapher;

public class UmlGraph {
    private final Class<?>[] classgraph;
    public UmlGraph(Class<?>...classgraph) {
        this.classgraph = classgraph;

    }

    public String as(GraphType typegraph) {
        if (typegraph == GraphType.Mermaid) {
            String graph = "cdiagraclass";

            for (Class diagraclasse : classgraph) {
                if (typegraph == GraphType.Mermaid) {
                    return """
                        classDiagram
                        class Machin {
                            <<interface>>
                        }                   
                        """;
                }

            }
            return graph;
        }
        return "";
    }
}
