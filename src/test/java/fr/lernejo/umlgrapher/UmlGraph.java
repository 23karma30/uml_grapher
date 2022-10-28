package fr.lernejo.umlgrapher;

public class UmlGraph {
    private final Class<?>[] classgraph;
    public UmlGraph(Class<?>...classgraph) {
        this.classgraph = classgraph;

    }

      /*
    private final Set<UmlType> types = new TreeSet<>(Comparator
        .<UmlType, String>comparing(t->t.name())
        .thenComparing(t->t.packageName()));

    private final Set<MermaidLink> types = new TreeSet<>(Comparator
        .<UmlType, String>comparing(t->t.name())
        .thenComparing(t->t.packageName()));

    */

    public String as(GraphType typegraph) {
        if (typegraph == GraphType.Mermaid) {
            String graph = "diagraclass";

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
