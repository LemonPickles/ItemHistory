package net.stzups.itemhistory;

import net.stzups.util.DirectedAcyclicGraph.Node;
import net.stzups.util.DirectedAcyclicGraph;

import java.util.*;

public class TrackedList extends DirectedAcyclicGraph<TrackedItem> {
    private ItemHistory plugin;

    TrackedList(ItemHistory plugin) {
        this.plugin = plugin;
    }

    List<Node<TrackedItem>> getByName(String name) {
        List<Node<TrackedItem>> hits = new ArrayList<>();
        for (Node<TrackedItem> node : getAllNodes()) {
            if (node.getData().getEventName().equalsIgnoreCase(name)) {
                hits.add(node);
            }
        }
        return hits;
    }
}
