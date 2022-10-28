package fr.lernejo.umlgrapher;

import fr.lernejo.UmlGraphTests;

public class UmlGraph {
    private final Class<?>[] classgraph;
    public UmlGraph(Class<?>...classgraph) {
        this.classgraph = classgraph;

    }

    public String as(GraphType typegraph) {
        for (Class classeDiagram : classgraph){
            if (typegraph ==GraphType.Mermaid){
                return """
                classDiagram
                class"+classeDiagram.getSimpleName() +"{
                  <<interface>>
                }
                """;
            }
        }
        return "";
    }
}
